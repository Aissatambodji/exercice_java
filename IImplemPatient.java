package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Patient;

public class IImplemPatient implements IPatient{
private static DBConnection _db;
public static DBConnection getDb(){
if(_db==null){
_db=new DBConnection();
}
return _db;
}

public class IPatient {

public void addPatient(Patient p) throws Exception {
String sql = "INSERT INTO patients(nom, prenom, date_naissance) VALUES (?, ?, ?)";
try (Connection conn = DBConnection.getConnection();
PreparedStatement ps = conn.prepareStatement(sql)) {
ps.setString(1, p.getNom());
ps.setString(2, p.getPrenom());
ps.setDate(3, new java.sql.Date(p.getDateNaissance().getTime()));
ps.executeUpdate();
System.out.println("Patient ajouté avec succès !");
} 
catch (SQLException e) {
System.out.println("Erreur lors de l'ajout du patient : " + e.getMessage());
}
}

public List<Patient> getAllPatients() throws Exception {
List<Patient> patients = new ArrayList<>();
String sql = "SELECT * FROM patients";
try (Connection conn = DBConnection.getConnection();
Statement st = conn.createStatement();
ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                patients.add(new Patient(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getString("prenom"),
                    rs.getDate("date_naissance")
));
            }
        } catch (SQLException e) {
System.out.println("Erreur lors de la récupération des patients : " + e.getMessage());
        }
 return patients;
    }

public void deletePatient(int id) throws Exception {
String sql = "DELETE FROM patients WHERE id=?";
try (Connection conn = DBConnection.getConnection();
PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
int rows = ps.executeUpdate();
              if (rows > 0) {
                   System.out.println("Patient supprimé avec succès !");
            } else {
                   System.out.println("Aucun patient trouvé avec cet ID.");
                   }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la suppression du patient : " + e.getMessage());
        }
    }
}

public int add(Patient p) throws Exception {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public List<Patient> getAll() throws Exception {
	// TODO Auto-generated method stub
	return null;
}
@Override
public boolean delete(int id) throws Exception {
	// TODO Auto-generated method stub
	return false;
}
public void addPatient(Patient p) {
	// TODO Auto-generated method stub
	
}
public List<Patient> getAllPatients() {
	// TODO Auto-generated method stub
	return null;
}}
