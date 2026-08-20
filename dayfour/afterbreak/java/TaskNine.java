import java.util.Scanner;
public class TaskOne{
	public static void main(String [] args){
	Scanner input = new Scanner (System.in);
	
	int sum = 0;
	for(int count = 1 ; count <= 10; count++){
	System.out.println("enter score: ");
	int Score = input.nextInt();
	if(Score > 0 || Score < 100)
	sum =sum + Score;
	}
	
	System.out.println("the sum  scores is: "+ sum);
	
	
	}
}
