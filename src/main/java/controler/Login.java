package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UtilisateursDAO;
import modele.UtilisateursBean;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UtilisateursDAO utilisateursDAO = new UtilisateursDAO();
	private UtilisateursBean user = new UtilisateursBean();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession( true );
		
		if (request.getParameter("logout") != null) {
			session.invalidate();
			response.sendRedirect(request.getContextPath() + "/ServletMainpage");
			}
		if (request.getParameter("loginEmail") != null) {
			user = utilisateursDAO.Connection(request.getParameter("loginEmail"),request.getParameter("InputLoginPassword"));
			session.setAttribute("User", user);
			response.sendRedirect(request.getContextPath() + "/ServletMainpage");
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
