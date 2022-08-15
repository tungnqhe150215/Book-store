<%-- 
    Document   : ManagerBook.jsp
    Created on : Jul 15, 2021, 9:58:48 AM
    Author     : nqt26
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <a class="list-group-item active">Tài khoản của bạn</a>
                <ul class="list-group">
                    <li class="list-group-item active" ><a href="profile"> Thông tin cá nhân</a></li>
                    <li class="list-group-item"><a href="changepass">Đổi mật khẩu </a></li>
                    <li class="list-group-item" style="background-color: pink"><a href="managebook">Quản lí sản phẩm</a>
                    <li class="list-group-item"><a href="manageorder">Quản lí hóa đơn</a></li>
                </ul>     
            </div>
            <div class="col-md-9">
                <div class="table-users">
   <div class="header">Danh sách sản phẩm</div>
   
   <table border="1px">
      <tr>
         <th>Ảnh minh họa</th>
         <th>Tên</th>
         <th>Số lượng trong kho</th>
         <th>Giá</th>
         <th width="120"></th>
      </tr>
      <c:forEach items="${requestScope.data}" var="d">
      <tr>
         <td><img src="${d.image}" alt="" /></td>
         <td style="font-size: 18px">${d.name}</td>
         <td class="mid">${d.unitinstock}</td>
         <td class="mid"><strong style="color">${d.unitprice}</strong> VND</td>
         <td class="mid"><button type="button" class="btn btn-secondary" ><a href="updatebook?id=${d.ID}">Sửa</a></button>&nbsp;&nbsp;&nbsp;
            <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#exampleModal${d.ID}">Xóa</button> </td>
      </tr>     
     
<!-- Modal -->
<div class="modal fade" id="updatemodal${d.ID}" tabindex="-1" role="dialog" aria-labelledby="exampleModalScrollableTitle" aria-hidden="true"> 
      <div class="modal-dialog modal-dialog-scrollable" role="document">
    <div class="modal-content">
      <div class="modal-header">
          <h5 class="modal-title" id="exampleModalScrollableTitle" style="font-size: 15px">Cập nhật </h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
        <br/>
      </div>
    <div>

         <div class="modal-body">
             <div class="form-group">
               <label for="id">ID</label>
                <input type="text" class="form-control" id="id" name="id" value="${d.ID}" readonly >
            </div>
                        
                <div class="form-group ">
                    <label for="name">Tên</label>
                    <input type="text" class="form-control" id="name" name="name" value="${d.name}" >
                </div>
                <div class="form-group ">
                    <label for="date">Ngày xuất bản</label>
                    <input type="text" class="form-control" id="date" name="date" value=" ${d.date}" >
                </div>

            <div class="form-group">
                <label for="image">Ảnh</label>
                <input type="text" class="form-control" id="image" name="image" value="${d.image}">
            </div>
            <div class="form-group">
                <label for="size">Kích cỡ</label>
                <input type="text" class="form-control" id="size" name="size" value="${d.size}">
            </div>
            <div class="form-group">
                <label for="des">Mô tả</label>
                <textarea  class="form-control" id="des" name="des" >${d.description}</textarea>
            </div>
            <div class="form-row">                
                <div class="form-group col-md-4">
                    <label for="cover">Loại bìa</label>
                    <select id="cover" name="cover" class="form-control">
                        <c:forEach items="${requestScope.cover}" var="c">
                            <option <c:if test="${d.cid.name==c.name}">selected</c:if> value="${c.id}">${c.name}</option>
                        </c:forEach>
                        <option>Khác</option>
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="author">Tác giả</label>
                    <select id="author" name="author" class="form-control">
                        <c:forEach items="${requestScope.author}" var="a">
                            <option <c:if test="${d.aid.name==a.name}">selected</c:if> value="${a.ID}">${a.name}</option>
                        </c:forEach>
                        <option>Khác</option>
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="publisher">Nhà Phát Hành</label>
                    <select id="publisher" name="publisher" class="form-control">
                        <c:forEach items="${requestScope.publisher}" var="p">
                            <option <c:if test="${d.pid.name==p.name}">selected</c:if> value="${p.ID}">${p.name}</option>
                        </c:forEach>
                        <option>Khác</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label for="quantity">Số lượng còn</label>
                <input type="number" class="form-control" id="quantity" name="quantity" value="${d.unitinstock}">
            </div>
            <div class="form-group">
                <label for="price">Giá bán</label>
                <input type="text" class="form-control" id="price" name="price" value="${d.unitprice} ">
            </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary"><a href="update?id=${d.ID}" style="color:yellow">Save changes</a></button>
      </div>

    </div>
    </div>
      </div>
