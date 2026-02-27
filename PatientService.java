package service;
import dao.IImplemPatient;
import model.Patient;
import java.util.List;

public class PatientService {
private IImplemPatient dao = new IImplemPatient();

public void ajouter(Patient p) throws Exception {
        dao.addPatient(p);
    }
public List<Patient> lister() throws Exception {
        return dao.getAllPatients();
    }
public void supprimer(Patient id) throws Exception {
        dao.addPatient(id);
    }
public void supprimer(int nextInt) {
	// TODO Auto-generated method stub
	
}

}
