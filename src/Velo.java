import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de d�but de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        int dureeLocation = fin - debut;
        double tarifHoraire = 0;
        int tarifNuit = 1;
        int tarifJour = 2;
        int coutLocation = 0;
        
        if (debut<0 || debut>24) {
        	System.out.println("Les heures doivent �tre comprises entre 0 et 24 !");
        }
        	if (dureeLocation<1) {
        		System.out.println("Bizarre, vous n'avez pas lou� votre v�lo bien longtemps !");
        	}
        		if (fin<debut) {
        			System.out.println("Bizarre, le d�but de la location est apr�s la fin ...");
        		}
        
        if (debut >= 17 || debut < 7) {
        	if (fin > 17 || fin <= 7) {
            		coutLocation = dureeLocation * tarifNuit;
            		tarifHoraire = tarifNuit;
        	}
        } else {
            	coutLocation = dureeLocation * tarifJour;
            	tarifHoraire = tarifJour;
        	}
    	System.out.println("Vous avez lou� votre v�lo pendant "+dureeLocation+" heures au tarif horaire de "+tarifHoraire+" franc(s)");
        System.out.print("Le montant total � payer est de ");
        System.out.println(coutLocation + " franc(s).");
        clavier.close();
        }
    }