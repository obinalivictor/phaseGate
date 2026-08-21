public class Addition{
	public static int sum(int numberOne,int numberTwo){
	return numberOne + numberTwo;
	
	}
	
	public static void evenChecker(int number){
	if(number % 2 == 0)
	System.out.println("number is an even number");
		else
		System.out.println("number is not even");
	}
	
	
	public static int square(int number){
	
	return number * number;
	
	}
	
	public static void primeChecker(int number){
		int counter = 0;
	for(int count = 1 ; count <= number ; count++){
		if(number % count == 0)
		counter++;
		}
		if(counter == 2)
		System.out.println("number is prime");
		else if(counter > 2)
		System.out.println("not a prime number");
	}
	
	public static int findingLargest(int numberOne,int numberTwo,int numberThree){
	int largest = 0;
	if(numberTwo > numberOne && numberTwo > numberThree)
		largest = numberTwo;
		
	if(numberOne > numberTwo && numberOne > numberThree)
		largest = numberOne;
	
	if(numberThree > numberOne && numberThree > numberTwo){
		largest = numberThree;
	}
		return largest;
	}
	
	
	
	public static int reverseNumber(int number){
	int reverse = 0;
	int lastDigit = 0;
	while(number > 0){
	
	lastDigit = number % 10;
	
	reverse = (reverse * 10) + lastDigit;
	
	number /= 10;
	
	}
		return reverse;
	
	}
	
	
	//public static int StringOccurence(String word){
	
	//int counter = 0;
	
	//for(int count = 0 ; count < word.length(); count++){
	//if(word.charAt[0] == word[count])
	//	counter++;
	//	}
	//return counter;
	
	//}
	
	public static void main(String [] args){
	
	String name = "nathaniel";
	int numberOne = 34;
	int numberTwo = 5;
	int numberFour = 12345;
	int numberThree = 4;
	int total = sum( numberOne, numberTwo);
	System.out.println("total is: "+ total);
	
	evenChecker( numberOne);
	
	System.out.println("this is is the square: "+square(numberTwo));
	primeChecker(numberThree);
	
	System.out.println("this is is the largest number: "+findingLargest( numberOne,numberTwo, numberThree));
	System.out.println("this is is the reversed number: "+reverseNumber( numberFour));	
	//System.out.println("this is is the number of times first character occurs: "+StringOccurence( name));	
	}
}
