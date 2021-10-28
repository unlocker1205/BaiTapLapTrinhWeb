let textField = document.getElementsByClassName('textfield').value
let button = document.querySelector('.btn')

button.addEventListener('click', click)

function click() {
    let textArea = document.getElementById('abc').value
    let textField = document.getElementById('textField').value

    alert('Số lần xuất hiện: ' + (textArea.split(textField).length - 1))
}
