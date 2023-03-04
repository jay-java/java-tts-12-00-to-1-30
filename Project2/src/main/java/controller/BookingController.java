package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookingDao;
import model.BookService;

/**
 * Servlet implementation class BookingController
 */
@WebServlet("/BookingController")
public class BookingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("book")) {
			BookService b = new BookService();
			b.setCid(Integer.parseInt(request.getParameter("cid")));
			b.setSid(Integer.parseInt(request.getParameter("sid")));
			b.setSname(request.getParameter("sname"));
			b.setSemail(request.getParameter("semail"));
			b.setStype(request.getParameter("stype"));
			b.setStatus("pending");
			BookingDao.bookService(b);
			response.sendRedirect("customer-index.jsp");
		}
		else if(action.equalsIgnoreCase("confirm")) {
			int id = Integer.parseInt(request.getParameter("bid"));
			BookingDao.approveStatus(id);
			response.sendRedirect("pending-services.jsp");
		}
	}

}
