package Day15.java.com.training.web;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url="jdbc:oracle:thin:@localhost:1521/orcl.iiht.tech";
			String user="system";
			String pass="system";
			String username= request.getParameter("uname");
			String password= request.getParameter("pwd");
			PrintWriter out =response.getWriter();
			response.setContentType("text/html");
			if(username.equals(user)&&password.equals(pass))
			{
//				String email=config.getInitParameter("email");
//				ServletContext context=config.getServletContext();
//				String dname=context.getInitParameter("dname");
				Connection con =DriverManager.getConnection(url,user,pass);
				PreparedStatement stmt2=con.prepareStatement("Insert into UserHarsh values(?,?)");
				stmt2.setString(1, username);
				stmt2.setString(2, password);
				stmt2.executeUpdate();
				
				out.println("<html><body>");
				out.println("<h1>Login Successful!<br> Welcome "+msg+"</h1>");
				out.println("</body></html>");
			}
			else
			{
				out.println("<html><body>");
				out.println("<h1>Login Failed! </h1>");
				out.println("</body></html>");
			}
			
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
