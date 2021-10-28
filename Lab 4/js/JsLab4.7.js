$(document).ready(function () {
    let arr = []
    let number = 1
    let button = document.querySelectorAll('.btn')

    for (let i = 0; i < button.length; i++) {
        let random = (Math.floor(Math.random() * 64) + 1)
        if (arr.indexOf(random) < 0) {
            arr.push(random)
            $(button[i]).text(String(random))
        } else {
            i--
        }
    }

    for (let i = 0; i < button.length; i++) {
        button[i].addEventListener('click', hidden)
    }

    function hidden() {
        if (Number($(this).text()) == number) {
            number++
            this.classList.add('hidden')
            $(this).button({disabled: false})
        } else if (Number($(this).text()) != number) {
            alert('Bạn chọn sai thứ tự, số cần tìm hiện tại là: ' + number)
        }
    }
})