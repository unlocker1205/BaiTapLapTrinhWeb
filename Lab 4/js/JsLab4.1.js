let button = document.querySelectorAll('.btn')
let main = document.getElementById('main')

for (let i = 0; i < button.length; i++){
    let styles = window.getComputedStyle(button[i], null)
    let color = styles.getPropertyValue('background-color')
    button[i].addEventListener('click',changeColor)

    function changeColor() {
        main.style.backgroundColor = color
    }
}

