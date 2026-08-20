import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TransactionLogTest{
	@Test
	public void TestThatDepositIsWorking(){
	
	double balance = 0.0;
	balance = balance + 3453;
	
	double expected = TransactionLog.deposit(balance);
	double actual = 3453.0;
	assertEquals=(actual,expected);
	}
}







