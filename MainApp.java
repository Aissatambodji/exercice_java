package main;

import service.PatientService;
import service.MedicamentService;
import service.PrescriptionService;
import model.Patient;
import model.Medicament;
import model.Prescription;

import java.util.*;

public class MainApp {
public static void main(String[] args) throws Exception {
try (Scanner sc = new Scanner(System.in)) {
PatientService patientService = new PatientService();
MedicamentService medicamentService = new MedicamentService();
PrescriptionService prescriptionService = new PrescriptionService();
int choix;
do {
System.out.println("1. Ajouter patient");
System.out.println("2. Liste patients");
System.out.println("3. Supprimer patient");
System.out.println("4. Ajouter médicament");
System.out.println("5. Liste médicaments");
System.out.println("6. Modifier médicament");
System.out.println("7. Supprimer médicament");
System.out.println("8. Prescrire médicament");
System.out.println("9. Voir prescriptions d’un patient");
System.out.println("10. Supprimer prescription");
System.out.println("11. Afficher médicaments d’un patient");
System.out.println("0. Quitter");

System.out.print("Choix : ");
choix = sc.nextInt(); sc.nextLine();

	 switch (choix) {
			case 1 -> patientService.ajouter(new Patient().saisiePatient());
			case 2 -> patientService.lister().forEach(Patient::showPatient);
			case 3 -> {
			            System.out.print("ID patient à supprimer: ");
			patientService.supprimer(sc.nextInt());
			        }
			case 4 -> medicamentService.ajouter(new Medicament().saisieMedicament());
			case 5 -> medicamentService.lister().forEach(Medicament::showMedicament);
			case 6 -> {
			            System.out.print("ID médicament à modifier: ");
			            int idm = sc.nextInt(); sc.nextLine();
			            Medicament m = new Medicament().saisieMedicament();
			            m.setId(idm);
			            medicamentService.modifier(m);
			        }
			case 7 -> {
			            System.out.print("ID médicament à supprimer: ");
			            medicamentService.supprimer(sc.nextInt());
			        }
			case 8 -> prescriptionService.ajouter(new Prescription().saisiePrescription());
			case 9 -> {
			            System.out.print("ID patient: ");
			            prescriptionService.listerParPatient(sc.nextInt()).forEach(Prescription::showPrescription);
			        }
			case 10 -> {
			            System.out.print("ID prescription à supprimer: ");
			            prescriptionService.supprimer(sc.nextInt());
			        }
			 case 11 -> {
			            System.out.print("ID patient: ");
			            prescriptionService.afficherMedicamentsPatient(sc.nextInt());
			        }
			    }
} while (choix != 0);
		}
        System.out.println("Programme terminé.");
    }
}

