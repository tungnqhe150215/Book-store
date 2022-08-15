<%-- 
    Document   : accountinfor
    Created on : Jul 12, 2021, 2:24:56 PM
    Author     : nqt26
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <a class="list-group-item active">Tài khoản của bạn</a>
                <ul class="list-group">
                    <li class="list-group-item active" style="background-color: pink"><a href="profile"> Thông tin cá nhân</a></li>
                    <li class="list-group-item"><a href="changepass">Đổi mật khẩu </a></li>
                    <c:if test="${sessionScope.account.level==2}">
                    <li class="list-group-item"><a href="managebook">Quản lí sản phẩm</a></li>
                    </c:if>
                    <li class="list-group-item"><a href="manageorder">Quản lí hóa đơn</a></li>
                </ul>     
            </div>
            <div class="col-md-9">
            <h1 class="text-center">Thông tin tài khoản</h1>
                <form action="profile" method="post" accept-charset="utf-8"  > 
                    <h4 style="color: red">${requestScope.noti}</h4>
                    <h4>Tên của bạn:</h4><input type="text" name="name" value="${requestScope.infor.name}" class="form-control input-lg"/>   
                    <h4>Tài Khoản:</h4><input type="text" name="user" value="${requestScope.infor.accname.username}" class="form-control input-lg" disabled />                                             
                    <h4>Số điện thoại:</h4><input type="text" name="phone" value="${requestScope.infor.phone}" class="form-control input-lg"  />   
                    <h4>Email:</h4><input type="text" name="email"  value="${requestScope.infor.email}" class="form-control input-lg"  />  
                    <h4>Địa chỉ</h4><input type="text" name="address" value="${requestScope.infor.address}" class="form-control input-lg"  />   <br/>
                    <button class="btn btn-lg btn-primary btn-block signup-btn" type="submit">Cập nhật</button>
                </form>
            </div>       
        </div>
    <!-- /.container -->
    </div>
    <!--Footer -->
    <%@include file="footer.jsp" %>