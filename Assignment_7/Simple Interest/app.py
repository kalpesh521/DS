from flask import Flask, render_template, request

app = Flask(__name__)

@app.route('/')
def home():
    return render_template('index.html')

@app.route('/calculate', methods=['POST'])
def calculate():
    principal = float(request.form['principal'])
    rate = float(request.form['rate'])
    time = float(request.form['time'])

    simple_interest = (principal * rate * time) / 100
    return f'The Simple Interest is {simple_interest}'

if __name__ == '__main__':
    app.run(debug=True)

 