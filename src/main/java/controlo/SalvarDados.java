package controlo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SalvarDados
 */
@WebServlet("/SalvarDados")
public class SalvarDados extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String nome = request.getParameter("nome");
		String codigo = request.getParameter("codigo");
		String curso = request.getParameter("curso");
		String ano = request.getParameter("ano");
		String despacho = request.getParameter("despacho");
		
		response.sendRedirect("sucesso.jsp?nome=" + nome + "&codigo=" + codigo + "&curso=" + curso+ "&ano=" + ano+ "&despacho=" + despacho);
		
	}

}
