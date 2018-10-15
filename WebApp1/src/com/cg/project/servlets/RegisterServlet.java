package com.cg.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}


	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		/*	out.print("<html><body>");              //dynamic html/response
		out.println("<div><font color=red size=8>Registered Successfully!</font></div>");
		out.print("</html></body>");*/
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String dob = req.getParameter("dob");
		String[] hobbies = req.getParameterValues("hobbies");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");

		PrintWriter out = resp.getWriter();
		out.print("<html><body><div align='center'><font color='red'>Welcome "+firstName+"</font></div><br><br><table align='center' border : 2px>");
		out.print("<tr><td>First Name</td><td>Last Name</td><td>Hobbies</td><td>Date Of Birth</td><td>Phone Number</td><td>Email</td></tr>");
		out.print("<tr><td>"+firstName+"</td><td>"+lastName+"</td><td>");
		for (String string : hobbies)
			out.print(string+" ");
		out.print("</td><td>"+dob+"</td><td>"+phone+"</td><td>"+email+"</td></tr>");
		out.print("</table></body></html>");
	}
}
