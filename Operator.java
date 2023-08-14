package studycase_java;
import java.util.*;

public class Operator {
    public static void main(String[] args) {
        // Referensi https://www.w3schools.com/java/java_operators.asp

        // Modulus
        int x = 2 % 3;
        System.out.println(x);

        // increment
        x = 0;
        x++;
        x += 2; // x = x + 2
        System.out.println(x);

        // decrement
        int y = 1;
        --y;
        System.out.println(y);

        // Logical Operators
        System.out.println((1 < 5 && 10 < 5)); // AND
        System.out.println((1 < 5 || 10 < 15)); // OR

        // System input integer
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Bilanagan : ");
        int a = sc.nextInt();
        System.out.println("Bil = " + a);

        sc = new Scanner(System.in);
        System.out.print("Masukan String : ");
        String str = sc.nextLine();
        System.out.println("String = " + str);
    }
}
