package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ManagerBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Fontawesome core CSS -->\n");
      out.write("    <link href=\"assets/css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <!--GOOGLE FONT -->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>\n");
      out.write("    <!--Slide Show Css -->\n");
      out.write("    <link href=\"assets/ItemSlider/css/main-style.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- custom CSS here -->\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\" /> \n");
      out.write("    <link href=\"assets/css/format.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-default\" role=\"navigation\" style=\"background-color: yellowgreen\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"home\"><strong>LN</strong> Shop</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("                <form action=\"home\" class=\"navbar-form \" role=\"search\" style=\"text-align: center\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" name=\"search\" placeholder=\"Tên hoặc một phần tên\" class=\"form-control\" style=\"width:100%\">\n");
      out.write("                    </div>\n");
      out.write("                    &nbsp; \n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Tìm kiếm</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container-fluid -->\n");
      out.write("    </nav>");
      out.write("\n");
      out.write("<style>\n");
      out.write(".modal-notify .modal-header {\n");
      out.write("    border-radius: 3px 3px 0 0;\n");
      out.write("}\n");
      out.write(".modal-notify .modal-content {\n");
      out.write("    border-radius: 3px;\n");
      out.write("}    \n");
      out.write("\n");
      out.write("body {\n");
      out.write("   background-color: pink;\n");
      out.write("   * { box-sizing: border-box; }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header {\n");
      out.write("   background-color: #398B93;\n");
      out.write("   color: black;\n");
      out.write("   font-size: 1.5em;\n");
      out.write("   padding: 1rem;\n");
      out.write("   text-align: center;\n");
      out.write("   text-transform: uppercase;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img {\n");
      out.write("   margin: 10px;\n");
      out.write("   height:auto;\n");
      out.write("   width:100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table-users {\n");
      out.write("   border: 1px solid darkgoldenrod;\n");
      out.write("   border-radius: 10px;\n");
      out.write("   box-shadow: 3px 3px 0 rgba(0,0,0,0.1);\n");
      out.write("   max-width: calc(100% - 2em);\n");
      out.write("   margin: 1em auto;\n");
      out.write("   overflow: hidden;\n");
      out.write("   width: 800px;\n");
      out.write("}\n");
      out.write(".mid{\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("th{\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("table {\n");
      out.write("   width: 100%;\n");
      out.write("   \n");
      out.write("   td, th { \n");
      out.write("      color: darken(#398B93, 10%);\n");
      out.write("      padding: 10px; \n");
      out.write("   }\n");
      out.write("   \n");
      out.write("   td {\n");
      out.write("      text-align: center;\n");
      out.write("      vertical-align: middle;\n");
      out.write("      \n");
      out.write("      &:last-child {\n");
      out.write("         font-size: 0.95em;\n");
      out.write("         line-height: 1.4;\n");
      out.write("         text-align: left;\n");
      out.write("      }\n");
      out.write("   }\n");
      out.write("   \n");
      out.write("   th { \n");
      out.write("      background-color: lighten(#398B93, 50%);\n");
      out.write("      font-weight: 300;\n");
      out.write("   }\n");
      out.write("   \n");
      out.write("   tr {     \n");
      out.write("      &:nth-child(2n) { background-color: white; }\n");
      out.write("      &:nth-child(2n+1) { background-color: gainsboro; }\n");
      out.write("   }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <a class=\"list-group-item active\">Tài khoản của bạn</a>\n");
      out.write("                <ul class=\"list-group\">\n");
      out.write("                    <li class=\"list-group-item active\" ><a href=\"profile\"> Thông tin cá nhân</a></li>\n");
      out.write("                    <li class=\"list-group-item\"><a href=\"changepass\">Đổi mật khẩu </a></li>\n");
      out.write("                    <li class=\"list-group-item\" style=\"background-color: pink\"><a href=\"managebook\">Quản lí sản phẩm</a>\n");
      out.write("                </ul>     \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("                <div class=\"table-users\">\n");
      out.write("   <div class=\"header\">Danh sách sản phẩm</div>\n");
      out.write("   \n");
      out.write("   <table border=\"1px\">\n");
      out.write("      <tr>\n");
      out.write("         <th>Ảnh minh họa</th>\n");
      out.write("         <th>Tên</th>\n");
      out.write("         <th>Số lượng trong kho</th>\n");
      out.write("         <th>Giá</th>\n");
      out.write("         <th width=\"120\"></th>\n");
      out.write("      </tr>\n");
      out.write("      ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("      \n");
      out.write("   </table>\n");
      out.write("</div>\n");
      out.write("                <div class=\"modal fade\" id=\"orangeModalSubscription\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\"\n");
      out.write("  aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog modal-notify modal-warning\" role=\"document\">\n");
      out.write("    <!--Content-->\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <!--Header-->\n");
      out.write("      <div class=\"modal-header text-center\">\n");
      out.write("        <h4 class=\"modal-title white-text w-100 font-weight-bold py-2\">Subscribe</h4>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\" class=\"white-text\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!--Body-->\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <div class=\"md-form mb-5\">\n");
      out.write("          <i class=\"fas fa-user prefix grey-text\"></i>\n");
      out.write("          <input type=\"text\" id=\"form3\" class=\"form-control validate\">\n");
      out.write("          <label data-error=\"wrong\" data-success=\"right\" for=\"form3\">Your name</label>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"md-form\">\n");
      out.write("          <i class=\"fas fa-envelope prefix grey-text\"></i>\n");
      out.write("          <input type=\"email\" id=\"form2\" class=\"form-control validate\">\n");
      out.write("          <label data-error=\"wrong\" data-success=\"right\" for=\"form2\">Your email</label>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!--Footer-->\n");
      out.write("      <div class=\"modal-footer justify-content-center\">\n");
      out.write("        <a type=\"button\" class=\"btn btn-outline-warning waves-effect\">Send <i class=\"fas fa-paper-plane-o ml-1\"></i></a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!--/.Content-->\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"text-center\">\n");
      out.write("  <a href=\"\" class=\"btn btn-default btn-rounded\" data-toggle=\"modal\" data-target=\"#orangeModalSubscription\">Launch\n");
      out.write("    modal Subscription</a>\n");
      out.write("</div>\n");
      out.write("                <!-- Button trigger modal-->\n");
      out.write("<button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#modalConfirmDelete\">Launch\n");
      out.write("  modal</button>\n");
      out.write("\n");
      out.write("<!--Modal: modalConfirmDelete-->\n");
      out.write("<div class=\"modal fade\" id=\"modalConfirmDelete\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\n");
      out.write("  aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog modal-sm modal-notify modal-danger\" role=\"document\">\n");
      out.write("    <!--Content-->\n");
      out.write("    <div class=\"modal-content text-center\">\n");
      out.write("      <!--Header-->\n");
      out.write("      <div class=\"modal-header d-flex justify-content-center\">\n");
      out.write("        <p class=\"heading\">Are you sure?</p>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!--Body-->\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("        <i class=\"fas fa-times fa-4x animated rotateIn\"></i>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!--Footer-->\n");
      out.write("      <div class=\"modal-footer flex-center\">\n");
      out.write("        <a href=\"\" class=\"btn  btn-outline-danger\">Yes</a>\n");
      out.write("        <a type=\"button\" class=\"btn  btn-danger waves-effect\" data-dismiss=\"modal\">No</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!--/.Content-->\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!--Modal: modalConfirmDelete-->\n");
      out.write("            </div>       \n");
      out.write("        </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("    </div>\n");
      out.write("    <!--Footer -->\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("    <div class=\"col-md-12 footer-box\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <strong style=\"font-size: 20px\">Liên hệ</strong>\n");
      out.write("                <p>\n");
      out.write("                <h3 style=\"color: red\">CÔNG TY TNHH LN</h3>\n");
      out.write("                     234, Phố Hoàng Cầu, Hà Nội<br />\n");
      out.write("                                    \n");
      out.write("                    Số điện thoại: 0376164241<br>\n");
      out.write("                    Email: lnshop@gmail.com<br>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 social-box\">\n");
      out.write("                <strong style=\"font-size: 20px\">Follow us</strong>\n");
      out.write("                <hr>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-facebook-square fa-3x \"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-twitter-square fa-3x \"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-google-plus-square fa-3x c\"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-linkedin-square fa-3x \"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-pinterest-square fa-3x \"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.col -->\n");
      out.write("    <div class=\"col-md-12 end-box \">\n");
      out.write("        &copy; 2014 | &nbsp; All Rights Reserved | &nbsp; www.yourdomain.com | &nbsp; 24x7 support | &nbsp; Email us: info@yourdomain.com\n");
      out.write("    </div>\n");
      out.write("    <!-- /.col -->\n");
      out.write("    <!--Footer end -->\n");
      out.write("    <!--Core JavaScript file  -->\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\n");
      out.write("    <!--bootstrap JavaScript file  -->\n");
      out.write("    <script src=\"assets/js/bootstrap.js\"></script>\n");
      out.write("    <!--Slider JavaScript file  -->\n");
      out.write("    <script src=\"assets/ItemSlider/js/modernizr.custom.63321.js\"></script>\n");
      out.write("    <script src=\"assets/ItemSlider/js/jquery.catslider.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $(function () {\n");
      out.write("\n");
      out.write("            $('#mi-slider').catslider();\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\t\t</script>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <li><a href=\"login\">Đăng nhập</a></li>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    <li class=\"dropdown\"> \n");
        out.write("                        <a href=\"\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" <b class=\"caret\"></b> </a>\n");
        out.write("                        <ul class=\"dropdown-menu \">\n");
        out.write("                            ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                <li><a href=\"\">Xem đơn hàng</a></li>\n");
        out.write("                            ");
        if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("                      \n");
        out.write("\n");
        out.write("                                <li><a href=\"logout\">Đăng xuất</a> </li>\n");
        out.write("                        </ul>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.level==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <a href=\"\" class=\"cart position-relative d-inline-flex\" aria-label=\"View your shopping cart\">\n");
        out.write("          <i class=\"fas fa fa-shopping-cart fa-lg\" style=\"font-size:32px;color:whitesmoke;padding-top: 10px;\"></i>\n");
        out.write("          <span class=\"cart-basket d-flex align-items-center justify-content-center\">\n");
        out.write("            ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("          </span>\n");
        out.write("        </a>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.level==3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <li><a href=\"\">Quản lý đơn hàng</a></li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.level==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li><a href=\"managebook\">Quản lý sản phẩm</a></li>\n");
        out.write("                                <li><a href=\"profile\">Thông tin cá nhân</a></li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.level==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("                              \n");
        out.write("                                <li><a href=\"profile\">Thông tin cá nhân</a></li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.data}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("d");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("      <tr>\n");
          out.write("         <td><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" /></td>\n");
          out.write("         <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("         <td class=\"mid\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.unitinstock}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("         <td class=\"mid\"><strong style=\"color\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.unitprice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong> VND</td>\n");
          out.write("         <td class=\"mid\"><a href=\"update?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Update</a>&nbsp;&nbsp;&nbsp;\n");
          out.write("             <a href=\"delete?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Delete</a> </td>\n");
          out.write("      </tr>\n");
          out.write("      ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
