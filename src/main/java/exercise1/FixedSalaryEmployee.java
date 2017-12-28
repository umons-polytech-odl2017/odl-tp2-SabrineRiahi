package exercise1;

public class FixedSalaryEmployee extends Employee {

	int fixedSalary = 0 ;

	public FixedSalaryEmployee (String name, int fixedSalary) {
		super(name) ;
		this.fixedSalary = fixedSalary ;
	}

	@Override
	public int computeSalary() {
		return fixedSalary;
	}
}
