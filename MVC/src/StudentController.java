import com.sun.net.httpserver.Authenticator;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class StudentController extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");
        String last_name = request.getParameter("last_name");
        String email = request.getParameter("email");
        String dob = request.getParameter("dob");


        StudentModel sm = new StudentModel();

        int val = sm.saveInfo(name, last_name, email, dob);
        if (val != 1 ) {
            System.out.println("Failed to archive information");
            RequestDispatcher rq = request.getRequestDispatcher("index.jsp");
            rq.forward(request, response);
        }
        else {
            System.out.println("Information is archive successfully.");
            RequestDispatcher rq = request.getRequestDispatcher("Success.jsp");
            rq.forward(request, response);
        }
    }
}
