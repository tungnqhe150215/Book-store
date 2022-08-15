package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dal.CustomerDAO;
import dal.SellerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.Customer;
import model.Seller;

/**
 *
 * @author nqt26
 */
public class ProfileServlet extends HttpServlet {

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
            out.println("<title>Servlet ProfileServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProfileServlet at " + request.getContextPath() + "</h1>");
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
        try{
        CustomerDAO ad=new CustomerDAO();
        SellerDAO sd= new SellerDAO();
        HttpSession session= request.getSession();
        Account ac=(Account) session.getAttribute("account");
        if(ac.getLevel()==1){
        Customer cus= ad.getbyaccount(ac.getUsername());
        request.setAttribute("infor", cus);
        } else{
        Seller sel= sd.getbyaccount(ac.getUsername());        
        request.setAttribute("infor", sel);}
        request.getRequestDispatcher("profile.jsp").forward(request, response);
        } catch(NullPointerException a){
            response.sendRedirect("login");
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
        try{
       request.setCharacterEncoding("UTF-8");
       String name= request.getParameter("name");
       String phone=request.getParameter("phone");
       String email=request.getParameter("email");
       String address=request.getParameter("address");
       HttpSession session=request.getSession();
       Account ac=(Account) session.getAttribute("account");
       if(ac.getLevel()==1){
           CustomerDAO cd= new CustomerDAO();
           cd.update(name, phone, email, address, ac.getUsername());
           Customer c=cd.getbyaccount(ac.getUsername());
           request.setAttribute("infor", c);
       }
       if(ac.getLevel()==2){
           SellerDAO sd=new SellerDAO();
           sd.update(name, phone, email, address, ac.getUsername());
           Seller s=sd.getbyaccount(ac.getUsername());
           request.setAttribute("infor", s);
       }
       request.setAttribute("noti", "Cập nhật thành công");
        request.getRequestDispatcher("profile.jsp").forward(request, response);       
        } catch(NullPointerException a){
            response.sendRedirect("login");
        }
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
