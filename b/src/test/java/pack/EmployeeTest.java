package pack;

import junit.framework.TestCase;
import pack.Employee;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
public class EmployeeTest extends TestCase {
	
	static Employee myInstance;
	
	
	@BeforeClass
	public static void initializeInstanceOfClass()
	{
		myInstance = new Employee();
	}
	
	@Test
	public void testCalculateSalary1() {
		assertTrue(myInstance.calculateSalary(1200, 2, 500) == 2900);
		
	}
	@Test
	public void testCalculateSalary2() {
		
		assertFalse(myInstance.calculateSalary(1200, 2, 500) != 2900);
	}
	@Test
	public void testCalculateFinancialAid() {
		assertTrue(myInstance.calculateFinancialAid(1200, 100) == 1200);
	}
	@Test
	public void testCalculateDetailsPerHour() {
		assertTrue(myInstance.calculateDetailsPerHour(10, 10) == 1);
	}
	@Test
	public void testCalculateTaxesOnNaturalPerson() {
		assertTrue(myInstance.calculateTaxesOnNaturalPerson(1200, 2, 500, 18, 2) == 580);
	}
	@Test
	public void testCalculatePaymentsToTheTradeUnion() {
		assertTrue(myInstance.calculatePaymentsToTheTradeUnion(1200, 2, 500, 1) == 29);
	}
	@Test
	public void testCalculateBonus() {
		assertTrue(myInstance.calculateBonus(10, 20) == 200);
	}

}