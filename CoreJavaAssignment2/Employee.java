package CoreJavaAssignment2;

public class Employee extends Persons {
	private int employeeId;
	private double salary;

	
	public Employee(String name, int age, String address, int employeeId, double salary) {
		super(name, age, address);
		this.employeeId = employeeId;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String getName() {

		return super.getName();
	}

	@Override
	public int getAge() {
		return super.getAge();
	}

	@Override
	public String getAddress() {
		return super.getAddress();
	}

	@Override
	public String toString() {
		return "name:"+getName()+"\n "+"age:"+getAge()+"\n"+"address:"+getAddress()+"\n"+"employeeId:"+getEmployeeId()+"\n "+"salary:"+getSalary();
	}
}
