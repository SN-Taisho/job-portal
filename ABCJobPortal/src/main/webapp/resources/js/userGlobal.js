/* Open */
function openNav() {
	document.getElementById("myNav").style.height = "100%";
}

/* Close */
function closeNav() {
  document.getElementById("myNav").style.height = "0%";
}

function toggleUserDropDown() {
	var uO = document.getElementById("userOverlay");
	
	uO.classList.toggle("opened");
	
}