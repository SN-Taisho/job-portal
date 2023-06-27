<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    <!-- unpaired navbar -->
    
    <jsp:include page="../unpaired-navbar.jsp"></jsp:include>

    <main class="flex">

        <div class="left-side flex">
        
            <section>
     		
     		<h3 class="font">Reset Password</h3>
     		
     		<span id="errorText" class="font">Please enter your new password</span>
     		
     		<form:form id="resetPasswordForm" name="forgotPassword" 
     		action="reset-password" method="post" onsubmit="return validateNewPass(event)">
     		
			<fieldset class="form-group font">
					<label>Enter your new password</label> 
					<br>
					<input id="newPassword" class="font" type="password" name="password" onkeydown="validateResetPassword()" maxlength="14">
			</fieldset>
			<fieldset class="form-group font">
					<label>Confirm your new password</label> 
					<br>
					<input id="newPasswordConfirm" class="font" type="password" onkeydown="validateResetPassword()" maxlength="14">
			</fieldset>
     		
     		<button type="submit" id="forgotBtn" class="secondaryBtn">Submit</button>

     		</form:form>
     		</section>
     		
        </div>

        <div class="right-side flex">
        
        <img src="svgs/undraw_my_password_re_ydq7.svg" height="600px" width="600px">
     		
        </div>

    </main>
	<script type="text/javascript" src="js/verification.js"></script>
    <jsp:include page="../footer.jsp"></jsp:include>
    
    