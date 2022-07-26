package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ProduitsDAO;
import modele.ProduitsBean;

import static java.lang.String.valueOf;

/**
 * Servlet implementation class ServletInscription
 */
@WebServlet("/ServletAddProduct")
public class ServletAddProduct extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private ProduitsDAO produitsDAO = new ProduitsDAO();
    private ProduitsBean produit = new ProduitsBean();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAddProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession( true );



        request.getRequestDispatcher("page/addProductPage/addProductPage.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String InputName = request.getParameter("InputName");
        String PriceString = request.getParameter("InputPrice");
        String InputCategory = request.getParameter("InputCategory");
        String InputDescription = request.getParameter("InputDescription");
        String InputImage = request.getParameter("InputImage");
        String StockString = request.getParameter("InputStock");
        String StockStringMin = request.getParameter("InputStockMin");

       // int InputPrice;
        //InputPrice = Integer.parseInt(request.getParameter("InputPrice"));


       // InputPrice = Integer.parseInt(PriceString);
      //  System.out.println(InputPrice);
        int InputStock = Integer.parseInt(StockString);
        System.out.println(InputStock);
        int InputStockMin = Integer.parseInt(StockStringMin);
        System.out.println(InputStockMin);
        System.out.println(InputName);

      //  ProduitsBean myProduct = new ProduitsBean(InputName, InputPrice, InputDescription, InputImage, InputStock, InputStockMin);
     //   System.out.println(myProduct);

         new ProduitsDAO().inserTest(new ProduitsBean(request.getParameter("InputName"),Integer.parseInt(request.getParameter("InputPrice")),request.getParameter("InputDescription"),request.getParameter("InputImage"),Integer.parseInt(request.getParameter("InputStock")),Integer.parseInt(request.getParameter("InputStockMin"))));

        request.getRequestDispatcher("page/mainPage/mainPage.jsp").forward(request, response);
        System.out.println("posted");
    }

}