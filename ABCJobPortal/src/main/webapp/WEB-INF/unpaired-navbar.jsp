  <!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="css/global.css">
    
    <%
   if ( session.getAttribute("pageTitle") == "ABC | Sign Up" || ( session.getAttribute("pageTitle") == "ABC | Log In")) { %>
	  <link rel="stylesheet" href="css/regLog.css">
   <% } %>
    
	<%
   if ( session.getAttribute("pageTitle") == "ABC | Forgot Password" || ( session.getAttribute("pageTitle") == "ABC | Reset Password")) { %>
	 <link rel="stylesheet" href="css/forgotPassword.css">
   <% } %>
	<link rel="stylesheet" href="css/confirmation.css">
	
	
	<link rel="icon" href="imgs/Logo.png" type="image/icon type">
    <title>${pageTitle}</title>
</head>

<body> 

<nav id="navbar" class="flex">
        <div id="navbarLeft" class="flex solo">
            <img src="imgs/Logo.png" alt="ABC Job Portal Logo">
            <h1 id="fullLogoText" class="logoText">ABC Job Portal</h1>
        </div>
    </nav>