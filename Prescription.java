package model;
import java.util.Date;
import java.util.Scanner;

public class Prescription {
private int id;
private int patientId;
private int medicamentId;
private Date dateDebut;
private Date dateFin;
private String posologie;

public Prescription() {}

public Prescription(int id, int patientId, int medicamentId, Date dateDebut, Date dateFin, String posologie) {
        this.id = id;
        this.patientId = patientId;
        this.medicamentId = medicamentId;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.posologie = posologie;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getPatientId() {
	return patientId;
}

public void setPatientId(int patientId) {
	this.patientId = patientId;
}

public int getMedicamentId() {
	return medicamentId;
}

public void setMedicamentId(int medicamentId) {
	this.medicamentId = medicamentId;
}

public Date getDateDebut() {
	return dateDebut;
}

public void setDateDebut(Date dateDebut) {
	this.dateDebut = dateDebut;
}

public Date getDateFin() {
	return dateFin;
}

public void setDateFin(Date dateFin) {
	this.dateFin = dateFin;
}

public String getPosologie() {
	return posologie;
}

public void setPosologie(String posologie) {
	this.posologie = posologie;
}

public Prescription saisiePrescription() {
Scanner sc = new Scanner(System.in);
System.out.println("=== Saisie Prescription ===");
System.out.print("ID Patient: ");
patientId = sc.nextInt(); sc.nextLine();
System.out.print("ID Médicament: ");
medicamentId = sc.nextInt(); sc.nextLine();
System.out.print("Date début (yyyy-mm-dd): ");
dateDebut = java.sql.Date.valueOf(sc.nextLine());
System.out.print("Date fin (yyyy-mm-dd): ");
dateFin = java.sql.Date.valueOf(sc.nextLine());
System.out.print("Posologie: ");
posologie = sc.nextLine();
        return this;
    }

    public void showPrescription() {
        System.out.println(id + " Patient:" + patientId + " Médicament:" + medicamentId + " " + dateDebut + " " + dateFin + " " + posologie);
    }
}
