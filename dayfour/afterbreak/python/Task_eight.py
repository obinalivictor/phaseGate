sum = 0
for count in range(1,11):
	
	score = int(input("enter score:"))
	if(score > 100 or score < 0):
		print("invalid score")
		break
	sum = sum + score

print(sum)
