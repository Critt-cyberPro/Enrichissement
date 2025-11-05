
import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
   
    nombre();

}
public static void nombre() {
    int ino1,ino2;

    System.out.println("Bonjour, Veuillez rentrez deux nombres !");
    System.out.println("Premier nombre :");
    Scanner lire = new Scanner(System.in);
    ino1 = lire.nextInt();
    System.out.println("Deuxième nombre :");
    ino2 = lire.nextInt();
    lire.close();

    if (ino1 > ino2) {
        System.out.println("Le Premier nombre est plus grand !");
    }
    else {
        System.out.println("Le Premier nombre est plus petit !");
    }
}
}

