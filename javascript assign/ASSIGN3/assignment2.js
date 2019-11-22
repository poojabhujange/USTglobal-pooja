// named function
function circum(num)
{
    console.log('circumference = ',2*Math.PI*num);
}
circum(2);
// anonymous function
var circum1 = function(num)
              {
                console.log('circumference = ',2*Math.PI*num);
              }
circum1(3);
// self invoked function
(
    function(num)
    {
      console.log('circumference = ',2*Math.PI*num);
    } 
)
(4);
// fat arrow function
var circum2 = num => console.log('circumference = ',2*Math.PI*num);
circum2(5);