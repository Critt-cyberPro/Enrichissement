import java.util.Random;

public class Ex_07 {
public static void main(String[] args) {
    int [] iTableau = new int[10];
    Object [][] iClassement = new Object[2][5];
    Random rNombre = new Random();
    int iNombre;
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
    
}
}
