/*let element = document.getElementById('demo')
console.log('element =',element)

console.log('element',element.textContent)
element.textContent = 'Good Evening'

let button = document.createElement('button')
button.textContent='click me!!!'
console.log('Button element',button)

document.body.appendChild(button)

 let ulElement = document.createElement('ul')
 let li1Element = document.createElement('li')
 let li2Element = document.createElement('li')
 let li3Element = document.createElement('li')

 li1Element.textContent = 'java'
 li2Element.textContent = 'SQL'
 li3Element.textContent = 'javascript'

 ulElement.appendChild(li1Element)
 ulElement.appendChild(li2Element)
 ulElement.appendChild(li3Element)
 document.body.appendChild(ulElement)

 element.style.color = 'red'
 element.style.fontSize = '50px'
*/
function showmessge(){
    alert('hello pooja')
}

function changecolor(){
    let pElement = document.getElementById('mover')
    pElement.style.color = 'green'
}

function removecolor(){
    let pElement =document.getElementById('mover')
    pElement.style.color = 'black'
}


function printhello(){
    console.log('hello')
    document.getElementById('username').value  //value is used to get the user typed value
    document.getElementById('showusername').textContent = username;

}
let name = 'pooja'
let age = 21
let phoneno = 678987282
console.log('name is'+name + 'age is' +age+'phone no is '+phoneno)
console.log(`name is ${name}' age is ${age} phone no is ${phoneno}`)
console.log(`2+2=${2+2}`)

//document.getElementById('b1').disabled =false;