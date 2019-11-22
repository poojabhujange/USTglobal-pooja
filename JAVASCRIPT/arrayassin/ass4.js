const hobbies=['dancing','bikeride','eating','penting','cocking']
console.log(typeof hobbies);
const isArrayOrNot=Array.isArray(hobbies);//method
console.log('hobbies array or not',isArrayOrNot);
const hasCricket=hobbies.includes('batmetan',100);
console.log('using include methods',batmetan);



const colors=['black','red','white','green','blue']
console.log(typeof colors);
const isArrayOrNot1=Array.isArray(colors);
console.log('colors array or not',isArrayOrNot1);
const hasPink=colors.includes('pink',3);
console.log('using include methods',hasPink);



const fruits=['apple','orange','grapes']
console.log(typeof fruits);
const isArrayOrNot2=Array.isArray(fruits);
console.log('fruits array or not',isArrayOrNot2);
const hasGuava=fruits.includes('guava',2);
console.log('using include methods',hasGuava);



const vegetables=['carrot','beetroot','raddish']
console.log(typeof vegetables);
const isArrayOrNot3=Array.isArray(vegetables);
console.log('vegetables array or not',isArrayOrNot3);
const hasBeans=vegetables.includes('beans',1);
console.log('using include methods',hasBeans);



const languages=['kannada','english','hindi']
console.log(typeof languages);
const isArrayOrNot9=Array.isArray(languages);
console.log('languages array or not',isArrayOrNot9);
const hasTamil=languages.includes('tamil',2);
console.log('using include methods',hasTamil);



const accessories=['bangles','eyeliner','lipstick']
console.log(typeof accessories);
const isArrayOrNot4=Array.isArray(accessories);
console.log('accessories array or not',isArrayOrNot4);
const hasEarrings=accessories.includes('earrings',1);
console.log('using include methods',hasEarrings);




const names=['pooja','raju','kanaka']
console.log(typeof names);
const isArrayOrNot7=Array.isArray(names);
console.log('names array or not',isArrayOrNot7);
const hasraghu=names.includes('pooj',3);
console.log('using include methods',hasraghu);





const shapes=['circle','rectangle','triangle']
console.log(typeof shapes);
const isArrayOrNot5=Array.isArray(shapes);
console.log('shapes array or not',isArrayOrNot5);
const hasCircle=shapes.includes('circle',3);
console.log('using include methods',hasCircle);



const months = ['janauary','febrauary','march']
console.log(typeof months);
const isArrayOrNot6=Array.isArray(months);
console.log('months array or not',isArrayOrNot6);
const hasJanuary=months.includes('january',2);
console.log('using include methods',hasJanuary);
months.push('december');
console.log('after push methods',months);
months.pop();
console.log('after pop methods',months);


const days = ['monday','tuesday','wenssdaye','saturday','sunday']
console.log(typeof days);
const isArrayOrNot8=Array.isArray(days);
console.log('days array or not',isArrayOrNot8);
const hasday=days.includes('monday',1);
console.log('using include methods',hasday);




//push method
hobbies.push('guitar');
console.log('after push methods',hobbies);
months.push('december');
console.log('after push methods',months);
fruits.push('raddish');
console.log('after push methods',fruits);
vegetables.push('cauliflower');
console.log('after push methods',vegetables);
colors.push('black','brown');
console.log('after push methods',colors);
accessories.push('lipcare','anklets');
console.log('after push methods',accessories);
names.push('geeta','suma');
console.log('after push methods',names);
games.push('foot ball','volley ball');
console.log('after push methods',games);
shapes.push('rhombus');
console.log('after push methods',shapes);


//pop method
hobbies.pop();
console.log('after pop methods',hobbies);
languages.pop();
console.log('after pop methods',languages);
months.pop();
console.log('after pop methods',months);
colors.pop();
console.log('after pop methods',colors);
vegetables.pop();
console.log('after pop methods',vegetables);
fruits.pop();
console.log('after pop methods',fruits);
names.pop();
console.log('after pop methods',names);
accessories.pop();
console.log('after pop methods',accessories);
shapes.pop();
console.log('after pop methods',shapes);
hobbies.pop();
console.log('after pop methods',hobbies);



//unshift method
hobbies.unshift('numismatics','singing')
console.log('after unshift',hobbies)
languages.unshift('urdu','telugu')
console.log('after unshift',language)
shapes.unshift('pentagon','hexagon')
console.log('after unshift',shapes)
accessories.unshift('rings','anklets')
console.log('after unshift',accessories)
fruits.unshift('guava','banana')
console.log('after unshift',fruits)
vegetables.unshift('bitterguard','brinjal')
console.log('after unshift',vegetables)
months.unshift('sep','oct')
console.log('after unshift',months)
names.unshift('shashank','rahul')
console.log('after unshift',names)
hobbies.unshift('numismatics','singing')
console.log('after unshift',hobbies)



//shift method
hobbies.shift();

console.log('after shift methods',hobbies);
languages.shift();

console.log('after shift methods',languages);
months.shift();

console.log('after shift methods',months);
fruits.shift();

console.log('after shift methods',fruits);
names.shift();

console.log('after shift methods',names);
vegetables.shift();

console.log('after shift methods',vegetables);
shapes.shift();

console.log('after shift methods',shapes);
accessories.shift();

console.log('after shift methods',accessories);
colors.shift();

