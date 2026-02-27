package service;
import dao.IImplemPrescription;
import model.Prescription;
import java.util.List;

public class PrescriptionService {
private IImplemPrescription dao = new IImplemPrescription();
public void ajouter(Prescription p) throws Exception {
        dao.addPrescription(p);
    }

public List<Prescription> listerParPatient(int patientId) throws Exception {
        return dao.getPrescriptionsByPatient(patientId);
    }

public void supprimer(int id) throws Exception {
        dao.deletePrescription(id);
    }
public void afficherMedicamentsPatient(int patientId) throws Exception {
        dao.afficherMedicamentsPatient(patientId);
    }
}
