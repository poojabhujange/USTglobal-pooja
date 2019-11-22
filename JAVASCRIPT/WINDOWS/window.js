console.log('window object' ,window)
console.log('this keyword',this)
console.log(this==window);

//window.alert('well come to javascrip')
//alert('well come pooja')


//let conformdelete = confirm('are you sure you want to delete')
//console.log('conform',conformdelete);

//let username = prompt('what is your name','pooja')
//console.log('user name',username);


const person = {
    firstname : 'pooja',
    age : 26,
    lastname : 'bhujange',
    getname : function(){
        console.log('this keyword',this)//this key when ever invok method with  a object this keyword chages to the object
        return this.firstname+ ' '+this.lastname
    }
}

let fullname = person.getname()
console.log('fullname',fullname)