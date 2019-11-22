var brand=['kingfishar','bisleri','aqua','kinley']
console.log('for of loop')
for(var element of brand)
{
    console.log('Brand',element);

}

console.log('****************');

console.log('for in loop')

for(var index in brand){
    console.log('brand=',brand[index])
}

console.log('*************')
//for in lop is used for objrct and array
var persion ={
    name:'sundar',
    age:68,
    color:'white',

}
for(var key in persion){
    console.log('value=',persion[key]);
}


console.log('**************************')
console.log('for each method array')
var movie=['sholay','hum apke hai kon','hum sat sat','photocopy']
movie.forEach(function(value,index){
    console.log('movie',value)
    console.log('movie index=',index)
})



var items=[
    {
        item:'bagles',
        id:1,
        price:200
    },
    {
        item:'eyeliner',
        id:2,
        price:256

    },
    {
        item:'watch',
        id:4,
        price:1780
    },

    {
        item:'bike',
        id:3,
        price:456
    }
]
items.forEach(function(item,index)
{
    console.log('items',item)
    console.log('items=',index)
})



console.log('*****************')

var nummbe=[10,20,30]
nummbe[4]=40
nummbe['value']=60;
console.log(nummbe)