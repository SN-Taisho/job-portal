<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!-- unpaired navbars -->
    <jsp:include page="../user-navbar.jsp"></jsp:include>

	<div id="dashboardArea" class="flex">
	
		<h1 class="font">Admin Dashboard</h1>
	
	<div id="userTable" class="flex">
		
		<table class="font">
		
		
			  <tr class="highlight1">
			    <th>User Id</th>
			    <th>Name</th>
			    <th>City</th>
			    <th>Country</th>
			    <th>Occupation</th>
			    <th>Company</th>
			    <th>Actions</th>
			  </tr>
			  
			  <%int i = 1; %>
			  <c:forEach var="s" items="${users}">
			  
			  	<tr>
					<th><%= i++ %></th>
					<th>${s.getUserFirstName()} ${s.getUserLastName()}</th>
					<th>${s.getUserCity()}</th>
					<th>${s.getUserCountry()}</th>
					<th>${s.getUserOccupation()}</th>
					<th>${s.getUserCompany()}</th>
					<th>
					
					<form action="view" method="post">
					<input type="hidden" name="uId" value="${s.getUserId()}">
					<button class="adminActionBtn" type="submit">View</button>
					</form>
					
					<button id="delUserBtn" onclick="window.location='<%=request.getContextPath()%>/delete/${s.getUserId()}'">Delete</button>
					
					</th>
				</tr>
				
			  </c:forEach>
			  
			  
		</table>
	</div>
	
	</div>
	
     <jsp:include page="../footer.jsp"></jsp:include>