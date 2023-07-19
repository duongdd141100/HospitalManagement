/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author giang
 */
public class UserDAO extends DBContext{
    public List<User> getAll() {
        String sql = "SELECT * FROM tbl_user";
        
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            List<User> users = new ArrayList<>();
            while(rs.next()) {
                users.add(new User(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getBoolean(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }
            return users;
        } catch(Exception e) {
            System.out.println("ERROR User.getAll()" + e.getMessage());
            return null;
        }
    }
    public static void main(String[] args) {
        List<User> users = new UserDAO().getAll();
        System.out.println(users.size());
    }
}
