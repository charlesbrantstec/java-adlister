import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="NameServlet", urlPatterns = "/name")
public class NameServlet extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String first = req.getParameter("first");
        String last = req.getParameter("last");
        if (first == null || last == null){
            out.println("Enter your name at the end of the url in the format of http://localhost:8080/name?first=<b>first name</b>&last=<b>last name</b>");
        }else
        out.println("<h1>Hello, "+first+" "+last+".</h1>");
    }
}
