
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp")
                .forward(request,response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String age = request.getParameter("age"); //age variable from age jsp
          String message = "You must give your current age";
          request.setAttribute("age", age);
          
          
         //if age is null or blank, send user back to the main page and print out the message in <p>
         if(age == null || age.equals("") || age.matches("[a-zA-Z]+")){
             
            // set attribute for jsp
              request.setAttribute("message", message);
                getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp") //returns user to the main page
                .forward(request,response);
                return;
         }
         else{
            
             int intAge = Integer.parseInt(age);
             intAge++;
             message = "Your age next birthday is: ";
             request.setAttribute("message", message);
              request.setAttribute("intAge", intAge);
             
             
             getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp") //returns user to the main page
                .forward(request,response);
             
         }
         
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
