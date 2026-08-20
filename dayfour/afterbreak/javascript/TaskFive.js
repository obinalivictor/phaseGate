const scanner = require("prompt-sync")();
	
	
	let sum = 0;
	for(let count = 1 ; count <= 10; count++){
	
	const Score = Number(scanner("enter score"));
	
	if(Score % 2 == 0)
	sum =sum + Score;
	}
	
	console.log("the sum of even scores is: "+ sum);
	
