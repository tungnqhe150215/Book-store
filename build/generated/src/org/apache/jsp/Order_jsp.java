package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Order_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\n");
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
      out.write("    \n");
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
      out.write("    body{\n");
      out.write("    margin-top:20px;\n");
      out.write("    color: #484b51;\n");
      out.write("}\n");
      out.write(".text-secondary-d1 {\n");
      out.write("    color: #728299!important;\n");
      out.write("}\n");
      out.write(".page-header {\n");
      out.write("    margin: 0 0 1rem;\n");
      out.write("    padding-bottom: 1rem;\n");
      out.write("    padding-top: .5rem;\n");
      out.write("    border-bottom: 1px dotted #e2e2e2;\n");
      out.write("    display: -ms-flexbox;\n");
      out.write("    display: flex;\n");
      out.write("    -ms-flex-pack: justify;\n");
      out.write("    justify-content: space-between;\n");
      out.write("    -ms-flex-align: center;\n");
      out.write("    align-items: center;\n");
      out.write("}\n");
      out.write(".page-title {\n");
      out.write("    padding: 0;\n");
      out.write("    margin: 0;\n");
      out.write("    font-size: 1.75rem;\n");
      out.write("    font-weight: 300;\n");
      out.write("}\n");
      out.write(".brc-default-l1 {\n");
      out.write("    border-color: #dce9f0!important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ml-n1, .mx-n1 {\n");
      out.write("    margin-left: -.25rem!important;\n");
      out.write("}\n");
      out.write(".mr-n1, .mx-n1 {\n");
      out.write("    margin-right: -.25rem!important;\n");
      out.write("}\n");
      out.write(".mb-4, .my-4 {\n");
      out.write("    margin-bottom: 1.5rem!important;\n");
      out.write("}\n");
      out.write("\n");
      out.write("hr {\n");
      out.write("    margin-top: 1rem;\n");
      out.write("    margin-bottom: 1rem;\n");
      out.write("    border: 0;\n");
      out.write("    border-top: 1px solid rgba(0,0,0,.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".text-grey-m2 {\n");
      out.write("    color: #888a8d!important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".text-success-m2 {\n");
      out.write("    color: #86bd68!important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".font-bolder, .text-600 {\n");
      out.write("    font-weight: 600!important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".text-110 {\n");
      out.write("    font-size: 110%!important;\n");
      out.write("}\n");
      out.write(".text-blue {\n");
      out.write("    color: #478fcc!important;\n");
      out.write("}\n");
      out.write(".pb-25, .py-25 {\n");
      out.write("    padding-bottom: .75rem!important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".pt-25, .py-25 {\n");
      out.write("    padding-top: .75rem!important;\n");
      out.write("}\n");
      out.write(".bgc-default-tp1 {\n");
      out.write("    background-color: rgba(121,169,197,.92)!important;\n");
      out.write("}\n");
      out.write(".bgc-default-l4, .bgc-h-default-l4:hover {\n");
      out.write("    background-color: #f3f8fa!important;\n");
      out.write("}\n");
      out.write(".page-header .page-tools {\n");
      out.write("    -ms-flex-item-align: end;\n");
      out.write("    align-self: flex-end;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-light {\n");
      out.write("    color: #757984;\n");
      out.write("    background-color: #f5f6f9;\n");
      out.write("    border-color: #dddfe4;\n");
      out.write("}\n");
      out.write(".w-2 {\n");
      out.write("    width: 1rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".text-120 {\n");
      out.write("    font-size: 120%!important;\n");
      out.write("}\n");
      out.write(".text-primary-m1 {\n");
      out.write("    color: #4087d4!important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".text-danger-m1 {\n");
      out.write("    color: #dd4949!important;\n");
      out.write("}\n");
      out.write(".text-blue-m2 {\n");
      out.write("    color: #68a3d5!important;\n");
      out.write("}\n");
      out.write(".text-150 {\n");
      out.write("    font-size: 150%!important;\n");
      out.write("}\n");
      out.write(".text-60 {\n");
      out.write("    font-size: 60%!important;\n");
      out.write("}\n");
      out.write(".text-grey-m1 {\n");
      out.write("    color: #7b7d81!important;\n");
      out.write("}\n");
      out.write(".align-bottom {\n");
      out.write("    vertical-align: bottom!important;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("   \n");
      out.write("<div class=\"page-content container\">\n");
      out.write("    <div class=\"page-header text-blue-d2\">\n");
      out.write("        <h1 class=\"page-title text-secondary-d1\">\n");
      out.write("            Invoice\n");
      out.write("            <small class=\"page-info\">\n");
      out.write("                <i class=\"fa fa-angle-double-right text-80\"></i>\n");
      out.write("                ID: #111-222\n");
      out.write("            </small>\n");
      out.write("        </h1>\n");
      out.write("\n");
      out.write("        <div class=\"page-tools\">\n");
      out.write("            <div class=\"action-buttons\">\n");
      out.write("                <a class=\"btn bg-white btn-light mx-1px text-95\" href=\"#\" data-title=\"Print\">\n");
      out.write("                    <i class=\"mr-1 fa fa-print text-primary-m1 text-120 w-2\"></i>\n");
      out.write("                    Print\n");
      out.write("                </a>\n");
      out.write("                <a class=\"btn bg-white btn-light mx-1px text-95\" href=\"#\" data-title=\"PDF\">\n");
      out.write("                    <i class=\"mr-1 fa fa-file-pdf-o text-danger-m1 text-120 w-2\"></i>\n");
      out.write("                    Export\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container px-0\">\n");
      out.write("        <div class=\"row mt-4\">\n");
      out.write("            <div class=\"col-12 col-lg-10 offset-lg-1\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <div class=\"text-center text-150\">\n");
      out.write("                            <i class=\"fa fa-book fa-2x text-success-m2 mr-1\"></i>\n");
      out.write("                            <span class=\"text-default-d3\">Bootdey.com</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- .row -->\n");
      out.write("\n");
      out.write("                <hr class=\"row brc-default-l1 mx-n1 mb-4\" />\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <div>\n");
      out.write("                            <span class=\"text-sm text-grey-m2 align-middle\">To:</span>\n");
      out.write("                            <span class=\"text-600 text-110 text-blue align-middle\">Alex Doe</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"text-grey-m2\">\n");
      out.write("                            <div class=\"my-1\">\n");
      out.write("                                Street, City\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"my-1\">\n");
      out.write("                                State, Country\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"my-1\"><i class=\"fa fa-phone fa-flip-horizontal text-secondary\"></i> <b class=\"text-600\">111-111-111</b></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col -->\n");
      out.write("\n");
      out.write("                    <div class=\"text-95 col-sm-6 align-self-start d-sm-flex justify-content-end\">\n");
      out.write("                        <hr class=\"d-sm-none\" />\n");
      out.write("                        <div class=\"text-grey-m2\">\n");
      out.write("                            <div class=\"mt-1 mb-2 text-secondary-m1 text-600 text-125\">\n");
      out.write("                                Invoice\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"my-2\"><i class=\"fa fa-circle text-blue-m2 text-xs mr-1\"></i> <span class=\"text-600 text-90\">ID:</span> #111-222</div>\n");
      out.write("\n");
      out.write("                            <div class=\"my-2\"><i class=\"fa fa-circle text-blue-m2 text-xs mr-1\"></i> <span class=\"text-600 text-90\">Issue Date:</span> Oct 12, 2019</div>\n");
      out.write("\n");
      out.write("                            <div class=\"my-2\"><i class=\"fa fa-circle text-blue-m2 text-xs mr-1\"></i> <span class=\"text-600 text-90\">Status:</span> <span class=\"badge badge-warning badge-pill px-25\">Unpaid</span></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col -->\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"mt-4\">\n");
      out.write("                    <div class=\"row text-600 text-white bgc-default-tp1 py-25\">\n");
      out.write("                        <div class=\"d-none d-sm-block col-1\">#</div>\n");
      out.write("                        <div class=\"col-9 col-sm-5\">Description</div>\n");
      out.write("                        <div class=\"d-none d-sm-block col-4 col-sm-2\">Qty</div>\n");
      out.write("                        <div class=\"d-none d-sm-block col-sm-2\">Unit Price</div>\n");
      out.write("                        <div class=\"col-2\">Amount</div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"text-95 text-secondary-d3\">\n");
      out.write("                        <div class=\"row mb-2 mb-sm-0 py-25\">\n");
      out.write("                            <div class=\"d-none d-sm-block col-1\">1</div>\n");
      out.write("                            <div class=\"col-9 col-sm-5\">Domain registration</div>\n");
      out.write("                            <div class=\"d-none d-sm-block col-2\">2</div>\n");
      out.write("                            <div class=\"d-none d-sm-block col-2 text-95\">$10</div>\n");
      out.write("                            <div class=\"col-2 text-secondary-d2\">$20</div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row mb-2 mb-sm-0 py-25 bgc-default-l4\">\n");
      out.write("                            <div class=\"d-none d-sm-block col-1\">2</div>\n");
      out.write("                            <div class=\"col-9 col-sm-5\">Web hosting</div>\n");
      out.write("                            <div class=\"d-none d-sm-block col-2\">1</div>\n");
      out.write("                            <div class=\"d-none d-sm-block col-2 text-95\">$15</div>\n");
      out.write("                            <div class=\"col-2 text-secondary-d2\">$15</div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row mb-2 mb-sm-0 py-25\">\n");
      out.write("                            <div class=\"d-none d-sm-block col-1\">3</div>\n");
      out.write("                            <div class=\"col-9 col-sm-5\">Software development</div>\n");
      out.write("                            <div class=\"d-none d-sm-block col-2\">--</div>\n");
      out.write("                            <div class=\"d-none d-sm-block col-2 text-95\">$1,000</div>\n");
      out.write("                            <div class=\"col-2 text-secondary-d2\">$1,000</div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row mb-2 mb-sm-0 py-25 bgc-default-l4\">\n");
      out.write("                            <div class=\"d-none d-sm-block col-1\">4</div>\n");
      out.write("                            <div class=\"col-9 col-sm-5\">Consulting</div>\n");
      out.write("                            <div class=\"d-none d-sm-block col-2\">1 Year</div>\n");
      out.write("                            <div class=\"d-none d-sm-block col-2 text-95\">$500</div>\n");
      out.write("                            <div class=\"col-2 text-secondary-d2\">$500</div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"row border-b-2 brc-default-l2\"></div>\n");
      out.write("\n");
      out.write("                    <!-- or use a table instead -->\n");
      out.write("                    <!--\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <table class=\"table table-striped table-borderless border-0 border-b-2 brc-default-l1\">\n");
      out.write("                    <thead class=\"bg-none bgc-default-tp1\">\n");
      out.write("                        <tr class=\"text-white\">\n");
      out.write("                            <th class=\"opacity-2\">#</th>\n");
      out.write("                            <th>Description</th>\n");
      out.write("                            <th>Qty</th>\n");
      out.write("                            <th>Unit Price</th>\n");
      out.write("                            <th width=\"140\">Amount</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("\n");
      out.write("                    <tbody class=\"text-95 text-secondary-d3\">\n");
      out.write("                        <tr></tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>1</td>\n");
      out.write("                            <td>Domain registration</td>\n");
      out.write("                            <td>2</td>\n");
      out.write("                            <td class=\"text-95\">$10</td>\n");
      out.write("                            <td class=\"text-secondary-d2\">$20</td>\n");
      out.write("                        </tr> \n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            -->\n");
      out.write("\n");
      out.write("                    <div class=\"row mt-3\">\n");
      out.write("                        <div class=\"col-12 col-sm-7 text-grey-d2 text-95 mt-2 mt-lg-0\">\n");
      out.write("                            Extra note such as company or payment information...\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-12 col-sm-5 text-grey text-90 order-first order-sm-last\">\n");
      out.write("                            <div class=\"row my-2\">\n");
      out.write("                                <div class=\"col-7 text-right\">\n");
      out.write("                                    SubTotal\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-5\">\n");
      out.write("                                    <span class=\"text-120 text-secondary-d1\">$2,250</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"row my-2\">\n");
      out.write("                                <div class=\"col-7 text-right\">\n");
      out.write("                                    Tax (10%)\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-5\">\n");
      out.write("                                    <span class=\"text-110 text-secondary-d1\">$225</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"row my-2 align-items-center bgc-primary-l3 p-2\">\n");
      out.write("                                <div class=\"col-7 text-right\">\n");
      out.write("                                    Total Amount\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-5\">\n");
      out.write("                                    <span class=\"text-150 text-success-d3 opacity-2\">$2,475</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <hr />\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <span class=\"text-secondary-d1 text-105\">Thank you for your business</span>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-info btn-bold px-4 float-right mt-3 mt-lg-0\">Pay Now</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
        out.write("                        <a href=\"cart\" class=\"cart position-relative d-inline-flex\" aria-label=\"View your shopping cart\">\n");
        out.write("          <i class=\"fas fa fa-shopping-cart fa-lg\" style=\"font-size:32px;color:whitesmoke;padding-top: 10px;\"></i>\n");
        out.write("          <span class=\"cart-basket d-flex align-items-center justify-content-center\" style=\"color: black\">\n");
        out.write("              ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
}
