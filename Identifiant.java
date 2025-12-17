package etudiant;

public class Identifiant {

	private  String nom;
	private String prenom;
	private String adresse;
	private String email;
	private int  note;
	private int tel;
	private int age;
	private int AnneeN;
	private int AnneeA;
	public Identifiant() {
		// TODO Auto-generated constructor stub
	}
	public Identifiant(String nom, String prenom, String adresse, String email, int note, int tel, int age, int anneeN,
			int anneeA) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.note = note;
		this.tel = tel;
		this.age = age;
		AnneeN = anneeN;
		AnneeA = anneeA;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAnneeN() {
		return AnneeN;
	}
	public void setAnneeN(int anneeN) {
		AnneeN = anneeN;
	}
	public int getAnneeA() {
		return AnneeA;
	}
	public void setAnneeA(int anneeA) {
		AnneeA = anneeA;
	}
	
	

}
