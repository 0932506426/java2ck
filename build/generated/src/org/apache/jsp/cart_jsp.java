package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.SanPhamDaoImpl;
import java.text.NumberFormat;
import java.util.Map;
import model.SanPham;
import java.util.TreeMap;
import model.GioHang;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
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

            SanPhamDaoImpl sanPhamDAO = new SanPhamDaoImpl();
            GioHang cart = (GioHang) session.getAttribute("cart");
            if (cart == null) {
                cart = new GioHang();
                session.setAttribute("cart", cart);
            }
            TreeMap<SanPham, Integer> list = cart.getList();
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(0);
        
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <section>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <section id=\"cart_items\">\n");
      out.write("                            <div class=\"container\">                                \n");
      out.write("                                <div class=\"table-responsive cart_info\">\n");
      out.write("                                    <table class=\"table table-condensed\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr class=\"cart_menu\">\n");
      out.write("                                                <td class=\"image\">Sản phẩm</td>\n");
      out.write("                                                <td class=\"description\"></td>\n");
      out.write("                                                <td class=\"price\">Đơn giá</td>\n");
      out.write("                                                <td class=\"quantity\">Số lượng</td>\n");
      out.write("                                                <td class=\"total\">Thành tiền</td>\n");
      out.write("                                                <td></td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                        ");
                                     
                                            for (Map.Entry<SanPham, Integer> ds : list.entrySet()) {
                                        
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"cart_product\">\n");
      out.write("                                                <a href=\"\"><img src=\"images/coca 330ml.png\" alt=\"\"></a>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td class=\"cart_description\">\n");
      out.write("                                                <h4><a href=\"\">");
      out.print(ds.getKey().getTen_san_pham());
      out.write("</a></h4>\n");
      out.write("                                                <p>Mã sản phẩm: ");
      out.print(ds.getKey().getMa_san_pham());
      out.write("</p>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td class=\"cart_price\">\n");
      out.write("                                                <p>");
      out.print(nf.format(ds.getKey().getDon_gia()));
      out.write(" VNĐ</p>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td class=\"cart_quantity\">\n");
      out.write("                                                <div class=\"cart_quantity_button\">\n");
      out.write("                                                    <a class=\"cart_quantity_up\" href=\"GioHangServlet?command=plus&ma_san_pham=");
      out.print(ds.getKey().getMa_san_pham());
      out.write("&cartID=");
      out.print(System.currentTimeMillis());
      out.write("\"> + </a>\n");
      out.write("                                                    <input class=\"cart_quantity_input\" type=\"text\" name=\"quantity\" value=\"");
      out.print(ds.getValue());
      out.write("\" autocomplete=\"off\" size=\"2\" disabled=\"\">\n");
      out.write("                                                    <a class=\"cart_quantity_down\" href=\"GioHangServlet?command=sub&ma_san_pham=");
      out.print(ds.getKey().getMa_san_pham());
      out.write("&cartID=");
      out.print(System.currentTimeMillis());
      out.write("\"> - </a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td class=\"cart_total\">\n");
      out.write("                                                <p class=\"cart_total_price\">");
      out.print(nf.format(ds.getValue() * ds.getKey().getDon_gia()));
      out.write(" VNĐ</p>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td class=\"cart_delete\">\n");
      out.write("                                                <a class=\"cart_quantity_delete\" href=\"GioHangServlet?command=remove&ma_san_pham=");
      out.print(ds.getKey().getMa_san_pham());
      out.write("&cartID=");
      out.print(System.currentTimeMillis());
      out.write("\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr> \n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </section> <!--/#cart_items-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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
