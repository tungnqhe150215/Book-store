<%-- 
    Document   : shoppingcart
    Created on : Jul 19, 2021, 2:47:24 PM
    Author     : nqt26
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
    <style>
        .shopping-cart{
	padding-bottom: 50px;
	font-family: 'Montserrat', sans-serif;
}

.shopping-cart.dark{
	background-color: #f6f6f6;
}

.shopping-cart .content{
	box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.075);
	background-color: white;
}

.shopping-cart .block-heading{
    padding-top: 50px;
    margin-bottom: 40px;
    text-align: center;
}

.shopping-cart .block-heading p{
	text-align: center;
	max-width: 420px;
	margin: auto;
	opacity:0.7;
}

.shopping-cart .dark .block-heading p{
	opacity:0.8;
}

.shopping-cart .block-heading h1,
.shopping-cart .block-heading h2,
.shopping-cart .block-heading h3 {
	margin-bottom:1.2rem;
	color: #3b99e0;
}

.shopping-cart .items{
	margin: auto;
}

.shopping-cart .items .product{
	margin-bottom: 20px;
	padding-top: 20px;
	padding-bottom: 20px;
}

.shopping-cart .items .product .info{
	padding-top: 0px;
	text-align: center;
}

.shopping-cart .items .product .info .product-name{
	font-weight: 600;
}

.shopping-cart .items .product .info .product-name .product-info{
	font-size: 14px;
	margin-top: 15px;
}

.shopping-cart .items .product .info .product-name .product-info .value{
	font-weight: 400;
}

.shopping-cart .items .product .info .quantity .quantity-input{
    margin: auto;
    width: 80px;
}

.shopping-cart .items .product .info .price{
	margin-top: 15px;
    font-weight: bold;
    font-size: 22px;
 }

.shopping-cart .summary{
	border-top: 2px solid #5ea4f3;
    background-color: #f7fbff;
    height: 100%;
    padding: 30px;
}

.shopping-cart .summary h3{
	text-align: center;
	font-size: 1.3em;
	font-weight: 600;
	padding-top: 20px;
	padding-bottom: 20px;
}

.shopping-cart .summary .summary-item:not(:last-of-type){
	padding-bottom: 10px;
	padding-top: 10px;
	border-bottom: 1px solid rgba(0, 0, 0, 0.1);
}

.shopping-cart .summary .text{
	font-size: 1em;
	font-weight: 600;
}

.shopping-cart .summary .price{
	font-size: 1em;
	float: right;
}

.shopping-cart .summary button{
	margin-top: 20px;
}

@media (min-width: 768px) {
	.shopping-cart .items .product .info {
		padding-top: 25px;
		text-align: left; 
	}

	.shopping-cart .items .product .info .price {
		font-weight: bold;
		font-size: 22px;
		top: 17px; 
	}

	.shopping-cart .items .product .info .quantity {
		text-align: center; 
	}
	.shopping-cart .items .product .info .quantity .quantity-input {
		padding: 4px 10px;
		text-align: center; 
	}
}

    </style>
    <c:set var="t" value="0"/>
<div class="container">           
	 	<section class="shopping-cart dark">
		        <div class="block-heading">
		          <h2>Giỏ hàng của bạn</h2>
		        </div>
		        <div class="content">
	 				<div class="row">
	 					<div class="col-md-12 col-lg-8">
                                                    <c:forEach items="${requestScope.list}" var="d">
	 						<div class="items">
				 				<div class="product">
				 					<div class="row">
					 					<div class="col-md-3">
                                                                                    <img class="img-fluid mx-auto d-block image" style="width: 100%;height: auto; margin: 2px" src="${d.bookid.image}">
					 					</div>
					 					<div class="col-md-8">
					 						<div class="info">
						 						<div class="row">
							 						<div class="col-md-5 product-name">
							 							<div class="product-name">
								 							<a href="Detail?id=${d.bookid.ID}">${d.bookid.name}</a>
								 							<div class="product-info">
									 							<div>Tác giả: <span class="value">${d.bookid.aid.name}</span></div>
									 							<div>Nhà phát hành: <span class="value">${d.bookid.pid.name}</span></div>
									 							<div>Loại bìa: <span class="value">${d.bookid.cid.name}</span></div>
									 						</div>
									 					</div>
							 						</div>
							 						<div class="col-md-4 quantity">                                                                                                            
							 							<label for="quantity">Quantity:</label> <br/>                                           
                                                                                                                <div class=" row ">
                                                                                                                    <div class="col-md-4 "><a href="<c:if test="${d.quantity>1}">updatecart?id=${d.bookid.ID}&quan=${d.quantity-1}</c:if>"><i class="fa fa-minus text-danger"></i></a></div>
                                                                                                                    <div class="col-md-4"><input type="text" name="quantity" value="${d.quantity}" style="width: 100%;text-align: center;" disabled></div>
                                                                                                                    <div class="col-md-4 "><a href="<c:if test="${d.quantity<d.bookid.unitinstock}">updatecart?id=${d.bookid.ID}&quan=${d.quantity+1}</c:if>"><i class="fa fa-plus text-success"></i></a></div>
                                                                                                                </div>                                                                                                            
							 						</div>
							 						<div class="col-md-3 price">
                                                                                                            <span><strong style="color:red">${d.bookid.unitprice*d.quantity}</strong> VND</span>
							 						</div>
							 					</div>
							 				</div>
					 					</div>
                                                                            <div class="col-md-1">
                                                                                <a href="deletecart?id=${d.bookid.ID}" class="cart position-relative d-inline-flex" aria-label="View your shopping cart">
                                                                                    <i class="fas fa fa-trash-o fa-lg" style="font-size:32px;color:black;margin-top: 60px;"></i></a>
                                                                            </div>
                                                                                                      
					 				</div>
                                                                    
				 				</div>
				 				
				 			</div>
                                                                                                        <hr style="color: black">
                                                                                                        <c:set var="t" value="${t+d.bookid.unitprice*d.quantity}"/>
                                                    </c:forEach>
			 			</div>
			 			<div class="col-md-12 col-lg-4">
			 				<div class="summary">
			 					<h3>Tổng hóa đơn</h3>
			 					<div class="summary-item"><span class="text">Tổng cộng</span><span class="price">${t} VND</span></div>
                                                                <button type="button" class="btn btn-primary btn-lg btn-block"><a href="checkout" style="color: black">Checkout</a></button>
				 			</div>
			 			</div>
		 			</div> 
		 		</div>
	 		
		</section>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

<%@include file="footer.jsp" %>

