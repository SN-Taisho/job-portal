console.log("js connected");

const errorText = document.getElementById("errorText");

var numberRegex = /\d/;
var alphanumericRegex = /^([a-z]*\d[a-z0-9]*|[a-z]+\d+[a-z0-9]*){50,}$/i;
var fName = document.getElementById("firstName");
var lName = document.getElementById("lastName");
var emailRegex = /^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-]+)(\.[a-zA-Z]{2,5}){1,2}$/;
var email = document.getElementById("email");
var password = document.getElementById("password");
var city = document.getElementById("city");
var country = document.getElementById("country");
	
	
function validateName() {
	
	if (fName.value.length <= 1) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter a name exceeding one character"
		fName.style.outlineColor = "#ff5b5b";
		
	} else if (fName.value.length == 50) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Max character length is 50"
		fName.style.outlineColor = "#ff5b5b";
		
	} else if (alphanumericRegex.test(fName.value)) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter a valid name"
		fName.style.outlineColor = "#ff5b5b";
		
	} else if (numberRegex.test(fName.value)) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter a valid name"
		fName.style.outlineColor = "#ff5b5b";
		
	} else {
		errorText.style.visibility = "hidden";
		fName.style.outlineColor = "#2cb67d";
		
	}
}

function validateLastName() {
	
	if (lName.value.length <= 1) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter a name exceeding one character"
		lName.style.outlineColor = "#ff5b5b";
		
	} else if (lName.value.length == 50) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Max character length is 50"
		lName.style.outlineColor = "#ff5b5b";
		
	} else if (alphanumericRegex.test(lName.value)) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter a valid name"
		lName.style.outlineColor = "#ff5b5b";
		
	} else if (numberRegex.test(lName.value)) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter a valid name"
		lName.style.outlineColor = "#ff5b5b";
		
	} else {
		errorText.style.visibility = "hidden";
		lName.style.outlineColor = "#2cb67d";
		
	}
}

function validateEmail() {

	if (emailRegex.test(email.value)) {
		email.style.outlineColor = "#2cb67d";
		errorText.style.visibility = "hidden";
		
	} else {
		email.style.outlineColor = "#ff5b5b";
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter a valid email"
		
	}
}

function validatePassword() {
	
	if (password.value.length <= 6) {
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

function validateCity() {
	
	if (city.value.length < 1) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter your city"
		city.style.outlineColor = "#ff5b5b";
		
	} else {
		city.style.outlineColor = "#2cb67d";
		errorText.style.visibility = "hidden";
		
	}
}

function validateCountry() {
	
	if (country.value.length < 1) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter your country"
		country.style.outlineColor = "#ff5b5b";
		
	} else if (numberRegex.test(country.value)) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Your country cannot contain any numbers"
		country.style.outlineColor = "#ff5b5b";
		
	} else {
		country.style.outlineColor = "#2cb67d";
		errorText.style.visibility = "hidden";
		
	}
}

function finalValidation(event) {
	
	event.preventDefault;
	if (fName.value == "") {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter your first name"
		fName.style.outlineColor = "#ff5b5b";
		fName.focus();
		return false;
		
	} else if (lName.value == "") {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter your last name"
		lName.style.outlineColor = "#ff5b5b";
		lName.focus();
		return false;
		
	} else if (email.value == "") {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter your email address"
		email.style.outlineColor = "#ff5b5b";
		email.focus();
		return false;
		
	} else if (password.value == "") {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter a password"
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
		
	} else if (!emailRegex.test(email.value)) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter a valid email"
		password.style.outlineColor = "#ff5b5b";
		email.focus();
		return false;
		
	} else if (fName.value.length <= 1) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter a name exceeding one character"
		fName.style.outlineColor = "#ff5b5b";
		fName.focus();
		return false;
		
	} else if (numberRegex.test(fName.value)) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter a valid name"
		fName.style.outlineColor = "#ff5b5b";
		fName.focus();
		return false;
		
	} else if (lName.value.length <= 1) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter a name exceeding one character"
		lName.style.outlineColor = "#ff5b5b";
		lName.focus();
		return false;
		
	} else if (numberRegex.test(lName.value)) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter a valid name"
		lName.style.outlineColor = "#ff5b5b";
		lName.focus();
		return false;
		
	} else if (city.value.length < 1 || city.value == "") {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter your city"
		city.style.outlineColor = "#ff5b5b";
		city.focus();
		return false;
		
	} else if (country.value.length < 1 || country.value == "") {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Please enter your country"
		country.style.outlineColor = "#ff5b5b";
		country.focus();
		return false;
		
	} else if (numberRegex.test(country.value)) {
		errorText.style.visibility = "visible";
		errorText.innerHTML = "Your country cannot contain any numbers"
		country.style.outlineColor = "#ff5b5b";
		country.focus();
		return false;
		
	} else {
		errorText.style.visibility = "hidden";
		document.getElementById("signUpForm").submit();
	}
	
}

