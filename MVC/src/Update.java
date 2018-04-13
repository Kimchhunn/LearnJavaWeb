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

@WebServlet(name = "Update")
public class Update extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Controller cont = new Controller();
        DAOFunction dao = new DAOFunction();

        ServletContext context=getServletContext();
        String current_user= "'"+context.getInitParameter("current_user")+"'";

        String name = request.getParameter("name");
        String password = request.getParameter("password");
        int age = Integer.parseInt(request.getParameter("age"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");

        System.out.println(name+password+age+phone+email);

        if (name != "") {
            cont.setName(name);
        }
        if (age > 0 ) {
            cont.setAge(age);
        }
        if (password != "") {
            cont.setPassword(password);
        }
        if (phone != "") {
            cont.setPhone(phone);
        }
        if (email != "") {
            cont.setEmail(email);
        }

        cont.setName(request.getParameter("name"));
        cont.setPassword(request.getParameter("password"));
        cont.setAge(Integer.parseInt(request.getParameter("age")));
        cont.setPhone(request.getParameter("phone"));
        cont.setEmail(request.getParameter("email"));


        Boolean res = dao.update(current_user, cont, dao.getCon());
        if (res) {
            out.println("Update Successfully!");
        }
        else {
            out.println("Update Failed");
        }

    }
}
