package ex4;

import java.util.Scanner;

//Une boutique propose à ses clients, une réduction de 15% pour les montants d’achat supérieurs à 200 Euros. 
//Écrire un programme en Java permettant de saisir le prix total HT et de calculer le  montant TTC en prenant en compte 
//la réduction et la TVA=20%. 

public class Boutique {
    public static void main(String[] args) {
        Scanner scanner = new scanner(System.in);

        System.out.println("Entrez le prix HT");
        double total = scanner.nextDouble();

        double taxe = 20;
        double remise = 15;
    
        total = total + (total * taxe /100);

        System.out.println("Le montant TTC est : " + total);
        switch ((int) remise) {
            case 0:
                System.out.println("Pas de remise.");
                break;
            case 15:
                System.out.println("Remise de 15%.");
                break;
            default:
        

    }
}
}