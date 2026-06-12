package DAY10.AbstractClasses.Example2;

public class Marketing extends Employee {

    double incentive;
    Marketing(int id, String name, double salary, double incentive) {

        super(id, name, salary);
        this.incentive = incentive;
    }

    @Override
    double calculateAnnualSalary() {
        return (salary * 12) + incentive;
    }
}
