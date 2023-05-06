package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.UserService;

/**
 * Servlet implementation class UserUpdateServlet
 */
public class UserUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	UserService userService;
	
    public UserUpdateServlet() {
        userService = new UserService();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setId(Integer.parseInt(request.getParameter("id")));
		user.setName(request.getParameter("name"));
		user.setAge(Integer.parseInt(request.getParameter("age")));
		userService.update(user);
		PrintWriter out = response.getWriter();
		out.println("User updated successfully");
	}

}
