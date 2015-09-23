
public class compteBusiness extends Compte {
	

	private int tauxBusi ;
	
	
	public compteBusiness(String cCompte, String cClient, Float solde,
			int tauxBusi) {
		super(cCompte, cClient, solde);
		this.tauxBusi = tauxBusi;
	}


	public int getTauxBusi() {
		return tauxBusi;
	}


	public void setTauxBusi(int tauxBusi) {
		this.tauxBusi = tauxBusi;
	}

public void interet(){
		
		Float nvSolde = ((getSoldeCompte() * tauxBusi)/100) + getSoldeCompte()  ;
		setSoldeCompte(nvSolde) ;
	

}
}
