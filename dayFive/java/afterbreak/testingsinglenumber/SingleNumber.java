public class SingleNumber{
	public static int totalOfDigit(int  number){
	
	int totalNumber = 0;

	while(number != 0){
	
	int lastDigit = number % 10;
	totalNumber += lastDigit;
	number/= 10;
	}
	
	return totalNumber;
	
	}
	
	public static void main(String [] args){
	
	int numberOne = 143;
	
	System.out.println(totalOfDigit( numberOne));
	
	
	
	}
}
