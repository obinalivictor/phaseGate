import java.util.Arrays;
public class TaskOne{
	public static int[] primeSorter(int [] numbers){
	int [] secondNumbers = new int [numbers.length];
	
	int currentValue = 0;
	for(int count = 0 ; count < numbers.length ; count++){
		currentValue = numbers[count];
		int counter = 0;
		for(int index = 1 ; index <= currentValue ; index++){
		
		if(currentValue % index == 0){
			counter++;
			
		}	
			
		
			
		}	
		if(counter == 2)	
		secondNumbers[count] = currentValue ;	
	   }
	   return secondNumbers;
	}
	public static void main(String [] args){
	
	int [] scores = {5,9,3,6,2};
	
	System.out.println(Arrays.toString(primeSorter( scores)));
	
	
	}
}
