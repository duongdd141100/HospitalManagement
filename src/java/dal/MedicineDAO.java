package dal;

import java.util.ArrayList;
import java.util.List;
import model.Medicine;

public class MedicineDAO extends DBContext{
    public List<Medicine> getAll() {
        String sql = "SELECT * FROM tbl_medicine";
        
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            List<Medicine> medicines = new ArrayList<>();
            while(rs.next()) {
                medicines.add(new Medicine(rs.getLong("id"),
                rs.getString("name"),
                rs.getDouble("price"),
                rs.getString("information"),
                rs.getInt("amount")));
            }
            return medicines;
        } catch(Exception e) {
            System.out.println("ERROR MedicineDAO.getAll()" + e.getMessage());
            return null;
        }
    }
    
    public void updateById(long id, String name, double price, String information, int amount) {
        String sql = "UPDATE tbl_medicine SET name = " + name + ", price = " + price +
                ", information = " + information + ", amount = " + amount + 
                "WHERE id = " + id;
        try {
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch(Exception e) {
            System.out.println("ERROR MedicineDAO.updateById()" + e.getMessage());
        }
    }
}
