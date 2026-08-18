let numberOne = 34;
let numberTwo = 32;
let numberThree = 36;

let mean = 0;
let median= Number(numberOne + numberTwo + numberThree) / 3 ;

if (numberOne > numberTwo && numberOne > numberThree )
	mean = numberOne;

else if (numberTwo > numberOne && numberTwo > numberThree )
	mean = numberTwo;


else if (numberThree > numberOne && numberThree > numberTwo )
	mean = numberThree;


console.log(mean);
console.log(median);











