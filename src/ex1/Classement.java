package ex1;

import java.util.Scanner;

public class Classement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez l'âge de l'enfant : ");
        int age = scanner.nextInt();

        String categorie = determinerCategorie(age);

        System.out.println("La catégorie de l'enfant est : " + categorie);
    }

    public static String determinerCategorie(int age) {
        String categorie;

        switch (age) {
            case 6:
            case 7:
                categorie = "Poussin de 6 a 7 ans";
                break;

            case 8:
            case 9:
                categorie = "Pupille de 8 a 9 ans";
                break;

            case 10:
            case 11:
                categorie = "Minime de 10 a 11 ans";
                break;

            default:
                categorie = "Cadet après 12 ans";
                break;
        }

       
    }
}