console.log('after shift methods',colors);
hobbies.shift();
console.log('after shift methods',hobbies);


//splice method
const hobbies1=['sleeping','cricket','eating','coding','roaming']
hobbies1.splice(1,2,'bird watching','pubg')
console.log('after splice method',hobbies1)

const months1=['jan','feb','march','april']
months1.splice(1,2,'may','june')
console.log('after splice method',months11)

const fruits1=['watermelon','apple','orange','gua','roaming']
fruits.splice(1,2,'watermelon','guava')
console.log('after splice method',)

const hobbies1=['sleeping','cricket','eating','coding','roaming']
hobbies1.splice(1,2,'bird watching','pubg')
console.log('after splice method',hobbies1)
const hobbies1=['sleeping','cricket','eating','coding','roaming']
hobbies1.splice(1,2,'bird watching','pubg')
console.log('after splice method',hobbies1)
const hobbies1=['sleeping','cricket','eating','coding','roaming']
hobbies1.splice(1,2,'bird watching','pubg')
console.log('after splice method',hobbies1)
const hobbies1=['sleeping','cricket','eating','coding','roaming']
hobbies1.splice(1,2,'bird watching','pubg')
console.log('after splice method',hobbies1)
const hobbies1=['sleeping','cricket','eating','coding','roaming']
hobbies1.splice(1,2,'bird watching','pubg')
console.log('after splice method',hobbies1)
const hobbies1=['sleeping','cricket','eating','coding','roaming']
hobbies1.splice(1,2,'bird watching','pubg')
console.log('after splice method',hobbies1)
const hobbies1=['sleeping','cricket','eating','coding','roaming']
hobbies1.splice(1,2,'bird watching','pubg')
console.log('after splice method',hobbies1)


//slice method
const afterSlice=hobbies1.slice(2,4)
console.log('after slice method',hobbies1)
console.log('after slice method',afterSlice)
const afterSlice=hobbies1.slice(2,4)
console.log('after slice method',hobbies1)
console.log('after slice method',afterSlice)
const afterSlice=hobbies1.slice(2,4)
console.log('after slice method',hobbies1)
console.log('after slice method',afterSlice)
const afterSlice=hobbies1.slice(2,4)
console.log('after slice method',hobbies1)
console.log('after slice method',afterSlice)
const afterSlice=hobbies1.slice(2,4)
console.log('after slice method',hobbies1)
console.log('after slice method',afterSlice)
const afterSlice=hobbies1.slice(2,4)
console.log('after slice method',hobbies1)
console.log('after slice method',afterSlice)
const afterSlice=hobbies1.slice(2,4)
console.log('after slice method',hobbies1)
console.log('after slice method',afterSlice)
const afterSlice=hobbies1.slice(2,4)
console.log('after slice method',hobbies1)
console.log('after slice method',afterSlice)
const afterSlice=hobbies1.slice(2,4)
console.log('after slice method',hobbies1)
console.log('after slice method',afterSlice)
const afterSlice=hobbies1.slice(2,4)
console.log('after slice method',hobbies1)
console.log('after slice method',afterSlice)


//indexof method
const indexOfCoding=hobbies.indexOf('coding',2)
console.log('indexof method',indexOfCoding);
const indexOfCoding=hobbies.indexOf('coding',2)
console.log('indexof method',indexOfCoding);
const indexOfCoding=hobbies.indexOf('coding',2)
console.log('indexof method',indexOfCoding);
const indexOfCoding=hobbies.indexOf('coding',2)
console.log('indexof method',indexOfCoding);
const indexOfCoding=hobbies.indexOf('coding',2)
console.log('indexof method',indexOfCoding);
const indexOfCoding=hobbies.indexOf('coding',2)
console.log('indexof method',indexOfCoding);
const indexOfCoding=hobbies.indexOf('coding',2)
console.log('indexof method',indexOfCoding);
const indexOfCoding=hobbies.indexOf('coding',2)
console.log('indexof method',indexOfCoding);
const indexOfCoding=hobbies.indexOf('coding',2)
console.log('indexof method',indexOfCoding);
const indexOfCoding=hobbies.indexOf('coding',2)
console.log('indexof method',indexOfCoding);
const indexOfCoding=hobbies.indexOf('coding',2)
console.log('indexof method',indexOfCoding);
const indexOfCoding=hobbies.indexOf('coding',2)
console.log('indexof method',indexOfCoding);


//join method
const stringHobbies=hobbies.join('-')
console.log("after join",stringHobbies)
const stringFruits=fruits.join('-')
console.log("after join",stringFruits)
const stringVegetables=vegetables.join('-')
console.log("after join",stringVegetables)
const stringFruits=fruits.join('-')
console.log("after join",stringFruits)
const stringNames=names.join('-')
console.log("after join",stringNames)
const stringAccessories=accessories.join('-')
console.log("after join",stringAccessories)
const stringShappes=shapes.join('-')
console.log("after join",stringShappes)
const stringLanguages=languages.join('-')
console.log("after join",stringLanguages)
const stringMonths=months.join('-')
console.log("after join",stringMonths)
const stringHobbies=hobbies.join('-')
console.log("after join",stringHobbies)


//map method
const numbers=[10,20,30,40]
numbers.map(function(val,index)
{
    let newValue=val+50;
    return newValue;
})
console.log("after map method",numbers);
const numbers1=numbers.map(value=>value+50);
console.log("using fatarrow function",numbers1)


//filter method
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

