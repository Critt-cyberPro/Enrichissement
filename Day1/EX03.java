

import java.util.Scanner;

public class EX03 {
public static void main(String[] args) {
    int iage1,iage2,imoyenne;

    System.out.println("Bonjour, Veuillez rentrez deux ages !");
    System.out.println("Premier age :");
    Scanner lire = new Scanner(System.in);
    iage1 = lire.nextInt();
    System.out.println("Deuxième age :");
    iage2 = lire.nextInt();
    lire.close();


    if (iage1>iage2) {
        System.out.println("Bonjour, Le plus vieux a  "+ iage1 +" !");
    }

    else {
        System.out.println("Bonjour, Le plus vieux a  "+ iage2 +" !");
    }

    imoyenne = (iage1 + iage2) / 2;

    System.out.println("Bonjour, La moyenne d'age est de " + imoyenne + " !" );
    
}
public static void moyenne() {
    
}
}
