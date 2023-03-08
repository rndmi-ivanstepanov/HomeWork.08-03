import java.time.LocalDate;

public class Methods {
    public static void main(String[] args) {
        checkIfLeap(400);
        defineAppVersion(2021, 0);
        int ans = getDeliveryDays(21);

        if (ans == -1) {
            System.out.println("You're out of delivery range, sorry");
        } else {
            System.out.println("Required days for delivery: " + ans);
        }
    }

    public static void checkIfLeap(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap-year");
        } else {
            System.out.println(year + " is not a leap-year");
        }
        System.out.println();
    }

    public static void defineAppVersion(int deviceYear, int OS) {
        int currentYear = LocalDate.now().getYear();

        if (OS == 1 && deviceYear < currentYear) {
            System.out.println("You have an obsolete Android device, follow this link to install light app");
        } else if (OS == 1)
            System.out.println("For Android installation follow this link");

        if (OS == 0 && deviceYear < currentYear) {
            System.out.println("You have an obsolete IOS device, follow this link to install light app");
        } else if (OS == 0)
            System.out.println("For IOS installation follow this link");
        System.out.println();
    }

    public static int getDeliveryDays(int distance) {
        int days = 1;

        if (distance > 100) {
            return -1;
        } else {
            if (distance > 20) {
                days++;
            }
            if (distance > 60) {
                days++;
            }
        }
        return days;
    }
}
