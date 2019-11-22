
const items=[{
    name:'ear ring',
    id:1,
    price:5000
},
{
    name:'kajal',
    id:2,
    price:1000
},
{
    name:'trimmer',
    id:3,
    price:3000

},
{
    name:'beardo',
    id:4,
    price:170
}]

items.map(function(value,index)
{
    let newValue=value+300;
    return newValue;
})
console.log("after map method",items);

//using fatarrow method
const items1=items.map(value=>value+300);
console.log("using fatarrow function",items1)


items.filter(function(value,index)
{
    if(value>1000){
        return true;
    }else{
        return false;
    }
})
console.log("after filter method",items);
const items2=items.filter(value=>value>1000);
console.log("using fatarrow function",items2)