</div>

<!--Modal: modalConfirmDelete-->
<!-- Modal -->
<div class="modal fade" id="exampleModal${d.ID}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Cảnh báo xóa sản phẩm</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
        <br/>
      </div>
      <div class="modal-body">
          Are you sure to delete <strong style="color:red"> ${d.name}</strong> ?
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>
        <button type="button" class="btn btn-primary"><a href="deletebook?id=${d.ID}">Yes</a></button>
      </div>
    </div>
  </div>
</div>
      </c:forEach>
    </table>
     </div>
 <div class="modal fade" id="createmodal" tabindex="-1" role="dialog" aria-labelledby="exampleModalScrollableTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-scrollable" role="document">
    <div class="modal-content">
      <div class="modal-header">
          <h5 class="modal-title" id="exampleModalScrollableTitle" style="font-size: 15px">Thêm mới </h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
        <br/>
      </div>
     <form action="addbook" method="post">
         <div class="modal-body">
                          
                <div class="form-group ">
                    <label for="name">Tên</label>
                    <input type="text" class="form-control" id="name" name="name" >
                </div>
                <div class="form-group ">
                    <label for="date">Ngày xuất bản</label>
                    <input type="text" class="form-control" id="date" name="date"  >
                </div>
         
            <div class="form-group">
                <label for="image">Ảnh</label>
                <input type="text" class="form-control" id="image" name="image" >
            </div>
            <div class="form-group">
                <label for="size">Kích cỡ</label>
                <input type="text" class="form-control" id="size" name="size" >
            </div>
            <div class="form-group">
                <label for="des">Mô tả</label>
                <textarea  class="form-control" id="des" name="des" ></textarea>
            </div>
            <div class="form-row">                
                <div class="form-group col-md-4">
                    <label for="cover">Loại bìa</label>
                    <select id="cover" name="cover" class="form-control">
                        <c:forEach items="${requestScope.cover}" var="c">
                            <option value="${c.id}" >${c.name}</option>
                        </c:forEach>
                        <option>Khác</option>
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="author">Tác giả</label>
                    <select id="author" name="author" class="form-control">
                        <c:forEach items="${requestScope.author}" var="a">
                            <option value="${a.ID}" >${a.name}</option>
                        </c:forEach>
                        <option>Khác</option>
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="publisher">Nhà Phát Hành</label>
                    <select id="publisher" name="publisher" class="form-control">
                        <c:forEach items="${requestScope.publisher}" var="p">
                            <option value="${p.ID}">${p.name}</option>
                        </c:forEach>
                        <option>Khác</option>
                    </select>
                </div>
            </div>
              <div class="form-group">
                <label for="quantity">Số lượng còn</label>
                <input type="number" class="form-control" id="quantity" name="quantity" >
            </div>
            <div class="form-group">
                <label for="price">Giá bán</label>
                <input type="text" class="form-control" id="price" name="price" >
            </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Create</button>
      </div>
     </form>
    </div>
  </div>
</div>
<!--Modal: modalConfirmDelete-->
 
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#createmodal">Thêm mới</button>
    <!-- /.container -->
    </div>
</div>
    </div>
    <!--Footer -->
    <%@include file="footer.jsp" %>