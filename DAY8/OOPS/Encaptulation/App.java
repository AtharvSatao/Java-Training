package DAY8.OOPS.Encaptulation;

public class App {
    public static void main(String[] args) {

        MITEmp emp1 = new MITEmp("Atharv", 101, 50000);

        emp1.showSalary();

        emp1.setSalary(60000);

        System.out.println("Updated Salary: " + emp1.getSalary());
    }
}