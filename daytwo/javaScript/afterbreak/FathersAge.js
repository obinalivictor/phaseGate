const ageCalculator = (fathersAge,sonsAge)=>{

let ageDifference = 0;

if(fathersAge > sonsAge * 2)
ageDifference = fathersAge - (sonsAge * 2);

else if (fathersAge < sonsAge * 2)
ageDifference = (sonsAge * 2) - fathersAge ;


return ageDifference ;

}


let daddyAge = 45;
let sonAge = 17;

wasTwiceAs = ageCalculator(daddyAge,sonAge);

console.log("the father was twice as old as his son: "+ wasTwiceAs + "years ago" );

let fathersAge = 30;
let boysAge = 17

willBeTwiceAs = ageCalculator(fathersAge,boysAge);

console.log("the father will be twice as old as his son in: "+ willBeTwiceAs + "years time" );

