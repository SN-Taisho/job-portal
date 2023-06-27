<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link rel="stylesheet" href="css/global.css">
    <link rel="stylesheet" href="css/userGlobal.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    
    <link rel="icon" href="imgs/Logo.png" type="image/icon type">
    <title>${pageTitle}</title>
</head>

<body>	

<div id="myNav" class="overlay">
  
   <div class="overlay-content font">
   <a class="closeBtn" onclick="closeNav()">Close</a>
   <br>
   
   <%
   if ((Boolean) session.getAttribute("isLogin") != null && session.getAttribute("roleId").equals("1")) { %>
	   <a href="<%=request.getContextPath()%>/admin-dashboard">Admin Dashboard</a>
   <% } %>
   
    <a href="<%=request.getContextPath()%>/search">Search</a>
    <a href="<%=request.getContextPath()%>/messages">Messages</a>
   	<a href="<%=request.getContextPath()%>/notifications">Notifications</a>
    <a href="<%=request.getContextPath()%>/user-homepage">Home</a>
    
  </div>
  
  </div>

<nav id="uNavbar" class="flex">
    
       <div id="uNavbarLeft" class="flex">
       		<img id="logo" src="imgs/Logo.png" alt="ABC Job Portal Logo">
       		<h1 id="logoText" class="logoText">ABC Job Portal</h1>
       		<h1 id="shortLogoText" class="logoText" style="display: none;">ABC Jobs</h1>
       </div>
       
       <div id="uNavbarRight" class="flex">
       	<ul id="uVavLinks" class="font flex">
       		<%
	   if ((Boolean) session.getAttribute("isLogin") != null && session.getAttribute("roleId").equals("1")) { %>
		   <li ><span class="material-icons navbarIcons">admin_panel_settings</span><a href="<%=request.getContextPath()%>/admin-dashboard">Admin</a></li>
	   <% } %>
       		<li><span class="material-icons navbarIcons">search</span><a href="<%=request.getContextPath()%>/search">Search</a></li>
       		<li><span class="material-icons navbarIcons">message</span><a href="<%=request.getContextPath()%>/messages">Messages</a></li>
       		<li><span class="material-icons navbarIcons">notifications</span><a href="<%=request.getContextPath()%>/notifications">Notifications</a></li>
       		<li><span class="material-icons navbarIcons">home</span><a href="<%=request.getContextPath()%>/user-homepage">Home</a></li>
       	</ul>
       		<span id="openNavBtn" class="material-icons generalIcons" onclick="openNav()">menu</span>
       		<a onclick="toggleUserDropDown()"><span id="profileIcon" class="material-icons">account_circle</span></a>
       </div>
       
</nav>

<div id="userOverlay">
	<a id="viewProfileBtn" href="<%=request.getContextPath()%>/user-profile">View Profile</a>
	<a id="editProfileBtn" href="<%=request.getContextPath()%>/edit-profile">Edit Profile</a>
	<a id="logOutBtn" href="<%=request.getContextPath()%>/log-out">Log out</a>
</div>
    
  