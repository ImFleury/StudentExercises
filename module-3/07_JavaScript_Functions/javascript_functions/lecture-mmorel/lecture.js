/***************************************************************** */
/***************  Array Functions  ******************************* */
/***************************************************************** */

let x = ['p0', 'p1', 'p2'];
// call_me(x);

/**
 * Throws alert for each array element
 * 
 * @param {array} params 
 */
function call_me(params) {
  for (i = 0; i < params.length; i++) {
    alert(params[i])
  }
}

let oddArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11];

/**
 * state purpose
 * 
 * state return type and purpose
 * 
 * @param {array} someArray 
 * @returns {array} newArray
 */
function oddOnly(someArray) {
  let newArray = [];
  for (let i = 0; i < someArray.length; i++) {
    if (someArray[i] % 2 != 0) {
      newArray.push(someArray[i]);
    }
  }
  return newArray;
}

function arrayFunctions() {
  // Split a string into an array
  let phrase1 = "When in the course of human events it becomes necessary for one people to dissolve the political bands";
  // split here...
  let words = phrase1.split(" ");
  // printArray(words);
  // call printArray here...


  // array.slice gets a "sub-array" but does not modify the original
  // array.slice(startElement, nonInclusiveEndElement)
  console.log('*** ***\r\narray.slice gets a "sub-array" but does not modify the original');
  // slice here...
  let arr = words.slice(3, 7);
  printArray(arr);
  printArray(words);


  // array.splice gets a "sub-array" and removes those elements.
  // array.splice(start, count, newelements…)
  console.log('*** ***\r\narray.splice gets a "sub-array" and removes those elements.');
  // splice here...
  arr = words.splice(3, 5, "middle", "of", "the", "array", "list");
  printArray(arr);
  printArray(words);


  // array.concat(arr2)
  // array.concat joins two arrays, and does not modify either.
  console.log('*** ***\r\narray.concat joins two arrays, and does not modify either.');
  // concat here...
  let bigArray = words.concat(arr);
  printArray(words);
  printArray(arr);
  printArray(bigArray);



}

/**
 * Joins an array of strings together with the - separator and prints to console.
 * @param {string[]} arr The array to be printed
 */
function printArray(arr) {
  console.log(arr);
  console.log(arr.join("-"));
}



/***************************************************************** */
/************* Functions and Parameters ************************** */
/***************************************************************** */
/**
 * Write a function called multiplyTogether that multiplies two numbers together. But 
 * what happens if we don't pass a value in? What happens if the value is not a number?
 *
 * @param {number} firstParameter the first parameter to multiply
 * @param {number} secondParameter the second parameter to multiply
 */
function multiplyTogether(firstParameter, secondParameter = 1) {
  return firstParameter * secondParameter;
}
/**
 * This version makes sure that no parameters are ever missing. If
 * someone calls this function without parameters, we default the
 * values to 0. However, it is impossible in JavaScript to prevent
 * someone from calling this function with data that is not a number.
 * Call this function multiplyNoUndefined
 *
 * @param {number} [firstParameter=0] the first parameter to multiply
 * @param {number} [secondParameter=1] the second parameter to multiply
 */
function multiplyNotDefined(firstParameter = 0, secondParameter = 1) {
  return firstParameter * secondParameter;
}

/**
 * How can I write the multiply function so that it will multiply any number of parameters?
 */
function multiply() {
  if (arguments.length == 0) {
    return 0;
  }

  let product = 1;
  for (arg of arguments) {
    if (typeof (arg) === "number") {
      product *= arg;
    }
  }

  return product;
}

// How can we change this so that it can add up zero to three numbers?

/**
 * 
 * @param {number} num1 A number to add
 * @param {number} num2 A number to add
 * @param {number} num3 A number to add
 * @returns {number} The sum of numbers passed in
 */
function Add(num1 = 0, num2 = 0, num3 = 0) {
  return num1 + num2 + num3;
}


/**
 * How can I write the add function so that it will add any number of parameters?
 */


function Add() {
  let sum = 0;
  for (let i = 0; i < arguments.length; i++) {

    if (typeof (arguments[i]) === "number") {
      sum += arguments[i];
    }
  }
  return sum;
}

/***************************************************************** */
/***************** Anonymous Functions  ************************** */
/***************************************************************** */

/*********************************************************
 * Anonymous Functions
 * 
 * Functions are a "first-class object" in JavaScript.  
 * There are numerous ways to define functions.  We have seen just one 
 * way so far... with the "function" keyword similar to how we define a method in C#.
 */
// Anonymous functions
function doubleIt(n) {
  return n * 2;
}

/***************************
 * There is actually a "variable" called doubleIt now
 */
// print it...
console.log(`doubleIt is a type ${typeof (doubleIt)}`);
console.log(doubleIt.name);


/************************
 * Now that the function is defined, we can actually "assign" that function to 
 * another variable.
 */
