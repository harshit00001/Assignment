package com.training.web;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/Demo-servlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String msg;
       ServletConfig config;

 //      ServletContext context=getServletContext();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config)
    {
    	msg="Kevin";
    	this.config=config;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			List<Course> course =new ArrayList<>();
			ServletContext context=config.getServletContext();
			String email=config.getInitParameter("email");
			String dname=context.getInitParameter("dname");
			String userName=request.getParameter("uname");
			String password=request.getParameter("pwd");
			
			
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url="jdbc:oracle:thin:@localhost:1521/orcl.iiht.tech";
			String user="system";
			String pass="root";
			
			Connection con =DriverManager.getConnection(url,user,pass);
			Statement stmt4=  con.createStatement();
			String query="select * from course";
			ResultSet rs2=stmt4.executeQuery(query);
			while(rs2.next())
			{
				course.add(new Course(rs2.getString(1),rs2.getString(2),rs2.getString(3),rs2.getString(4)));
			}
			request.setAttribute("courseDetail",course);
			RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
			rd.forward(request, response);
			
			
			
			
			
//			String username= request.getParameter("uname");
//			String password= request.getParameter("pwd");
//			PrintWriter out =response.getWriter();
//			response.setContentType("text/html");
//			
//			Connection con =DriverManager.getConnection(url,user,pass);
//			System.out.println("Connection successful!");
//			String newuser=null;
//			String newpass=null;
//			Statement stmt4=  con.createStatement();
//			String query="select * from StAdmin";
//			ResultSet rs2=stmt4.executeQuery(query);
//			while(rs2.next())
//			{
//				if(rs2.getString(1).equals(username)&& rs2.getString(2).equals(password))
//				{
//					newuser=rs2.getString(1);
//					newpass=rs2.getString(2);
//					break;
//				}
//			}
//			if(username.equals(newuser)&& password.equals(newpass))
//				{
//					out.println("<html><body>");
//					out.println("<h1>Login Successful!<br> Welcome "+msg+"</h1>");
//					out.println("</body></html>");
//				}
//				else
//				{
//					out.println("<html><body>");
//					out.println("<h1>Login Failed! </h1>");
//					out.println("</body></html>");
//				}
//			con.commit();
			
//			if(username.equals(user)&& password.equals(pass))
//			{
//				out.println("<html><body>");
//				out.println("<h1>Login Successful!<br> Welcome "+msg+"</h1>");
//				out.println("</body></html>");
//			}
//			else
//			{
//				out.println("<html><body>");
//				out.println("<h1>Login Failed! </h1>");
//				out.println("</body></html>");
//			}
//			PreparedStatement stmt3=con.prepareStatement("Select * from StAdmin where username=? && password=?");
//			stmt3.setString(1, username);
//			stmt3.setString(2, password);
//			ResultSet rs2=stmt3.executeQuery();
//			while(rs2.next())
//			{
//				if(rs2.getString(1).equals(username)&& rs2.getString(2).equals(password))
//					{
//						out.println("<html><body>");
//						out.println("<h1>Login Successful!<br> Welcome "+msg+"</h1>");
//						out.println("</body></html>");
//					1	break;
//					}
//				
//			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
