

public class Ex_08 {
public static void main(String[] args) {

    Object [][] iNote = {

        {"Étudiants","Pierre","André","Julie","Brigitte","Anne","Olivier","Simon","Nadine"},
        {"TP1",65,78,43,82,76,91,71,96},
        {"TP2",45,55,67,89,100,95,92,81},
        {"Examen1",34,65,21,67,75,54,69,54}
    };
    System.out.println("La moyenne du première exercise est : "+moyEval(iNote, 1));
    System.out.println("La moyenne du deuxième exercise est : "+moyEval(iNote, 2));
    System.out.println("La moyenne de l'examen est : "+moyEval(iNote, 3));
    System.out.println("-----------------------------------------------------------");

    System.out.println("La moyenne de Pierre est : "+moyÉtu(iNote, 1));
    System.out.println("La moyenne de Pierre est : "+moyÉtu(iNote, 2));
    System.out.println("La moyenne de Pierre est : "+moyÉtu(iNote, 3));
    System.out.println("La moyenne de Pierre est : "+moyÉtu(iNote, 4));
    System.out.println("La moyenne de Pierre est : "+moyÉtu(iNote, 5));
    System.out.println("La moyenne de Pierre est : "+moyÉtu(iNote, 6));
    System.out.println("La moyenne de Pierre est : "+moyÉtu(iNote, 7));
    System.out.println("La moyenne de Pierre est : "+moyÉtu(iNote, 8));
    
}
public static double moyEval(Object [][] iNote,int iLigne) {
    double dMoy,dSomm=0;
    for (int i=1; i<9; i++) {
        dSomm += (int)iNote[iLigne][i];
    }
    dMoy =dSomm/8;
    dMoy =Math.round(dMoy * 10.0)/10.0;  //arondire et garder un chiffre (100.0 + deux chifre apres la virgule)
    return dMoy;
}
public static double moyÉtu(Object [][] iNote,int iColone) {
    double dMoy,dSomm=0;
    for (int i=1; i<4; i++) {
        dSomm += (int)iNote[i][iColone];
    }
    dMoy =dSomm/3;
    dMoy =Math.round(dMoy * 10.0)/10.0;
    return dMoy;
}
}
