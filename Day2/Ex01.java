
import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {

    String sMot;
    Scanner lire = new Scanner(System.in);
    System.out.print("ecrire un mot :");
    sMot = lire.next();
    System.out.print(sMot.toUpperCase());
    lire.close();
    
}
}

