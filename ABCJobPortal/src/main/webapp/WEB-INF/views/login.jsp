<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!-- unpaired navbar -->
    <jsp:include page="../unpaired-navbar.jsp"></jsp:include>

    <main class="flex">

        <div class="left-side flex">
            <img src="svgs/undraw_secure_login_pdn4.svg" height="600px" width="600px">
        </div>

        <div class="right-side flex">
     		<section>
     		
     		<h3 class="font">Log In</h3>
     		<span id="errorText" class="font">${error}</span>
     		
     		<form:form method="post" action="log-in" id="logInForm">
     		
			<fieldset class="form-group font">
					<label>Email</label> 
					<br>
					<input id="email" class="font" 
					type="text" name="email" onkeydown="validateEmail()" maxlength="255"/>
			</fieldset>
			<fieldset class="form-group font">
					<label>Password</label> 
					<br>
					<input id="password" class="font" 
					type="password" name="password" maxlength="14"/>
			</fieldset>
     		
     		<div id="submit" class="flex font">
     		<a href="<%=request.getContextPath()%>/forgot-password">Forgot your password?</a>
     		<button type="submit" id="logInBtn" class="primaryBtn btnShape1">Log In</button>
     		</div>
     		
     		</form:form>
     		</section>
        </div>

    </main>

    <jsp:include page="../footer.jsp"></jsp:include>
    
    