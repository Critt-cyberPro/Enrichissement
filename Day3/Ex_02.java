import java.util.Scanner;
public class Ex_02 {
public static void main(String[] args) {
    Scanner lire = new Scanner(System.in);
    int [] iTableu = new int[10];
    int iNombre;

    System.out.println("Entrer un Maximum de 10 nombre !");
    for ( int i=0; i < iTableu.length ; i++) {
       
            iNombre = tryParseInt("Entrez un nombre :", lire);
            iTableu[i] = iNombre;
    }
    for (int p=0; p < iTableu.length ; p++) {
        System.out.print(iTableu[p]+ " ");
    }
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
