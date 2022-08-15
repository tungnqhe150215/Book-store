<%-- 
    Document   : header
    Created on : Jul 15, 2021, 1:30:24 PM
    Author     : nqt26
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
        <nav class="navbar navbar-default" role="navigation" style="background-color: yellowgreen">
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
                        <c:if test="${sessionScope.account.level==1}">
                        <a href="cart" class="cart position-relative d-inline-flex" aria-label="View your shopping cart">
          <i class="fas fa fa-shopping-cart fa-lg" style="font-size:32px;color:whitesmoke;padding-top: 10px;"></i>
          <span class="cart-basket d-flex align-items-center justify-content-center" style="color: black">
              ${sessionScope.size}
          </span>
        </a>
                        </c:if>
                    <li class="dropdown"> 
                        <a href="" class="dropdown-toggle" data-toggle="dropdown">${sessionScope.account.username} <b class="caret"></b> </a>
                        <ul class="dropdown-menu ">
                            <c:if test="${sessionScope.account.level==3}">
                                    <li><a href="manageorder">Quản lý đơn hàng</a></li>
                            </c:if>
                            <c:if test="${sessionScope.account.level==2}">
                                <li><a href="managebook">Quản lý sản phẩm</a></li>
                                <li><a href="profile">Thông tin cá nhân</a></li>
                                 <li><a href="manageorder">Xem đơn hàng</a></li>
                            </c:if>
                               
                            <c:if test="${sessionScope.account.level==1}">
                                 <li><a href="manageorder">Xem đơn hàng</a></li>
                                <li><a href="profile">Thông tin cá nhân</a></li>
                            </c:if>                      

                                <li><a href="logout">Đăng xuất</a> </li>
                        </ul>
                    </c:if>                    
                </ul>
                <form action="home" class="navbar-form " role="search" style="text-align: center">
                    <div class="form-group">
                        <input type="text" name="search" placeholder="Looking for ?" class="form-control" style="width:100%">
                    </div>
                    &nbsp; 
                    <button type="submit" class="btn btn-primary">Tìm kiếm</button>
                </form>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>