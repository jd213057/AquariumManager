package jd.entities;

public class Utilisateur {
	
	private String nom;
	
	private String prenom;
	
	private int age;
	
	private String user;
	
	private String password;
	
	public Utilisateur() {}
	

	public Utilisateur(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public Utilisateur(String user, String password) {
		super();
		this.user = user;
		this.password = password;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
