package service;

import dao.IImplemMedicament;
import model.Medicament;
import java.util.List;

public class MedicamentService {
    private IImplemMedicament dao = new IImplemMedicament();

    public void ajouter(Medicament m) throws Exception {
        dao.addMedicament(m);
    }

    public List<Medicament> lister() throws Exception {
        return dao.getAllMedicaments();
    }

    public void modifier(Medicament m) throws Exception {
        dao.updateMedicament(m);
    }

    public void supprimer(int id) throws Exception {
        dao.deleteMedicament(id);
    }
}
