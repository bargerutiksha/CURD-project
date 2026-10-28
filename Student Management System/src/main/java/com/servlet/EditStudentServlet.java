package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.Dao.StudentDAO;
import com.model.StudentBean;


@WebServlet("/EditStudent")
public class EditStudentServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		read stuent id
		
	  int id=Integer.parseInt(request.getParameter("id"));
	  
	  StudentDAO sdao=new StudentDAO();
	  StudentBean sb=sdao.getStudentById(id);
	  
	  request.setAttribute("s", sb);
	  
	  request.getRequestDispatcher("edit-student.jsp").forward(request, response);
	  
	}

}
