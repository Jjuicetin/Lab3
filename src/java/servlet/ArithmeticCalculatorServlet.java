
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
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        String buttonChoice = request.getParameter("button");
        int firstNumber = Integer.parseInt(request.getParameter("first"));
       int secondNumber = Integer.parseInt(request.getParameter("second"));
       int result = 0;
        
        //validation
        if(first == null || first.equals("") || second == null || second.equals("")){
             
              message = "Result: Invalid";
              request.setAttribute("message:",message);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp") //returns user to the main page
                .forward(request,response);
                return;
        }
        //button selection
        
     
       
       if("+".equalsIgnoreCase(buttonChoice) == true){
           message = "Result: ";
           result = firstNumber + secondNumber;
           
           request.setAttribute("message", message);
           request.setAttribute("result", result);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp") //returns user to the main page
                .forward(request,response);
           return;
           
       }
       else if ("-".equalsIgnoreCase(buttonChoice) == true){
            message = "Result: ";
            result = firstNumber - secondNumber;
            request.setAttribute("message", message);
            request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp") //returns user to the main page
                .forward(request,response);
           return;
       }
        else if ("*".equalsIgnoreCase(buttonChoice) == true){
           message = "Result: ";
            result = firstNumber * secondNumber;
            request.setAttribute("message", message);
            request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp") //returns user to the main page
                .forward(request,response);
           return;
       }
        else if ("%".equalsIgnoreCase(buttonChoice) == true){
           message = "Result: ";
            result = firstNumber / secondNumber;
            request.setAttribute("message", message);
            request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp") //returns user to the main page
                .forward(request,response);
           return;
       }
       
       
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
