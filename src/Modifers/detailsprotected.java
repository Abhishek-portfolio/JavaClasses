package Modifers;

	class DetailsProtected {
    protected String EmpName = "Abhishek";
    protected String EmpMailid = "Cgabhishek23@gmail.com";
    protected int EmpCode = 2610;
    protected byte EmpAge = 24;
    protected long MobileNumber = 929544452;

    // Inner class Employee extending DetailsProtected
    class Employee extends DetailsProtected {
        private String joiningDate = "03/01/2023"; // Changed to String for correct format
        
        public String getJoiningDate() {
            return joiningDate;
        }
    }

    public static void main(String[] args) {
        // Create an instance of Employee
        DetailsProtected details = new DetailsProtected();
        Employee employeeDetails = details.new Employee();
        
        // Accessing the protected variables through the instance
        System.out.println("Employee Name: " + employeeDetails.EmpName);
        System.out.println("Employee Mail ID: " + employeeDetails.EmpMailid);
        System.out.println("Employee Code: " + employeeDetails.EmpCode);
        System.out.println("Employee Age: " + employeeDetails.EmpAge);
        System.out.println("Employee Mobile Number: " + employeeDetails.MobileNumber);
        System.out.println("Joining Date: " + employeeDetails.getJoiningDate());
    }
}