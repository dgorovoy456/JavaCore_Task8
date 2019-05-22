import java.util.List;
import java.util.Scanner;

public class Asker {

    private static String createCompany = "1";
    private static String addEmployee = "2";
    private static String printMaxEmployeeSalary = "3";
    private  static String averageSalary = "4";
    private static String getEmployeeSalary = "5";
    public static void main(String[] args) throws InterruptedException {
        runner("Enter command:");
    }
    public static void runner(String question) throws InterruptedException {
        long salary=0;
        Company company = null;
        while (true) {
            System.out.println("Useful commands:");
            System.out.println("1 - " +"createCompany");
            System.out.println("2 - "+"addEmployee");
            System.out.println("3 - "+"printMaxEmployeeSalary");
            System.out.println("4 - "+"averageSalary");
            System.out.println("5 - "+ "getEmployeeSalary");
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
                    company = new Company(name, phone, address);
                }
            if (company!=null) {
                 if (command.equals(addEmployee)) {
                    System.out.println("Pls enter employee's name:");
                    scanner = new Scanner(System.in);
                    String name = scanner.next();
                    System.out.println("Pls enter employee's phone:");
                    scanner = new Scanner(System.in);
                    String phone = scanner.next();
                    System.out.println("Pls enter employee's salary:");
                    scanner = new Scanner(System.in);
                    try {
                        salary = scanner.nextLong();
                    }
                    catch (Exception e) {
                        System.out.println("Pls enter numeric value");
                        Thread.sleep(2000);

                     }

                    if (salary >= 2000) {
                        Employee employee = Employee.newEmployee(name, phone, salary);
                        company.addEmployee(employee);
                    } else {
                        System.out.println("Incorrect Salary");
                        System.out.println("Pls try again");
                    }
                } else if (command.equals(printMaxEmployeeSalary)) {
                    company.printMaxEmployeeSalary();
                } else if (command.equals(averageSalary)) {
                    long avSalary = company.averageSalary();
                    System.out.println(avSalary);
                } else if (command.equals(getEmployeeSalary)) {
                    System.out.println("Pls enter employee's name");
                    scanner = new Scanner(System.in);
                    String name = scanner.next();
                    System.out.println("Pls enter employee's phone");
                    scanner = new Scanner(System.in);
                    String phone = scanner.next();
                    salary = company.getEmployeeSalary(name, phone);
                    System.out.println(salary);
                }
            }
            }
        }



}
