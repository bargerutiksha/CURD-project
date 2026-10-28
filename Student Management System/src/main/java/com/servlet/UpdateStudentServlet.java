package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.Dao.StudentDAO;
import com.model.StudentBean;


@WebServlet("/UpdateStudent")
public class UpdateStudentServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		read update student values
		
		int id=Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String department = request.getParameter("department");
		String city = request.getParameter("city");
		
//		store the above values into a student bean
		
		StudentBean sb=new StudentBean();
		sb.setId(id);
		sb.setName(name);
		sb.setEmail(email);
		sb.setPhone(phone);
		sb.setDepartment(department);
		sb.setCity(city);
		
//		create obj for sdao and class updatestudent method
		
		StudentDAO sdao=new StudentDAO();
		int result =sdao.updateStudent(sb);
		
		if(result>0)
		{
			HttpSession hs=request.getSession(true);
			
			hs.setAttribute("updateMsg", sb.getName()+" student details updated successfully.");
		}else {
			HttpSession hs=request.getSession(true);
			hs.setAttribute("updateMsg",sb.getName()+" student details updation failed.");
		}
		
		response.sendRedirect("GetAllStudents");
		
	}

}
