<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

    <!-- unpaired navbars -->
    <jsp:include page="../user-navbar.jsp"></jsp:include>
    

	<div id="userHomeArea" class="flex userProfile">
		
		<div id="userProfileCard" class="flex">
		
			<div id="mainProfileContent" class="flex">
				<img id="mainUserProfilePicture" src="imgs/defaultUser.png">
					<div class="flex">
					<h6 id="userFirstName" class="font" >${fullName}</h6>
				</div>
			</div>
			
		<h6 id="cityAndCountry" class="font profileLower">${cityAndCountry}</h6>
		<h6 id="occupation" class="font profileLower">${title}</h6>
		<p id="userBio" class="font profileLower">${bio}</p>
		
		</div>
		
	<section id="followSuggestions">
	
		<div class="suggestionCotainer flex">
			<img src="imgs/defaultUser.png">
			<div class="suggestionName flex">
				<span class="font bold">User 1</span>
				<span class="font">Occupaiton</span>
			</div>
			<button class="followBtn font bold">+ follow</button>
		</div>
		
		<div class="suggestionCotainer flex">
			<img src="imgs/defaultUser.png">
			<div class="suggestionName flex">
				<span class="font bold">User 2</span>
				<span class="font">Occupaiton</span>
			</div>
			<button class="followBtn font bold">+ follow</button>
		</div>
		
		<div class="suggestionCotainer flex">
			<img src="imgs/defaultUser.png">
			<div class="suggestionName flex">
				<span class="font bold">User 3</span>
				<span class="font">Occupaiton</span>
			</div>
			<button class="followBtn font bold">+ follow</button>
		</div>
	
	</section>
	
	</div>
	
     <jsp:include page="../footer.jsp"></jsp:include>
     
</body>
    <script type="text/javascript" src="resources/js/userGlobal.js"></script>
</html>