public class FathersAge{
	public static int ageCalculator(int dadYears,int sonYears){
	
	int howManyYearsAgo = 0;
	
	if(dadYears > sonYears * 2)
	howManyYearsAgo = dadYears - (sonYears * 2);
	
	else if(dadYears < sonYears * 2)
	howManyYearsAgo = (sonYears * 2) - dadYears;
	
	return howManyYearsAgo;
	
	}
	public static void main(String [] args){
	
	int daddyAge = 30;
	int tobiAge = 17;
	
	System.out.println("the father was the twice the sons years or will be "+ageCalculator(daddyAge,tobiAge) + "years");
	
	}
}
