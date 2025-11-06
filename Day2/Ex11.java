import java.util.Scanner;
public class Ex11 {
public static void main(String[] args) {
    Scanner lire = new Scanner(System.in);
    int iChiffre;

    iChiffre = tryParseInt("Ecrire une chiffre a factorialiser : ", lire);
    factorielle(iChiffre);
    System.out.println("Le résultat est "+ factorielle(iChiffre));



    lire.close();
}
public static int factorielle(int iChiffre) {
        int iresultat = 1;
        for (int i = 1; i <= iChiffre; i++) {
            iresultat *= i;
        }
        return iresultat;
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
