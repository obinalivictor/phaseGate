public class ReverseString{
	public static void main(String [] args){
	
	String [] name  = {"r","o","s","e"};
	String [] reverse = new int [name.length];
	//for(int count = name.charAt(-1) ; count >= 0 ; count++)
	//System.out.println(name.charAt(count));
	
	for(int count = 1 ; count <= name.length ; count++){
	reverse = count + reverse;
	}
		System.out.print(reverse);
	}
}
