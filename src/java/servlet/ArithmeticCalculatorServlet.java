
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request,response); //bring the page to this jsp ^
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first = request.getParameter("first"); //initialize variable from jsp attributes.
        String second = request.getParameter("second"); //get attribute slaps the variables to the jsp page. 
        String message = "Result: ---";
        request.setAttribute("message", message);
        String buttonChoice = request.getParameter("button");
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp") //returns user to the main page
                .forward(request,response);
        
        //validation
        if(first == null || first.equals("") || second == null || second.equals("")){
              request.setAttribute("first", first);
              request.setAttribute("second", second);
              message = "Result: Invalid";
              request.setAttribute("message:",message);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp") //returns user to the main page
                .forward(request,response);
                
        }
        //button selection
        
       
       
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
