package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"HomePage.jsp\"><strong>LN</strong> Shop</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"login\">Đăng nhập</a></li>\n");
      out.write("                    <li><a href=\"register\">Đăng kí</a></li>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Liên hệ <b class=\"caret\"></b></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"#\"><strong>Hotline: </strong>0999912345</a></li>\n");
      out.write("                            <li><a href=\"#\"><strong>Mail: </strong>lnshop@gmail.com</a></li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li><a href=\"#\"><strong>Address: </strong>\n");
      out.write("                                <div>\n");
      out.write("                                    Số 234, phố Nguyễn Chí Thanh,<br />\n");
      out.write("                                    quận Thanh Xuân, Hà Nội\n");
      out.write("                                </div>\n");
      out.write("                            </a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"navbar-form navbar-right\" role=\"search\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter Keyword Here ...\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                    &nbsp; \n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Tìm kiếm</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container-fluid -->\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("                   \n");
      out.write("                <div class=\"row slider\">\n");
      out.write("                <div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <!-- Indicators -->\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                    <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" ></li>\n");
      out.write("                    <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\" class=\"active\"></li>\n");
      out.write("                    <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\n");
      out.write("                </ol>\n");
      out.write("\n");
      out.write("                <!-- Wrapper for slides -->\n");
      out.write("                <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                    <div class=\"item \">\n");
      out.write("                        <img src=\"ln/sli1.jpg\" alt=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item active\">\n");
      out.write("                        <img src=\"ln/sli2.jpg\" alt=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"ln/sli3.jpg\" alt=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Controls -->\n");
      out.write("                <a class=\"left carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"right carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("                <br />\n");
      out.write("        </div>\n");
      out.write("        <!-- /.row -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"#\" class=\"list-group-item active\">Electronics\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"list-group\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.div -->\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            <!-- /.col -->\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("                <div>\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li><a href=\"#\">Home</a></li>\n");
      out.write("                        <li class=\"active\">Electronics</li>\n");
      out.write("                    </ol>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.div -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"btn-group alg-right-pad\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\"><strong>1235  </strong>items</button>\n");
      out.write("                        <div class=\"btn-group\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-danger dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                Sort Products &nbsp;\n");
      out.write("                <span class=\"caret\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"#\">By Price Low</a></li>\n");
      out.write("                                <li class=\"divider\"></li>\n");
      out.write("                                <li><a href=\"#\">By Price High</a></li>\n");
      out.write("                                <li class=\"divider\"></li>\n");
      out.write("                                <li><a href=\"#\">By Popularity</a></li>\n");
      out.write("                                <li class=\"divider\"></li>\n");
      out.write("                                <li><a href=\"#\">By Reviews</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /.col -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.row -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("    <!--Footer -->\n");
      out.write("    <div class=\"col-md-12 footer-box\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <strong>Send a Quick Query </strong>\n");
      out.write("                <hr>\n");
      out.write("                <form>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" required=\"required\" placeholder=\"Name\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" required=\"required\" placeholder=\"Email address\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12 col-sm-12\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <textarea name=\"message\" id=\"message\" required=\"required\" class=\"form-control\" rows=\"3\" placeholder=\"Message\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\">Submit Request</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <strong>Our Location</strong>\n");
      out.write("                <hr>\n");
      out.write("                <p>\n");
      out.write("                     234, New york Street,<br />\n");
      out.write("                                    Just Location, USA<br />\n");
      out.write("                    Call: +09-456-567-890<br>\n");
      out.write("                    Email: info@yourdomain.com<br>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                2014 www.yourdomain.com | All Right Reserved\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 social-box\">\n");
      out.write("                <strong>We are Social </strong>\n");
      out.write("                <hr>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-facebook-square fa-3x \"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-twitter-square fa-3x \"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-google-plus-square fa-3x c\"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-linkedin-square fa-3x \"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-pinterest-square fa-3x \"></i></a>\n");
      out.write("                <p>\n");
      out.write("                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur nec nisl odio. Mauris vehicula at nunc id posuere. Curabitur nec nisl odio. Mauris vehicula at nunc id posuere. \n");
      out.write("                </p>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems(new String("#"));
    _jspx_th_c_forEach_0.setVar("c");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <li class=\"list-group-item\">Type\n");
          out.write("                            <span class=\"label label-primary pull-right\">234</span> \n");
          out.write("                        ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.data}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("d");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"col-md-4 text-center col-sm-6 col-xs-6\">\n");
          out.write("                        <div class=\"thumbnail product-box  \">\n");
          out.write("                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" />\n");
          out.write("                            <div class=\"caption\">\n");
          out.write("                                <h3><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </a></h3>\n");
          out.write("                                <p>Price : <strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.unitprice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong>  </p>              \n");
          out.write("                                <p><a href=\"#\" class=\"btn btn-success\" role=\"button\">Add To Cart</a> <a href=\"#\" class=\"btn btn-primary\" role=\"button\">See Details</a></p>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div> \n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
