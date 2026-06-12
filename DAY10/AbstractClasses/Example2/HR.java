package DAY10.AbstractClasses.Example2;
    public class HR extends Employee {
    double allowance;
    
    HR(int id, String name, double salary, double allowance) {

        super(id, name, salary);
        this.allowance = allowance;
    }

    @Override
    double calculateAnnualSalary() {
        return (salary * 12) + allowance;
    }
}
