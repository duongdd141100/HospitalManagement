package dal;

import java.util.ArrayList;
import java.util.List;
import model.HealthcareService;

public class HealthcareServiceDAO extends DBContext{
    public List<HealthcareService> getAll() {
        String sql = "SELECT * FROM tbl_healthcare_service";
        
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            List<HealthcareService> healthcareServices = new ArrayList<>();
            while(rs.next()) {
                healthcareServices.add(
                new HealthcareService(rs.getLong("id"),
                rs.getString("name"),
                rs.getDouble("price"),
                rs.getString("information")));
            }
            return healthcareServices;
        } catch(Exception e) {
            System.out.println("ERROR MedicineDAO.getAll()" + e.getMessage());
            return null;
        }
    }
    
    public void updateById(long id, String name, double price, String information) {
        String sql = "UPDATE tbl_healthcare_service SET name = " + name + ", price = " + price +
                ", information = " + information + 
                "WHERE id = " + id;
        try {
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch(Exception e) {
            System.out.println("ERROR HealthcareServiceDAO.updateById()" + e.getMessage());
        }
    }
}
