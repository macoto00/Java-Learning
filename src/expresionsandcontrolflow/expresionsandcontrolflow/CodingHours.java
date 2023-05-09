package expresionsandcontrolflow.expresionsandcontrolflow;/*public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
    }
}*/

public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int daily = 6;
        int weeks = 17;
        int days = 5;
        float attendeeHours = ((daily * days) * weeks);
        float avgWeeklyHours = 52;
        float avgSemesterHours = (avgWeeklyHours * weeks);
        float percent = ((attendeeHours / avgSemesterHours) * 100);

        // print attendee hours
        System.out.println("The attendee codes " + attendeeHours + " hours.");

        /*// print average coder hours
        System.out.println("The average codes " + avgSemesterHours + " hours.");*/

        // print percent
        System.out.println(percent);
    }
}

