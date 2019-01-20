import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        int dureeLocation = fin - debut;
        double tarifHoraire = 0;
        int tarifNuit = 1;
        int tarifJour = 2;
        int coutLocation = 0;
        
        if (debut<0 || debut>24) {
        	System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        }
        	if (dureeLocation<1) {
        		System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
        	}
        		if (fin<debut) {
        			System.out.println("Bizarre, le début de la location est après la fin ...");
        		}
        
        if (fin < 7 && fin > 17 && debut < 7 && debut > 17) {
        	coutLocation = dureeLocation * tarifNuit;
        	tarifHoraire = tarifNuit;
        }
        if (fin >= 7 && fin <= 17 && debut >= 7 && debut <= 17) {
        	coutLocation = dureeLocation * tarifJour;
        	tarifHoraire = tarifJour;
        	}
    	System.out.println("Vous avez loué votre vélo pendant "+dureeLocation+" heures au tarif horaire de "+tarifHoraire+" franc(s)");
        System.out.print("Le montant total à  payer est de ");
        System.out.println(coutLocation + " franc(s).");

        clavier.close();
    }
}