package exo3;

import java.util.Scanner;

public class Echange {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);// scanner pour obtenir les saisies de l'utilisateur

        System.out.print("Entrez la valeur de A : ");
        int a = scanner.nextInt();

        System.out.print("Entrez la valeur de B : ");
        int b = scanner.nextInt();

        System.out.println("Avant :");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        int change = a;
        a = b;
        b = change;
        System.out.println("Après :");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

    
}
}
