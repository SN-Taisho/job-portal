<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <jsp:include page="../user-navbar.jsp"></jsp:include>
    

	<div id="userHomeArea" class="flex userProfile">
		
		<div id="userTimeline" class="flex">
		
		<div id="userProfileCard" class="flex">
		
			<div id="mainProfileContent" class="flex">
				<img id="mainUserProfilePicture" src="imgs/ProfilePicture.jpg">
					<div class="flex">
					<h6 id="userFullName" class="font" >${fullName}</h6>
					
				</div>
			</div>
			<h6 id="titleAndCompany" class="font profileLower highlight2">${titleAndCompany}</h6>
			<h6 id="cityAndCountry" class="font profileLower">Lives in <span class="highlight1">${cityAndCountry}</span></h6>
			<p id="userBio" class="font profileLower">${bio}</p>
		
			<button id="editProfileBtn" class="font" onclick="window.location='<%=request.getContextPath()%>/edit-profile'">Edit Profile</button>
	
		</div>
		
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