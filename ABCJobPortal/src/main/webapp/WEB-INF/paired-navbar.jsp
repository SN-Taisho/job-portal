<!-- paired navbar -->
  <!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="css/global.css">
	
	<link rel="icon" href="imgs/Logo.png" type="image/icon type">
    <title>${pageTitle}</title>
    
</head>

<body> 
    <nav id="navbar" class="flex">
        <div id="navbarLeft" class="flex paired">
            <img src="imgs/Logo.png" alt="ABC Job Portal Logo">
            <h1 id="fullLogoText" class="logoText">ABC Job Portal</h1>
            <h1 id="shortLogoText" class="logoText">ABC Jobs</h1>
        </div>
        
        <ul class="flex">
            <li><a href="<%=request.getContextPath()%>/log-in" id="homeLoginBtn" class="font primaryBtn btnShape1">Log In</a></li>
            <li><a href="<%=request.getContextPath()%>/sign-up" id="homeSignInBtn" class="font secondaryBtn btnShape2">Sign Up</a></li>
        </ul>
    </nav>