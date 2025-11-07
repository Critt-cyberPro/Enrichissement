import java.util.Random;

public class Ex_07 {
public static void main(String[] args) {
    int [] iTableau = new int[10];
    Random rNombre = new Random();
    int iNombre;
    System.out.println("");
    int i0=0,i1=0,i2=0,i3=0,i4=0;
    for ( int i=0; i< iTableau.length ; i++) {
        iNombre = rNombre.nextInt(5);
        iTableau[i] = iNombre;
    }
    for (int i=0; i< iTableau.length ; i++) {
            if (iTableau[i] == 0) {
                i0++;
            } 
            if (iTableau[i] == 1) {
                i1++;
            }
            if (iTableau[i] == 2) {
                i2++;
            }
            if (iTableau[i] == 3) {
                i3++;
            }
            if (iTableau[i] == 4) {
                i4++;
            }
    }
    Object [][] iClassement = {

        {"Nombre 0","Nombre 1","Nombre 2","Nombre 3","Nombre 4"},
        {i0,i1,i2,i3,i4}
    };
    Classement(iClassement);
    System.out.println(); 
}
public static void Classement(Object [][] iClassement) {
    
    for (int i = 0; i < iClassement.length; i++) {

        for (int j = 0; j < iClassement[i].length; j++) {
            System.out.print(iClassement[i][j] + "     ");
        }
        System.out.println(); 
    }
}
}

