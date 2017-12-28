package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee {

	int baseSalary ;
	int commission ;

	public BaseSalaryPlusCommissionEmployee (String name, int baseSalary, int commission) {
		super(name);
		this.baseSalary = baseSalary ;
		this.commission = commission ;
	}

	@Override
	public int computeSalary() {
		return baseSalary + getQuantitySell()*commission ;
	}
}
