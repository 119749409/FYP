package Opperations;

import DataAccess.PatientData;
import Model.Patient;

public class PatientOpps {
    
    public void createNewPatient(String ID, String fname, String surname, int age, String address, String Pass){
        
        Patient newP = new Patient(); 
        
        newP.setPatientID(ID);
        newP.setfName(fname);
        newP.setSurname(surname);
        newP.setAge(age);
        newP.setAddress(address);
        newP.setPass(Pass);
        
        PatientData pda = new PatientData();
        pda.createPatient(newP);
    }
    
}
