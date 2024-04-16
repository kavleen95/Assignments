//Create a Employee Payroll clas with properties EmployeeId, employeeName, basicSalary, and designation.

public class EmployeePayroll {
    int EmployeeId;
    String EmployeeName;
    double Salary;
    String Designation;

    //Create a constructor to initialise these properties when instantiating an EmployeePayroll object


    public EmployeePayroll(int employeeId, String employeeName, double salary, String designation) {
        EmployeeId = employeeId;
        EmployeeName = employeeName;
        Salary = salary;
        Designation = designation;
    }

    //Create methods to calculate Salary , deductions, and net salary.
 public void Salary(int basic){
     double hra = 0.10 * basic;  // 10% of basic
     double da = 0.08 * basic;   // 8% of basic
     double grossSalary = basic + hra + da;

     double tax = 0.05 * grossSalary; // 5% tax on gross salary
     double netSalary = grossSalary - tax;

     System.out.println("Employee Salary Breakdown:");
    // System.out.println("Basic: " + basic);
    // System.out.println("HRA: " + hra);
     //System.out.println("DA: " + da);
     System.out.println("Gross Salary: " + grossSalary);
     System.out.println("Tax Deduction: " + tax);
     System.out.println("Net Salary: " + netSalary);
 }
  // Create the Constructor object and call the method created
    public static void main(String[] args) {
     EmployeePayroll employeePayroll = new EmployeePayroll(10, "Kavleen", 4500 , "Tester");
     employeePayroll.Salary(2500);
    }
}
