import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet(name="OderBonus", urlPatterns = "/order-form")
public class OrderBonus extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        res.setHeader("content-type", "text/html");
        out.println("<form method=\"POST\" action=\"/order-summary\">" +
                "Product<input id=\"product\" type=\"text\"><br><br>" +
                "Quantity<input id=\"quantity\" type=\"text\"><br><br>" +
                "<input type=\"submit\" value=\"Submit\">"
                + "</form>");
    }
}
