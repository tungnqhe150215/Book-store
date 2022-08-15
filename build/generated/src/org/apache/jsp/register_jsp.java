package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Register form</h1>\n");
      out.write("        <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("        <form action=\"register\" method=\"post\">\n");
      out.write("            Họ và tên:<input type=\"text\" name=\"name\"/><br/>\n");
      out.write("            Nhập tài khoản:<input type=\"text\" name=\"user\"/><br/>\n");
      out.write("            Nhập mật khẩu:<input type=\"password\" name=\"pass\"/><br/>\n");
      out.write("            Nhập lại mật khẩu:<input type=\"password\" name=\"rpass\"/><br/>\n");
      out.write("            Nhập giới tính:\n");
      out.write("            <input type=\"radio\" name=\"gender\" value=\"Nam\" checked/>Nam\n");
      out.write("            <input type=\"radio\" name=\"gender\" value=\"Nữ\" checked/>Nữ\n");
      out.write("            <br/>\n");
      out.write("            Bạn cần vai trò gì:\n");
      out.write("            <input type=\"radio\" name=\"job\" value=\"1\" checked=\"not\"/>Người mua\n");
      out.write("            <input type=\"radio\" name=\"job\" value=\"2\" checked=\"not\"/>Người bán\n");
      out.write("            <br/>\n");
      out.write("            Số điện thoại: <input type=\"text\" name=\"phone\"/><br/>\n");
      out.write("            Email: <input type=\"text\" name=\"email\"/><br/>\n");
      out.write("            Địa chỉ:<input type=\"text\" name=\"address\"/><br/>\n");
      out.write("<!--            <button style=\"cursor: pointer\" onclick=\"this.form.submit()\" >LOGIN</button>-->\n");
      out.write("            \n");
      out.write("       <input type=\"submit\" value=\"CREATE ACCOUNT\"/>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
