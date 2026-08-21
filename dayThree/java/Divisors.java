public class Divisors{
	public static void main(String [] args){
	
	int number = 75;
	
	for(int count = 1 ; count < number ; count++){
	if(number % count == 0)
	System.out.println(" the divisors of: "+ number +"= " + count);
	
	}
	
	
	}
}
