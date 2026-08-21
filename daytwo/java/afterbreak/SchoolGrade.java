import java.util.Scanner;
public class SchoolGrade{
	public static String grade(int scoreOne,int scoreTwo,int scoreThree){
	int sum = scoreOne + scoreTwo + scoreThree;
	int averageScore = sum / 3;
	
	String letterGrade = "e";
	
	if(averageScore > 90 && averageScore <= 100)
		letterGrade = "A";
		
	else if(averageScore > 80 && averageScore <= 90 )	
		letterGrade = "B";	
		
	else if(averageScore > 70 && averageScore <= 80)	
		letterGrade = "C";
		
	else if(averageScore >= 60 && averageScore <= 70)	
		letterGrade = "D";	
		
	else if(averageScore < 60)	
		letterGrade = "F";
		
		
return letterGrade;		
		
		
		
		
}

public static void main(String [] args){
Scanner input = new Scanner (System.in);

System.out.println("enter score: ");
int scoreOne = input.nextInt();


System.out.println("enter score");
int scoreTwo = input.nextInt();


System.out.println("enter score");
int scoreThree = input.nextInt();

String Grade = grade(scoreOne, scoreTwo, scoreThree);

System.out.println("grade is:" + Grade);




}


}
