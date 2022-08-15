/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.BookDAO;
import dal.CustomerDAO;
import dal.OrderDAO;
import dal.SellerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.Book;
import model.orderdetail;
import model.orders;

/**
 *
 * @author nqt26
 */
public class Manageorder extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Manageorder</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Manageorder at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
           OrderDAO ord=new OrderDAO();
           BookDAO bd=new BookDAO();
           SellerDAO sd=new SellerDAO();
           CustomerDAO cdao=new CustomerDAO();
            HttpSession session=request.getSession();
            Account ac=(Account) session.getAttribute("account");
         if(ac.getLevel()==1){
             List<orders> list= ord.getbycusid(cdao.getbyaccount(ac.getUsername()).getId());
             request.setAttribute("data", list);
             request.getRequestDispatcher("manageorder.jsp").forward(request, response);
         }
         if(ac.getLevel()==2){
             List<Book> lb= bd.GetbySeller(sd.getbyaccount(ac.getUsername()).getId());
             List<orderdetail> list=ord.getbybookid(lb);
             request.setAttribute("data", list);
             request.getRequestDispatcher("manageorder.jsp").forward(request, response);
         }
         if(ac.getLevel()==3){
             List<orders> list=ord.getneworder();
             request.setAttribute("data", list);
             request.getRequestDispatcher("manageorder.jsp").forward(request, response);
         }
         
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
