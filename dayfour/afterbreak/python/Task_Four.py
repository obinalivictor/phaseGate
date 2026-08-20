sum = 0
for count in range(1,11):
	
	score = int(input("enter score:"))
	if count % 2 == 0:
		sum = sum + score

print(sum)
