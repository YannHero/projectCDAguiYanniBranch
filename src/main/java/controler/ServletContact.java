package controler;

import dao.AdministrateursDAO;
import modele.AdministrateursBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ServletContact
 */
@WebServlet("/ServletContact")
public class ServletContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AdministrateursDAO administrateursDAO = new AdministrateursDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/contactPage/contactPage.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		administrateursDAO.creat(new AdministrateursBean("test","test","test","test"));
		doGet(request, response);
	}
	
}
