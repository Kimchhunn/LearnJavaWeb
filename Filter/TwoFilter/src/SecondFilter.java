import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "SecondFilter")
public class SecondFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String pwd = req.getParameter("pwd");

        RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
        if (pwd.length() < 8)
            rd.forward(req, resp);

        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
