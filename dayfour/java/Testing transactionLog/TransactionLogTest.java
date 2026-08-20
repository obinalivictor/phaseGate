import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TransactionLogTest{
	@Test
	public void TestThatDepositIsWorking(){
	
	double depositAmount = 3456.00;
	
	double balance = 0.0;
	
	 balance = balance + depositAmount;
	
	double expected = TransactionLog.deposit(balance);
	
	double actual = 3456.00;
	
	assertEquals(expected,actual);
	}
	
	@Test
	public void TestThatDepositIsWorking1(){
	
	double depositAmount = 3456.00;
	
	double balance = 0.0;
	
	 balance = balance + depositAmount;
	
	double expected = TransactionLog.deposit(balance);
	
	double actual = 3456.00;
	
	assertEquals(expected,actual);
	}
}







