import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


public class OrderSummaryBonus extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        out.println("<form method=\"POST\" action=\"/order-summary\">" +
                "Product<input id=product type=text name=Enter product name><br><br>" +
                "Quantity<input id=quantity type=text name=Quantity><br><br>"
                + "</form>");
    }
}
