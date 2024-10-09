import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float height, weight;
        System.out.println("Enter height in m: ");
        height = sc.nextFloat();
        System.out.println("Enter weight in kg: ");
        weight = sc.nextFloat();
        double bmi = weight / (height * height);
        System.out.println("BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi < 25) {
            System.out.println("Normal");
        }
        else if (bmi < 30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obesity");
        }
    }
}
