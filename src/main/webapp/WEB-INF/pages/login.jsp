<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="favicon.ico">

    <title>Signin Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/assets/css/bootstrap.min.css"/>" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/css/signin.css"/>" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <!--<script src="assets2/js/ie-emulation-modes-warning.js"></script>-->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <div class="container">
    <div class="row">
        <div class="col-md-3 col-md-offset-4">
            <div class="account-box">
                <div class="logo ">
                    <img src="http://placehold.it/90x38/fff/6E329D&text=LOGO" alt=""/>
                </div>
                <form class="form-signin" action="#">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Email" required autofocus />
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="Password" required />
                </div>
                <label class="checkbox">
                    <input type="checkbox" value="remember-me" />
                    Keep me signed in
                </label>
                <button class="btn btn-lg btn-block purple-bg" type="submit">
                    Sign in</button>
                </form>
                <a class="forgotLnk" href="http://www.jquery2dotnet.com">I can't access my account</a>
                <div class="or-box">
                    <span class="or">OR</span>
                    <div class="row">
                        <div class="col-md-6 row-block">
                            <a href="http://www.jquery2dotnet.com" class="btn btn-facebook btn-block">Facebook</a>
                        </div>
                        <div class="col-md-6 row-block">
                            <a href="http://www.jquery2dotnet.com" class="btn btn-google btn-block">Google</a>
                        </div>
                    </div>
                </div>
                <div class="or-box row-block">
                    <div class="row">
                        <div class="col-md-12 row-block">
                            <a href="http://www.jquery2dotnet.com" class="btn btn-primary btn-block">Create New Account</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

  
  


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="assets2/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
