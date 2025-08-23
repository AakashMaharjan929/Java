public class Employee {
    private String emp_name;
    private String emp_address;
    private String emp_designation;
    private String emp_gender;
    private double emp_salary;

    // Method to input employee information
    public void inputEmployee(String name, String address, String designation, String gender, double salary) {
        emp_name = name;
        emp_address = address;
        emp_designation = designation;
        emp_gender = gender;
        emp_salary = salary;
    }

    // Method overloading to input employee information with default values
    public void inputEmployee(String name, String address) {
        emp_name = name;
        emp_address = address;
        emp_designation = "Unknown";
        emp_gender = "Unknown";
        emp_salary = 0.0;
    }

    // Method to display employee information
    public void displayEmployee() {
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Address: " + emp_address);
        System.out.println("Employee Designation: " + emp_designation);
        System.out.println("Employee Gender: " + emp_gender);
        System.out.println("Employee Salary: " + emp_salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.inputEmployee("Aakash", "ktm", "Manager", "Male", 5000.0);
        emp1.displayEmployee();

        Employee emp2 = new Employee();
        emp2.inputEmployee("Peepal", "ktm");
        emp2.displayEmployee();
    }
}