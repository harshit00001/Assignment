package com.trainingtest.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Registration-servlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ServletConfig config;
       
 //      ServletContext context=getServletContext();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config)
    {
    	this.config=config;

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			
			List<UserDetails> ls=new ArrayList<>();
			List<UserDetails> ls2=new ArrayList<>();
			String userName=request.getParameter("uname");
			String password=request.getParameter("pwd");
			PrintWriter out =response.getWriter();
			response.setContentType("text/html");
			
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url="jdbc:oracle:thin:@localhost:1521/orcl.iiht.tech";
			String user="system";
			String pass="root";
			Connection con =DriverManager.getConnection(url,user,pass);
			System.out.println("Connection successful!");
			
			String newuser=null;
			String newpass=null;
			String newType=null;
			Statement stmt4=  con.createStatement();
			String query="select * from UserType";
			ResultSet rs2=stmt4.executeQuery(query);

//			while(rs2.next())
//			{
//				ls.add(new UserDetails(rs2.getString(1),rs2.getString(2),rs2.getString(3),rs2.getString(4),rs2.getString(5),rs2.getString(6)));
//			}
//				while(rs3.next())
//				{
//						ls2.add(new UserDetails(rs2.getString(1),rs2.getString(2),rs2.getString(3),rs2.getString(4),rs2.getString(5),rs2.getString(6)));
//				}

			while(rs2.next())
			{
				ls.add(new UserDetails(rs2.getString(1),rs2.getString(2),rs2.getString(3),rs2.getString(4),rs2.getString(5),rs2.getString(6)));

				if(rs2.getString(1).equals(userName)&& rs2.getString(2).equals(password))
				{
					ls2.add(new UserDetails(rs2.getString(1),rs2.getString(2),rs2.getString(3),rs2.getString(4),rs2.getString(5),rs2.getString(6)));

					newuser=rs2.getString(1);
					newpass=rs2.getString(2);
					newType=rs2.getString(6);
				}
			}
			if(userName.equals(newuser)&& password.equals(newpass))
				{
					if(newType.equals("admin type")) 
					{
						request.setAttribute("UserType",newType);
						request.setAttribute("RegisteredAdmin",ls);
						RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
						rd.forward(request, response);
					}
					else if(newType.equals("normal type"))
					{
						request.setAttribute("UserType",newType);
						request.setAttribute("RegisteredUser",ls2);
						RequestDispatcher rd=request.getRequestDispatcher("Home2.jsp");
						rd.forward(request, response);
					}
				}
			else
				{
					out.println("<html><body>");
					out.println("<h1>Login Failed! please Register Yourself </h1>");
					out.println("</body></html>");
				}
			con.commit();		
			
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

