package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import service.UserService;

/**
 * Servlet implementation class UserDeleteServlet
 */
public class UserDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	UserService userService;
    
    public UserDeleteServlet() {
        userService = new UserService();
    }

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		userService.delete(Integer.parseInt(request.getParameter("id")));
		PrintWriter out = response.getWriter();
		
		out.println("User deleted successfully");
	}

}
