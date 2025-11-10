

public class Ex_08 {
public static void main(String[] args) {

    Object [][] iNote = {

        {"Étudiants","Pierre","André","Julie","Brigitte","Anne","Olivier","Simon","Nadine"},
        {"TP1",65,78,43,82,76,91,71,96},
        {"TP2",45,55,67,89,100,95,92,81},
        {"Examen1",34,65,21,67,75,54,69,54}
    };
    System.out.println("La moyenne du première exercise est : "+moyEval(iNote, 2));
    System.out.println("La moyenne du deuxième exercise est : "+moyEval(iNote, 3));
    System.out.println("La moyenne de l'examen est : "+moyEval(iNote, 4));
}
public static int moyEval(Object [][] iNote,int iVal) {
    int iMoy,iSomm=0;
    for (int i=1; i<iNote.length; i++) {
        iSomm += (int)iNote[i][iVal];
    }
    iMoy =iSomm/8;
    return iMoy;
}
}
