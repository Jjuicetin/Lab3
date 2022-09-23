
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request,response); //bring the page to this jsp ^
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first = request.getParameter("first"); //initialize variable from jsp attributes.
        String second = request.getParameter("second"); //get attribute slaps the variables to the jsp page. 
        String message = "---";
        
        request.setAttribute("message", message);
        
        
        if(first == null || first.equals("") || second == null || second.equals("") 
                || first.matches("[a-zA-Z]+") || second.matches("[a-zA-Z]+")){
             
              message = "Result: Invalid";
              request.setAttribute("message:", message);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp") //returns user to the main page
                .forward(request,response);
                return;
        }
        String buttonChoice = request.getParameter("button");
        int firstNumber = Integer.parseInt(request.getParameter("first"));
       int secondNumber = Integer.parseInt(request.getParameter("second"));
       int result = 0;
        
      
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
