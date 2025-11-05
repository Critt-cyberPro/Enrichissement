

import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
    int ino1;
     System.out.println("Bonjour, Veuillez rentrez votre note !");
    System.out.println("Note :");
    Scanner lire = new Scanner(System.in);
    ino1 = lire.nextInt();
    lire.close();

    if (ino1 >= 60) {
        System.out.println("Succès !");
    }
    else {
        System.out.println("écheque !");
    }
}
}

