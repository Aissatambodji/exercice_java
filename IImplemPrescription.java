package dao;
import model.Prescription;
import java.sql.*;
import java.util.*;

public class IImplemPrescription implements IPrescription {
private static DBConnection _db;
public static DBConnection getDb() {
        if (_db == null) {
            _db = new DBConnection();
        }
        return _db;
}

 @Override
public void addPrescription(Prescription p) throws Exception {
String sql = "INSERT INTO prescriptions(patient_id, medicament_id, date_debut, date_fin, posologie) VALUES (?, ?, ?, ?, ?)";
try (Connection conn = DBConnection.getConnection();
PreparedStatement ps = conn.prepareStatement(sql)) {
ps.setInt(1, p.getPatientId());
ps.setInt(2, p.getMedicamentId());
ps.setDate(3, new java.sql.Date(p.getDateDebut().getTime()));
ps.setDate(4, new java.sql.Date(p.getDateFin().getTime()));
ps.setString(5, p.getPosologie());
ps.executeUpdate();
System.out.println("Prescription ajoutée avec succès !");
        } 
catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout de la prescription : " + e.getMessage());
        }
    }

@Override
public List<Prescription> getPrescriptionsByPatient(int patientId) throws Exception {
List<Prescription> pres = new ArrayList<>();
String sql = "SELECT * FROM prescriptions WHERE patient_id=?";
try (Connection conn = DBConnection.getConnection();
PreparedStatement ps = conn.prepareStatement(sql)) {
ps.setInt(1, patientId);
ResultSet rs = ps.executeQuery();
   while (rs.next()) {
         pres.add(new Prescription(
         rs.getInt("id"),
         rs.getInt("patient_id"),
         rs.getInt("medicament_id"),
         rs.getDate("date_debut"),
         rs.getDate("date_fin"),
         rs.getString("posologie")
                ));
            }
        } 
catch (SQLException e) {
            System.out.println("Erreur lors de la récupération des prescriptions : " + e.getMessage());
        }
        return pres;
    }

    @Override
public void deletePrescription(int id) throws Exception {
String sql = "DELETE FROM prescriptions WHERE id=?";
try (Connection conn = DBConnection.getConnection();
PreparedStatement ps = conn.prepareStatement(sql)) {
     ps.setInt(1, id);
int rows = ps.executeUpdate();
       if (rows > 0) {
                System.out.println("Prescription supprimée avec succès !");
            } 
       else {
                System.out.println("Aucune prescription trouvée avec cet ID.");
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la suppression de la prescription : " + e.getMessage());
        }
    }

@Override
public void afficherMedicamentsPatient(int patientId) throws Exception {
String sql = "SELECT m.nom, m.dosage, m.description, p.date_debut, p.date_fin, p.posologie " +
                     "FROM prescriptions p JOIN medicaments m ON p.medicament_id = m.id WHERE p.patient_id=?";
try (Connection conn = DBConnection.getConnection();
 PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, patientId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println( rs.getString("nom") +
                                     rs.getString("dosage")+ 
                                   rs.getString("description") +
                                    rs.getDate("date_debut") +
                                   rs.getDate("date_fin") +
                                    rs.getString("posologie"));
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'affichage des médicaments du patient : " + e.getMessage());
        }
    }
}
