import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FirstServlet")
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletConfig scf = getServletConfig();
        String value_scf = scf.getInitParameter("servlet-config");
        System.out.println(value_scf); //Output : Servlet Config Value

        ServletContext sct = getServletContext();
        String value_sct = sct.getInitParameter("servlet-context");
        System.out.println(value_sct); //Output : Servlet Context Value
    }
}
