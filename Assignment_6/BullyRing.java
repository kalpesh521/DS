
//DS Assignment 6: Implement Bully and Ring algorithm for leader election.

 
import java.util.Scanner;

// create process class for creating a process having id and status  
class Process {
	public int id;
	public String status;

	public Process(int id) {
		this.id = id;
		this.status = "active";
	}
}

public class BullyRing {

	Scanner sc;
	Process[] processes;
	int n;

	// initialize Scanner class object in constructor
	public BullyRing() {
		sc = new Scanner(System.in);
	}

	// create ring() method for initializing the ring
	public void ring() {

		// get input from the user for processes
		System.out.print("Enter total number of processes: ");
		n = sc.nextInt();

		// initialize processes array
		processes = new Process[n];
		for (int i = 0; i < n; i++) {
			processes[i] = new Process(i);
		}
	}

	// create election() method for electing process
	public void performElection() {

		// we use the sleep() method to stop the execution of the current thread
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		// show failed process
		System.out.println("Process " + processes[getMaxValue()].id + " fails");

		// change status to Inactive of the failed process
		processes[getMaxValue()].status = "Inactive";

		int idOfInitiator = 0;
		boolean overStatus = true;

		while (overStatus) {

			boolean higherProcesses = false;

			// iterate all the processes
			System.out.println();
			for (int i = idOfInitiator + 1; i < n; i++) {
				if (processes[i].status == "active") {
					System.out.println("Process " + idOfInitiator + " Passes Election(" + idOfInitiator	+ ") message to Process " + i);
					higherProcesses = true;
				}
			}

			// check for higher process
			if (higherProcesses) {
				
				System.out.println();
				for (int i = idOfInitiator + 1; i < n; i++) {
					if (processes[i].status == "active") {
						System.out.println("Process " + i + " passes Ok(" + i + ") message to Process " + idOfInitiator);
					}
				}
				idOfInitiator++;
			}

			else {
				// get the last process from the processes that will become coordinator
				int coord = processes[getMaxValue()].id;

				// show process that becomes the coordinator
				System.out.println("Finally Process " + coord + " Becomes Coordinator");

				for (int i = coord - 1; i >= 0; i--) {
					if (processes[i].status == "active") {
						System.out.println("Process " + coord + " passes Coordinator(" + coord + ") message to Process " + i);
					}
				}
				System.out.println("\nEnd of Election");
				overStatus = false;
				break;
			}
		}
	}

	// create getMaxValue() method that returns index of max process
	public int getMaxValue() {
		int mxId = -99;
		int mxIdIndex = 0;
		for (int i = 0; i < processes.length; i++) {
			if (processes[i].status == "active" && processes[i].id > mxId) {
				mxId = processes[i].id;
				mxIdIndex = i;
			}
		}
		return mxIdIndex;
	}

	public static void main(String[] args) {

		BullyRing bully = new BullyRing();

		bully.ring();
		bully.performElection();
	}
}
/* Output: 
Enter total number of processes: 6
Process 5 fails

Process 0 Passes Election(0) message to Process 1
Process 0 Passes Election(0) message to Process 2
Process 0 Passes Election(0) message to Process 3
Process 0 Passes Election(0) message to Process 4

Process 1 passes Ok(1) message to Process 0
Process 2 passes Ok(2) message to Process 0
Process 3 passes Ok(3) message to Process 0
Process 4 passes Ok(4) message to Process 0

Process 1 Passes Election(1) message to Process 2
Process 1 Passes Election(1) message to Process 3
Process 1 Passes Election(1) message to Process 4

Process 2 passes Ok(2) message to Process 1
Process 3 passes Ok(3) message to Process 1
Process 4 passes Ok(4) message to Process 1

Process 2 Passes Election(2) message to Process 3
Process 2 Passes Election(2) message to Process 4

Process 3 passes Ok(3) message to Process 2
Process 4 passes Ok(4) message to Process 2

Process 3 Passes Election(3) message to Process 4

Process 4 passes Ok(4) message to Process 3

Finally Process 4 Becomes Coordinator
Process 4 passes Coordinator(4) message to Process 3
Process 4 passes Coordinator(4) message to Process 2
Process 4 passes Coordinator(4) message to Process 1
Process 4 passes Coordinator(4) message to Process 0

End of Election

 */
