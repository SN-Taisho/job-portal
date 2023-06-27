<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!-- paired navbar -->
    <jsp:include page="../paired-navbar.jsp"></jsp:include>

    <main id="homePage" class="flex">

        <div id="homePageLeft" class="flex">

            <h3 class="font">Code you correct,<br><strong id="pwc">people we connect</strong></h3>

            <p class="font"><span>Develop your future</span> and <span>connect with great opportunities</span>, join the
                leading community in software engineering</p>

            <button id="joinUsBtn" class="secondaryBtn" onclick="window.location='<%=request.getContextPath()%>/sign-up'">Join Us</button>

        </div>

        <div id="homePageRight">

            <img src="svgs/undraw_team_up_re_84ok.svg">

        </div>

    </main>

    <jsp:include page="../footer.jsp"></jsp:include>

