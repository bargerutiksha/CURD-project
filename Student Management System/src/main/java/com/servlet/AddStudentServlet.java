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


@WebServlet("/AddStudent")
public class AddStudentServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		store all form details
		
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String department=request.getParameter("department");
		String city=request.getParameter("city");
		
		StudentBean sb=new StudentBean();
		sb.setName(name);
		sb.setPhone(phone);
		sb.setEmail(email);
		sb.setDepartment(department);
		sb.setCity(city);
		
//		create obj for student dao
		StudentDAO sdao= new StudentDAO();
		int result = sdao.addStudent(sb);
		
		if(result>0) {
			HttpSession hs=request.getSession(true);
			hs.setAttribute("insertMsg", sb.getName()+" details inserted sucessfully");
			response.sendRedirect("GetAllStudents");
			
		}
		else {
			HttpSession hs=request.getSession(true);
			hs.setAttribute("insertMsg", "insertion is failed");
			response.sendRedirect("add-stuent.jsp");
		}
	}

}
