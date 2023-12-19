package exercice.exo7;

import java.util.Scanner;

// Écrivez un programme Java qui accepte trois nombres et affiche
//  "Tous les nombres sont égaux" si les trois nombres sont égaux, 
//  "Tous les nombres sont différents" si les trois nombres sont différents
//   et sinon "Ni tous ni égaux ni différents".
public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez 1er nombre : ");
        int nbr1 = scanner.nextInt();

        System.out.print("Entrez le 2ème nombre : ");
        int nbr2 = scanner.nextInt();

        System.out.print("Entrez le 3ème nombre : ");
        int nbr3= scanner.nextInt();

        // comparerNombres(nbr1, nbr2, nbr3);

    }

    public static void comparerTroisNombres(int a, int b, int c) {

        if (a == b && b == c) {
            System.out.println("nombres égaux");

    } else if (a != b && b != c) { 
            System.out.println("nombre différnts");

    } else {
            System.out.println("ni égaux ni différents");
    }

}
}







