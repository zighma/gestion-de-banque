
public class CompteEpargne  extends Compte{
	private int tauxEpargne ;

	public CompteEpargne(String cCompte, String cClient, Float solde, int etaux) {
		super(cCompte, cClient, solde);
		this.tauxEpargne = etaux;
	}

	public int getTauxEpargne() {
		return tauxEpargne;
	}

	public void setTauxEpargne(int tauxEpargne) {
		this.tauxEpargne = tauxEpargne;
	}
	
	public void interet(){
		
		Float nvSolde = ((getSoldeCompte() * tauxEpargne)/100) + getSoldeCompte()  ;
		setSoldeCompte(nvSolde) ;
		
	}
	
	

}
