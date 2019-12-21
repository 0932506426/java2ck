<%-- 
    Document   : slider
    Created on : Dec 16, 2019, 10:48:16 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <section id="slider"><!--slider-->
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <div id="slider-carousel" class="carousel slide" data-ride="carousel">
                            <ol class="carousel-indicators">
                                <li data-target="#slider-carousel" data-slide-to="0" class="active"></li>
                                <li data-target="#slider-carousel" data-slide-to="1"></li>
                                <li data-target="#slider-carousel" data-slide-to="2"></li>
                            </ol>

                            <div class="carousel-inner">
                                <div class="item active">
                                    <div class="col-sm-6">
                                        <h1><span>WATER</span>-SHOPPER</h1>
                                        <h2>Tiêu hóa tốt mỗi ngày</h2>
                                        <p>Nhiều người cho rằng nước ngọt có gas giúp cho dễ tiêu hóa, chống ngán thức ăn, nhất là vào những bữa tiệc đầu năm. Sự thật thế nào? </p>
                                        <button type="button" class="btn btn-default get">Mua ngay</button>
                                    </div>
                                    <div class="col-sm-6">
                                        <img src="images/home/photo1518531945185-15185319451861722392952.jpg" class="girl img-responsive" alt="" />
                                       
                                    </div>
                                </div>
                                <div class="item">
                                    <div class="col-sm-6">
                                        <h1><span>WATER</span>-SHOPPER</h1>
                                        <h2>Không sợ đồ cay nóng</h2>
                                        <p>Nhiều người cho rằng nước ngọt có gas giúp cho dễ tiêu hóa, chống ngán thức ăn, nhất là vào những bữa tiệc đầu năm. Sự thật thế nào? </p>
                                        <button type="button" class="btn btn-default get">Mua ngay</button>
                                    </div>
                                    <div class="col-sm-6">
                                        <img src="images/home/do-uong-co-ga0.jpg" class="girl img-responsive" alt="" />
                                        
                                    </div>
                                </div>

                                <div class="item">
                                    <div class="col-sm-6">
                                        <h1><span>WATER</span>-SHOPPER</h1>
                                        <h2>Nhiều Khoang Chất Cho CƠ Thể</h2>
                                        <p>Nhiều người cho rằng nước ngọt có gas giúp cho dễ tiêu hóa, chống ngán thức ăn, nhất là vào những bữa tiệc đầu năm. Sự thật thế nào? </p>
                                        <button type="button" class="btn btn-default get">Mua ngay</button>
                                    </div>
                                    <div class="col-sm-6">
                                        <img src="images/home/nuoc-khoang-lavie-thung-24-chai-13112018162711.jpg" class="girl img-responsive" alt="" />
                                        
                                    </div>
                                </div>

                            </div>

                            <a href="#slider-carousel" class="left control-carousel hidden-xs" data-slide="prev">
                                <i class="fa fa-angle-left"></i>
                            </a>
                            <a href="#slider-carousel" class="right control-carousel hidden-xs" data-slide="next">
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </div>

                    </div>
                </div>
            </div>
        </section><!--/slider-->
    </body>
</html>
