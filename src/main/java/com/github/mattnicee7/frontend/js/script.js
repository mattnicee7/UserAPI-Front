let userApiUrl = "http://localhost:8080/users"

let xhr = new XMLHttpRequest();
xhr.open("POST", userApiUrl);

xhr.setRequestHeader("Accept", "application/json");
xhr.setRequestHeader("Content-Type", "application/json");

xhr.onreadystatechange = function () {
    if (xhr.readyState === 4) {
        console.log(xhr.responseText);
    }
}

function register() {
    let username = document.getElementById('usuario').value
    let password = document.getElementById('senha').value

    const user = new User({
        username: username,
        password: password
    });

    const data = JSON.stringify(user);
    xhr.send(data)
}

function User(obj) {
    this.username = obj.username;
    this.password = obj.password;
}

