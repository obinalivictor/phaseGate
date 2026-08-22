import java.util.Arrays;
public class TaskFour{
	public static int [] comonDuplicate(int [] numbers){
		int currentValue = 0;
		int counters = 0;
	for(int count = 0 ; count < numbers.length ; count++){
		 currentValue = numbers[count];
		 
		for(int index = 0; index < numbers.length ; index++){
			if(currentValue == numbers[index]){
				counters++;
			
				}
			}	
		}		
				
				
				
		int[] duplicates = new int[counters];		
		int counter = 0;
		int sameValue = 0;		
		for(int count = 0 ; count < numbers.length ; count++){
			sameValue = numbers[count];
			for(int index = 0; index < numbers.length ; index++){
				if(sameValue == numbers[index]){
				duplicates[counter] = sameValue;
					counter++;
				}
			}	
				
		}		
				
				
				
				
				
				
		return duplicates;		
	
	}
	public static void main(String [] args){
	
	int [] scores = {45,60,3,0,67,2,45,3,22,0};
	
	int [] result = comonDuplicate(scores);
	
	System.out.println(Arrays.toString(result));
	
	
	
	}
}






