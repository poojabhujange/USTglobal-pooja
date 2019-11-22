const hobbies=['sleeping','drawimg','eating','coding','roaming']
console.log(typeof hobbies);
const isArrayOrNot=Array.isArray(hobbies);
console.log('hobbies array or not',isArrayOrNot);
const hasCricket=hobbies.includes('cricket',100);
console.log('using include methods',hasCricket);
hobbies.push('guitar','volley ball');
console.log('after push methods',hobbies);
hobbies.pop();
console.log('after pop methods',hobbies);
hobbies.unshift('numismatics','singing')
console.log('after unshift',hobbies)
hobbies.shift();
console.log('after shift methods',hobbies);


const hobbies1=['sleeping','cricket','eating','coding','roaming']
hobbies1.splice(1,2,'bird watching','pubg')
console.log('after splice method',hobbies1)
const afterSlice=hobbies1.slice(2,4)
console.log('after slice method',hobbies1)
console.log('after slice method',afterSlice)
const indexOfCoding=hobbies.indexOf('coding',2)
console.log('indexof method',indexOfCoding);
const stringHobbies=hobbies.join('-')
console.log("after join",stringHobbies)

const numbers=[10,20,30,40]
numbers.map(function(val,index)
{
    let newValue=val+50;
    return newValue;
})
console.log("after map method",numbers);
const numbers1=numbers.map(value=>value+50);
console.log("using fatarrow function",numbers1)

numbers.filter(function(val,index)
{
    if(val>200){
        return true;
    }else{
        return false;
    }
})
console.log("after filter method",numbers);
const numbers3=numbers.filter(val=>val>30);
console.log("using fatarrow function",numbers3)


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
}