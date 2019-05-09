package scs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Example3
 */
@WebServlet("/Example3")
public class Example3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Example3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.write("<html><head>");
		out.write("<style type='text/css'>");
		out.write("*{margin:0px}");
		out.write("header{height:100px;background-color:cyan;}");
		out.write("section{height:500px;background-color:black;color:white;}");
		out.write("footer{height:100px;background-color:cyan;}");
		
		out.write("</style>");
		out.write("</head>");
		
		out.write("<body>");
		out.write("<header>");
		out.write("<a href='ram'>Home</a><a href='Example2'>About</a>");
		out.write("</header>");
		out.write("<section>");
		
		out.write("</section>");
		out.write("<footer>");
		out.write("</footer>");
		out.write("</body>");
		out.write("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
