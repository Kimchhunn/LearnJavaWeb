import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

@WebServlet(name = "Login")
public class Login extends HttpServlet {
    static String current_user;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        DAOFunction dao = new DAOFunction();
        Controller cont = new Controller();

        LinkedList<String> list = new LinkedList();

        try {
            list = dao.select(dao.getCon());
            for (String record : list)
            {
                String check = name+"|"+password;
                if (check.equals(record)) {
                    request.setAttribute("current_user", name);
                    RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
                    rd.forward(request, response);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("error", "Invalid Username and Password");
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }
}
