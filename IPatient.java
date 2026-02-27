package dao;
import model.Patient;
import java.util.List;
public interface IPatient {
int add(Patient p) throws Exception;
List<Patient> getAll() throws Exception;
boolean delete(int id) throws Exception;
	                       }

