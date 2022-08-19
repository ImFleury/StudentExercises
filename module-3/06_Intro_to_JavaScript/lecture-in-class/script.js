/*
    Example of a multi-line comment just like in C#/Java
*/

// Single line comment

/**
 * Functions start with the word function.
 * They don't have a return type and the naming convention is camel-case.
 */
function variables() {
  // Declares a variable where the value cannot be changed
  const DAYS_PER_WEEK = 7;
  console.log(`There are ${DAYS_PER_WEEK} days in a week`);

  // Declares a variable those value can be changed
  let daysPerMonth = 30;
  console.log(`There are ${daysPerMonth} days in the month`);
  
  // Declares a variable that will always be an array
  const weekdays = [
        "Sunday",
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday"
  ];

  console.table(weekdays);
}

/**
 * Functions can also accept parameters.
 * Notice the parameters do not have types.
 * @param {Number} param1 The first number to display
 * @param {Number} param2 The second number to display
 */
function printParameters(param1, param2) {
  console.log(`The value of param1 is ${param1}`);
  console.log(`The value of param2 is ${param2}`);
}


function testScope(){

  let x = 4;
  let name = 'Bob';

  if (true){ 
      let x = 5;    
      let name = 'Greg';
      console.log(`x = ${x} and name = ${name}`); }

  console.log(`x = ${x} and name = ${name}`);
}

function testVariableType(value){
  let x = value;
  console.log(`x = ${x}`);
  
  x = 5;
  console.log(`x = ${x}`);
}
/**
 * Compares two values x and y.
 * == is loose equality
 * === is strict equality
 * @param {Object} x
 * @param {Object} y
 */
function equality(x, y) {
  console.log(`x is ${typeof x}`);
  console.log(`y is ${typeof y}`);

  console.log(`x == y : ${x == y}`); // true
  console.log(`x === y : ${x === y}`); // false
}

/**
 * Each value is inherently truthy or falsy.
 * false, 0, '', null, undefined, and NaN are always falsy
 * everything else is always truthy
 * @param {Object} x The object to check for truthy or falsy,
 */
function falsy(x) {
  if (x) {
    console.log(`${x} is truthy`);
  } else {
    console.log(`${x} is falsy`);
  }
}


function testIfStatement(value){

  if(value){
    console.log(`${value} is of type ${typeof value} and is true`);
  } else {
    console.log(`${value} is of type ${typeof value} and is false`);
  }
}

function testSwitchStatement(){

  today = new Date().getDay();

  switch(today) {
    case 0:
      day = "sunday";
      break;
    case 1: 
    case 2:
    case 3:
      day = "It's the workday";
      break;
    default:
      day = "Some other day";


  }

  console.log(`Today is ${day}`);
}

/**
 *  Objects are simple key-value pairs
    - values can be primitive data types
    - values can be arrays
    - or they can be functions
*/
function objects() {
  const person = {
    firstName: "Bill",
    lastName: "Lumbergh",
    age: 42,
    employees: [
      "Peter Gibbons",
      "Milton Waddams",
      "Samir Nagheenanajar",
      "Michael Bolton"
    ],
    toString: function(){
      return `${this.firstName} ${this.lastName} ${this.age}`;
    }
    
  };

  // Log the object
  console.table(person);
 // console.table(person.employees);

  // Log the first and last name
console.log(`name: ${person.firstName} ${person.lastName}`);
 person.firstName = 'Wally';
 person.lastName = 'Webber';
console.log(`name: ${person.firstName} ${person.lastName}`);

console.log(person.toString());
  // Log each employee

  for (let i=0; i < person.employees.length; i++){
    console.log( `Employee ${i + 1} is ${person.employees[i]}`);
  }
}

function testSubstrings(value){
  console.log(` slice 4,8 : ${value.slice(4,8)}`);
  
  console.log(` substring 4,8 : ${value.substring(4,8)}`);

  console.log(` substr 4,8 : ${value.substr(4,8)}`);
}
// slice(start, end)
// substring(start, end)
// substr(start, length)


function testConcat(){
  value1 = " Test string 1       ";
  value2 = "    Test string 2";
  value3 = "test string 3";

  console.log(`Concatenated String 1: ${value1.trim().concat(" ").concat(value2.trim()).concat(value3.trim())}`);
  console.log(`Concatenated String 2: ${value1.trim().concat(" ", value2.trim(), " ",value3.trim())}`);
}

function testArrays(){
  let ourArray = [10,20,30];
  ourArray.push(40);
  ourArray.push(50);
  console.table(ourArray);

  let returnValue = ourArray.pop();

  console.log(returnValue);
  console.table(ourArray);

  ourArray.unshift(1);
  ourArray.unshift(2);

  console.table(ourArray);

  ourArray.shift();
  console.table(ourArray);
}
/*
########################
Function Overloading
########################

Function Overloading is not available in Javascript. If you declare a
function with the same name, more than one time in a script file, the
earlier ones are overriden and the most recent one will be used.
*/

function Add(num1, num2) {
  return num1 + num2;
}

function Add(num1, num2, num3) {
  return num1 + num2 + num3;
}

/*
########################
Math Library
########################

A built-in `Math` object has properties and methods for mathematical constants and functions.
*/

function mathFunctions() {
  console.log("Math.PI : " + Math.PI);
  console.log("Math.LOG10E : " + Math.LOG10E);
  console.log("Math.abs(-10) : " + Math.abs(-10));
  console.log("Math.floor(1.99) : " + Math.floor(1.99));
  console.log("Math.ceil(1.01) : " + Math.ceil(1.01));
  console.log("Math.random() : " + Math.random());
}

/*
########################
String Methods
########################

The string data type has a lot of properties and methods similar to strings in Java/C#
*/

function stringFunctions(value) {
  console.log(`.length -  ${value.length}`);
  console.log(`.endsWith('World') - ${value.endsWith("World")}`);
  console.log(`.startsWith('Hello') - ${value.startsWith("Hello")}`);
  console.log(`.indexOf('Hello') - ${value.indexOf("Hello")}`);

  /*
    Other Methods
        - split(string)
        - substr(number, number)
        - substring(number, number)
        - toLowerCase()
        - trim()
        - https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String
    */
}

function testSplit(stringValue, splitValue){
  newArray = stringValue.split(splitValue);

  console.log(newArray);

}
