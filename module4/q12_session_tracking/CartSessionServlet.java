import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CartSessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        HttpSession session = req.getSession();

        ArrayList<String> cart = (ArrayList<String>) session.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList<>();
            session.setAttribute("cart", cart);
        }

        String item = req.getParameter("item");
        if (item != null && !item.isEmpty()) {
            cart.add(item);
        }

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h2>Shopping Cart (Session Tracking)</h2>");
        out.println("<form action='CartSessionServlet' method='get'>");
        out.println("Item: <input type='text' name='item'> ");
        out.println("<button type='submit'>Add to Cart</button>");
        out.println("</form>");

        out.println("<h3>Items in Cart:</h3><ul>");
        for (String i : cart) {
            out.println("<li>" + i + "</li>");
        }
        out.println("</ul>");
    }
}
