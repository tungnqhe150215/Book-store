<%-- 
    Document   : updatebook.jsp
    Created on : Jul 19, 2021, 9:43:02 AM
    Author     : nqt26
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<c:set var="d" value="${requestScope.data}"></c:set>
<div class="container">
    <div class="row">
        <div class="col-md-3">
                <a class="list-group-item active">Tài khoản của bạn</a>
                <ul class="list-group">
                    <li class="list-group-item active" ><a href="profile"> Thông tin cá nhân</a></li>
                    <li class="list-group-item"><a href="changepass">Đổi mật khẩu </a></li>
                    <li class="list-group-item " ><a href="managebook">Quản lí sản phẩm</a></li>
                    <li class="list-group-item disabled" style="background-color: pink">Cập nhật sản phẩm</li>
                </ul>     
         </div>
        <div class="col-md-9">
    <form action="updatebook" method="post">
<div class="modal-dialog " id="updatemodal"  > 
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
          <button type="button" class="btn btn-secondary" data-dismiss="modal"><a href="managebook">Close</a></button>
        <button type="submit" class="btn btn-primary" style="color:yellow">Save changes</button>
      </div>

    </div>
    </div>
      </div>
</div>
    </form>
    </div>
</div>
</div>
        <%@include file="footer.jsp" %>
