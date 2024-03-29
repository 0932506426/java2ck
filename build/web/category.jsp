<%-- 
    Document   : category
    Created on : Dec 16, 2019, 10:46:28 PM
    Author     : Administrator
--%>

<%@page import="model.DanhMuc"%>
<%@page import="dao.DanhMucDAOImpl"%>
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
    </head>
    <body>
        <%
            DanhMucDAOImpl danhMucDAO = new DanhMucDAOImpl();
        %>
        <div class="col-sm-3">
            <div class="left-sidebar">
                <h2>Danh mục</h2>
                <div class="panel-group category-products" id="accordian"><!--category-productsr-->
                    <%for (DanhMuc danh_muc_cha : danhMucDAO.getListDanhMucCha()) {%>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a>
                                    <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                        <%=danh_muc_cha.getTen_danh_muc()%>
                                </a>
                            </h4>
                        </div>
                        <div class="panel-body">
                            <ul>
                                <%
                                    for (DanhMuc danh_muc_con : danhMucDAO.getListDanhMucCon(danh_muc_cha.getMa_danh_muc())) {
                                %>
                                <li><a href="index.jsp?ma_danh_muc=<%=danh_muc_con.getMa_danh_muc()%>"><%=danh_muc_con.getTen_danh_muc()%> </a></li>
                                    <%
                                        }
                                    %>
                            </ul>
                        </div>
                    </div>
                    <%
                        }
                    %>
                </div><!--/category-products-->                                           
                <div style="clear: both; margin-bottom: 30px;"></div>                
            </div>
        </div>
    </body>
</html>
