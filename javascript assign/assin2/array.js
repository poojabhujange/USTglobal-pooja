var num= [10,30,20]
var add=0;
var add1=0;

var add3=0;

console.log(num)
function sum() {
    for (var index = 0; index < num.length; index++) {
         add = add+num[index];
    }
    console.log('element=',add)
}
sum();


var adddd=function() {
    for (var index = 0; index < num.length; index++) {
         add1 = add1+num[index];
    }
    console.log('element=',add1)
}
adddd();


(
function(num){
    for (var index = 0; index < num.length; index++) {
         add3 = add3+num[index];
    }
    console.log('element=',add3)
}
)
(num);


var add4=0;

var sum1= num=>
{
    for (var index = 0; index < num.length; index++) {
        add4 = add4+num[index];
   }
   console.log('element=',add4)
}
sum1(num)




