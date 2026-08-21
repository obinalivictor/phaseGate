



public class NoneRepeatingElement{
	public static void main(String [] args){
	
	int [] numberOne = {2,3,4,4,3,2,7};
	
	System.out.println(singleElementChecker(numberOne));
	
	
	
	
	}
	
	public static int singleElementChecker(int [] number){
	
	int currentValue = 0;
	int singleIndex = 0;
	
	for(int count = 0 ; count < number.length ; count++){
		currentValue = number[count];

	
	for(int index = 0 ; index < number.length ; count++){
	
		if(currentValue != number[index])
		currentValue = singleIndex;
		
		
			}
		
		
		}
		return singleIndex;
		}
	}



