import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SingleNumberTest{

	@Test
	public void TestThatitsWorking(){
	
	int number = 143;
	
	int expected = SingleNumber.totalOfDigit(number);
	int actual = 8;
	assertEquals(actual,expected);
	
	}


}



