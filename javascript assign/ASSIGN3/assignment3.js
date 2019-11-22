var a = [1,2,3,4];
var sum1=0;
var sum2=0;
var sum3=0;
var sum4=0;
// named function
function add()
{
    for(var i=0;i<a.length;i++)
    {
        sum1 = sum1+a[i];
    }
    console.log('sum of array elements is '+sum1); 
}
add();
// anonymous function
var add1 = function()
           {
            for(var i=0;i<a.length;i++)
            {
                sum2 = sum2+a[i];
            }
            console.log('sum of array elements is '+sum1);
           }
add1();
// self invoked function
(
    function()
           {
            for(var i=0;i<a.length;i++)
            {
                sum3 = sum3+a[i];
            }
            console.log('sum of array elements is '+sum1);
           }
)
();
// fat arrow function
var add2 = () => {
    for(var i=0;i<a.length;i++)
    {
        sum3 = sum3+a[i];
    }
    console.log('sum of array elements is '+sum1);
   }
   add2();
