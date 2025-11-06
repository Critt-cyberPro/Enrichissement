import java.util.Scanner;

public class Ex07 {
public static void main(String[] args) {
    Scanner lire = new Scanner(System.in);
    String sPhrase;
    int iVoyelle=0,iCons=0;

    System.out.print("Entrez une phrase : ");
    sPhrase = lire.nextLine().toLowerCase();

    for (int i = 0; i < sPhrase.length(); i++) {
        char c = sPhrase.charAt(i);
        if (Character.isLetter(c)) {
            if (sPhrase.charAt(i) == 'a' ||sPhrase.charAt(i) == 'e' ||sPhrase.charAt(i) == 'i' ||sPhrase.charAt(i) == 'o' ||sPhrase.charAt(i) == 'u' ||sPhrase.charAt(i) == 'y') {
                iVoyelle++;
            }
            if (sPhrase.charAt(i) != 'a' && sPhrase.charAt(i) != 'e' && sPhrase.charAt(i) != 'i' &&sPhrase.charAt(i) != 'o' &&sPhrase.charAt(i) != 'u' &&sPhrase.charAt(i) != 'y') {
                iCons++;
            }
            else{
                System.out.println("Error !");
            }
        }
    }

    System.out.println("Nombre de consonne : "+iCons);
    System.out.println("Nombre de Voyelle : "+iVoyelle);



    lire.close();
}
}

