/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 792807
 */
@WebServlet(urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String operator; 
        String result = "---";
        int firstValue;
        int secondValue;
        
        operator = request.getParameter("operation");
        
        if(operator != null) {    
            try {
            firstValue = Integer.parseInt(request.getParameter("first"));
            secondValue = Integer.parseInt(request.getParameter("second"));
            //int output = 0;
            
                if (operator.equals("+")) {
                    result = firstValue + secondValue + " ";
                } else if (operator.equals("-")) {
                    result = firstValue - secondValue + " ";
                } else if (operator.equals("*")) {
                    result = firstValue * secondValue + " ";
                } else {
                    result = firstValue / secondValue + " ";
                }
                request.setAttribute("first", firstValue);
                request.setAttribute("second", secondValue);
                request.setAttribute("result", result);
            
            }
            catch (Exception e) {
            result = "Invalid";
            request.setAttribute("first", request.getParameter("first"));
            request.setAttribute("second", request.getParameter("second"));
            }      
        }
        else{
            result = "---";
        }
       
        request.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
        
    }   
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    

}


