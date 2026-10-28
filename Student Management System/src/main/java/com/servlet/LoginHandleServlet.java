package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.Dao.AdminDAO;
import com.model.AdminBean;

@WebServlet("/login")
public class LoginHandleServlet extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		AdminDAO adminDAO=new AdminDAO();
		AdminBean adminBean=adminDAO.validateAdmin(email, password);
		
		if(adminBean != null)
		{
			HttpSession hs=request.getSession();
			hs.setAttribute("admin", adminBean);
			 response.sendRedirect(request.getContextPath() + "/admin.jsp");
			}else {
				request.setAttribute("errorMsg", "admin details are incorrect");
				request.getRequestDispatcher("login.jsp").forward(request, response);
				
			}
		
		
	}

}
