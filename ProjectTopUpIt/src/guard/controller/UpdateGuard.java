package guard.controller;

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

import guard.dao.guardDAO;
import guard.dao.impl.guardDaoImplement;
import guard.model.Guard;



/**
 * Servlet implementation class UpdatePrisoner
 */
@WebServlet("/UpdateGuard")
public class UpdateGuard extends HttpServlet {
 private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateGuard() {
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
 
  String Guard_ID=request.getParameter("Guard_ID");
  String Guard_Name=request.getParameter("Guard_Name");
  String  Cell_No=request.getParameter("Cell_No");
  
  Guard guard=new Guard(Guard_ID,Guard_Name,Cell_No);
  ServletContext sc=getServletContext();
  Connection con=(Connection)sc.getAttribute("connObj");
 guardDAO sdao=new guardDaoImplement(con);
  int update=sdao.updateGuard(guard);
  pw.println("<center><h2>"+update+" Guard Record Updated Successfully..</h2></center>");
  RequestDispatcher rd=request.getRequestDispatcher("guard.jsp");
  rd.include(request, response);
  
 }

}
