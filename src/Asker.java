import java.util.List;
import java.util.Scanner;

public class Asker {
    private static String createCompany = "createCompany";
    private static String addEmployee = "addEmployee";
    private static String printMaxEmployeeSalary = "printMaxEmployeeSalary";
    private  static String averageSalary = "averageSalary";
    private static String getEmployeeSalary = "getEmployeeSalary";
    public static void main(String[] args) {
        runner("Enter command:");
    }
    public static void runner(String question) {
        Company company = null;
        while (true) {
            System.out.println("Useful commands:");
            System.out.println(createCompany);
            System.out.println(addEmployee);
            System.out.println(printMaxEmployeeSalary);
            System.out.println(averageSalary);
            System.out.println(getEmployeeSalary);
            System.out.println(question);
            Scanner scanner = new Scanner(System.in);
            String command = scanner.next();
            if (command.equals(createCompany)) {
                System.out.println("Pls enter company's name:");
                scanner = new Scanner(System.in);
                String name = scanner.next();
                System.out.println("Pls enter company's phone:");
                scanner = new Scanner(System.in);
                String phone = scanner.next();
                System.out.println("Pls enter company's address:");
                scanner = new Scanner(System.in);
                String address = scanner.next();
                company = new Company(name,phone,address);
            }else   if (command.equals(addEmployee)) {
                System.out.println("Pls enter employee's name:");
                scanner = new Scanner(System.in);
                String name = scanner.next();
                System.out.println("Pls enter employee's phone:");
                scanner = new Scanner(System.in);
                String phone = scanner.next();
                System.out.println("Pls enter employee's salary:");
                scanner = new Scanner(System.in);
                long salary = scanner.nextLong();
                    if (salary>=2000) {
                        Employee employee = Employee.newEmployee(name,phone,salary);
                        company.addEmployee(employee);
                    }
                    else {System.out.println("Incorrect Salary");
                            System.out.println("Pls try again");
               }
            }else   if (command.equals(printMaxEmployeeSalary)) {
               company.printMaxEmployeeSalary();
            }else if (command.equals(averageSalary)){
                long avSalary= company.averageSalary();
                System.out.println(avSalary);
            }else if (command.equals(getEmployeeSalary)){
                System.out.println("Pls enter employee's name");
                scanner = new Scanner(System.in);
                String name = scanner.next();
                System.out.println("Pls enter employee's phone");
                scanner = new Scanner(System.in);
                String phone = scanner.next();
                long salary = company.getEmployeeSalary(name,phone);
                System.out.println(salary);
            }
            }
        }



}
