import java.util.Scanner;

public class Ex09 {
public static void main(String[] args) {
    Scanner lire = new Scanner(System.in);
    int iRayon;

    System.out.print("Quelle est le rayon : ");
    iRayon = lire.nextInt();
    cironf(iRayon);
    lire.close();
}
public static void cironf(int iRayon) {
    double dcirconf;
    dcirconf = 2 * Math.PI * iRayon;

    System.out.println("La circonférence du cercle est "+dcirconf+" !");
}
}
