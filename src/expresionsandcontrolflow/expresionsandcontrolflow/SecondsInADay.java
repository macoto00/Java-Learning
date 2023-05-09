package expresionsandcontrolflow.expresionsandcontrolflow;//public class SecondsInADay {
//    public static void main(String[] args) {
//        int currentHours = 14;
//        int currentMinutes = 34;
//        int currentSeconds = 42;
//
//        // Write a program that prints the remaining seconds (as an integer) from a
//        // day if the current time is represented by the variables above
//    }
//}

public class SecondsInADay {
    public static void main(String[] args) {
        /*int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int hours = 24;
        int minutes = 60;
        int seconds = 60;

        int a = hours - currentHours;
        int b = minutes - currentMinutes;
        int c = seconds - currentSeconds;

        int d = a * minutes;
        int e = (d + b) * 60;
        int f = e + c;

        System.out.println("Remained seconds are: " + f);*/

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int day = 24;
        int dayMinutes = (day * 60);
        int daySeconds = dayMinutes * 60;
        int remainedSeconds = ((currentHours * 60) * 60) + (currentMinutes * 60) + currentSeconds;
        int remained = daySeconds - remainedSeconds;

        // System.out.println("The day has a seconds:  " + daySeconds);
        System.out.println("Remained seconds are: " + remained);

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above
    }
}