package model;
import java.util.Scanner;

public class Medicament {
private int id;
private String nom;
private String dosage;
private String description;

public Medicament() {}

public Medicament(int id, String nom, String dosage, String description) {
        this.id = id;
        this.nom = nom;
        this.dosage = dosage;
        this.description = description;
}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getDosage() {
	return dosage;
}

public void setDosage(String dosage) {
	this.dosage = dosage;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Medicament saisieMedicament() {
Scanner sc = new Scanner(System.in);
System.out.println(" Saisie Médicament ");
System.out.print("Nom: ");
nom = sc.nextLine();
System.out.print("Dosage: ");
dosage = sc.nextLine();
System.out.print("Description: ");
description = sc.nextLine();
        return this;
}

public void showMedicament() {
System.out.println(id + " " + nom + " " + dosage + " " + description);
    }
}

