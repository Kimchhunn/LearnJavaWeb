import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.out;

@WebServlet(name = "Next")
public class Next extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Controller cont = new Controller();
        DAOFunction df = new DAOFunction();

        LinkedList<String> list = new LinkedList<>();

        String name = request.getParameter("name");
        try {
            list = df.select(df.getCon());
            for (String record : list) {
                String[] curr = record.split("|");
                if (curr[0].equals(name)) {
                    request.setAttribute("exist", "Sorry, this user is already exits!");
                    RequestDispatcher rd = request.getRequestDispatcher("Insert.jsp");
                    rd.forward(request, response);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        cont.setName(request.getParameter("name"));
        cont.setPassword(request.getParameter("password"));
        cont.setAge(Integer.parseInt(request.getParameter("age")));
        cont.setPhone(request.getParameter("phone"));
        cont.setEmail(request.getParameter("email"));

        Boolean res = df.insert(cont, df.getCon());
        if (res) {
            out.println("Insert Successfully!");
            request.setAttribute("current_user", name);
            RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
            rd.forward(request, response);
        }
        else {
            out.println("Insert Failed");
            RequestDispatcher rd = request.getRequestDispatcher("Insert.jsp");
            rd.forward(request, response);
        }
//
//
//        try {
//            List list = cont.select(cont.getCon());
//            System.out.println(list);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//        Boolean a = df.delete(df.getCon());
//        System.out.println(a+"werwerewr");

//        Boolean b = cont.delete(cont.getCon(), 3);

    }
}
