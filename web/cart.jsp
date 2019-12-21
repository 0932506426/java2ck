<%-- 
    Document   : cart
    Created on : Dec 16, 2019, 11:25:00 PM
    Author     : Administrator
--%>

<%@page import="dao.SanPhamDaoImpl"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Map"%>
<%@page import="model.SanPham"%>
<%@page import="java.util.TreeMap"%>
<%@page import="model.GioHang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/price-range.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <link href="css/responsive.css" rel="stylesheet">   
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/price-range.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </head>
    <body>

        <%
            SanPhamDaoImpl sanPhamDAO = new SanPhamDaoImpl();
            GioHang cart = (GioHang) session.getAttribute("cart");
            if (cart == null) {
                cart = new GioHang();
                session.setAttribute("cart", cart);
            }
            TreeMap<SanPham, Integer> list = cart.getList();
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(0);
        %>

        <jsp:include page="header.jsp"></jsp:include>
            <section>
                <div class="container">
                    <div class="row">


                        <section id="cart_items">
                            <div class="container">                                
                                <div class="table-responsive cart_info">
                                    <table class="table table-condensed">
                                        <thead>
                                            <tr class="cart_menu">
                                                <td class="image">Sản phẩm</td>
                                                <td class="description"></td>
                                                <td class="price">Đơn giá</td>
                                                <td class="quantity">Số lượng</td>
                                                <td class="total">Thành tiền</td>
                                                <td></td>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        <%                                     
                                            for (Map.Entry<SanPham, Integer> ds : list.entrySet()) {
                                        %>
                                        <tr>
                                            <td class="cart_product">
                                                <a href=""><img src="images/coca 330ml.png" alt=""></a>
                                            </td>
                                            <td class="cart_description">
                                                <h4><a href=""><%=ds.getKey().getTen_san_pham()%></a></h4>
                                                <p>Mã sản phẩm: <%=ds.getKey().getMa_san_pham()%></p>
                                            </td>
                                            <td class="cart_price">
                                                <p><%=nf.format(ds.getKey().getDon_gia())%> VNĐ</p>
                                            </td>
                                            <td class="cart_quantity">
                                                <div class="cart_quantity_button">
                                                    <a class="cart_quantity_up" href="GioHangServlet?command=plus&ma_san_pham=<%=ds.getKey().getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>"> + </a>
                                                    <input class="cart_quantity_input" type="text" name="quantity" value="<%=ds.getValue()%>" autocomplete="off" size="2" disabled="">
                                                    <a class="cart_quantity_down" href="GioHangServlet?command=sub&ma_san_pham=<%=ds.getKey().getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>"> - </a>
                                                </div>
                                            </td>
                                            <td class="cart_total">
                                                <p class="cart_total_price"><%=nf.format(ds.getValue() * ds.getKey().getDon_gia())%> VNĐ</p>
                                            </td>
                                            <td class="cart_delete">
                                                <a class="cart_quantity_delete" href="GioHangServlet?command=remove&ma_san_pham=<%=ds.getKey().getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>"><i class="fa fa-times"></i></a>
                                            </td>
                                        </tr> 
                                        <%
                                            }
                                        %>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </section> <!--/#cart_items-->
                </div>
            </div>
        </section>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
