public class TransactionLog{
	public static double deposit(double depositAmount){
	double accountBalance = 0.0;
	
	//double depositAmount = 34;
	
	double newBalance = depositAmount + accountBalance;
	
	return newBalance;
	
	}
	
	public static double withdraw(double balance,double deposit,double withdrawalAmount){

	balance =  balance + deposit;
	
	double newBalance = balance - withdrawalAmount;
	return newBalance;
	}
	
	
}
