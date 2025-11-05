

import java.util.Scanner;

public class EX02 {
public static void main(String[] args) {
    Salaire();
}
public static void Salaire() {
    int iheure,idollar,itotal;
    System.out.println("Bonjour, Veuillez rentrez vos informations !");
    System.out.println("Nombre d'heure semaine :");
    Scanner lire = new Scanner(System.in);
    iheure = lire.nextInt();
    System.out.println("Salaire de l'heure :");
    idollar = lire.nextInt();
    lire.close();

    itotal = (iheure * idollar) * 2 ;
    

    System.out.println("Bonjour, vous faites " + itotal +" au chaque 2 semaine ! GG !");
}
}
