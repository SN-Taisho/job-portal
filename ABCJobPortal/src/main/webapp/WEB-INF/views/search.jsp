<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	
    <!-- unpaired navbars -->
    <jsp:include page="../user-navbar.jsp"></jsp:include>


	<div id="userHomeArea" class="flex">
	
	<main id="searchArea" class="flex">
		
		<form id="searchBar" class="flex" action="" method="get">
		
		
		<input name="search" class="font" placeholder="search"
		value="<%= request.getParameter("search") != null ? request.getParameter("search") : "" %>"
		>
		<button type="submit"><span class="material-icons generalIcons">search</span></button>
		</form>
 			
		
		
		<div id="searchResults" class="flex">
			
			
				<h6 class="font">${notFound == true ? "No User Found" : ""}</h6>
		
			
		<c:forEach var="s" items="${selected}">
			<div id="searchResultItem" class="font">
			
				<h6>${s.getUserFirstName()} ${s.getUserLastName()}</h6>
				<br>
				<span class="font">${s.getUserCity()} ${s.getUserCountry()} 
				 |  ${s.getUserOccupation()} in ${s.getUserCompany()}</span>
				
				<form:form action="result" method="post">
				
				<input type="hidden" name="uId" value="${s.getUserId()}">
				<button id="resultView" type="submit">View Profile</button>
				
				</form:form>

			</div>
		</c:forEach>
		
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