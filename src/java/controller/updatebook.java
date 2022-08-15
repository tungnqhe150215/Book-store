/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.AuthorDAO;
import dal.BookDAO;
import dal.CoverDAO;
import dal.PublisherDAO;
import dal.SellerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.Author;
import model.Book;
import model.Cover;
import model.Publisher;

/**
 *
 * @author nqt26
 */
public class updatebook extends HttpServlet {

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
            out.println("<title>Servlet updatebook</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updatebook at " + request.getContextPath() + "</h1>");
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
        BookDAO bd= new BookDAO();
         AuthorDAO ad=new AuthorDAO();
        CoverDAO cd = new CoverDAO();
        PublisherDAO pd= new PublisherDAO();
        List<Author> ala=ad.GetALLAuthor();
        List<Cover> cla= cd.GetALLCover();
        List<Publisher> pla=pd.GetALLPublisher();
        request.setAttribute("author", ala);
        request.setAttribute("cover", cla);
        request.setAttribute("publisher", pla);
        int id=Integer.parseInt(request.getParameter("id"));
        Book b=bd.GetbyID(id);
        request.setAttribute("data", b);
        request.getRequestDispatcher("updatebook.jsp").forward(request, response);
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
        int id= Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String date=request.getParameter("date");
        String image=request.getParameter("image");
        int pub=Integer.parseInt(request.getParameter("publisher"));
        int cov=Integer.parseInt(request.getParameter("cover"));
        int auth=Integer.parseInt(request.getParameter("author"));
        String des=request.getParameter("des");
        String size=request.getParameter("size");
        int quan=Integer.parseInt(request.getParameter("quantity"));
        double price=Double.parseDouble(request.getParameter("price"));
        BookDAO bd= new  BookDAO();
        SellerDAO sd= new SellerDAO();
        HttpSession session=request.getSession();
        Account ac=(Account) session.getAttribute("account");
            bd.updatebook(id, name, image, pub, date, auth, sd.getbyaccount(ac.getUsername()).getId(), size, cov, des, price, quan);
            response.sendRedirect("managebook"); 
        } catch(NullPointerException n){
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
