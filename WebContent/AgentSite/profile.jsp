<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList"%>
<%@page import="modele.*"%>
<%@page import="classe.*"%>
<!DOCTYPE html>
<html>
<head>

	<!-- Style Sheets -->
	<link rel="stylesheet" href="../Semantic-UI-master/dist/semantic.css">
	<link rel="stylesheet" href="../Semantic-UI-master/dist/components/transition.css">
	<link rel="stylesheet" href="../css/styles.css">
	<!-- End of Style Sheets -->
	<title>GuidiNa | Agent | Profile</title>
	
	<!-- Script -->
	<script src="../js/jquery.js">
</script>
<script src="../Semantic-UI-master/dist/semantic.js">
</script>
<script src="../js/main.js">
</script>
<style type="text/css">
	.container-1{
		margin: 25px !important;
	}
</style>

	<!-- End of Script -->
	<meta charset="UTF-8">
</head>
<body>
		
	<%if(request.getSession().getAttribute("ag") != null){ %>
	
<div class="container-1">
	<div class="ui center aligned image tiny">
		<img class="" src="../pics/logo.png">
	</div>
	<div class="ui grid">
		<div class="four wide column">
			<%@include file="Components/profile-card-info.jsp" %>
			<%@include file="Components/function.jsp" %>
		</div>
		<div class="twelve wide column">
			
			<%@include file="Components/main-stuff.jsp" %>
			<%@include file="Components/services.jsp" %>
		</div>
	</div>
</div>
	<%}else{
		response.sendRedirect("index.jsp");
		}
		%>
		
		<%@include file="Forms/circuits.jsp" %>
		<%@include file="Forms/manifestation.jsp" %>
		<%@include file="Forms/sites.jsp" %>
		
		<%@include file="Forms/hotel.jsp" %>
		
		
<script>
$('.ui.accordion')
.accordion()
;

$(function(){
	$("#circuit-add").click(function(){
		$(".circuit-add").modal('show');
	});
	$(".ui.modal").modal({
		closable: true
	});
});

$(function(){
	$("#manifest-add").click(function(){
		$(".manifest-add").modal('show');
	});
	$(".ui.modal").modal({
		closable: true
	});
});

$(function(){
	$("#site-add").click(function(){
		$(".site-add").modal('show');
	});
	$(".ui.modal").modal({
		closable: true
	});
});

$(function(){
	$("#hotel-add").click(function(){
		$(".hotel-add").modal('show');
	});
	$(".ui.modal").modal({
		closable: true
	});
});


</script>
</body>
</html>