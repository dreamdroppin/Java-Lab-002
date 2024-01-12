import javax.print.DocFlavor;

public class Date {
    public static String Thursday = "Thursday";
    public static String January = "January";
    public static void main(String[] args) {

        int day = 25;
        String date = Thursday;
        String month = January;
        int year = 2024;

        // Format American
        System.out.println("Today's date is: " + Thursday + ", " + January + " " + day + ", " + year);

        // Format European
        System.out.println("Today's date is: " + Thursday + " " + day + " " + January + " " + year);

    }
}