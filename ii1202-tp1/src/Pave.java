import java.util.Scanner;

public class Pave {
	public static void main ( String [] args) {
		Scanner scan = new Scanner(System.in);		
		double hauteur= scan.nextDouble();
		double longueur= scan.nextDouble();
		double largeur= scan.nextDouble();
		double aire= longueur * largeur * hauteur;
		System.out.println(" Aire = " +aire+ "");
	}
}
