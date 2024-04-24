 

from flask import Flask, render_template, request, jsonify

app = Flask(__name__)

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/hello_user', methods=['POST'])
def hello_user():
    user_name = request.form['user_name']
    return  f'Hello {user_name}'

if __name__ == "__main__":
    app.run(debug=True)