let f = doubleIt; //f is now a function
console.log(`f is a type ${typeof (f)}`);
console.log(f.name);

// Call the function doubleIt
doubleIt(4);


// Call the function f
f(4);


/*****************************
 * Another way to define a function - assign it to a variable directly
 * 
 */
// function tripleIt(n){
//   return n * 3;
// }

// let tripleIt = function (n) {
//   return n * 3;
// }

// let tripleIt = (n) => {return n * 3;};

let tripleIt = n => n * 3;

/*******************************
 * And finally, a shortcut for the above using lambda (fat arrow)
 * 
 */
let quadrupleIt = (n) => { return n * 4; };

/************************************
 * You may even see a shorter-cut, called an expression-bodied function
 * but I won't use it normally
 */

let quintupleIt = n => n * 5;
console.log(quintupleIt.name);
console.log(quintupleIt);

/************************************
 * Now we can write a function, which takes another function as a parameter.
 * The passed-in function can be called (executed / invoked).
 */
function toAllElements(array, functionToApply) {
  let returningArray = [];

  for (let i = 0; i < array.length; i++) {
    returningArray.push(functionToApply(array[i]));
  }

  return returningArray;
}

/***********************************
 * Define an array of numbers
 */
let myArray = [1, 2, 3, 4, 5];

/**********************************
 * Now in the Console window, call toAllElements, passing in myArray, and a function
 * which will perform an operation on every element
 */
toAllElements(myArray, doubleIt);
toAllElements(myArray, tripleIt);
toAllElements(myArray, quadrupleIt);
toAllElements(myArray, quintupleIt);

toAllElements(myArray, (n) => { return n + 10; });




function applyToAllElements(array, operation) {
  let returningArray = [];

  for (let i = 0; i < array.length; i++) {
    returningArray.push(operation(array[i]));
  }
  return returningArray;
}


function upCase(s) {
  return s.toUpperCase();
}
/*************************************************************************************
 * Using Anonymous functions
 * ***********************************************************************************
 */

/**
* Takes an array and returns a new array of only numbers that are
* multiples of 3
*
* @param {number[]} numbersToFilter numbers to filter through
* @returns {number[]} a new array with only those numbers that are
*   multiples of 3
*/
function allDivisibleByThree(numbersToFilter) {

  // return numbersToFilter.filter( (number)=> {
  //   return number % 3 == 0;
  // })

  // return numbersToFilter.filter( number => {return number % 3 == 0} )
  // return numbersToFilter.filter( number =>  number % 3 == 0 )

  return numbersToFilter.filter(x => x % 3 == 0);
}

/***************************************************************** */
/********************* Array Functions  ************************** */
/***************************************************************** */
/**
 * Takes an array and, using the power of anonymous functions, generates
 * their sum.
 *
 * @param {number[]} numbersToSum numbers to add up
 * @returns {number} sum of all the numbers
 */
function sumAllNumbers(numbersToSum) {
  return numbersToSum.reduce(

    // add each number to the previous sum 
    // (sum, numberToSumValue) => {
    //   return sum + numberToSumValue;
    // }

    // (accumulator, currentValue ) => {
    //   return accumulator + currentValue;
    // }

    //(accumulator, currentValue ) =>  accumulator + currentValue
    (x, y) => x + y
  );


}





let people = [
  { name: "Mike", age: 21, height: 71 },
  { name: "Barb", age: 25, height: 72 },
  { name: "Dave", age: 30, height: 73 },
  { name: "Mary", age: 19, height: 74 },
];

// List all the people using forEach
function listAllPeople(people) {
  // people.forEach(person => {
  //   console.log(`${person.name} age: ${person.age}`);
  // })

  // people.forEach(arrayElement => console.log(`${arrayElement.name} ${arrayElement.age}`));

  people.forEach(p => console.log(`${p.name} ${p.age}`));
}

// Filter people by height or age
function shortPeople(people) {
  return people.filter(p => {
    return p.height < 72;
  })
}

// Map Name to uppercase
function upperName(people) {
  return people.map(p => {
    return p.name.toUpperCase();

  })
}


// Reduce to total height of all people
function totalHeight(people) {
}

// Sort the array

function sortPeople(sortBy = "n") {

  switch (sortBy.toLowerCase()) {

    case "n":
      return people.sort((a, b) => {
        return (a.name > b.name ? 1 : (a.name < b.name ? -1 : 0))
      });
    case "h":
      // return people.sort((a, b) => {
      //   return (a.height > b.height ? 1 : (a.height < b.height ? -1 : 0))
      // });
      return people.sort((a, b) => {
        if (a.height > b.height) {
          return 1;
        }
        else if (a.height < b.height) {
          return -1;
        }
        else {
          return 0;
        }
      });
    case "a":
      return people.sort((a, b) => {
        return a.age - b.age;
      });
    default: return people;

  }
}
