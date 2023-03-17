package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ServicemanDao;
import model.Admin;
import model.ServiceMan;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminController() {
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
		if(action.equalsIgnoreCase("login")) {
			String email = "admin@gmail.com";
			String password = "admin123";
			Admin a = new Admin();
			a.setEmail(request.getParameter("email"));
			a.setPassword(request.getParameter("password"));
			if(a.getEmail().equals(email) && a.getPassword().equals(password)) {
				HttpSession session = request.getSession();
				session.setAttribute("data", email);
				request.getRequestDispatcher("admin-index.jsp").forward(request, response);
			}
			else {
				request.setAttribute("msg", "email or password is incorrect");
				request.getRequestDispatcher("admin-login.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("update serviceman")) {
			ServiceMan s = new ServiceMan();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setStype(request.getParameter("stype"));
			s.setEmail(request.getParameter("email"));
			ServicemanDao.updateProfile(s);
			response.sendRedirect("admin-serviceman-list.jsp");
		}
		else if(action.equalsIgnoreCase("delete serviceman")) {
			int id = Integer.parseInt(request.getParameter("id"));
			ServicemanDao.deleteServiceman(id);
			response.sendRedirect("admin-serviceman-list.jsp");
		}
	}

}
