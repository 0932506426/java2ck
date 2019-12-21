package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class account_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Đăng nhập, đăng kí thành viên </title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/price-range.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\">   \n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("        <script src=\"js/price-range.js\"></script>\n");
      out.write("        <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            String ten_tai_khoan_err = "", ten_dang_nhap_err = "", mat_khau_err = "";
            if (request.getAttribute("ten_tai_khoan_err") != null) {
                ten_tai_khoan_err = (String) request.getAttribute("ten_tai_khoan_err");
            }
            if (request.getAttribute("ten_dang_nhap_err") != null) {
                ten_dang_nhap_err = (String) request.getAttribute("ten_dang_nhap_err");
            }
            if (request.getAttribute("mat_khau_err") != null) {
                mat_khau_err = (String) request.getAttribute("mat_khau_err");
            }
            String ten_tai_khoan = "", ten_dang_nhap = "", mat_khau = "";
            if (request.getAttribute("ten_tai_khoan") != null) {
                ten_tai_khoan = (String) request.getAttribute("ten_tai_khoan");
            }
            if (request.getAttribute("ten_dang_nhap") != null) {
                ten_dang_nhap = (String) request.getAttribute("ten_dang_nhap");
            }
            if (request.getAttribute("mat_khau") != null) {
                mat_khau = (String) request.getAttribute("mat_khau");
            }
            String err="";
            if(request.getAttribute("err") != null){
                err = (String) request.getAttribute("err");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <section id=\"form\"><!--form-->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-4 col-sm-offset-1\">\n");
      out.write("                            <div class=\"login-form\"><!--login form-->\n");
      out.write("                                <h2>Đăng nhập hệ thống</h2>\n");
      out.write("                                <form action=\"DangNhapServlet\" method=\"post\">\n");
      out.write("                                    <p style=\"color: red\">");
      out.print(err);
      out.write("</p>\n");
      out.write("                                    <input type=\"email\" placeholder=\"Địa chỉ email đăng nhập\" name=\"ten_dang_nhap\"/>\n");
      out.write("                                    <input type=\"password\" placeholder=\"Mật khẩu đăng nhập\" name=\"mat_khau\"/>\n");
      out.write("                                    <span>\n");
      out.write("                                        <input type=\"checkbox\" class=\"checkbox\"> \n");
      out.write("                                        Duy trì đăng nhập\n");
      out.write("                                    </span>\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-default\">Đăng nhập</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div><!--/login form-->\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-1\">\n");
      out.write("                            <h2 class=\"or\">hoặc</h2>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                            <div class=\"signup-form\"><!--sign up form-->\n");
      out.write("                                <h2>Đăng kí thành viên</h2>\n");
      out.write("                                <form action=\"DanhKyServlet\" method=\"post\">\n");
      out.write("                                <p style=\"color: red\">");
      out.print(ten_tai_khoan_err);
      out.write("</p>\n");
      out.write("                                <input type=\"text\" placeholder=\"Họ và tên\" name=\"ten_tai_khoan\" value=\"");
      out.print(ten_tai_khoan);
      out.write("\"/>\n");
      out.write("                                <p style=\"color: red\">");
      out.print(ten_dang_nhap_err);
      out.write("</p>\n");
      out.write("                                <input type=\"email\" placeholder=\"Địa chỉ Email đăng kí\" name=\"ten_dang_nhap\" value=\"");
      out.print(ten_dang_nhap);
      out.write("\">\n");
      out.write("                                <p style=\"color: red\">");
      out.print(mat_khau_err);
      out.write("</p>\n");
      out.write("                                <input type=\"password\" placeholder=\"Mật khẩu đăng nhập\" name=\"mat_khau\" value=\"");
      out.print(mat_khau);
      out.write("\"/>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-default\">Đăng kí</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div><!--/sign up form-->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section><!--/form-->\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
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
