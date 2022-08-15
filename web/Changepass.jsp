<%-- 
    Document   : Changepass
    Created on : Jul 13, 2021, 12:57:44 PM
    Author     : nqt26
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!-- Fontawesome core CSS -->
    <link href="assets/css/font-awesome.min.css" rel="stylesheet" />
    <!--GOOGLE FONT -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
    <!--Slide Show Css -->
    <link href="assets/ItemSlider/css/main-style.css" rel="stylesheet" />
    <!-- custom CSS here -->
    <link href="assets/css/style.css" rel="stylesheet" /> 
    <link href="assets/css/format.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
                <nav class="navbar navbar-default" role="navigation">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="home"><strong>LN</strong> Shop</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">


                <ul class="nav navbar-nav navbar-right">
                    <c:if test="${sessionScope.account==null}">
                    <li><a href="login">Đăng nhập</a></li>
                    </c:if>
                    <c:if test="${sessionScope.account!=null}">
                    <li class="dropdown"> 
                        <a href="" class="dropdown-toggle" data-toggle="dropdown">${sessionScope.account.username} <b class="caret"></b> </a>
                        <ul class="dropdown-menu ">
                            <c:if test="${sessionScope.account.level==3}">
                                    <li><a href="">Quản lý đơn hàng</a></li>
                            </c:if>
                            <c:if test="${sessionScope.account.level==2}">
                                <li><a href="">Quản lý sản phẩm</a></li>
                                <li><a href="">Thông tin cá nhân</a></li>
                            </c:if>
                                <li><a href="">Xem đơn hàng</a></li>
                            <c:if test="${sessionScope.account.level==1}">                              
                                <li><a href="">Thông tin cá nhân</a></li>
                            </c:if>                      

                                <li><a href="logout">Đăng xuất</a> </li>
                        </ul>
                    </c:if>                    
                </ul>
                <form action="" class="navbar-form " role="search" style="text-align: center">
                    <div class="form-group">
                        <input type="text" placeholder="Enter Keyword Here ..." class="form-control" style="width:100%">
                    </div>
                    &nbsp; 
                    <button type="submit" class="btn btn-primary">Tìm kiếm</button>
                </form>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <a class="list-group-item active">Tài khoản của bạn</a>
                <ul class="list-group">
                    <li class="list-group-item " ><a href="profile"> Thông tin cá nhân</a></li>
                    <li class="list-group-item" style="background-color: pink"><a href="changepass">Đổi mật khẩu </a></li>
                </ul>     
            </div>
            <div class="col-md-9">
            <h1 class="text-center">Đổi mật khẩu</h1>
                <form action="changepass" method="post" accept-charset="utf-8"  >
                    <h4 style="color: red">${requestScope.error}</h4>
                    <h4>Mật khẩu hiện tại:</h4><input type="password" name="opass"  class="form-control input-lg"/>   
                    <h4>Mật khẩu mới:</h4><input type="password" name="npass"  class="form-control input-lg"  />                                             
                    <h4>Nhập lại mật khẩu:</h4><input type="password" name="rpass"  class="form-control input-lg"  />  <br/>   
                    <button class="btn btn-lg btn-primary btn-block signup-btn" type="submit">Cập nhật</button>
                </form>
            </div>       
        </div>
    <!-- /.container -->
    </div>
    <!--Footer -->
    <div class="col-md-12 footer-box">
        <div class="row">
            <div class="col-md-6">
                <strong style="font-size: 20px">Liên hệ</strong>
                <p>
                <h3 style="color: red">CÔNG TY TNHH LN</h3>
                     234, Phố Hoàng Cầu, Hà Nội<br />
                                    
                    Số điện thoại: 0376164241<br>
                    Email: lnshop@gmail.com<br>
                </p>

            </div>
            <div class="col-md-6 social-box">
                <strong style="font-size: 20px">Follow us</strong>
                <hr>
                <a href="#"><i class="fa fa-facebook-square fa-3x "></i></a>
                <a href="#"><i class="fa fa-twitter-square fa-3x "></i></a>
                <a href="#"><i class="fa fa-google-plus-square fa-3x c"></i></a>
                <a href="#"><i class="fa fa-linkedin-square fa-3x "></i></a>
                <a href="#"><i class="fa fa-pinterest-square fa-3x "></i></a>
            </div>
        </div>
        <hr>
    </div>
    <!-- /.col -->
    <div class="col-md-12 end-box ">
        &copy; 2014 | &nbsp; All Rights Reserved | &nbsp; www.yourdomain.com | &nbsp; 24x7 support | &nbsp; Email us: info@yourdomain.com
    </div>
    <!-- /.col -->
    <!--Footer end -->
    <!--Core JavaScript file  -->
    <script src="assets/js/jquery-1.10.2.js"></script>
    <!--bootstrap JavaScript file  -->
    <script src="assets/js/bootstrap.js"></script>
    <!--Slider JavaScript file  -->
    <script src="assets/ItemSlider/js/modernizr.custom.63321.js"></script>
    <script src="assets/ItemSlider/js/jquery.catslider.js"></script>
    <script>
        $(function () {

            $('#mi-slider').catslider();

        });
		</script>
    </body>
</html>