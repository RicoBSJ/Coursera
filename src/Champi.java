import java.util.Scanner;

public class Champi {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
		System.out.println("C�pe de Bordeaux, coprin chevelu ou agaric jaunissant.");

		System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
		boolean anneau = sc.nextBoolean();
		System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
		boolean chapeau = sc.nextBoolean();
		System.out.print("Est-ce que votre champignon vit en for�t (true : oui, false : non) ? ");
		boolean foret = sc.nextBoolean();

		if (anneau == true && chapeau == true || foret == false) {
			System.out.print("==> Le champignon auquel vous pensez est ");
			System.out.print("l'agaric jaunissant");
		}
			if (anneau == true && chapeau == true && foret == true) {
				System.out.print("==> Le champignon auquel vous pensez est ");
				System.out.print("l'amanite tue-mouches");
			}
		if (anneau == false && chapeau == false && foret == true) {
			System.out.print("==> Le champignon auquel vous pensez est ");
			System.out.print("le c�pe de Bordeaux");
		}
		if (anneau == true && chapeau == false && foret == false) {
			System.out.print("==> Le champignon auquel vous pensez est ");
			System.out.print("le coprin chevelu");	
		}
		if (anneau == false && chapeau == false && foret == true) {
			System.out.print("==> Le champignon auquel vous pensez est ");
			System.out.print("la girolle");
		}
		if (anneau == false && chapeau == true && foret == true) {
			System.out.print("==> Le champignon auquel vous pensez est ");
			System.out.print("le pied bleu");
		}
	    	sc.close();
	}
}
