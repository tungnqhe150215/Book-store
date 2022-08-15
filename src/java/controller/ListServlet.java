/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.AuthorDAO;
import dal.BookDAO;
import dal.CoverDAO;
import dal.CustomerDAO;
import dal.PublisherDAO;
import dal.itemDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
import model.item;

/**
 *
 * @author nqt26
 */
public class ListServlet extends HttpServlet {

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
            out.println("<title>Servlet ListServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ListServlet at " + request.getContextPath() + "</h1>");
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
        request.setCharacterEncoding("UTF-8");
        BookDAO bd=new BookDAO();
        AuthorDAO ad=new AuthorDAO();
        CoverDAO cd = new CoverDAO();
        itemDAO itd=new itemDAO();
        CustomerDAO cusd=new CustomerDAO();
        PublisherDAO pd= new PublisherDAO();
        List<Author> ala=ad.GetALLAuthor();
        List<Cover> cla= cd.GetALLCover();
        List<Publisher> pla=pd.GetALLPublisher();
        List<Author> al=new ArrayList<>();
        List<Publisher> pl=new ArrayList<>();
        List<Cover> cl=new ArrayList<>();        
        String [] author= request.getParameterValues("author");
        String [] publisher= request.getParameterValues("publisher");
        String [] cover= request.getParameterValues("cover");
        String name=request.getParameter("search");
        int[] aid=null;
        int[] pid=null;
        int[] cid=null;
        if(author!=null){
            aid=new int[author.length];
            for (int i=0; i<author.length;i++){
                aid[i]=Integer.parseInt(author[i]);
                al.add(new Author(aid[i], ""));
            }
        }
        if(publisher!=null){
             pid=new int[publisher.length];       
            for (int i=0; i<publisher.length;i++){
                pid[i]=Integer.parseInt(publisher[i]);
                pl.add(new Publisher(pid[i], ""));
            }
        }
        if(cover!=null){
            cid = new int[cover.length];
            for (int i=0; i<cover.length;i++){
                cid[i]=Integer.parseInt(cover[i]);
                cl.add(new Cover(cid[i], ""));
            }
        }
        List<Book> bl=bd.Getbyfilter(al, pl, cl,name);
        request.setAttribute("author", al);
        request.setAttribute("cover", cl);
        request.setAttribute("publisher", pl);
        request.setAttribute("data", bl);
        request.setAttribute("authordata", ala);
        request.setAttribute("coverdata", cla);
        request.setAttribute("publisherdata", pla);
        request.getRequestDispatcher("HomePage.jsp").forward(request, response);
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
