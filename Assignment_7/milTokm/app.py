from flask import Flask, render_template, request

app = Flask(__name__)

@app.route('/')
def home():
    return render_template('index.html')

@app.route('/calculate', methods=['POST'])
def calculate():
    miles = float(request.form['miles'])
    kilometers = round(miles * 1.60934,2)
    return f'The Distance in KM is {kilometers}'

if __name__ == '__main__':
    app.run(debug=True)

 