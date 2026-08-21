import java.util.Arrays;
public class ReverseInteger{
	public static void main(String [] args){
	int [] number = {1,2,3,4,5};
	int [] reverse = new int [number.length];
	
	for(int count = number.length-1 ; count >= 0 ;count--){
		reverse[count] = number[number.length-1-count];
		}
		System.out.print(Arrays.toString(reverse));
	
	
	
	
	
	
	
	
	
	
	}
}
