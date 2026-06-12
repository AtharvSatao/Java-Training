package DAY8.OOPS.Encaptulation;

public class MITEmp {
    public String name;
    public int EmpId;
    private double Salary;

    public MITEmp(String name, int EmpId, double Salary) {
        this.name = name;
        this.EmpId = EmpId;
        this.Salary = Salary;
    }

    public void showSalary() {
        System.out.println("Salary is: " + Salary);
    }

    public void setSalary(double amt) {
        Salary = amt;
    }

    public double getSalary() {
        return Salary;
    }
}