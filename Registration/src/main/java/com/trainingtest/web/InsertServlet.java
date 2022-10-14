package com.trainingtest.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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



@WebServlet("/Insert-servlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

       ServletConfig config;
       List<UserDetails> ls=new ArrayList<>();
 //      ServletContext context=getServletContext();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
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
			String userName=request.getParameter("uname");
			String password=request.getParameter("pwd");
			String Name=request.getParameter("name");
			String id=request.getParameter("id");
			String address=request.getParameter("address");
			String UserType=request.getParameter("userT");
			PrintWriter out =response.getWriter();
			response.setContentType("text/html");
			
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url="jdbc:oracle:thin:@localhost:1521/orcl.iiht.tech";
			String user="system";
			String pass="root";
			Connection con =DriverManager.getConnection(url,user,pass);
			System.out.println("Connection successful!");
			PreparedStatement p=con.prepareStatement("insert into Usertype values(?,?,?,?,?,?)");
			p.setString(1, userName);
			p.setString(2, password);
			p.setString(3, Name);
			p.setString(4, id);
			p.setString(5, address);
			p.setString(6, UserType);
			p.executeUpdate();
			p.close();
			ls.add(new UserDetails(userName,password,Name,id,address,UserType));
			request.setAttribute("UserType",UserType);
			request.setAttribute("Registered",ls);
			RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
			rd.forward(request, response);
				
			
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

