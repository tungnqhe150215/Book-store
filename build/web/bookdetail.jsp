<%-- 
    Document   : detail
    Created on : Jul 11, 2021, 5:09:01 PM
    Author     : nqt26
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
    <div class="container">

        <!-- /.row -->
            <!-- /.col -->
            <div class="row">
                    <ol class="breadcrumb">
                        <li><a href="home">Home</a></li>
                        <li class="active"> ${book.name}</li>
                    </ol>
            </div>
            <div class="row">
                    <div class=" col-md-3 text-center ">
                        <img src="${book.image}" style="width: 100%;height: auto" alt="" />
                  </div>
                   <div class="col-md-3 ">
                            <h2>${book.name} </a></h2>
                            <p style="margin: 10px; text-align: left">Số lượng còn lại <strong>${book.unitinstock} </strong>  </p>                           
                            <p style="margin-bottom: 20px;margin-top: 20px">Price : <strong style="font-size: 20px">${book.unitprice} VND</strong>  </p>
                            <p style=""><a href="addcart?id=${book.ID}" class="btn btn-success" role="button">Thêm vào giỏ hàng</a>
                            
                    </div>
                            <div class="col-md-6">
                                <style>
                                    .first{
                                        width: 20%;
                                        font-size: 15px;
                                        font-weight: bold;
                                       padding-left: 5px;
                                    }
                                    .second{
                                        padding: 10px;
                                    }
                                </style>
                                <table border="1px" width="100%">
                                    <tr>
                                        <td class="first">Tác giả </td><td class="second">${book.aid.name}</td>
                                    </tr>
                                    <tr>
                                        <td class="first">Nhà phát hành </td><td class="second">${book.pid.name}</td>
                                    </tr>
                                    <tr>
                                        <td class="first">Ngày xuất bản</td><td class="second">${book.date}</td>
                                    </tr>
                                    <tr>
                                        <td class="first">Kích cỡ </td><td class="second">${book.size}</td>
                                    </tr>
                                    <tr>
                                        <td class="first">Loại bìa </td><td class="second">${book.cid.name}</td>
                                    </tr>
                                    <tr>
                                        <td class="first">Giới thiệu </td><td class="second">${book.description}</td>
                                    </tr>
                                </table>
                            </div>
            </div> 
            <!-- /.col -->
        <!-- /.row -->
    </div>
    <!-- /.container -->
    </div>
    <!--Footer -->
    <%@include file="footer.jsp" %>
