console.log("js connected");

const errorText = document.getElementById("errorText");

var numberRegex = /\d/;
var alphanumericRegex = /^[a-zA-Z]/

var accountVerification = document.getElementById("accVerif")

function checkValidationCode(event) {
	
	event.preventDefault;
	if (alphanumericRegex.test(accountVerification.value)) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Verification code can only contain numbers";
		accountVerification.style.outlineColor = "#ff5b5b";
		accountVerification.focus();
		
		return false;
	} else if (accountVerification.value.length < 6) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter the 6 digit verification code";
		accountVerification.style.outlineColor = "#ff5b5b";
		accountVerification.focus();
		
		return false;
		
	} else {
		errorText.style.visibility = "hidden";
		document.getElementById("accountVerificationForm").submit();
		
	}
	
	
}

var email = document.getElementById("email");
var emailRegex = /^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-]+)(\.[a-zA-Z]{2,5}){1,2}$/;

function finalEmailValidation(event) {
	
	event.preventDefault;
	if (emailRegex.test(email.value)) {
		email.style.outlineColor = "#2cb67d";
		errorText.style.visibility = "hidden";
		email.focus();
		return false;
		
	} else {	
		document.getElementById("forgotPasswordForm").submit();
		
	}
	
}

var password = document.getElementById("newPassword");
var passwordConfirm = document.getElementById("newPasswordConfirm");

function validateResetPassword() {
	
	if (passwordConfirm.value != password.value) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Your passwords don't match";
		passwordConfirm.style.outlineColor = "#ff5b5b";
		
	} else if (password.value != passwordConfirm.value) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Your passwords don't match";
		password.style.outlineColor = "#ff5b5b";
		
	} else if (password.value.length <= 6) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Min password length is 7 characters"
		password.style.outlineColor = "#ff5b5b";
		
	} else if (!numberRegex.test(password.value)) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Password must contain at least one number"
		password.style.outlineColor = "#ff5b5b";
		
	} else {
		password.style.outlineColor = "#2cb67d";
		errorText.style.visibility = "hidden";
	}
}

function validateNewPass(event) {
	
	event.preventDefault;
	if (passwordConfirm.value != password.value) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Your passwords don't match";
		passwordConfirm.style.outlineColor = "#ff5b5b";
		passwordConfirm.focus();
		return false;
		
	} else if (password.value != passwordConfirm.value) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Your passwords don't match";
		password.style.outlineColor = "#ff5b5b";
		password.focus();
		return false;
		
	} else if (password.value.length <= 6) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Min password length is 7 characters"
		password.style.outlineColor = "#ff5b5b";
		password.focus();
		return false;
		
	} else if (!numberRegex.test(password.value)) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Password must contain at least one number"
		password.style.outlineColor = "#ff5b5b";
		password.focus();
		return false;
		
	} else {
		errorText.style.visibility = "hidden";
		document.getElementById("resetPasswordForm").submit();
		
	}
	
}