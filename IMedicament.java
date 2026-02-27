package dao;
import model.Medicament;
import java.util.List;
public interface IMedicament {
    void addMedicament(Medicament m) throws Exception;
    List<Medicament> getAllMedicaments() throws Exception;
    void updateMedicament(Medicament m) throws Exception;
    void deleteMedicament(int id) throws Exception;
}