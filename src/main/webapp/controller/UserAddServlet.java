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
 * Servlet implementation class UserAddServlet
 */
public class UserAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	UserService userService;
  
    public UserAddServlet() {
    	userService = new UserService();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		User user = new User();
		user.setName(request.getParameter("name"));
		user.setAge(Integer.parseInt(request.getParameter("age")));
		userService.save(user);
		out.println("User added succesfully");
	}

}
