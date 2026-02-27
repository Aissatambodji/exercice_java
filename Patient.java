package model;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
public class Patient {
private int id;
private String nom;
private String prenom;
private Date dateNaissance;

public Patient() {}
public Patient(String nom, String prenom, Date dateNaissance) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.dateNaissance = dateNaissance;
}
public Patient(int id, String nom, String prenom, Date dateNaissance) {
	        this.id = id;
	        this.nom = nom; 
	        this.prenom = prenom;
	        this.dateNaissance = dateNaissance;
}


	// TODO Auto-generated constructor stub

public void setId(int id) {
	this.id = id;
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
public Date getDateNaissance() {
	return dateNaissance;
}
public void setDateNaissance(Date dateNaissance) {
	this.dateNaissance = dateNaissance;
}
public Patient saisiePatient() {
Scanner sc = new Scanner(System.in);
System.out.print("Nom: "); nom = sc.nextLine();
System.out.print("Prénom: "); prenom = sc.nextLine();
System.out.print("Date naissance (yyyy-mm-dd): ");
dateNaissance = java.sql.Date.valueOf(sc.nextLine());
	        
return this;
}

public void showPatient() {
System.out.println(id + " " + nom + " " + prenom + " " + dateNaissance);
	    }
	}

