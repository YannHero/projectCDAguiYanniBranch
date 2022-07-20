package controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CoordonneesDAO;
import dao.UtilisateursDAO;
import modele.CoordonneesBean;
import modele.UtilisateursBean;

/**
 * Servlet implementation class ServletModifUserPage
 */
@WebServlet("/ServletModifUserPage")
public class ServletModifUserPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CoordonneesDAO coordonneesDAO= new CoordonneesDAO();
	private CoordonneesBean coordonneesBean = new CoordonneesBean();
	private UtilisateursDAO utilisateursDAO = new UtilisateursDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletModifUserPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession( true );
	
		request.getRequestDispatcher("page/modifUserPage/ModifUserPage.jsp").forward(request, response);
		
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		UtilisateursBean ub = (UtilisateursBean)request.getSession().getAttribute("User");
		
		
		switch (request.getAttribute("buttonValider").toString()) {
		case "modifEmail":
			ub.setEmail(request.getParameter("Email"));
			utilisateursDAO.update(ub);
			break;
		case "modifPrenom":
			ub.setNom(request.getParameter("Nom"));
			utilisateursDAO.update(ub);
			break;
		case "modifNom":
			ub.setPrenom(request.getParameter("prenom"));
			utilisateursDAO.update(ub);
			break;
		}
		
		doGet(request, response);
	}

}
