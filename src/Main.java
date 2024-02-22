
public class Main {

	public static void main(String[] args) {
		System.out.println("Bienvenue dans l'application bancaire");
		Compte compte = new Compte();
		compte.deposer(100);
		compte.afficher();
		compte.retirer(50);
		compte.afficher();
	}

}
