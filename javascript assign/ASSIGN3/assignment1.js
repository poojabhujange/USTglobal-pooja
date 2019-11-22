var i;
var value=1;
var value1=1;
var value2=1;
var value3=1;
// named function
function fact(num1)
{
    for(i=1;i<=num1;i++)
    {
        value=value*i;
    }
    console.log('Factorial of '+num1+" is "+value);
}
fact(2);
// anonymous function
var fact1 = function(num2)
            {
                for(i=1;i<=num2;i++)
                {
                    value1=value1*i;
                }
                console.log('Factorial of '+num2+" is "+value1);
            }
fact1(3);
// self invoked function
(
    function(num2)
            {
                for(i=1;i<=num2;i++)
                {
                    value2=value2*i;
                }
                console.log('Factorial of '+num2+" is "+value2);
            }
)
(4);
// fat arrow function
var fact3 = num2 => {
    for(i=1;i<=num2;i++)
    {
        value3=value3*i;
    }
    console.log('Factorial of '+num2+" is "+value3);
}
fact3(5);