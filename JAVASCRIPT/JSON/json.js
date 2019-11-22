const person = {
    name : "pooja",
    age : 100,
    phone : 23456789,
    adrress : {
              city : 'bidar',
             state : 'karnatak',
            pincode : 585401
    },
}

console.log('JavaScript person object',person)
const jsonObject = JSON.stringify(person)
console.log('JSON person object',jsonObject)
const JavaScriptpersonObject = JSON.parse(jsonObject)
console.log(JavaScriptpersonObject)

localStorage.setItem('email','poojabhujange@gmail.com')//when login we storage the email in localstrogae

const emailID = localStorage.getItem('email')//get the data
console.log('Email ID',emailID)
localStorage.clear()//when user logout data is clear