#include <stdio.h>
#include <stdlib.h>
#include <mpi.h>

#define UNITSIZE 5

int main(int argc, char *argv[]) {
    int rank, size;
    int *send_buffer = NULL;
    int *receive_buffer = (int *)malloc(UNITSIZE * sizeof(int));
    int *new_receive_buffer = NULL;
    int root = 0;
    int i, total_elements, total_sum = 0;
    
    MPI_Init(&argc, &argv);
    MPI_Comm_rank(MPI_COMM_WORLD, &rank);
    MPI_Comm_size(MPI_COMM_WORLD, &size);

    if (rank == root) {
        total_elements = UNITSIZE * size;
        send_buffer = (int *)malloc(total_elements * sizeof(int));
        printf("Enter %d elements:\n", total_elements);
        for (i = 0; i < total_elements; i++) {
            printf("Element %d\t = %d\n", i, i);
            send_buffer[i] = i;
        }
    }

    MPI_Scatter(send_buffer, UNITSIZE, MPI_INT, receive_buffer, UNITSIZE, MPI_INT, root, MPI_COMM_WORLD);

    for (i = 1; i < UNITSIZE; i++) {
        receive_buffer[0] += receive_buffer[i];
    }
    printf("Intermediate sum at process %d is %d\n", rank, receive_buffer[0]);

    if (rank == root) {
        new_receive_buffer = (int *)malloc(size * sizeof(int));
    }

    MPI_Gather(&receive_buffer[0], 1, MPI_INT, new_receive_buffer, 1, MPI_INT, root, MPI_COMM_WORLD);

    if (rank == root) {
        for (i = 0; i < size; i++) {
            total_sum += new_receive_buffer[i];
        }
        printf("Final sum : %d\n", total_sum);
    }

    MPI_Finalize();
    free(send_buffer);
    free(receive_buffer);
    if (rank == root) {
        free(new_receive_buffer);
    }

    return 0;
}

