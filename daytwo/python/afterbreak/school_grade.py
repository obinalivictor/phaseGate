def Grade(scoreOne,scoreTwo,scoreThree): 
	summing = scoreOne + scoreTwo + scoreThree
	average_score = summing / 3
	
	if(90 <= average_score <= 100):
		letter_grade = "A"
	elif(80 <= average_score <= 90):
		letter_grade = "B"

	elif(70 <= average_score <= 80):
		letter_grade = "C"
		
	elif(60 <= average_score <= 70):	
		letter_grade = "D"	
		
	elif(0 <= average_score <= 60):	
		letter_grade = "F"

	return letter_grade 
	
	
	
	
	
scoreOne = int(input("enter score"))	
	
scoreTwo = int(input("enter score"))	
	
scoreThree = int(input("enter score"))	
	
grade = Grade(scoreOne,scoreTwo,scoreThree)	
	
print("the grade for the average of three scores is: ",grade)	
	
	
	
	
	
	
