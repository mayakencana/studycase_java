package studycase_java;
public class Variable {
    public static void main(String[] args) {
        // Referensi https://www.w3schools.com/java/java_variables.asp
        int myNum = 5; // Integer (whole number)
        float myFloatNum = 5.99f; // Floating point number
        char myLetter = 'D'; // Character
        boolean myBool = true; // Boolean
        String myText = "Hello"; // String
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        int[] myNums = { 10, 20, 30, 40 };

        System.out.println("myNum : " + myNum);
        System.out.println("myFloatNum : " + myFloatNum);
        System.out.println("myLetter : " + myLetter);
        System.out.println("myBool : " + myBool);
        System.out.println("myText : " + myText);
        System.out.println("cars ke 1 : " + cars[0]);
        System.out.println("myNums ke - 1 : " + myNums[0]);
    }
}