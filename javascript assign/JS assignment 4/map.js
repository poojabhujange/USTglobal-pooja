const item=[{
    name:'Earring',
    id:1,
    price:5000
// },{
//     name:'kajal',
//     id:2,
//     price:3000
// },{
//     name:'trimmer',
//     id:3,
//     price:1000
// },{
//     name:'beard',
//     id:4,
//     price:170
}]
const item1=item.map(function(value,index){
    let newvalue=item[value]+300
    return newvalue;
})
console.log(item1)