public class TaskThree{
	public static int[] DescendingArray(int [] numbers){
	
	for(int count = 0 ; count < numbers.length ; count++){
	
		for(int index = 0 ; index < numbers.length-1 ; index++){
		if(numbers[index] < numbers[index +1]){
		int temp = numbers[index];
		numbers[index] = numbers[index + 1];
		numbers[index + 1] = temp;
	
	
	
	         }
	
	
	    }
	
	
	}
	
		
	return numbers;
	
	}
	public static void main(String [] args){
	
	int  [] numbers = {5,0,3,0,2,0};
	
	System.out.println(DescendingArray(numbers));
	
	
	
	
	
	}
}
