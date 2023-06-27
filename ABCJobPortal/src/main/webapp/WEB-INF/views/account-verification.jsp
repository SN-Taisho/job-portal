<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

    <!-- unpaired navbars -->
    <jsp:include page="../unpaired-navbar.jsp"></jsp:include>

    <main class="flex">

        <div class="left-side flex">
            <img src="svgs/undraw_secure_login_pdn4.svg" height="600px" width="600px">
        </div>

        <div class="right-side flex">
     		<section>
     		
     		<h3 class="font">Verify Account</h3>
     		<span id="errorText" class="font" style="visibility: hidden"></span>
     		
     		<form:form id="accountVerificationForm" onsubmit="return checkValidationCode(event)">
     		
			<fieldset class="form-group font flex">
					<label>Type the Verification code sent to your email</label> 
					<br>
					<br>
					<input id="accVerif" class="font" 
					type="text" maxlength="6"/>
			</fieldset>
     		
     		<div id="submitVerif" class="flex font">
     		<button type="submit" id="verifyBtn" class="primaryBtn">Verify</button>
     		</div>
     		
     		</form:form>
     		</section>
        </div>

    </main>

    <jsp:include page="../footer.jsp"></jsp:include>