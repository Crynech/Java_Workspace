
public class Vendeur extends Employe {
	private double chiffreVente;

	public Vendeur(String nom, String prenom, String tel, String dNaissance, String dEmbauche, double chiffreVente) {
		super(nom, prenom, tel, dNaissance, dEmbauche);
		this.chiffreVente = chiffreVente;
	}

	public double salaire() {
		return this.chiffreVente * 0.75 + 400;
	}

	public double getChiffreVente() {
		return chiffreVente;
	}

	public void setChiffreVente(double chiffreVente) {
		this.chiffreVente = chiffreVente;
	}

}
