package DAY9.OOPS.Example1;

public class Capgimini {

    private boolean insurance;
    private int workingDays;
    private double appraisal;
    private String role;

    Capgimini(boolean insurance, int workingDays,
              double appraisal, String role) {

        this.insurance = insurance;
        this.workingDays = workingDays;
        this.appraisal = appraisal;
        this.role = role;
    }

    public void updateWorkingDays(int days) {

        if (role.equalsIgnoreCase("Manager")) {

            workingDays += days;

            System.out.println("Working Days Updated");
            System.out.println("Current Working Days: " + workingDays);
        }
        else {
            System.out.println("Only Manager can update working days.");
        }
    }

    public void updateAppraisal(Capgimini obj, double newAppraisal, double amt) {

        // if (role.equalsIgnoreCase("Director")) {

        //     appraisal = newAppraisal;

        //     System.out.println("Appraisal Updated");
        //     System.out.println("Current Appraisal: " + appraisal + "%");
        // }
        // else {
        //     System.out.println("Only Director can update appraisal.");
        // }

        if(this.role=="Director"){
            appraisal = newAppraisal;
        }
    }

    public void showDetails() {

        System.out.println("\n===== Employee Details =====");
        System.out.println("Role         : " + role);
        System.out.println("Insurance    : " + insurance);
        System.out.println("Working Days : " + workingDays);
        System.out.println("Appraisal    : " + appraisal + "%");
    }
}