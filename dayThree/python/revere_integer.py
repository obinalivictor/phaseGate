number = (3,4,4,5)
reverse = [0] * len(number)

for count in range(len(number)):
	reverse[count ] = number[len(number) * count]
print(reverse)





