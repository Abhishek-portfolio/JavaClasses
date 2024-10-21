package Constructors;

public class Employee {
	String Name;
	
	public Employee(String Abhi) {
		Name =Abhi;
	}

	public static void main(String[] args) {
		Employee details = new Employee("Abhishek");
		System.out.println(details.Name);

	}

}
