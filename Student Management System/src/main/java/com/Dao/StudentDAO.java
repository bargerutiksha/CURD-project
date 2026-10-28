package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.db.DBConnection;
import com.model.StudentBean;

public class StudentDAO {
	
//this method return all student records
	public ArrayList<StudentBean>GetAllStudents(){
//create arraylist to store student records
		ArrayList<StudentBean> stdList=new ArrayList();
		StudentBean sb=null;
//		create connection with db
		Connection con=DBConnection.getConnection();

		try {
			PreparedStatement p = con.prepareStatement("SELECT id, name, email, phone, department, city FROM student_details");
		ResultSet rs=p.executeQuery();
		while(rs.next()) {
			sb=new StudentBean();
			sb.setId(rs.getInt(1));
			sb.setName(rs.getString(2));
			sb.setEmail(rs.getString(3));
			sb.setPhone(rs.getString(4));
			sb.setDepartment(rs.getString(5));
			sb.setCity(rs.getString(6));
			stdList.add(sb);
		}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return stdList;
}
//	end of the method
	
//	this method insert student record into db
	public int addStudent(StudentBean sb) {
		
		int result=0;
		Connection con=DBConnection.getConnection();

		try {
			PreparedStatement ps = con.prepareStatement("INSERT INTO student_details (name, email, phone, department, city) VALUES (?, ?, ?, ?, ?)");
		
		ps.setString(1, sb.getName());
		ps.setString(2, sb.getEmail());
		ps.setString(3, sb.getPhone());
		ps.setString(4, sb.getDepartment());
		ps.setString(5, sb.getCity());
		
	   result=ps.executeUpdate();
		}
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return result;
	}
//end of method
	
//	this method return stuednt record based on student id
	
	public StudentBean getStudentById(int id)
	{
		StudentBean sb=null;
		Connection con =DBConnection.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("select * from student_details where id=?");
			ps.setInt(1, id);
			ResultSet rs= ps.executeQuery();
		
			if(rs.next())
			{
				sb=new StudentBean();
				sb.setId(rs.getInt(1));
				sb.setName(rs.getString(2));
				sb.setEmail(rs.getString(3));
				sb.setPhone(rs.getString(4));
				sb.setDepartment(rs.getString(5));
				sb.setCity(rs.getString(6));
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb;
		
	}  //end of method	
      //this method update student details in db
	
	public int updateStudent(StudentBean sb) {
		int result=0;
		Connection con=DBConnection.getConnection();
		
		try {
			PreparedStatement ps=con.prepareStatement("update student_details set name=?, email=?, phone=?, department=?, city=? where id=?");
		ps.setString(1, sb.getName());
	    ps.setString(2, sb.getEmail());
	    ps.setString(3, sb.getPhone());
	    ps.setString(4, sb.getDepartment());
	    ps.setString(5, sb.getCity());
	    ps.setInt(6, sb.getId());
	    
	    result =ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return result;
		
	}

//end of method
	
//	this method delete student record based on id
	
	public int deleteStudentById(int sid) {
		int result=0;
		Connection con=DBConnection.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("delete from student_details where id=?");
			ps.setInt(1, sid);
			result=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}




}