import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "FirstServlet")
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usr = request.getParameter("usr");
        String pwd = request.getParameter("pwd");

        HttpSession ses = request.getSession();
        ses.setAttribute("usr", usr);
        ses.setAttribute("pwd", pwd);

        RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
        rd.forward(request, response);
    }
}
