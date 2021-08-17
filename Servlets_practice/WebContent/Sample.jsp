<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
 <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <!-- Required bootstrap css -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
   <!-- Optional JS but first jquery need to be add -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Register Page</title>
<script>
$(document).ready(function () {
   $("#ConfirmPassword").on('keyup', function(){
    var password = $("#Password").val();
    var confirmPassword = $("#ConfirmPassword").val();
    if (password != confirmPassword)
        $("#CheckPasswordMatch").html("Password does not match !").css("color","red");
    else
        $("#CheckPasswordMatch").html("Password match !").css("color","green");
   });
});
</script>
<style>
.banner_image {
    padding-top: 110px;
     padding-bottom: 100px;
     background: url("https://blog.policyexpert.co.uk/wp-content/uploads/2013/11/iStock-628925952-1024x388.jpg") no-repeat center center;
     background-size: cover;
    }
   
 .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
     footer {
    padding: 10px 0;
      background-color: #101010;
    color:#9d9d9d;
     margin-top:30px;
     bottom: 0;
     width: 100%;
    
    }
</style>
</head>
<body>
 <nav class="navbar navbar-inverse ">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    <a href="MainHome.jsp" class="navbar-brand" >PetShop</a>
                </div>
                    <div class="collapse navbar-collapse" id="myNavbar">
                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="Login.jsp"><span class="glyphicon glyphicon-log-in"></span>&nbsp;Login</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
            <div class ="banner_image">
            </div>
        </div>
            <div class="container">
             <h2>Register</h2>
                        <form action="RegisterServletController" method="post">
                            <div class="form-group">
                                <label for="username">Name:</label>
                                <input type="text" class="form-control" placeholder="Name" name="username"  required = "true">
                            </div>
                            <div class="form-group">
                                <label for="userpassword">Password:</label>
                                <input type="password" class="form-control" placeholder="Password" id="Password" name="userpassword"  required = "true">
                            </div>
                             <div class="form-group">
                                 <label for="confirmuserpassword">Confirm Password:</label>
                                <input type="password" class="form-control"  placeholder="ConfirmPassword"  id="ConfirmPassword" name="confirmuserpassword" required = "true">
                            </div>
                            <div style="margin-top: 3px;" id="CheckPasswordMatch"></div>
                            <input type="submit" value="Submit" class="btn btn-primary">
                        </form>
            <footer>
                <div class="container">
                        <center>
                    <p>Copyright © PetPeers All Rights Reserved and Contact Shubham Pandey</p>
                    </center>
            </div>
            </footer>
            </div>
          
</body>
</html>