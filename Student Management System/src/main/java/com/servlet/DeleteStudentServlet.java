package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.Dao.StudentDAO;


@WebServlet("/DeleteStudent")
public class DeleteStudentServlet extends HttpServlet {
	
    public DeleteStudentServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		store student id
		
	int sid=Integer.parseInt(request.getParameter("id"));
	
//	create obj for studentDAO and call deletebyid method
	
	StudentDAO sdao=new StudentDAO();
	int result=sdao.deleteStudentById(sid);
	
	if(result==1) {
		HttpSession hs = request.getSession(true);
		hs.setAttribute("deleteMsg", sid+" student record is deleted..!");
	}else {
		HttpSession hs = request.getSession(true);
		hs.setAttribute("deleteMsg", sid+" student record is not deleted..!");
	}
	response.sendRedirect("GetAllStudents");
	}

}
