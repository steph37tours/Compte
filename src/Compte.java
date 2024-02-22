
public class Compte {
	private double solde =0.0;
	
	public double getSolde() {
		return solde;
	}
	
	public void deposer(double montant) {
		solde +=montant;
	}
	public void retirer(double montant) {
		if (solde == 0) {
			System.out.println("Le compte est vide !");
			return;
		}
		else if(montant>solde) {
			System.out.println("Montant trop élevé");
			return;
		}
		else
			solde -=montant;
	}
	public void afficher() {
		System.out.println("Le compte contient "+ solde);
	}
}
