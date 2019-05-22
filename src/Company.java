import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Company {
    private String name;
    private String address;
    private String phoneCompany;
    private List<Employee> employees;
    public Company(String name, String address, String phoneCompany) {
        this.name = name;
        this.address = address;
        this.phoneCompany = phoneCompany;
        this.employees= new ArrayList<>();
    }

    public void printMaxEmployeeSalary () {
        long max=0;
        String printMaxEmployeeSalaryName="";
        for (Employee employee : employees) {
            if (printMaxEmployeeSalaryName==employee.getName()) {
                printMaxEmployeeSalaryName=employee.getName();
            }
            if (employee.getSalary()>max) {
                max = employee.getSalary();
                printMaxEmployeeSalaryName = employee.getName()+" " +max;
            }
            }
        System.out.println(printMaxEmployeeSalaryName);
        }
        public void addEmployee (Employee employee) {
        employees.add(employee);
        }
    public void addEmployee (String name, String phone, long salary) {
        Employee employee = Employee.newEmployee(name,phone,salary);
        employees.add(employee);
    }
    public void removeEmployee (Employee employee) {
        employees.remove(employee);
    }
    public void removeEmployee (String name, String phone, long salary) {
        Employee employee = Employee.newEmployee(name,phone,salary);
        employees.remove(employee);
    }
    public long averageSalary () {
        long some =0;
        for (Employee employee : employees) {
            some=some+employee.getSalary();
        }
    return some/employees.size();
    }
   public long getEmployeeSalary (String name, String phone) {
        long salary=0;
       for (Employee employee : employees ) {
           if (employee.getName().equals(name)&&employee.getPhone().equals(phone)) {
               salary = employee.getSalary();
           }
       }
       return salary;
    }
    public Employee verifyMinSalary (long minSalary) {
        Employee name=null;
        for (Employee employee : employees) {
            if (employee.getSalary()<minSalary) {
                name= employee;
            }
        }
        return name;
    }
}

