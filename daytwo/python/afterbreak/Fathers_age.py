def age_calculator(fathers_age,sons_age):

	age_difference = 0
	
	if(fathers_age > sons_age * 2):
		age_difference = fathers_age - (sons_age * 2)	
	#return age_difference 
	
	elif(fathers_age < sons_age * 2):
		age_difference = (sons_age * 2)	- fathers_age
	
	
	return age_difference 	
	
	
daddy_age = int(34)	
	
ayo_age = int(15)


print("the father was  : ",age_calculator(daddy_age,ayo_age),"years ago")


#it works for both

	

