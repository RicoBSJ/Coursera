import java.util.Scanner;

class Swap3 {
	private static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Entrez la premiere  valeur : ");
		int a = clavier.nextInt();

		System.out.print("Entrez la deuxieme  valeur : ");
		int b = clavier.nextInt();

		System.out.print("Entrez la troisieme valeur : ");
		int c = clavier.nextInt();
		
		System.out.println("Les valeurs entrees sont : a = " + a
							+ ", b = " + b + " et c = " + c);
		
		System.out.println("Permutation: a ==> b, b ==> c, c ==> a");
		int d = a;int e = b;a = c;b = d;c = e;
		System.out.println("Les valeurs permutees sont : a = " + a
							+ ", b = " + b + " et c = " + c);
	}
}