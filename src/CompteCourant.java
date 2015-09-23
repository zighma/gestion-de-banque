
public class CompteCourant extends Compte {
	
	private int tauxCourant ;
	
	public CompteCourant(String cCompte, String cClient, Float solde,
			int tauxCourant) {
		super(cCompte, cClient, solde);
		this.tauxCourant = tauxCourant;
	}

	public int getTauxCourant() {
		return tauxCourant;
	}

	public void setTauxEpargne(int tauxCourant) {
		this.tauxCourant = tauxCourant;
	}

public void interet(){
		
		Float nvSolde = ((getSoldeCompte() * tauxCourant)/100) + getSoldeCompte()  ;
		setSoldeCompte(nvSolde) ;
		
	}

}
