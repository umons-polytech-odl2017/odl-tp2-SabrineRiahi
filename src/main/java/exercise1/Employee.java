package exercise1;

import exercise2.Payable ;

public abstract class Employee implements Payable {

	String name ;
	int numberHours = 0 ;
	int quantitySell = 0 ;

	@Override
	public abstract int computeSalary();

	public Employee (String name) {
		this.name = name ;
	}

	public void sell() {
		quantitySell += 1 ;
	}

	public int getQuantitySell() {
		return quantitySell ;
	}

	public void workOneHour() {
		numberHours += 1 ;
	}

	public int getNumberHours () {
		return numberHours ;
	}

	public String getName() {
		return name;
	}
}
