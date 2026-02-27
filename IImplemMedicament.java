package dao;

import model.Medicament;
import java.sql.*;
import java.util.*;

public class IImplemMedicament implements IMedicament {
private static DBConnection _db;

public static DBConnection getDb() {
        if (_db == null) {
            _db = new DBConnection();
        }
        return _db;
    }

@Override
public void addMedicament(Medicament m) throws Exception {
String sql = "INSERT INTO medicaments(nom, dosage, description) VALUES (?, ?, ?)";
try (Connection conn = DBConnection.getConnection();
 PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, m.getNom());
            ps.setString(2, m.getDosage());
            ps.setString(3, m.getDescription());
            ps.executeUpdate();
            System.out.println("Médicament ajouté avec succès !");
} 
catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout du médicament : " + e.getMessage());
        }
    }

 @Override
public List<Medicament> getAllMedicaments() throws Exception {
List<Medicament> meds = new ArrayList<>();
String sql = "SELECT * FROM medicaments";
try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
 while (rs.next()) {
                meds.add(new Medicament(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getString("dosage"),
                    rs.getString("description")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la récupération des médicaments : " + e.getMessage());
        }
        return meds;
 }

 @Override
 public void updateMedicament(Medicament m) throws Exception {
 String sql = "UPDATE medicaments SET nom=?, dosage=?, description=? WHERE id=?";
try (Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, m.getNom());
            ps.setString(2, m.getDosage());
            ps.setString(3, m.getDescription());
            ps.setInt(4, m.getId());
            int rows = ps.executeUpdate();
 if (rows > 0) {
                System.out.println("Médicament modifié avec succès !");
            } 
 else {
                System.out.println("Aucun médicament trouvé avec cet ID.");
   }
        } 
catch (SQLException e) {
            System.out.println("Erreur lors de la modification du médicament : " + e.getMessage());
        }
    }

    @Override
public void deleteMedicament(int id) throws Exception {
 String sql = "DELETE FROM medicaments WHERE id=?";
try (Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
if (rows > 0) {
                System.out.println("Médicament supprimé avec succès !");
            }
else {
                System.out.println("Aucun médicament trouvé avec cet ID.");
            }
        } 
catch (SQLException e) {
            System.out.println("Erreur lors de la suppression du médicament : " + e.getMessage());
        }
    }
}
