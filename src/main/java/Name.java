import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="Name", urlPatterns = "/name")
public class Name extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("firstAndLastName");
        if (name == null){
            name = "Charles Brant-Stec";
        }
        out.println("<h1>" +name+"</h1>");
    }
}
