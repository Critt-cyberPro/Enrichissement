

import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
    int iValeur;
    Scanner lire = new Scanner(System.in);

    do {

       iValeur = tryParseInt("Quel est votre valeur", lire);

    } while (iValeur < 101);
    lire.close();
}
 public static Integer tryParseInt(String message, Scanner lire) {
    String sValeur;
    int iValeur = 0;
    boolean bValide = false;
    do {
        
        System.out.print(message);
        sValeur = lire.nextLine();
        try {
            iValeur =Integer.parseInt(sValeur);
            bValide = true;
        } 
        catch (NumberFormatException e) {
            System.out.println("Erreur !");
            bValide = false; 
        }
    } while (!bValide);
    return iValeur;
    }
}

