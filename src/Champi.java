import java.util.Scanner;

public class Champi {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
		System.out.println("Cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");

		System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
		boolean lamelles = sc.nextBoolean();
		System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
		boolean chapeau = sc.nextBoolean();
		System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
		boolean anneau = sc.nextBoolean();

		if (lamelles == true || lamelles == false) {
			if (lamelles == false) {
				System.out.print("==> Le champignon auquel vous pensez est ");
				System.out.print("le cèpe de Bordeaux");
			}
				if (lamelles == true && chapeau == true) {
					if (anneau == true) {
						System.out.print("==> Le champignon auquel vous pensez est ");
						System.out.print("l'agaric jaunissant");
					}
						if (anneau == false) {
							System.out.print("==> Le champignon auquel vous pensez est ");
							System.out.print("le pied bleu");
						}
				}
		}
		

//		if (anneau == true && chapeau == true && lamelles == true) {
//			System.out.print("==> Le champignon auquel vous pensez est ");
//			System.out.print("l'amanite tue-mouches");
//		}
//		if (anneau == false && chapeau == false && lamelles == false) {
//
//		}
//		if (anneau == true && chapeau != true && lamelles == true) {
//			System.out.print("==> Le champignon auquel vous pensez est ");
//			System.out.print("le coprin chevelu");	
//		}
//		if (anneau != true && chapeau != true && lamelles == true) {
//			System.out.print("==> Le champignon auquel vous pensez est ");
//			System.out.print("la girolle");
//		}

	    	sc.close();
	}
}
