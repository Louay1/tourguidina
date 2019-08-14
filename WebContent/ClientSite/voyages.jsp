<%@ page language="java" contentType="text/html; charset=UTF-8" 
		pageEncoding="UTF-8"%>
		
		<%@page import="java.util.ArrayList"%>
		<%@page import="classe.*"%>
		<%@page import="modele.*"%>
<!DOCTYPE html>
<html>
<head>

	<!-- Style Sheets -->
	<link rel="stylesheet" href="../Semantic-UI-master/dist/semantic.css">
	<link rel="stylesheet" href="../Semantic-UI-master/dist/components/transition.css">
	<link rel="stylesheet" href="../css/styles.css">
	<!-- End of Style Sheets -->
	<title>GuidiNa | Client | Voyages</title>
	
	<!-- Script -->
	<script src="../js/jquery.js">
</script>
<script src="../Semantic-UI-master/dist/semantic.js">
</script>
<script src="../js/main.js">
</script>

	<!-- End of Script -->
	<meta charset="UTF-8">
</head>
<body>	

		<!-- Navigation -->
		<nav class="ui large top fixed hidden menu">
		  <div class="ui container">
		  	<a class="item"><img src="../pics/logo.png"></a>
		    <a class="item" href="../VoyagesServlet">Voyages</a>
		    <a class="item" href="#manifest">Manifestations Culturelle</a>
		    <a class="item" href="#sitetour">Sites Touristiques</a>
		    <a class="item" href="#services">Services</a>
		    <div class="right menu">
		      <div class="item">
		        <a class="ui button" id="signins">Log in</a>
		      </div>
		      <div class="item">
		        <a class="ui primary button" id="signups">Sign Up</a>
		      </div>
		    </div>
		  </div>
		</nav>
		
		<!-- End Of Navigation -->
	<%
		ArrayList<Voyage> allvoyages = new ArrayList<>();
		allvoyages = (ArrayList<Voyage>) session.getAttribute("allvoyages");
	%>
	<h1 class="nos-voyages">Nos Voyages</h1>
	<div class="ui container">
		<div class="ui link centered cards">
		<% for(Voyage voyage : allvoyages){ %>
			<div class="card">
				<div class="image">
					<img src="../pics/oran.jpeg">
				</div>
				<div class="content">
					<div class="header"><%= voyage.getNom() %></div>
					<div class="description">
        				Heure : <%= voyage.getHeuredep() %>
        				<br>
        				Date : <%= voyage.getDatedepart() %>
        				<br>
        				Price : <%= voyage.getPrice() %>
     				 </div>
				</div>
				<div class="extra content">
					<span class="right floated">
						<%= voyage.getNbrjours() %>
					</span>
					<span>
						<i class="plane icon"></i>
						<%= voyage.getPlaces() %>
					</span>
				</div>
			</div>
			<%} %>
		</div>
	</div>
	
	<br><br>
<div class="ui inverted vertical footer segment">
    <div class="ui center aligned container">
      <div class="ui stackable inverted divided grid">
        <div class="three wide column">
          <h4 class="ui inverted header">Group 1</h4>
          <div class="ui inverted link list">
            <a href="#" class="item">Link One</a>
            <a href="#" class="item">Link Two</a>
            <a href="#" class="item">Link Three</a>
            <a href="#" class="item">Link Four</a>
          </div>
        </div>
        <div class="three wide column">
          <h4 class="ui inverted header">Group 2</h4>
          <div class="ui inverted link list">
            <a href="#" class="item">Link One</a>
            <a href="#" class="item">Link Two</a>
            <a href="#" class="item">Link Three</a>
            <a href="#" class="item">Link Four</a>
          </div>
        </div>
        <div class="three wide column">
          <h4 class="ui inverted header">Group 3</h4>
          <div class="ui inverted link list">
            <a href="#" class="item">Link One</a>
            <a href="#" class="item">Link Two</a>
            <a href="#" class="item">Link Three</a>
            <a href="#" class="item">Link Four</a>
          </div>
        </div>
        <div class="seven wide column">
          <h4 class="ui inverted header">Footer Header</h4>
          <p>Extra space for a call to action inside the footer that could help re-engage users.</p>
        </div>
      </div>
      <div class="ui inverted section divider"></div>
      <img src="../pics/logo.png" class="ui centered mini image">
      <div class="ui horizontal inverted small divided link list">
        <a class="item" href="#">Site Map</a>
        <a class="item" href="#">Contact Us</a>
        <a class="item" href="#">Terms and Conditions</a>
        <a class="item" href="#">Privacy Policy</a>
      </div>
    </div>
  </div>
	
<script>
	$('.dropdown').dropdown();
</script>
</body>
</html>