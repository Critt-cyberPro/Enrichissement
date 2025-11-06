
import java.util.Scanner;
public class Ex06 {
public static void main(String[] args) {

    Scanner clavier = new Scanner(System.in);
    compare(clavier);
    programme(clavier);
    clavier.close();

}
public static void programme(Scanner clavier) {
    int cplancher,ilongeur,ilargeur,icout = 0;
    int iprix,iaire;
    String snom,stype=""; 
    boolean choix = false;

    System.out.println("3 types de plancher (1- Chêne, 2- Érable, 3-Pin)");
    
    do {
        cplancher = clavier.nextInt();
        if (cplancher == 2 || cplancher ==1 || cplancher == 3) {
            if (cplancher ==1) {
                icout = 5;
                stype = "Chene";
            }
            if (cplancher ==2) {
                icout = 12;
                stype = "Érable";
            }
            if (cplancher == 3) {
                icout = 10;
                stype = "Pin";
            }
            choix = true;
         } 
        else {
            System.out.println(" Vous n’avez pas choisit le bon type de plancher.");
        }
    } while (choix == false);
    
    
    System.out.print("veulliez entre la longueur: ");
    ilongeur = clavier.nextInt();

    System.out.print("veulliez entre la largeur : ");
    ilargeur = clavier.nextInt();

    System.out.print("veulliez entre votre nom : ");
    snom = clavier.next();

    iaire = ilargeur * ilongeur;
    iprix = iaire * icout;

    System.out.print("La commande au nom de "+snom+" pour une surface de "+iaire+" et un cout de "+iprix+"$ a été passer chez BoisFranc ! Merci beaucoup !");
    System.out.println("votre type de bois est "+stype);
}
public static void compare(Scanner clavier) {
    int ino1,ino2;
    System.out.println("Entrez deux nombre :");
    System.out.print("Entrez le premier nombre :");
    ino1 = clavier.nextInt();
    System.out.print("Entrez le dernier nombre :");
    ino2 = clavier.nextInt();

    if (ino1>ino2) {
        System.out.println("Le premier nombre est plus grand !");
    } 
    else {
        System.out.println("Le premier nombre est plus petit !");
    }
}
}
