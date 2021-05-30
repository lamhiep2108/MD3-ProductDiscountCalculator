import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculator", value = "/ProductDiscountCalculator")
public class ProductDiscountCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double ListPrice = Double.parseDouble(request.getParameter("ListPrice"));
        Double DiscountPercent =  Double.parseDouble(request.getParameter("DiscountPercent"));
        double DiscountAmount=ListPrice*DiscountPercent*0.01;
        PrintWriter writer = response.getWriter();
        writer.println("Discount Amount: " + DiscountAmount);
        writer.println("Discount Price: " + DiscountAmount);
    }
}
