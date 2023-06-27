<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!-- unpaired navbar -->
    <jsp:include page="../user-navbar.jsp"></jsp:include>

	<div id="userHomeArea" class="flex ">
		
	<aside id="miniProfile">
	
		<div id="userInfoPannel" class="flex">
			<img id="userProfilePicture" src="imgs/ProfilePicture.jpg">
			<div id="nameContainer">
				<h6 id="userFirstName" class="font" >${firstName}</h6>
				<h6 id="userLastName" class="font">${lastName}</h6>
				<h6 id="occupation" class="font">${titleAndCompany}</h6>
			</div>
		</div>
		
		<h6 id="cityAndCountry" class="font">${cityAndCountry}</h6>
		<p id="userBio" class="font">${bio}</p>
		
	</aside>
	
	<main class="flex">
		<div id="createPostSection">
			<form id="postForm" action="" class="flex">
			
			<textarea rows="3" class="font">Create a post</textarea>
			
			<button type="submit">Post</button>
			
			</form>
			<div id="postMedia">
				<ul class="flex font">
					<li><span class="material-icons generalIcons">image</span>Image</li>
					<li><span class="material-icons generalIcons">video_library</span>Video</li>
					<li><span class="material-icons generalIcons">event</span>Event</li>
				</ul>
			</div>
		</div>
		
		<div id="userFeed">
			<div class="samplePost">
			
				<div class="posterInfo flex"> 
				
					<img class="posterProfilePicture" src="imgs/ProfilePicture.jpg">
					<h5 class="posterName font">Elon Musk</h5>
				</div>
				
				<img class="postImage" src="imgs/samplePost.jpg">
				<span class="postDate font">Feb 27, 2023</span>
				<p class="font">Among other enhancements, V2 minis are equipped with new argon Hall thrusters for on orbit maneuvering</p>
				
			</div>
		</div>
	
	</main>
	
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