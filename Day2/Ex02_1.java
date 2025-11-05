import java.util.Scanner;

public class Ex02_1 {
public static void main(String[] args) {
    String sMot;
    Scanner lire = new Scanner(System.in);
    System.out.print("Écrire un mot :");
    sMot = lire.nextLine();
    System.out.print(sMot.length());
    lire.close();
}
}
