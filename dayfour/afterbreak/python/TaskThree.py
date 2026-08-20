average = 0
length = 0
sum = 0
for count in range(1,11):
	
	score = int(input("enter score:"))
	sum = sum + score
	length = length + 1
average = sum / length	
print("the average of scores is: ",average)
print("the sum of scores is: ",sum)
