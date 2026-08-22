import java.util.Arrays;
public class TaskTwo{
	public static int[] negativeReplacer(int [] numbers){
	
	for(int count = 0 ; count < numbers.length ; count++){
		if(numbers[count] < 0)
		numbers[count] = 0;
	
		}
		return numbers;
	}
	public static void main(String [] args){
	
	int [] number = {5,-9,3,-6,2,-11};
	int [] secondNumbers = negativeReplacer(number);
	
	System.out.println(Arrays.toString(secondNumbers));
	
	
	}
}
