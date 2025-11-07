import java.util.Random;

public class Ex_05 {
public static void main(String[] args) {
    int [] iTableau = new int[10];
    int [] iTableau2 = new int[10];
    Random rNombre = new Random();
    int iNombre;
    for ( int i=0; i< iTableau.length ; i++) {
       
        iNombre = rNombre.nextInt(101);
        iTableau[i] = iNombre;
    }
    System.out.println( " ");
    for ( int i=0; i< iTableau.length ; i++) {
       
         iTableau2[i] = iTableau[iTableau.length - 1 - i];
    }
    affiche(iTableau, iTableau2);
}
public static void affiche(int [] iTableau,int [] iTableau2) {
    for (int p=0; p < iTableau.length ; p++) {
        System.out.print(iTableau[p]+ " ");
    }
    System.out.println(" ");
    for (int p=0; p < iTableau.length ; p++) {
        System.out.print(iTableau2[p]+ " ");
    }
}
}
