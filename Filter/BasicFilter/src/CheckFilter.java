import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "CheckFilter")
public class CheckFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String usr = req.getParameter("usr");
        String pwd = req.getParameter("pwd");
        RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
        if (usr.isEmpty() || usr.equals(null))
            rd.forward(req, resp);
        if (pwd.isEmpty() || pwd.equals(null))
            rd.forward(req, resp);

        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
