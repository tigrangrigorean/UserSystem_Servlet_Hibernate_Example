package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService;

/**
 * Servlet implementation class UserServlet
 */
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UserService userService;
    
    public UsersServlet() {
    	userService = new UserService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		if(request.getParameter("id") != null) {
		long id = Integer.parseInt(request.getParameter("id"));
		out.print(userService.getById(id));
		}else {
			out.print(userService.getAll());
		}
	}


}
