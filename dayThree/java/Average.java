public class Average{
	public static void main(String [] args){
	int sum = 0;
	int length = 0;
	int average = 0;
	for(int count = 1 ; count <= 100 ; count++){
		sum = sum + count;
		length = length + 1;
		}
		average = sum / length;
		
		
		System.out.println("the average is: " + average);
		//System.out.print(sum);
	}
}
