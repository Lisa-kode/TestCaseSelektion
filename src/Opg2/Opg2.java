package Opg2;

public class Opg2 {

    public static void main(String[] args) {


        /************** OPGAVE 2 ************************/

        //Erklæring af to variabler x, y.

        int x = 41;
        int y = 67;

        //Test case for:
        //Input: x = 41, y = 67
        //Forventet output: Summen er større end hundrede

        //Programkode
        boolean opg2a = (x + y) > 100;

        //Testkode
        if (opg2a == true)
            System.out.println("Opg2a: Summen er større end hundrede, da resultatet giver " + (x + y));
        else
            System.out.println("Opg2a: Summen er mindre end hundrede, da resultatet giver " + (x + y));


        // Erklæring af nye variabler l, k

        x = 20;
        y = 33;

        //Test case
        //Input: x = 20, y = 33
        //Forventet output: summen er større end hunderede

        //Programkode
        boolean opg2b = (x + y) > 100;

        //Testkode
        if (opg2b == true)
            System.out.println("Opg2b: Summen er større end hundrede, da resultatet giver " + (x + y));
        else
            System.out.println("Opg2b: Summen er mindre end hundrede, da resultatet giver " + (x + y));


    }
}
