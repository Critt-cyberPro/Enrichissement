

import java.util.Scanner;

public class Ex05 {
public static void main(String[] args) {
    int ino1;
    double drabais;

    System.out.println("Bonjour, Veuillez rentrez un montant !");
    System.out.print("montant :");
    Scanner lire = new Scanner(System.in);
    ino1 = lire.nextInt();
    lire.close();

    drabais = ino1 * 0.75;


    System.out.print("montant "+ drabais +" !");
    
}
}

