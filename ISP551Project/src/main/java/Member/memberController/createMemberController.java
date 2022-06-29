package Member.memberController;

import java.io.IOException;
import java.sql.SQLException;

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
//		member m = new member();
/*		m.setMem_icnum(request.getParameter("mem_icnum"));
		m.setMem_name(request.getParameter("mem_name"));
		m.setMem_age(Integer.parseInt(request.getParameter("mem_age")));
		m.setMem_gender(request.getParameter("mem_gender"));
		m.setMem_address(request.getParameter("mem_adress"));
		m.setMem_phonenum(request.getParameter("mem_phonenum"));
		m.setRepresentative_name(request.getParameter("rep_name"));
		m.setRepresentative_icnum(request.getParameter("rep_ic"));
*/		
		
		String icnum= (request.getParameter("mem_icnum"));
		String name =(request.getParameter("mem_name"));
		int age = (Integer.parseInt(request.getParameter("mem_age")));
		String gender =(request.getParameter("mem_gender"));
		String address= (request.getParameter("mem_adress"));
		String email= (request.getParameter("mem_email"));
		String phoneNum = (request.getParameter("mem_phonenum"));
		String repName = (request.getParameter("rep_name")); 
		String	repIcnum = (request.getParameter("rep_icnum"));
		
		member newMember = new member(icnum, name, age, gender, address, email, phoneNum, repName, repIcnum);
		
		System.out.println(icnum);
		System.out.println(name);
		System.out.println(age);
		
		dao.createMember(newMember);// invoke method createMember() in MemberDAO
		
		RequestDispatcher view = request.getRequestDispatcher("Viewmember.jsp");
		view.forward(request,response);
	}

}
