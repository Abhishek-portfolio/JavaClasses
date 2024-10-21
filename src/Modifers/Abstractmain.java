package Modifers;

abstract class Abstractmain {
	public String Name ="Abhishek";
	public String Designation = "Junior Test Engineer";
	public int Code = 2610;
	public byte Age = 24;
	abstract void Working();
}
class Employee extends Abstractmain {
	public String password = "Wordp@ss";
	private String userid = "AbhishekC";
	//OverRiding
	public void Working() {
	System.out.println("Organisation:ZOHO");
	}
	


//public class main{
	public static void main(String[] args) {
		Employee Details = new Employee();
		System.out.println("Name:"+" "+Details.Name);
		System.out.println("Desgination:"+" "+Details.Designation);
		System.out.println("Employee Code:"+" "+Details.Code);
		System.out.println("Age:"+" "+Details.Age);
		Details.Working();

	}
}
