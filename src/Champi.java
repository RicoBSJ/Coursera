import java.util.Scanner;

public class Champi {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
		System.out.println("Cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");

		System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
		boolean lamelles = sc.nextBoolean();
		System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
		boolean foret = sc.nextBoolean();
		System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
		boolean anneau = sc.nextBoolean();
		System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
		boolean chapeau = sc.nextBoolean();
		
		if (lamelles == false && foret == false) {
			System.out.print("==> Le champignon auquel vous pensez est ");
			System.out.print("le cèpe de Bordeaux");
		}
			if (chapeau == false && lamelles == true && anneau == true) {
				System.out.print("==> Le champignon auquel vous pensez est ");
				System.out.print("le coprin chevelu");
			}
				if (chapeau == true && lamelles == true && anneau == true) {
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("l'agaric jaunissant");
				}
					if (foret == true && lamelles == true) {
						System.out.print("==> Le champignon auquel vous pensez est ");
						System.out.print("la girolle");
					}
	    	sc.close();
		}
//		System.out.print("le cèpe de Bordeaux");
//		System.out.print("le coprin chevelu");
//		System.out.print("l'agaric jaunissant");
//		System.out.print("la girolle");
//		System.out.print("l'amanite tue-mouches");
//		System.out.print("le pied bleu");
	}
