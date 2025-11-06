import java.util.Scanner;

public class Ex10 {
public static void main(String[] args) {
   Scanner lire = new Scanner(System.in);
    plusGrand(lire);
    lire.close();
}
public static void plusGrand(Scanner lire) {
    int ino1,ino2;

    System.out.println("Bonjour, Veuillez rentrez deux nombres !");
    System.out.println("Premier nombre :");
    ino1 = lire.nextInt();
    System.out.println("Deuxième nombre :");
    ino2 = lire.nextInt();

    if (ino1 > ino2) {
        System.out.println("Le Premier nombre est plus grand !");
    }
    if (ino2 > ino1) {
        System.out.println("Le Premier nombre est plus petit !");
    }
    else {
        System.out.println("Les deux sont égale !!!");
    }
}
}
