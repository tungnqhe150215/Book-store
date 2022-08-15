<%-- 
    Document   : HomePage
    Created on : Jun 10, 2021, 1:33:01 PM
    Author     : nqt26
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
    <div class="container">

                   
        <div class="row landscape">
            <div class="col-12 text-center">
                <img src="ln/landscape.jpg" width="100%" height="auto"/>
            <br/>
            </div>
        </div>
 

        <!-- /.row -->
        <div class="row">
            <div class="col-md-3">
                <form action="home" method="GET">
                    <a class="list-group-item active">Tác giả</a>
                    <ul class="list-group">                        
                        <c:forEach items="${requestScope.authordata}" var="a">
                        <li class="list-group-item">${a.name}
                            <input type="checkbox" name="author" value="${a.ID}" onclick="this.form.submit()" class="checkbox-inline pull-right" 
                        <c:forEach items="${requestScope.author}" var="d">
                            <c:if test="${a.ID==d.ID}"> checked</c:if>
                        </c:forEach><c/>
                        </li>
                        </c:forEach>                       
                    </ul>
                    <a class="list-group-item active" >Nhà phát hành</a>
                    <ul class="list-group">                        
                        <c:forEach items="${requestScope.publisherdata}" var="p">
                        <li class="list-group-item">${p.name}
                            <input type="checkbox" name="publisher" value="${p.ID}" onclick="this.form.submit()" class="checkbox-inline pull-right"
                        <c:forEach items="${requestScope.publisher}" var="d">
                            <c:if test="${p.ID==d.ID}"> checked="yes"</c:if>
                        </c:forEach><c/>
                        </li>
                        </c:forEach>                       
                    </ul>
                    <a class="list-group-item active">Loại bìa</a>
                    <ul class="list-group">                        
                        <c:forEach items="${requestScope.coverdata}" var="c">
                        <li class="list-group-item">${c.name}
                            <input type="checkbox" name="cover" value="${c.id}" onclick="this.form.submit()" class="checkbox-inline pull-right"
                         <c:forEach items="${requestScope.cover}" var="d">
                            <c:if test="${c.id==d.id}"> checked="yes" </c:if>
                        </c:forEach><c/>
                        </li>
                        </c:forEach>                       
                    </ul>
                </form>
                <!-- /.div -->
               
            </div>
            <!-- /.col -->
            <div class="col-md-9">
                <div>
                    <ol class="breadcrumb">
                        <li><a href="home">Home</a></li>
                        <li class="active"></li>
                    </ol>
                </div>
                <!-- /.div -->
                <!-- /.row -->
                <div class="row">
                    <c:forEach items="${requestScope.data}" var="d">
                    <div class="col-12 col-md-3 text-center col-sm-6 col-xs-6">
                        <div class="thumbnail product-box  ">
                            <img src="${d.image}" alt="" />
                            <div class="caption">
                                <h3><a href="Detail?id=${d.ID}">${d.name} </a></h3>
                                <p>Price : <strong style="color: red">${d.unitprice} VND</strong>  </p>
                            </div>
                        </div>
                    </div> 
                    </c:forEach>
            </div>
            <!-- /.col -->
        </div>
        <!-- /.row -->
    </div>
    <!-- /.container -->
    </div>
    <!--Footer -->
    <%@include file="footer.jsp" %>