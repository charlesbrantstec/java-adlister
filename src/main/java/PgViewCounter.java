import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="PgViewCounter", urlPatterns = "/count")
public class PgViewCounter extends HttpServlet {
    public int count = 1;
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        count++;
        out.println("<h1>Number of times this web page has been visited: " + count + "<h1>");
    }
}
