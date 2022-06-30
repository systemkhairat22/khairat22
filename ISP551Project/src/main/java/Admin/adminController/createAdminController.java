package Admin.adminController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Admin.adminDAO.adminDAO;
import Member.memberController.RequestDispatcher;
import modelClass.admin;

@WebServlet("/createAdminController")
public class createAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private adminDAO dao;
    public createAdminController() {
    	super()
    	dao = new adminDAO();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		admin a = new admin();
		a.setAdmin_icnum(request.getParameter("admin_icnum"));
		a.setAdd_name(request.getParameter("add_name"));
		a.setAdd_age(Integer.parseInt(request.getParamter("add_age")));
		a.setAdd_email(request.getParameter("add_email"));
		a.setAdd_password(request.getParameter("add_password"));
		a.setAdd_phonenum(request.getParameter("add_phonenum"));
		a.setSupervisorid(request.getParameter("supervisorid"));
		
		dao.createAdmin(a);// invoke method createMember() in AdminDAO
		
		RequestDispatcher view = request.getRequestDispatcher("Viewmember.jsp");
		view.forward(request,response);
	}

}
