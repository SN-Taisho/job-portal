<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!-- unpaired navbars -->
    <jsp:include page="../unpaired-navbar.jsp"></jsp:include>

    <main class="flex conf">
    
		<img alt="" src="svgs/undraw_authentication_re_svpt.svg">
		
		<div class="flex">
		<h6 class="font">Your account has been <span>successfully confirmed</span></h6>
		<p class="font" >Thank you for joining ABC Job Portal</p>
      	</div>
      	
      	<a class="primaryBtn btnShape1 font" href="<%=request.getContextPath()%>/log-in" >Login</a>

    </main>

    <jsp:include page="../footer.jsp"></jsp:include>