<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

    <!-- unpaired navbar -->
    <jsp:include page="../unpaired-navbar.jsp"></jsp:include>

    <main class="flex">

        <div class="left-side flex">
            <img src="svgs/undraw_join_re_w1lh.svg" height="600px" width="600px">
        </div>

        <div class="right-side flex">
     		<section>
     		
     		<h3 class="font">Sign Up</h3>
     		<span id="errorText" class="font" style="visibility: hidden"></span>
     		
     		<form:form method="post" name="myForm" action="sign-up" id="signUpForm" onsubmit="return finalValidation(event)">
     		
			<!-- <input type="hidden" name="User_Id"/> -->
					
     		<fieldset class="form-group font">
					<label>First Name</label> 
					<br>
					<input id="firstName" class="font" 
					type="text" name="firstName" onkeydown="validateFirstName()" maxlength="50"/>
			</fieldset>
			<fieldset class="form-group font">
					<label>Last Name</label> 
					<br>
					<input id="lastName" class="font" 
					type="text" name="lastName" onkeydown="validateLastName()" maxlength="50"/>
			</fieldset>
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
					type="password" name="password" onkeydown="validatePassword()" maxlength="14"/>
			</fieldset>
     		
     		
     		<div id="submit" class="flex font">
     		
     		<a href="<%=request.getContextPath()%>/log-in">Already have an account?</a>
     		<button type="submit" id="signUpBtn" class="secondaryBtn btnShape2">Sign Up</button>
     		
     		</div>
     		
     		</form:form>
     		</section>
        </div>

    </main>

    <jsp:include page="../footer.jsp"></jsp:include>
    
    