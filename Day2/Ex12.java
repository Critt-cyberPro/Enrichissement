import java.util.Scanner;
public class Ex12 {
public static void main(String[] args) {
    Scanner lire = new Scanner(System.in);
    int iMax,iMin;


    System.out.println("Entrer les deux nombres");
    iMin = tryParseInt("Entre le nombre min : ", lire);
    iMax = tryParseInt("Entrer le nombre Max : ", lire);
    somme(iMin, iMax);
    System.out.println("Le résultat est "+ somme(iMin, iMax));



    lire.close();
}
public static int somme(int iMin,int iMax) {
        int iresultat = 1;
        for (int i = iMin; i <= iMax; i++) {
            iresultat += i;
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
