import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "FirstServlet")
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String usr = request.getParameter("usr");
//        String pwd = request.getParameter("pwd");
//
//        response.addCookie(new Cookie("usr", usr));
//        response.addCookie(new Cookie("pwd", pwd));
//
//        RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
//        rd.forward(request, response);

        response.addCookie(new Cookie("usr", request.getParameter("usr")));
        response.addCookie(new Cookie("pwd", request.getParameter("pwd")));

        request.getRequestDispatcher("SecondServlet").forward(request, response);
    }
}
