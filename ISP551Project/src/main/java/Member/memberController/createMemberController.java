package Member.memberController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Member.memberDAO.memberDAO;
import modelClass.member;

@WebServlet("/createMemberController")
public class createMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private memberDAO dao;
    public createMemberController() {
        super();
        dao = new memberDAO();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		member m = new member();
		m.setMem_icnum(request.getParameter("mem_icnum"));
		m.setMem_name(request.getParameter("mem_name"));
		m.setMem_age(Integer.parseInt(request.getParameter("mem_age")));
		m.setMem_gender(request.getParameter("mem_gender"));
		m.setMem_address(request.getParameter("mem_adress"));
		m.setMem_phonenum(request.getParameter("mem_phonenum"));
		m.setRepresentative_name(request.getParameter("rep_name"));
		m.setRepresentative_icnum(request.getParameter("rep_name"));
		
		dao.createMember(m);// invoke method createMember() in MemberDAO
		
		RequestDispatcher view = request.getRequestDispatcher("viewmember.jsp");
		view.forward(request,response);
	}

}
