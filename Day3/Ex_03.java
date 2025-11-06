import java.util.Random;
public class Ex_03 {
public static void main(String[] args) {
    int [] iTableu1 = new int[5];
    int [] iTableu2 = new int[5];
    Random rNombre = new Random();
    int iNombre;
    for ( int i=0; i< iTableu1.length ; i++) {
       
           iNombre = rNombre.nextInt(101);
            iTableu1[i] = iNombre;
    }
    for (int p=0; p < iTableu1.length ; p++) {
        System.out.print(iTableu1[p]+ " ");
    }
    System.out.println( " ");
     for ( int i=0; i< iTableu1.length ; i++) {
       
         iTableu2[i] = iTableu1[iTableu1.length - 1 - i]; 
    }
    for (int p=0; p < iTableu1.length ; p++) {
        System.out.print(iTableu2[p]+ " ");
    }
 
}
}