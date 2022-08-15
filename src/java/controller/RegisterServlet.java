/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.AccountDAO;
import dal.CustomerDAO;
import dal.SellerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;

/**
 *
 * @author ADMIN
 */
public class RegisterServlet extends HttpServlet {

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
            out.println("<title>Servlet RegisterServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterServlet at " + request.getContextPath() + "</h1>");
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
        
        request.getRequestDispatcher("register.jsp").forward(request, response);
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
        request.setCharacterEncoding("UTF-8");
        String u=request.getParameter("user");
        String p=request.getParameter("pass");
        int v= Integer.parseInt(request.getParameter("job"));           
        AccountDAO db=new AccountDAO();
        CustomerDAO cd=new CustomerDAO();
        SellerDAO sd= new SellerDAO();
        Account a=db.getAccount(u);
        if(a!=null){
            request.setAttribute("error", "tài khoản đã tồn tại");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }else{
            db.create(new Account(u,p,v));
            String rp=request.getParameter("rpass");
            String name=request.getParameter("name");
            String phone=request.getParameter("phone");
            String email=request.getParameter("email");
            String address=request.getParameter("address");
            if(!p.equalsIgnoreCase(rp)){
                request.setAttribute("error", "Mật khẩu nhập lại không khớp");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            } else {
            if(v == 1) { 
            cd.insert(name, phone, email, address, u);}
            if(v == 2) {
            sd.insert(name, phone, email, address,u);
            }
            response.sendRedirect("login");
            }
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
