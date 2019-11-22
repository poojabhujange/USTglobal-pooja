var limit = prompt("Enter the limit 'n' to generate the fibonacci series:", " ");
var f1=0;
var f2=1;

console.log(f1,f2)
function fibonacci(limit) {
var i,f3;
for(i=2; i<limit; i++)
{
 f3=f1+f2;
 console.log(f3)
 f1=f2;
 f2=f3;
}

}
fibonacci(9)




var a=0;
var b=1;
var value=function (limit) {
    var i,c;
    for(i=2; i<limit; i++)
    {
     c=a+b;
     console.log(c);
     a=b;
     b=c;
    }
    }
    value(9);

var a1=0;
var b1=1;

(    function (limit) {
        var i,c1;
        for(i=2; i<limit; i++)
        {
         c1=a1+b1;
         console.log(c1)
         a1=b1;
         b1=c1;
        }
        }
)
(9);
 

var a2=0;
var b2=0;
var value2 = limit=> {
    var i,c2;
    for(i=2; i<limit; i++)
    {
     c2=a2+b2;
     console.log(c2)
     a2=b2;
     b2=c3;
    }
    }
    value2(9)
    
