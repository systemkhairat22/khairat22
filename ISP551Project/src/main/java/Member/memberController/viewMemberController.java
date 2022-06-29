package Member.memberController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Member.memberDAO.memberDAO;

/**
 * Servlet implementation class viewMemberController
 */
@WebServlet("/viewMemberController")
public class viewMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private memberDAO dao;
    public viewMemberController() {
        super();
        dao = new memberDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("m", memberDAO.getMemberById(id));
		RequestDispatcher view = request.getRequestDispatcher("viewmember.jsp");
		view.forward(request,response);
	}
}
