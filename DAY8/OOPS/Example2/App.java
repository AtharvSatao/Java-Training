package DAY8.OOPS.Example2;

public class App {
    public static void main(String[] args) {

        StudentRecord aman = new StudentRecord();

        aman.Name = "Aman";
        aman.RollNo = 7;
        aman.Class = 9;
        aman.Marks = 80;
        aman.Attendance = 90;

        System.out.println("Name: " + aman.Name);
        System.out.println("Roll No: " + aman.RollNo);
        System.out.println("Class: " + aman.Class);
        System.out.println("Marks: " + aman.Marks);
        System.out.println("Attendance: " + aman.Attendance + "%");

        aman.Attending();
        aman.Bunk();
    }
}