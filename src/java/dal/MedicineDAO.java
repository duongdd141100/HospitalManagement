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
    
    public void updateById(String id, String name, String price, String information, String amount) {
        String sql = "UPDATE tbl_medicine"
                + " SET name = ?,"
                + " price = ? ,"
                + " information = ?,"
                + " amount = ?"
                + " WHERE id = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, price);
            ps.setString(3, information);
            ps.setString(4, amount);
            ps.setString(5, id);
            ps.executeUpdate();
        } catch(Exception e) {
            System.out.println("ERROR MedicineDAO.updateById()" + e.getMessage());
        }
    }
}
