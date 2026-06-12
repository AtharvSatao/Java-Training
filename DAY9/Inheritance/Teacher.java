package DAY9.Inheritance;

public class Teacher extends Employee {

    int exp;
    String degree;

    Teacher(int ID, String Name, String Email,
            int exp, String degree) {

        super(ID, Name, Email);
        System.out.println("I am Teacher Constructor");
        this.exp = exp;
        this.degree = degree;

    }

    void MarkAttendance() {
        System.out.println("Attendance Marked");
    }

    void Teaches() {
        System.out.println("Teacher is Teaching");
    }
}