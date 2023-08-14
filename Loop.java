package studycase_java;
public class Loop {
    public static void main(String[] args) {
        // Referensi https://www.w3schools.com/java/java_for_loop.asp
        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String car : cars) {
            System.out.println(car);
        }

        // While loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // do - while
        int y = 0;
        do {
            System.out.println(y);
            y++;
        } while (y < 5);
    }
}
