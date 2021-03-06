package executioner.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import executioner.dao.PrisonerExecutionerDAO;
import executioner.dao.impl.PrisonerExecutionerDAOImpl;
import executioner.model.PrisonersExecutioner;


/**
 * Servlet implementation class InsertExecutioner
 */
@WebServlet("/InsertExecutioner")
public class InsertExecutioner extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertExecutioner() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String National_ID=request.getParameter("National_ID");
		String Executioner_ID=request.getParameter("Executioner_ID");
		String Executioner_Name=request.getParameter("Executioner_Name");
		//int age=Integer.parseInt(request.getParameter("age"));
		String  Prisoner_ID=request.getParameter("Prisoner_ID");
		String  Duty_Date=request.getParameter("Duty_Date");
		
		
		PrisonersExecutioner prisonersExecutioner=new PrisonersExecutioner(National_ID,Executioner_ID,Executioner_Name, Prisoner_ID,Duty_Date);
		
		ServletContext sc=getServletContext();
		Connection con=(Connection)sc.getAttribute("connObj");
		PrisonerExecutionerDAO sdao=new PrisonerExecutionerDAOImpl(con);
		boolean status=sdao.insertExecutioner(prisonersExecutioner);
		//if 
		//9oper==true)
		//status=true;
		System.out.println(status);

		
		if(status==true)
		{
			pw.println("<center><h2>Executioner Record Inserted Successfully..</h2></center>");
			RequestDispatcher rd=request.getRequestDispatcher("executioner.jsp");
			rd.include(request, response);
		}
		else
		{
			pw.println("<center><h2>Executioner Record Insertation Failed..</h2></center>");
			RequestDispatcher rd=request.getRequestDispatcher("executioner.jsp");
			rd.include(request, response);
			
		}
		
	}

}
