import java.util.Random;
public class Ex_04 {
public static void main(String[] args) {
    int [] iTableau = new int[5];
    Random rNombre = new Random();
    int iNombre;
    int iPetit=100;
    int iGrand=0;
    int iPP=0,iPG=0;

    for ( int i=0; i< iTableau.length ; i++) {
        iNombre = rNombre.nextInt(101);
        if (iNombre < iPetit){
            iPetit = iNombre;
            iPP = i;
        }
        if (iNombre > iGrand){
            iGrand = iNombre;
            iPG = i;

        }
        iTableau[i] = iNombre;
    }
    System.out.println("La valeur la plus grande : "+iGrand +" en "+iPG+" position !");
    System.out.println("La valeur la plus petite : "+iPetit+" en "+iPP+" position !");



}
}
