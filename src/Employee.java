
public class Employee {
	private String nameString;
	private int age;
	private double salary;
	public Employee() {
	}
	public Employee(String nameString, int age, double salary) {
		this.nameString = nameString;
		this.age = age;
		this.salary = salary;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [nameString=" + nameString + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
