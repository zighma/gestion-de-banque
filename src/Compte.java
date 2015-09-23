
public class Compte {

	private String codeCompte;
	private String codeClient ;
	private Float soldeCompte ;

	public Compte (String cCompte, String cClient, Float solde ){
		this.codeCompte = cCompte;
		this.codeCompte = cClient;
		this.soldeCompte = solde;
	}

	public String getCodeCompte() {
		return codeCompte;
	}

	public void setCodeCompte(String codeCompte) {
		this.codeCompte = codeCompte;
	}

	public String getCodeClient() {
		return codeClient;
	}

	public void setCodeClient(String codeClient) {
		this.codeClient = codeClient;
	}

	public Float getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(Float soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	
	public void debiter (int montant){
		soldeCompte = soldeCompte-montant;
		System.out.println("votre solde est maintenat de "+soldeCompte);
		
	}
	
	public void crediter (int montant){
		if (montant > 0){
			soldeCompte = soldeCompte+montant ;
			System.out.println("votre solde est maintenat de "+soldeCompte);
		}
		else System.out.println("il faut mettre de l'argenttttttttttt");
		
		
	}
	
	public String toString(){
		return "Solde : "+soldeCompte;
	}
	
	public void Transferer(int montant, int codeCompte){
		
		
	}
	
	

}
