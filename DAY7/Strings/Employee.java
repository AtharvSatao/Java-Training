package DAY7.Strings;

public class Employee {

    static String[] Employees = {
            "Shlok Kumar",
            "Pankaj Oberoi",
            "Rohit Sharma",
            "Virat Kohli",
            "Aman Singh"
        };
        
    static void findByFirst() {
        String input = "Pankaj";
        int flag = 0;

        for (String name : Employees) {
            if (name.startsWith(input)) {
                System.out.println("Mil Gaya Majdoor");
                System.out.println(name);
                flag = 1;
            }
        }

        if (flag == 0) {
            System.out.println("Bhag Gaya Yaha Se");
        }
    }

    static void findByLast() {
        String input = "Sharma";
        int flag = 0;

        for (String name : Employees) {
            if (name.endsWith(input)) {
                System.out.println("Employee Found: " + name);
                flag = 1;
            }
        }

        if (flag == 0) {
            System.out.println("Employee Not Found");
        }
    }

    static void CountofEmp() {
        System.out.println("Total Employees: " + Employees.length);
    }

    static void LongestName() {
        String longest = Employees[0];

        for (String name : Employees) {
            if (name.length() > longest.length()) {
                longest = name;
            }
        }

        System.out.println("Longest Name: " + longest);
    }

    static void UpperCaseNames() {
        System.out.println("Names in Uppercase:");

        for (String name : Employees) {
            System.out.println(name.toUpperCase());
        }
    }

    public static void main(String[] args) {

        
        findByFirst();
        findByLast();
        CountofEmp();
        LongestName();
        UpperCaseNames();
    }
}