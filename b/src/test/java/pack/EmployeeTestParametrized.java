package pack;

import junit.framework.TestCase;
import pack.Employee;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)

public class EmployeeTestParametrized extends TestCase {
	private double inputNumber1;
	private double inputNumber2;
	private double inputNumber3;
	private double expectedResult;
	private Employee myInstance;
	
	@Before
	   public void initialize() {
		myInstance = new Employee();
	   }
	public EmployeeTestParametrized (double inputNumber1, double inputNumber2, double inputNumber3, double expectedResult) {
	      this.inputNumber1 = inputNumber1;
	      this.inputNumber2 = inputNumber2;
	      this.inputNumber3 = inputNumber3;
	      this.expectedResult = expectedResult;
	   }
	
	@Test
	public void testCalculateSalary1() {
		assertEquals(expectedResult, myInstance.calculateSalary(inputNumber1, inputNumber2, inputNumber3));
		
	}
	@Parameterized.Parameters
	   public static Collection inputData() {
	      return Arrays.asList(new Object[][] {
	         { 2,1,2, 4 },
	         { 10,1,2, 12 },
	         { 20,1,2, 22},
	         { 60,1,2, 63 },
	         { 80,1,2, 82 }
	      });
	   }
	
}