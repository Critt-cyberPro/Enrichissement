import java.util.Arrays;
import java.util.Scanner;
public class Ex08 {
public static void main(String[] args) {
    Scanner lire = new Scanner(System.in);
    String sMot="";

    System.out.println("Entrer des mots");

    String[] motsSaisis = new String[compteur];
        for (int i = 0; i < compteur; i++) {
            motsSaisis[i] = sMot[i];
        }

        // Tri alphabétique sans tenir compte des majuscules
        Arrays.sort(motsSaisis, String.CASE_INSENSITIVE_ORDER);

        // Affichage du premier et du dernier mot
        System.out.println("Premier mot (ordre alphabétique) : " + motsSaisis[0]);
        System.out.println("Dernier mot (ordre alphabétique) : " + motsSaisis[motsSaisis.length - 1]);

        lire.close();
}
}
