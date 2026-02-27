package dao;
import model.Prescription;
import java.util.List;
public interface IPrescription{
void addPrescription(Prescription p) throws Exception;
List<Prescription> getPrescriptionsByPatient(int patientId) throws Exception;
void deletePrescription(int id) throws Exception;
void afficherMedicamentsPatient(int patientId) throws Exception;
}

