import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//TODO: If a user is already logged in and they visit /login, instead redirect them to their profile page
        if (null != request.getSession().getAttribute("user")){
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");

        if (validAttempt) {
//TODO: In your LoginServlet, when a user successfully logs in, set a key named "user" in the session
            request.getSession().setAttribute("user", username);
            response.sendRedirect("/profile");
        } else {
//TODO: Use this key to redirect unauthorized users that try to visit the /profile page
            response.sendRedirect("/login");
        }

    }
}
