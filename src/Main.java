public class Main {
    public static void main(String[] args) {



        Company gl = new Company("GlobalLogic", "Hrinchenka","0991");
        gl.printMaxEmployeeSalary();
        Employee dima = Employee.newEmployee("Dima","+38067222222",2010);

        gl.addEmployee("Denys","093926662", 20);
        gl.addEmployee("Vasya","093926662", 23000);
        gl.addEmployee(dima);

        gl.printMaxEmployeeSalary();
       // gl.removeEmployee(dima);
        gl.removeEmployee("Vasya","093926662", 23000);
        long avSalary = gl.averageSalary();
        System.out.println(avSalary);
        long salary = gl.getEmployeeSalary("Denys","093926662");
        System.out.println("Denys" + "-" + salary);
        System.out.println(gl.verifyMinSalary(2000));


    }

}
