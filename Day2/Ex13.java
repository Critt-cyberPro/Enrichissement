import java.util.Scanner;
public class Ex13 {
public static void main(String[] args) {
    Scanner lire = new Scanner(System.in);
    int iTemp;
    int iChoix=0;

    iChoix = Choix(lire);
    iTemp = tryParseInt("Quelle est la température !", lire);
    if (iChoix == 1) {
        System.out.println(iTemp+" Celcius est égale a "+conversion(iChoix, iTemp, lire)+" Fahrenheit");
    }
    if (iChoix == 2) {
         System.out.println(iTemp+" Fahrenheit est égale a "+conversion(iChoix, iTemp, lire)+" Celcius");
    }
    
    lire.close();
}
public static int Choix(Scanner lire) {
    boolean bChoix = false; 
    int iChoix;
    System.out.println("Quelle converstion voulez vous faire ?");
    do {
        iChoix = tryParseInt("1- C/F 2- F/C :", lire);
        if (iChoix == 1 || iChoix == 2) {
            bChoix = true;
        }
        else{
            System.out.println("Erreur !");
        }
    } while (!bChoix);
    return iChoix;
}
public static int conversion(int iChoix,int iTemp,Scanner lire) {
    int iReponse=0;
    if (iChoix == 1) {
        iReponse = iTemp*9/5 + 32;
    }
    if (iChoix == 2) {
        iReponse = (iTemp - 32)*5/9;
    }
    return iReponse;
    
}
 public static Integer tryParseInt(String message, Scanner lire) {
    String sValeur;
    int iValeur = 0;
    boolean bValide = false;
    do {
        
        System.out.print(message);
        sValeur = lire.nextLine();
        try {
            iValeur =Integer.parseInt(sValeur);
            bValide = true;
        } 
        catch (NumberFormatException e) {
            System.out.println("Erreur !");
            bValide = false; 
        }
    } while (!bValide);
    return iValeur;
    }
}
