package pack;


public class Employee {

	public double calculateSalary(double baseRate, double exprianceRatio, double bonus) {
		return baseRate * exprianceRatio + bonus;
	}

	public double calculateFinancialAid(double baseRate, double percentOfBaseRate) {

		return baseRate * percentOfBaseRate;
	}

	public double calculateDetailsPerHour(int details, double hours) {

		return hours / details;
	}

	public double calculateTaxesOnNaturalPerson(double baseRate, double exprianceRatio, double bonus,
			double taxOnNaturalPersonPercent, double militaryTaxPercent) {

		return (baseRate * exprianceRatio + bonus) * (taxOnNaturalPersonPercent + militaryTaxPercent) / 100;
	}

	public double calculatePaymentsToTheTradeUnion(double baseRate, double exprianceRatio, double bonus,
			double percentToTheTradeUnion) {
		return (baseRate * exprianceRatio + bonus) * percentToTheTradeUnion / 100;
	}

	public double calculateBonus(int details, double bonusForDetail) {
		return details * bonusForDetail;

	}

	

}
