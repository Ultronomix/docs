console.log("===================Printing and Declaring variables")

//JS is loosely typed, no need to decalre data types, and we can change them
var a = 100; //number
a = true;
a = null;
a = "now I'm a String!"

//JS adds the "var" keyword implicitly if we don't say it
b = "I was never given a variable declaration"

console.log("==================Testing type coercion")

var type1 = "5" * 5;
console.log("string times number is: " + typeof type1)

var type2 = "5" * "5";
console.log("string times string is: " + typeof type2)

var type3 = 5 + "5";
console.log("number plus string is: " + typeof type3)

var type4 = 5 + 5 + "5";
console.log("number plus number plus string is: " + typeof type4)
console.log(type4) //5 + 5 = 10 
                   //+ 5 = 105

var type5 = 5 + "5" + 5;
console.log("number plus string plus number is: " + typeof type5)
console.log(type5) //5 + 5 = 55 
                   //+ 5 = 555


console.log("=======================Truthy/Falsy")

//I want to create a function that compares two vars
function testTrueFalse(var1, var2){
    console.log(var1 + " compared to " + var2)
    console.log(var1 == var2)
    var funcScope = "I am functional scoped"
}

testTrueFalse(0, false) //true, 0 is falsy
testTrueFalse(1, true) //true, 1 is truthy
testTrueFalse(2, false) //false. 2 is truthy
testTrueFalse(2, true) //false... what??? see below

/* 
while 2 (and any number != 0) is considered truthy, the boolean true always evaluates to the number 1.
so comparing any number besides 1 to true will return false
*/

//an if statement to drive this point home
if(2){
    console.log("any number besides 0 is truthy")
    var blockScope = "I am block scoped"
}

console.log("=============global scope/hoisting")

console.log(hoisted)
//prints undefined 
//why not an error? the declaration was HOISTED

var hoisted = 10 //actually give it a value

//now its value is visible
console.log(hoisted)

//attempting hoisting with let-------------

//won't work!!! only vars are affected by hoisting

//console.log(notHoisted)

//let notHoisted = 10
