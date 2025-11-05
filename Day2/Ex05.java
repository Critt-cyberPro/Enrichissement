

import java.util.Scanner;

public class Ex05 {
public static void main(String[] args) {
    Scanner lire = new Scanner(System.in);
    String sAlphabet= "abcdefghigklmnopqrstuvwxyz";
    String sReverse = "";

    for (int i = 0; i < sAlphabet.length(); i++) {
            System.out.print(sAlphabet.charAt(i));
        }
        System.out.println();
     for (int i = 0; i < sAlphabet.length(); i++) {
           sReverse = sAlphabet.charAt(i) + sReverse;
        }
        System.out.println(sReverse);
}
}

