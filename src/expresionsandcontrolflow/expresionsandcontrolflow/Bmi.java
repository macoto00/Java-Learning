package expresionsandcontrolflow.expresionsandcontrolflow;/*public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values
    }
}*/

public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;
        double heightInMSquare = (heightInM * heightInM);

        // double BMI = weight / height squared
        double BMI = (massInKg / heightInMSquare);

        // Print the Body mass index (BMI) based on these values
        // System.out.println("BMI is: " + BMI);
        System.out.println(BMI);
    }
}
