

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SomatorioServlet
 */
@WebServlet("/SomatorioServlet")
public class SomatorioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SomatorioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head>");
		out.println("<title>Servlet SomatorioServlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Informe os valores inicial e final para o cálculo do somatório:</P>");
		out.println("<form action=\"MostraSomatorioServlet\" method=\"post\">");
		out.println(" Valor inicial: <input type=\"text\" name=\"inicial\"/>");
		out.println(" Valor final: <input type=\"text\" name=\"final\"/><br/>");
		out.println(" <input type=\"submit\" value=\"Calcular soma\"/>");
		out.println("</form>");
		out.println("</body></html>");
		out.close();
	}

}
