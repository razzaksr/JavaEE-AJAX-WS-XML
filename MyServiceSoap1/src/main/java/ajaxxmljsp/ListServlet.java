package ajaxxmljsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "ListServlet", value = "/list")
public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request.setAttribute("data",new String[]{"Flipkat","Amazon","Gpay","facebook","microsoft","youtube","ibm"});
        //request.getRequestDispatcher("index.jsp").forward(request,response);
        String[] str = new String[]{"Flipkat","Amazon","Gpay","facebook","microsoft","youtube","ibm"};
        response.getWriter().write(Arrays.toString(str));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
