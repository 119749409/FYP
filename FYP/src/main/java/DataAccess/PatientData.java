
package DataAccess;

import Model.Patient;
import Util.DatabaseActions;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class PatientData {
    
    
     
    public ArrayList<Patient> getPatients(){
        ArrayList<Patient> patientList = new ArrayList<Patient>();
        try{
            DatabaseActions dba = new DatabaseActions();
            Connection conn = dba.connectDB();
            
            PreparedStatement stmt = conn.prepareStatement("Select * from Patients");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
           
                Patient pt = new Patient();
                
                pt.setPatientID(rs.getString(1));
                pt.setfName(rs.getString(2));
                pt.setSurname(rs.getString(3));
                pt.setAge(rs.getInt(4));
                pt.setAddress(rs.getString(5));
                pt.setPass(rs.getString(6));
 
                patientList.add(pt);
            }
        }catch(Exception e){
            
        }return patientList;
    }
    
    public void createPatient(Patient newPatient){
        System.out.println("adding new user");
         try{
            DatabaseActions dba = new DatabaseActions();
            Connection conn = dba.connectDB();
            // create a Statement from the connection
            Statement statement = conn.createStatement();

            System.out.println("adding new user");
            // insert the data
            statement.executeUpdate("INSERT INTO Patients " + 
                    "VALUES ('" + newPatient.getPatientID() +
                    "','" +  newPatient.getfName() + 
                    "','" +  newPatient.getSurname() + 
                    "'," +  newPatient.getAge() + 
                    ",'" +  newPatient.getAddress() + 
                    "','" +  newPatient.getPass() + "')"); 
    
            System.out.println("New Value inserted into Patient Data base");
         }catch(Exception e){
             
         }
         }
}
