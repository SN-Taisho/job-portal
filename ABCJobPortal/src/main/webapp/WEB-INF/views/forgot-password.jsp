<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    <!-- unpaired navbar -->
    
    <jsp:include page="../unpaired-navbar.jsp"></jsp:include>

    <main class="flex">

        <div class="left-sidefp flex">
        
            <section>
     		
     		<h3 class="font">Forgot Password</h3>
     		
     		<span id="errorText" class="font">${error}</span>
     		
     		<form:form id="forgotPasswordForm" action="forgot-password" method="post" onsubmit="return finalEmailValidation(event)">
     		
			<fieldset class="form-group font">
					<label>Email Address</label> 
					<br>
					<input id="email" class="font" type="text" name="email" onkeydown="validateEmail()" maxlength="255">
			</fieldset>
     		
     		<button type="submit" id="forgotBtn" class="secondaryBtn">Submit</button>
			
     		</form:form>
     		
     		</section>
     		
        </div>

        <div class="right-side flex">
        
        <img src="svgs/undraw_forgot_password_re_hxwm.svg" height="600px" width="600px">
     	
        </div>

    </main>
	
    <jsp:include page="../footer.jsp"></jsp:include>
    
    