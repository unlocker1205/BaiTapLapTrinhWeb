let a = prompt('Xin mời nhập a: ')
let b = prompt('Xin mời nhập b: ')
let c = prompt('Xin mời nhập c: ')

let delta = (b / 2) * (b / 2) - a * c;


if (delta < 0) {
    alert('Phương trình vô nghiệm')
} else if (delta == 0){
    let result = (-b / 2) / a;
    alert('Phương trình có nghiệm kép x1 = x2 = ' + result)
} else {
    let result1 = ((-b / 2) - Math.sqrt(delta / a));
    let result2 = ((-b / 2) + Math.sqrt(delta / a));
    alert('Phương trình có hai nghiệp phân biệt: x1 = ' + result1 + ' và x2 = ' + result2)
}
