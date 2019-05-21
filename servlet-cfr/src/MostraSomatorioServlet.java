

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MostraSomatorioServlet
 */
@WebServlet("/MostraSomatorioServlet")
public class MostraSomatorioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostraSomatorioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		int inicio = Integer.parseInt(request.getParameter("inicial"));
		int fim  = Integer.parseInt(request.getParameter("final"));
		int soma = 0;
		for (int i = inicio; i<=fim; i++) {soma += i;}
		PrintWriter out = response.getWriter();
		out.println("<html><head>");
		out.println("<title>Servlet MostraSomatorioServlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<P>O somatório de "+inicio+" a "+fim+" é "+soma+"</P><br/>");
		out.println("</body></html>");
		out.close();
	}

}
