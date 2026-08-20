length = 0
sum = 0
for count in range(1,11):
	
	score = int(input("enter score:"))
	if score % 2 == 0:
		sum = sum + score
		length = length + 1
		
average = sum / length		
		
print("the sum of even scores is: ",sum)		
print("the average of even scores is: ",average)
