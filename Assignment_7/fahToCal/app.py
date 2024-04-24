from flask import Flask, render_template, request

app = Flask(__name__)

@app.route('/')
def home():
    return render_template('index.html')

@app.route('/calculate', methods=['POST'])
def calculate():
    
    fahrenheit = float(request.form['fahrenheit'])
    celsius =round((fahrenheit - 32) * 5/9,2)
    return f'The Temperature in celcius is {celsius}'

if __name__ == '__main__':
    app.run(debug=True)

 