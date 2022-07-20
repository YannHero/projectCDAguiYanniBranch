package controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UtilisateursDAO;
import modele.UtilisateursBean;

/**
 * Servlet implementation class ServletInscription
 */
@WebServlet("/ServletInscription")
public class ServletInscriptionPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletInscriptionPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
			request.getRequestDispatcher("page/inscriptionPage/InscriptionPage.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String InputFirstName = request.getParameter("InputFirstName");
		String InputLastName = request.getParameter("InputLastName");
		String InputEmail = request.getParameter("InputEmail");
		String InputPassword = request.getParameter("InputFirstName");
		String ConfirmPassword = request.getParameter("InputFirstName");
		new UtilisateursDAO().ecrire(new UtilisateursBean(InputLastName,InputFirstName,InputEmail,InputPassword)); 


		System.out.println("posted");
		request.getRequestDispatcher("mainPage/MainPage.jsp").forward(request, response);
	}

}
