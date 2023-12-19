package exercice.ex6;

import java.util.Scanner;

//Écrivez un programme Java qui demande deux chiffres à un utilisateur, pour afficher la somme (addition), 
//multiplier, soustraire, diviser et le reste.v

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double chiffre1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième chiffre : ");
        double chiffre2 = scanner.nextDouble();

        System.out.println("Somme : " + addition(chiffre1, chiffre2));
        System.out.println("Multiplication : " + multiplication(chiffre1, chiffre2));
        System.out.println("Soustraction : " + soustraction(chiffre1, chiffre2));
        System.out.println("Division : " + division(chiffre1, chiffre2));

    }

        public static double addition(double a, double b) {
        return a + b;
    }


        public static double multiplication(double a, double b) {
        return a * b;
    }

        public static double soustraction(double a, double b) {
        return a - b;
    }

        public static double division(double a, double b) {
        return a / b;
    }
   // modif test pour git
}
