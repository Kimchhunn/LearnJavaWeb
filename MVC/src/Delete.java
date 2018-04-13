import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static java.lang.System.out;

@WebServlet(name = "Delete")
public class Delete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DAOFunction dao = new DAOFunction();
        Controller cont = new Controller();

        ServletContext context=getServletContext();
        String current_user = "'"+context.getInitParameter("current_user")+"'";


        Boolean res = dao.delete(current_user, cont, dao.getCon());
        if (res) {
            out.println("Dectivate Successfully!");
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }
        else {
            out.println("Activate Failed");
        }
    }
}
