package com.company.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.model.User;
import com.company.dao.*;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDao userDao = new UserDaoImpl();   

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String password = request.getParameter("password");
    	String username = request.getParameter("username");
        
        String email = request.getParameter("email");

        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);

        if (userDao.addUser(user)) {
            response.sendRedirect("Login.jsp?registration=success");
        } else {
            response.sendRedirect("Register.jsp?error=1");
        }
    }

}
