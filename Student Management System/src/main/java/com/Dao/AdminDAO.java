
package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.DBConnection;
import com.model.AdminBean;

public class AdminDAO {

    public AdminBean validateAdmin(String email, String password) {

        AdminBean adminBean = null;

        String sql = "SELECT id, username, email, password "
                   + "FROM admin_details "
                   + "WHERE email = ? AND password = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement p = con.prepareStatement(sql)) {

            p.setString(1, email);
            p.setString(2, password);

            try (ResultSet rs = p.executeQuery()) {

                if (rs.next()) {
                    adminBean = new AdminBean();

                    adminBean.setId(rs.getInt("id"));
                    adminBean.setUsername(rs.getString("username"));
                    adminBean.setEmail(rs.getString("email"));
                    adminBean.setPassword(rs.getString("password"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return adminBean;
    }
}