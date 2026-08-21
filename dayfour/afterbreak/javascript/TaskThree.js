const scanner = require("prompt-sync")();
	let average = 0;
	let length = 0;
	let sum = 0;
	for(let count = 1 ; count <= 10; count++){
	
	const Score = Number(scanner("enter score"));
	
	sum =sum + Score;
	length = length + 1;
	}
	average = sum /length;
	console.log("the average of ten scores is: "+ average);
	console.log("the sum of ten scores is: "+ sum);
