package Member.memberController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Member.memberDAO.memberDAO;

@WebServlet("/deleteMemberController")
public class deleteMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private memberDAO dao;
    public deleteMemberController() {
        super();
        dao = new memberDAO();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		dao.deleteMember(id);
		
	}
}
