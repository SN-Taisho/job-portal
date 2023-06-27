<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!-- unpaired navbars -->
    <jsp:include page="../user-navbar.jsp"></jsp:include>

	<div id="userHomeArea" class="flex userEditProfile">
		
		<div id="userTimeline" class="flex">
		
		<div id="editProfileBakcground" class="flex">
			<div id="editProfileCard" class="flex">
			
				<form:form id="userEditProfileForm" class="flex font" 
				modelAttribute="profile" action="save-user-changes" method="post">
					
					<input type="hidden" name="uId" value="${uId}">
					
					<fieldset class="flex">
						<label>First Name</label>
						<input name="userFirstName" type="text" value="${firstName}">
					
						<label>Last Name</label>
						<input name="userLastName" type="text" value="${lastName}">
					</fieldset>
					
					<fieldset class="flex">
						<label>City</label>
						<input name="userCity" type="text" value="${city}">
				
						<label>Country</label>
						<input name="userCountry" type="text" value="${country}">
					</fieldset>
					
					<fieldset class="flex">
						<label>Occupation</label>
						<input name="userOccupation" type="text" value="${title}">
						<label>Company</label>
						<input name="userCompany" type="text" value="${company}">
						<label>Bio</label>
						<input name="userBio" type="text" value="${bio}">
					</fieldset>
					
				</form:form>
				
				
				
			</div>
			<div id="editProfileBtns" class="flex font">
				<button id="editSaveBtn" type="submit" form="userEditProfileForm">Save</button>
				<button id="editCancelBtn" onclick="window.location='<%=request.getContextPath()%>/admin-dashboard'">Cancel</button>
			</div>
			
		</div>
		
		</div>
		
	</div>
	
     <jsp:include page="../footer.jsp"></jsp:include>