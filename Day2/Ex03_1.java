import java.util.Scanner;

public class Ex03_1 {
public static void main(String[] args) {

    String sMot;
    int iA = 0;
    boolean bA = false;
    Scanner lire = new Scanner(System.in);

    System.out.println("Écrivez une phrase et tout les a devinderon des $");
    sMot = lire.nextLine().toUpperCase();

   for (int i = 0; i < sMot.length(); i++) {
            if (sMot.charAt(i) == 'A') {
                iA++;
            }
        }

    System.out.println("Il y avais "+iA+" A !");
    System.out.println(sMot.replace('A', '$'));
    System.out.println();
    lire.close();
}
}
