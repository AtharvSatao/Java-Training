package DAY9.Inheritance;

public class Employee {

    int ID;
    String Name;
    String Email;

    Employee(int ID, String Name, String Email) {
        this.ID = ID;
        this.Name = Name;
        this.Email = Email;

        System.out.println("I am Employee Constructor");
    }

    void TakeLeaves() {
        System.out.println("Chutti pe hai");
    }
}