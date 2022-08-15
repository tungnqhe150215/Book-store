<%-- 
    Document   : register
    Created on : Jun 1, 2021, 5:21:05 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <style>
        #wrap{
background-image: -ms-linear-gradient(top, #FFFFFF 0%, #D3D8E8 100%);
/* Mozilla Firefox */ 
background-image: -moz-linear-gradient(top, #FFFFFF 0%, #D3D8E8 100%);
/* Opera */ 
background-image: -o-linear-gradient(top, #FFFFFF 0%, #D3D8E8 100%);
/* Webkit (Safari/Chrome 10) */ 
background-image: -webkit-gradient(linear, left top, left bottom, color-stop(0, #FFFFFF), color-stop(1, #D3D8E8));
/* Webkit (Chrome 11+) */ 
background-image: -webkit-linear-gradient(top, #FFFFFF 0%, #D3D8E8 100%);
/* W3C Markup, IE10 Release Preview */ 
background-image: linear-gradient(to bottom, #FFFFFF 0%, #D3D8E8 100%);
background-repeat: no-repeat;
background-attachment: fixed;
}
legend{
	color:#141823;
	font-size:25px;
	font-weight:bold;
}
.signup-btn {
  background: #79bc64;
  background-image: -webkit-linear-gradient(top, #79bc64, #578843);
  background-image: -moz-linear-gradient(top, #79bc64, #578843);
  background-image: -ms-linear-gradient(top, #79bc64, #578843);
  background-image: -o-linear-gradient(top, #79bc64, #578843);
  background-image: linear-gradient(to bottom, #79bc64, #578843);
  -webkit-border-radius: 4;
  -moz-border-radius: 4;
  border-radius: 4px;
  text-shadow: 0px 1px 0px #898a88;
  -webkit-box-shadow: 0px 0px 0px #a4e388;
  -moz-box-shadow: 0px 0px 0px #a4e388;
  box-shadow: 0px 0px 0px #a4e388;
  font-family: Arial;
  color: #ffffff;
  font-size: 20px;
  padding: 10px 20px 10px 20px;
  border: solid #3b6e22  1px;
  text-decoration: none;
}

.signup-btn:hover {
  background: #79bc64;
  background-image: -webkit-linear-gradient(top, #79bc64, #5e7056);
  background-image: -moz-linear-gradient(top, #79bc64, #5e7056);
  background-image: -ms-linear-gradient(top, #79bc64, #5e7056);
  background-image: -o-linear-gradient(top, #79bc64, #5e7056);
  background-image: linear-gradient(to bottom, #79bc64, #5e7056);
  text-decoration: none;
}
.navbar-default .navbar-brand{
		color:#fff;
		font-size:30px;
		font-weight:bold;
	}
.form .form-control { margin-bottom: 10px; }
@media (min-width:768px) {
	#home{
		margin-top:50px;
	}
	#home .slogan{
		color: #0e385f;
		line-height: 29px;
		font-weight:bold;
	}
}
    </style>
    </head>
    <body>

<!------ Include the above in your HEAD tag ---------->

<div class="container" id="wrap">
	  <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <form action="register" method="post" accept-charset="utf-8" class="form" role="form">   
                    <legend>Đăng kí</legend>
                    <h2 style="color: red">${requestScope.error}</h2>
                    <h4>Tên của bạn:</h4><input type="text" name="name" class="form-control input-lg" />   
                    <h4>Tài Khoản:</h4><input type="text" name="user" value="" class="form-control input-lg"  />
                    <h4>Mật khẩu:</h4><input type="password" name="pass" value="" class="form-control input-lg" />
                    <h4>Nhập lại mật khẩu:</h4><input type="password" name="rpass" value="" class="form-control input-lg"  />                                      
                    <h4>Bạn muốn gì:</h4>
                    <label class="radio-inline">
                        <input type="radio" name="job" value="1" checked="" />           Người mua
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="job" value="2" checked="" />          Người bán
                    </label>
                    <br/>
                    <h4>Số điện thoại:</h4><input type="text" name="phone"  class="form-control input-lg"  />   
                    <h4>Email:</h4><input type="text" name="email"  class="form-control input-lg"  />  
                    <h4>Địa chỉ</h4><input type="text" name="address"  class="form-control input-lg"  /> <br/>  
              <span class="help-block">By clicking Create my account, you agree to our Terms and that you have read our Data Use Policy, including our Cookie Use.</span>
                    <button class="btn btn-lg btn-primary btn-block signup-btn" type="submit">
                        Create my account</button>
            </form>          
          </div>
</div>            
</div>
</div>
    </body>
</html>
