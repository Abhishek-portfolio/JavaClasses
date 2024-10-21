package Encapusaltion;

 class Employee {
	private String name;
	
	//Setter
	public void setname(String name) {
		this.name = name;
	}
	
	//Getter
	public String getname(){
		return name;
	}
 }
	public class Main {
		
	public static void main(String[] args) {
		Employee details = new Employee();
		details.setname("Abhishek");
		System.out.println(details.getname());
	}

}
