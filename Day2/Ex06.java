import java.util.Scanner;

public class Ex06 {
public static void main(String[] args) {
    Scanner lire = new Scanner(System.in);
    int iChiffre,iTotale=0,ifois=0,iMoyenne;
    int iMax=0,iMin = Integer.MAX_VALUE;


    System.out.println("Entrer des chiffres pour calculer la moyenne et avoir plus d'information (Entrer 0 pour calculer) !");
    do {
        System.out.println();
        iChiffre = tryParseInt("Entrer vos chiffres :", lire);
        if (iChiffre > iMax) {
            iMax = iChiffre;
        }
        if (iChiffre < iMin && iChiffre != 0) {
            iMin = iChiffre;
        }
        iTotale += iChiffre;
        if (iChiffre != 0) {
            ifois++;
        }
    } while (iChiffre != 0);

    iMoyenne = iTotale / ifois;
    System.out.println("Le chiffre le plus grand est : "+iMax);
    System.out.println("Le chiffre le plus petit est : "+iMin);
    System.out.println("La Moyenne est de "+iMoyenne);
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
