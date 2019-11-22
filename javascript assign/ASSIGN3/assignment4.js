var i;
var count=0;
// named function
function isPrime(num)
{
    for(i=1;i<=num;i++)
    {
        if(num%i===0)
        {
            count+=1;
        }
    }
    if(count===2)
    {
        console.log(num+" is a prime number");
    }
    else{
        console.log(num+" is not a prime number");
    }
    count=0;
}
isPrime(3);
//anonymous function
var prime = function(num)
{
    for(i=1;i<=num;i++)
    {
        if(num%i===0)
        {
            count+=1;
        }
    }
    if(count===2)
    {
        console.log(num+" is a prime number");
    }
    else{
        console.log(num+" is not a prime number");
    }
    count=0;
}
prime(4);
//self invoked function
(
function(num)
{
    for(i=1;i<=num;i++)
    {
        if(num%i===0)
        {
            count+=1;
        }
    }
    if(count===2)
    {
        console.log(num+" is a prime number");
    }
    else{
        console.log(num+" is not a prime number");
    }
    count=0;
})
(5);
//fat arrow function
var isPrime1 = num => {
    for(i=1;i<=num;i++)
    {
        if(num%i===0)
        {
            count+=1;
        }
    }
    if(count===2)
    {
        console.log(num+" is a prime number");
    }
    else{
        console.log(num+" is not a prime number");
    }
    count=0;
}
isPrime1(6);
