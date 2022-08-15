<%-- 
    Document   : manageorder
    Created on : Jul 20, 2021, 2:10:11 PM
    Author     : nqt26
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<style>
.modal-notify .modal-header {
    border-radius: 3px 3px 0 0;
}
.modal-notify .modal-content {
    border-radius: 3px;
}    

body {
  
   * { box-sizing: border-box; }
}

.header {
   background-color: #398B93;
   color: black;
   font-size: 1.5em;
   padding: 1rem;
   text-align: center;
   text-transform: uppercase;
}

img {
   margin: 10px;
   height:auto;
   width:100px;
}

.table-users {
    background-color: lightblue;
   border: 1px solid darkgoldenrod;
   border-radius: 10px;
   box-shadow: 3px 3px 0 rgba(0,0,0,0.1);
   max-width: calc(100% - 2em);
   margin: 1em auto;
   overflow: hidden;
   width: 800px;
}
.mid{
    text-align: center;
}
th{
    text-align: center;
}
table {
   width: 100%;
   
   td, th { 
      color: darken(#398B93, 10%);
      padding: 10px; 
   }
   
   td {
      font-size: 10px;
      text-align: center;
      vertical-align: middle;
      
      &:last-child {
         font-size: 0.95em;
         line-height: 1.4;
         text-align: left;
      }
   }
   
   th { 
      background-color: lighten(#398B93, 50%);
      font-weight: 300;
   }
   
   tr {     
      &:nth-child(2n) { background-color: white; }
      &:nth-child(2n+1) { background-color: gainsboro; }
   }
}
</style>
    </style>
    <c:if test="${sessionScope.account.level==2}"><c:set var="d" value="${requestScope.data.oid}"/></c:if>
    <c:if test="${sessionScope.account.level!=2}"><c:set var="d" value="${requestScope.data}"/></c:if>
<div class="container">
    <div class="col-md-3">
                <a class="list-group-item active">Tài khoản của bạn</a>
                <ul class="list-group">
                    <li class="list-group-item active" ><a href="profile"> Thông tin cá nhân</a></li>
                    <li class="list-group-item"><a href="changepass">Đổi mật khẩu </a></li>
                    <c:if test="${sessionScope.account.level==2}">
                    <li class="list-group-item"><a href="managebook">Quản lí sản phẩm</a></li>
                    </c:if>
                    <li class="list-group-item" style="background-color: pink"><a href="manageorder">Quản lí hóa đơn</a></li>
                </ul>     
    </div>
    <div class="col-md-9">
                <div class="table-users">
   <div class="header">Danh sách sản phẩm</div>
   
   <table border="1px">
      <tr>
         <th>Mã đơn hàng</th>
         <th>Tên khách hàng</th>
         <th>Tình trạng</th>
         <th width="120"></th>
      </tr>
      <c:forEach items="${d}" var="p">
      <tr>
          <td style="text-align: center;vertical-align: central;">${p.id}</td>
          <td style="font-size: 15px"><strong>${p.cus.name}</strong><br/> Địa chỉ: ${p.address}</td>
         <td class="mid"><strong style="color">${p.status.name}</strong></td>
         <td class="mid"><a href="orderdetail?id=${p.id}">chi tiết</a></td>
      </tr>
      </c:forEach>
      </table>
      </div>
   </div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<%@include file="footer.jsp" %>
