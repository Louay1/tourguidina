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
	<title>GuidiNa | Admin | Profile</title>
	
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
		<%if(request.getSession().getAttribute("ad") != null){ %>
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
			<%@include file="Components/just-stuff.jsp" %>
			<%@include file="StatsVis/stats.jsp" %>
		</div>
	</div>
</div>
		<%}else{ %>
		
		<%
			response.sendRedirect("index.jsp");
		} %>
		
		
		<%@include file="Forms/voyage.jsp" %>
		<%@include file="Forms/offre.jsp" %>
		
		
		
		
<script>
$('.ui.accordion')
.accordion()
;

$(function(){
	$("#voyage-add").click(function(){
		$(".voyage-add").modal('show');
	});
	$(".ui.modal").modal({
		closable: true
	});
});

$(function(){
	$("#off-add").click(function(){
		$(".off-add").modal('show');
	});
	$(".ui.modal").modal({
		closable: true
	});
});



</script>
</body>
</html>