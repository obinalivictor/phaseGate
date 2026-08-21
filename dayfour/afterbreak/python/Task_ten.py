length = 0
sum = 0
for count in range(1,11):
	
	score = int(input("enter score:"))
	if(score > 0 or score < 100):
		sum = sum + score
		length = length + 1
average = sum / length
print(average)
