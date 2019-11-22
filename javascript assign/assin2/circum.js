var PI=3.14;
var radius1;
var radius2;
var radius3;
var radius4; 

function circum(radius1) {

    console.log( 'circum=',2*PI*radius1)
    
}
circum(3)



var value= function(radius2) {

    console.log( 'value=',2*PI*radius2)
    
}
value(2);
//self invok
(
    function(radius3)
            {
        console.log( 'circum=',2*PI*radius3)
    }
)
(2);


var value2 = radius4 =>{
    console.log( 'value2=',2*PI*radius4)
}

value2(3)

