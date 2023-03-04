package controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ServicemanDao;
import model.ServiceMan;
import services.Service;

/**
 * Servlet implementation class ServicemanController
 */
@WebServlet("/ServicemanController")
public class ServicemanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServicemanController() {
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
		if(action.equalsIgnoreCase("register")) {
			ServiceMan s = new ServiceMan();
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setStype(request.getParameter("stype"));
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			ServicemanDao.insertServicemanData(s);
			response.sendRedirect("serviceman-login.jsp");
		}
		else if(action.equalsIgnoreCase("login")) {
			ServiceMan s = new ServiceMan();
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			ServiceMan s1 = ServicemanDao.servicemanLogin(s);
			System.out.println(s1);
			if(s1==null) {
				request.setAttribute("msg", "email or password is incorrect");
				request.getRequestDispatcher("serviceman-login.jsp").forward(request, response);
			}
			else {
				HttpSession session = request.getSession();
				session.setAttribute("data", s1);
				request.getRequestDispatcher("serviceman-index.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("update")) {
			ServiceMan s = new ServiceMan();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setStype(request.getParameter("stype"));
			s.setEmail(request.getParameter("email"));
			ServicemanDao.updateProfile(s);
			HttpSession session = request.getSession();
			session.setAttribute("data", s);
			request.getRequestDispatcher("serviceman-index.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("change password")) {
			ServiceMan s = new ServiceMan();
			int id = Integer.parseInt(request.getParameter("id"));
			String op = request.getParameter("op");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			boolean flag = ServicemanDao.checkOldPassword(id, op);
			if(flag == true) {
				if(np.equals(cnp)) {
					ServicemanDao.updatePassword(id, np);
					response.sendRedirect("serviceman-index.jsp");
				}
				else {
					request.setAttribute("msg", "new password and confirm new password not matched");
					request.getRequestDispatcher("serviceman-change-password.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg1", "old password incoorect");
				request.getRequestDispatcher("serviceman-change-password.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("get otp")) {
			String email = request.getParameter("email");
			boolean flag = ServicemanDao.checkEmail(email);
			if(flag == true) {
				Service s = new Service();
				Random r = new Random();
				int num = r.nextInt(9999);
				System.out.println(num);
				s.sendMail(email, num);
				request.setAttribute("email", email);
				request.setAttribute("otp", num);
				request.getRequestDispatcher("serviceman-verify-otp.jsp").forward(request, response);
			}
			else {
				request.setAttribute("msg", "Email id not registered");
				request.getRequestDispatcher("serviceman-forgot-password.jsp").forward(request, response);
			}
		}
	}

}
