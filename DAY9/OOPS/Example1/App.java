package DAY9.OOPS.Example1;

public class App {

    public static void main(String[] args) {

        Capgimini Emp1 = new Capgimini(true, 5, 9.5, "Developer");
        Capgimini Emp2 = new Capgimini(false, 4, 12.5, "Manager");
        Capgimini Emp3 = new Capgimini(true, 1, 15, "Director");

        System.out.println("===== Employee 1 =====");
        Emp1.showDetails();
        //Emp1.writeCode();

        System.out.println("\n===== Employee 2 =====");
        Emp2.showDetails();
        Emp2.updateWorkingDays(2);

        System.out.println("\n===== Employee 3 =====");
        Emp3.showDetails();
        //Emp3.updateAppraisal(20);

        System.out.println("\n===== Updated Details =====");
        Emp1.showDetails();
        Emp2.showDetails();
        Emp3.showDetails();
    }
}