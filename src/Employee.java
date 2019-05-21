public class Employee {
    private String name;
    private String phone;
    private long salary;

    private Employee(String name, String phone, long salary) {
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }
    public long getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                '}';
    }
    public static Employee newEmployee (String name, String phone, long salary) {
        return new Employee(name,phone,salary);
    }
    @Override
    public boolean equals(Object obj) {
        Employee employee = (Employee) obj;
        return this.name.equals(employee.name)&&this.phone.equals(employee.phone);
    }
}

