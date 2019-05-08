package scs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleInterest
 */
@WebServlet("/SimpleInterest")
public class SimpleInterest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleInterest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.write("<form action='' method='post'>");
		out.write("Enter Amount");
		out.write("<input type='text' name='txtamount' />");
		out.write("Enter Rate");
		out.write("<input type='text' name='txtrate' />");
		out.write("Enter time");
		out.write("<input type='text' name='txttime' />");
		out.write("<input type='submit' name='btnsubmit' value='click' />");
		out.write("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		float p = Float.parseFloat(request.getParameter("txtamount"));
		float r = Float.parseFloat(request.getParameter("txtrate"));
		float t = Float.parseFloat(request.getParameter("txttime"));
		float si = (p*r*t)/100;
		out.print("Result is "+si);
	}

}
