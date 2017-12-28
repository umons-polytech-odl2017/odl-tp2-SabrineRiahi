package exercise1;

public abstract class Employee {

	String name ;
	int numberHours = 0 ;
	int quantitySell = 0 ;

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
