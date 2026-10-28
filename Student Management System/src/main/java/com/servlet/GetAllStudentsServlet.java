package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import com.Dao.StudentDAO;
import com.model.StudentBean;


@WebServlet("/GetAllStudents")
public class GetAllStudentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       ArrayList<StudentBean> studentList=new ArrayList<StudentBean>();
       StudentDAO sd=new StudentDAO();
       studentList=sd.GetAllStudents();
       request.setAttribute("studentList", studentList);
       RequestDispatcher rd= request.getRequestDispatcher("display-student.jsp");
       rd.forward(request, response);
       
       
		
	}

}
