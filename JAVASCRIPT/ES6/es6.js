const message = new Promise(function(resolve,reject) {
    if(30>10){
        resolve ('success')
    }
    else{
        reject('Failed')
    }
    
})

message.then(function (msg) {
    console.log('success message',msg)    
}).catch(function(error) {
    console.log('failed messge',error)
})



const employ =  new Promise(function(resolve,reject) {
    if(30>10){
        resolve ([{
                   name : 'Billgate',
                   age : 67
                 },{
                     name : 'mark zuckerbeger',
                     age : 40

                },{
                    name : 'ms dhoni',
                    age : 42
                }])
    }
    else{
        reject('Failed')
    }
    
})
employ.then(function (data) {
    console.log('employe data',data)    
}).catch(function(error1) {
    console.log('failed data',error1)
})



function outerFunction(counter) {
    function innerFunction() {
        let count;
        count =counter +10;
        return count
    }
    return innerFunction
}

let innerFun = outerFunction(10)
let counter = innerFun()
console.log('counter value',counter)


function sum(number1,number2) {
    let total =  number1 + number2;
    console.log(total)
    
}
sum(10,20)
sum(10,20,30)

//when we dont the parameter count than we use Rest oprater
function sum(...number) {
    let total=0;
    for(let i=0;i<number.length;i++)
    {
        total = total+number[i]

    }
    console.log(total)
}