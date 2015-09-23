



public class Client {

	private int codeClient;
	private String nomClient;
	private String prenomClient;
	private String adressClient;
	private String mdpClient;
	
	
	public Client(int code, String nom, String prenom, String adresse, String mdp )
	{
		this.codeClient = code;
		this.nomClient = nom;
		this.prenomClient = prenom;
		this.adressClient = adresse;
		this.mdpClient = mdp;
		
	}


	public int getCodeClient() {
		return codeClient;
	}


	public void setCodeClient(int codeClient) {
		this.codeClient = codeClient;
	}


	public String getNomClient() {
		return nomClient;
	}


	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}


	public String getPrenomClient() {
		return prenomClient;
	}


	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}


	public String getAdressClient() {
		return adressClient;
	}


	public void setAdressClient(String adressClient) {
		this.adressClient = adressClient;
	}


	public String getMdpClient() {
		return mdpClient;
	}


	public void setMdpClient(String mdpClient) {
		this.mdpClient = mdpClient;
	}
	
	
	

}
