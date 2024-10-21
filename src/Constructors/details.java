package Constructors;

public class details {
	String EmpName;
	int EmpCode;
	int EmpAge;
	
	public details (String Name,int Code, int age) {
	
		EmpName =Name;
		EmpCode =Code;
		EmpAge =age;
	}

	public static void main(String[] args) {
		details Details = new details ("Abhishek",2610,24);
		System.out.println("Employee Name:"+" "+Details.EmpName);
		System.out.println("Employee Code:"+" "+Details.EmpCode);
		System.out.println("Employee Age:"+" "+Details.EmpAge);

	}

}
