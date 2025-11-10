import java.util.Random;

public class Ex_06 {
public static void main(String[] args) {
    int [] iTableau = new int[10];
    Random rNombre = new Random();
    int iNombre=0;
    int iN=0,iP=0;

    A(iTableau, iN, iP);
    B(iTableau, iNombre, rNombre, iN, iP);

}
public static void A(int [] iTableau,int iN,int iP) {
        iTableau[0] = -65;
    iTableau[1] = -34;
    iTableau[2] = 7;
    iTableau[3] = -3;
    iTableau[4] = -43;
    iTableau[5] = 14;
    iTableau[6] = 23;
    iTableau[7] = -9;
    iTableau[0] = 45;
    iTableau[9] = 11;

    for (int i=0; i<iTableau.length ; i++) {
        if (iTableau[i] < 0) {
            iN += iTableau[i];
        }
        if (iTableau[i] > 0){
            iP += iTableau[i];
        }
    }
    System.out.println("La somme des chiffre Négatif est : "+iN);
    System.out.println("La somme des chiffre Positif est : "+iP);
}
public static void B(int [] iTableau,int iNombre,Random rNombre,int iN,int iP) {
    for ( int i=0; i< iTableau.length ; i++) {
       
        iNombre = rNombre.nextInt(201) -100;
        iTableau[i] = iNombre;
    }
     for (int i=0; i<iTableau.length ; i++) {
        if (iTableau[i] < 0) {
            iN += iTableau[i];
        }
        if (iTableau[i] > 0){
            iP += iTableau[i];
        }
    }
    System.out.println("La somme des chiffre Négatif est : "+iN);
    System.out.println("La somme des chiffre Positif est : "+iP);
}
}
