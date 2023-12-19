package exercice.ex2;

// Écrire un programme en Java qui permet de calculer la somme S=1+2+3+...+10. Utilisant la boucle for.
public class Calcul {

    public static void main(String[] args) {
        // Création d'une instance de la classe Calcul
        Calcul calculateur = new Calcul();

        int somme = calculateur.calculerSomme(1, 10);
        System.out.println("La somme de 1 à 10 est : " + somme);
    }

    public int calculerSomme(int debut, int fin) {
        int somme = 0;

        for (int i = debut; i <= fin; i++) {
            somme += i;
        }

        return somme;
    }
}

   

       
    


