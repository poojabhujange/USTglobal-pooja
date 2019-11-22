var m1=0;
var m2=1;
var i;
//named function
function fib(num)
{
    console.log(m1);
    console.log(m2);
    for(i=0;i<num-2;i++)
    {
        var m3=m1+m2;
        m1=m2;
        m2=m3;
        console.log(m3);
    }
    m1=0;
    m2=1;
}
fib(6);
console.log('****************************');
//anonymous function
var fib1=function(num){
    console.log(m1);
    console.log(m2);
    for(i=0;i<num-2;i++)
    {
        var m3=m1+m2;
        m1=m2;
        m2=m3;
        console.log(m3);
    }
    m1=0;
    m2=1;
}
fib1(2);
console.log('****************************');
//self invoked function
(function(num){
    console.log(m1);
    console.log(m2);
    for(i=0;i<num-2;i++)
    {
        var m3=m1+m2;
        m1=m2;
        m2=m3;
        console.log(m3);
    }
    m1=0;
    m2=1;
})
(8);
console.log('****************************');
//fat arrow function
var fib2 = num => {
    console.log(m1);
    console.log(m2);
    for(i=0;i<num-2;i++)
    {
        var m3=m1+m2;
        m1=m2;
        m2=m3;
        console.log(m3);
    }
}
fib2(3);



