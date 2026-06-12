package DAY1.Conditional_Statements;

public class Practice {
    public static void main(String[] args) {
        Double weight = 70.0;
        Double height = 1.7;
        Double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);

        if(bmi<18.5){
            System.out.println("Underweight");
        }
        else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("Healthy weight");
        }
        else if(bmi>=25 && bmi<29.9){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obesity");
        }
    }
}
