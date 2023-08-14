package studycase_java;
import java.util.Scanner;

public class StudyCase {
  public static void main(String args[]){
     
    int bil1, bil2, bil3, bil4, bil5, hasil;
     
    System.out.println("Kalkulator Java");
    System.out.println("=======================");   
    System.out.println();
     
    Scanner input = new Scanner(System.in);
    System.out.print("Bil1: ");
    bil1 = input.nextInt();

    System.out.print("Bil2: ");
    bil2= input.nextInt();
 
    System.out.print("Bil3: ");
    bil3 = input.nextInt();

    System.out.print("Bil4: ");
    bil4 = input.nextInt();

    System.out.print("Bil5: ");
    bil5 = input.nextInt();
    System.out.println("\n");
    hasil = bil1 * bil2*bil3*bil4*bil5;
    System.out.println("Hasil perkalian=" +hasil);  
    
    if (hasil%2 == 0) {
      System.out.println("Genap");
  }   else {
        System.out.println("Gajil");
  }
  }
}
    