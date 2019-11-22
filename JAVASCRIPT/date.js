var todaydate = new Date();
console.log('today date',todaydate);

console.log('day',todaydate.getDate());
console.log('year',todaydate.getFullYear());
console.log('month',todaydate.getMonth());
console.log('date',todaydate.getDate());

var constMilli = new Date(0);
console.log('date',constMilli);
var conststring = new Date('nov 10')
console.log('date string constructor',conststring);
var constyear = new Date(2017,10);
console.log('date year constructor',constyear)

