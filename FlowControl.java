package studycase_java;
import java.util.*;

public class FlowControl {
    public static void main(String[] args) {
        // Refrensi https://www.w3schools.com/java/java_conditions.asp
        // if .. elif .. else ..
        // System input integer
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Time : ");
        int time = sc.nextInt();

        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 10 && time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // System input integer
        sc = new Scanner(System.in);
        System.out.print("Masukan Day : ");
        int day = sc.nextInt();
        // Referensi https://www.w3schools.com/java/java_switch.asp
        // switch case
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
