package DAY9.Inheritance;

public class Demo {
    public static void main(String[] args) {

        Teacher anish = new Teacher(
                101,
                "Anish",
                "anish@gmail.com",
                5,
                "MCA"
        );

        System.out.println();
        anish.MarkAttendance();
        anish.Teaches();
        anish.TakeLeaves();

        Teacher Ayushi = new Support(102, "Ayushi", "a@gmail.com", 10, "BTech", true, 10);
    }
}