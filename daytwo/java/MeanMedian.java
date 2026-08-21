public class MeanMedian{
	public static void main(String [] args){
	
	int numberOne = 17 ;
	int numberTwo = 24;
	int numberThree = 15;
	
	int mean = 0;
	if(numberTwo > numberOne && numberTwo > numberThree)
	 mean = numberTwo;
	
	else if (numberThree > numberOne && numberThree > numberTwo)
	 mean = numberThree;
		
	
	 if(numberOne > numberTwo && numberOne > numberThree)
	 mean = numberOne;
	System.out.println("the mean is: "+ mean);	
	
	
	
	int median = numberOne + numberTwo + numberThree / 3 ;
	System.out.println("the median is: "+median);
	
	
	}
}
