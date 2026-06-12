package DAY10.AbstractClasses.Example2;

    public class Developer extends Employee {

    double bonus;

    Developer(int id, String name, double salary, double bonus) {

        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    double calculateAnnualSalary() {
        return (salary * 12) + bonus;
    }
    }
