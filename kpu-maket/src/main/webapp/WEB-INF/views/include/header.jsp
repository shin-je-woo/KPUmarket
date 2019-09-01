<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="${path}/resources/css/bootstrap.min.css">
<link rel="stylesheet" href="${path}/resources/css/style.css">

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href=${path }>KPU장터</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="#">중고책거래<span class="sr-only"></span></a></li>
        <li><a href="#">자취물품</a></li>
        <li><a href="#">자취방양도</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
      <!-- 로그인 세션 처리 -->
			<c:choose>
				<c:when test="${sessionScope.userid ==null}">
					<li class="nav-item"><a class="nav-link"
						href="#">로그인</a></li>
						<li class="nav-item"><a class="nav-link"
						href="${path}/member/signup.do">회원가입</a></li>
				</c:when>
				<c:otherwise>
					<li class="dropdown">
          				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">ㅇㅇ님<span class="caret"></span></a>
          				<ul class="dropdown-menu" role="menu">
            				<li><a href="#">회원정보수정</a></li>
            				<li><a href="#">로그아웃</a></li>
          				</ul>
        			</li>
				</c:otherwise>
			</c:choose>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<div style='line-height: 200%'>
	<br>
</div>