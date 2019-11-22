/*function first()
    {
      setTimeout(function()
      {
          console.log('first function exicute')
      },0)
    }

    function second() {
        console.log('second function exicute')
        
    }

    first()
    second()

*/   


    /*function first()
    {
      setTimeout(function()
      {
          console.log('first function exicute')
      },0)
      console.log('executed')
    }

    function second() {
        console.log('second function exicute')
        
    }

    first()
    second()*/


/*
    function first()
    {
      setTimeout(function()
      {
          console.log('first function exicute')
      },5000)
     
    }

    function second() {
        console.log('second function exicute')
        
    }

    first()
    second()
*/

    function first(callback){
      setTimeout(function()
      {
          console.log('first function exicute')
          callback();
      },5000)
     
    }

    function second() {
        console.log('second function exicute')
        
    }
    first(second)
    







