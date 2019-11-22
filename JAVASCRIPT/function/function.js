//name function
function add(num1,num2)
{
    console.log('sum=',num1+num2);

}
add(12,10)

var sub = function (num1,num2) {
    var subvalue = num1-num2;
    return subvalue;

    
}
var value = sub(90,80)
console.log('value=',value)

console.log("==============================");
(function (a,b)
{
    console.log('value=',a+b);
}) 
(10,20);


var div = (num1,num2)=>{
    console.log('value=',num1/num2);
}
div(10,2)

var div2 = num1=>console.log(num1);
div2(2)

var add= (num1,num2)=>num1+num2;

var value= add(10,2);
console.log(value)



console.log("=============");

greating('chand')
function greating(mesg) {
    
    console.log('hello',mesg)
}



greet('dinga')  
var greet = function (msg) {
    console.log('hi',msg)
    
}
  

greets('dingi')
var greets = (msg)=>{
   console.log('hi=',msg)

}