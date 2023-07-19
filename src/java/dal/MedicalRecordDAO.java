/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.time.LocalDate;

/**
 *
 * @author giang
 */
public class MedicalRecordDAO extends DBContext{

    public void insertMedicalRecord(long userId, String healthcareserviceId, String medicineId, String diagnosis) {
        LocalDate date = java.time.LocalDate.now();
        String sql = "INSERT INTO [dbo].[tbl_medicalrecord] ([user_id],[service_id],[medicine_id],[date],[diagnosis]) VALUES ("+userId+", "+healthcareserviceId+", "+medicineId+", '"+date+"', '"+diagnosis+"')";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();                             
        } catch(Exception e) {
            System.out.println("ERROR MedicalRecordDAO.insertMedicalRecord()" + e.getMessage());
            
        }
    }
    
    public static void main(String[] args) {
        new MedicalRecordDAO().insertMedicalRecord(1, "2", "2", "bbb");
    }
    
}
