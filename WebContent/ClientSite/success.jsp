<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
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
	<title>GuidiNa | Client</title>
	
	<!-- Script -->
	<script src="../js/jquery.js">
</script>
<script src="../Semantic-UI-master/dist/semantic.js">
</script>
<script src="../js/main.js">
</script>
	<style>
footer {
        position: absolute;
        bottom: 0;
        width: 100%;
        height: 60px;
        padding-top: 20px;
        padding-bottom: 20px;
        background-color: #f5f5f5;
        margin-top: 0;
        margin-bottom: 0;
      }

</style>
	<!-- End of Script -->
	<meta charset="UTF-8">
</head>
	<body>
		
	
	
	<!-- Navigation -->
		<nav class="ui large top fixed hidden menu">
		  <div class="ui container">
		  	<a class="item" href="../StatsServlet"><img src="../pics/logo.png"></a>
		    <a class="item" href="../VoyagesServlet">Voyages</a>
		    <a class="item" href="../ManifestationServlet">Manifestations Culturelle</a>
		    <a class="item" href="../SiteTouristiqueServlet">Sites Touristiques</a>
		    <a class="item" href="../OffresServlet">Offres</a>
		    <%if(request.getSession().getAttribute("client") == null){ %>
		    <div class="right menu">
		       <div class="item">
		        <a class="ui button" id="signins">Log in</a>
		      </div>
		      <div class="item">
		        <a class="ui primary button" id="signups">Sign Up</a>
		      </div>
		    </div>
		    <%}else{ %>
		    
		    <%
				Client cl = new Client();
				cl = (Client) session.getAttribute("client");
			%>
		    <div class="right menu">
		        <div class="item">
		        	<div class="ui dropdown">
		        		<img class="ui avatar image" src="<%=cl.getImage()%>"> <%= cl.getNom() %>
		        		<i class="icon dropdown"></i>
		        		<div class="menu">
		        			<div class="item"><a href="../ProfileRouterServlet">Profile</a></div>
		        			<div class="item"><a href="../LogoutServlet">Logout</a></div>
		        		</div>
		        	</div>
		    	</div>
		    </div>
		    <%} %>
		  </div>
		</nav>
		
		<!-- End Of Navigation -->
	
		<div class="ui middle aligned center aligned grid">
			<div class="row"></div>
			<div class="three column row">
				<div class="column">
					<div class="ui positive message nos-voyages">
						<div class="header">
							Yaaaaaaay !!!!
						</div>
						<p>
							Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
							Nam sed justo in neque blandit vulputate. 
						</p>
					</div>
				</div>
			</div>
		</div>
	
			
		<!-- Start of #voyages the Footer -->
		<footer>
			<div class="ui inverted vertical footer segment">
			    <div class="ui center aligned container">
			      <img src="../pics/logo.png" class="ui centered mini image">
			      <div class="ui horizontal inverted small divided link list">
			        <a class="item" href="#">Contact Us</a>
			        <a class="item" href="#">Terms and Conditions</a>
			        <a class="item" href="#">Privacy Policy</a>
			      </div>
			    </div>
			  </div>
		</footer>

<script>
$('.dropdown').dropdown();
$(function(){
	$("#signups").click(function(){
		$(".sign-up").modal('show');
	});
	$(".ui.modal").modal({
		closable: true
	});
});

$(function(){
	$("#signins").click(function(){
		$(".sign-in").modal('show');
	});
	$(".ui.modal").modal({
		closable: true
	});
});
</script>
	</body>
</html>