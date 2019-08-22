<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        
<%@page import="modele.*"%>
<%@page import="classe.*"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Profile</title>
		<!-- Style Sheets -->
	<link rel="stylesheet" href="../Semantic-UI-master/dist/semantic.css">
	<link rel="stylesheet" href="../Semantic-UI-master/dist/components/transition.css">
	<link rel="stylesheet" href="../css/styles.css">
		
	<!-- Script -->
	<script src="../js/jquery.js">
</script>
<script src="../Semantic-UI-master/dist/semantic.js">
</script>
<script src="../js/main.js">
</script>
	
</head>
<body>

		<%
			Client cl = new Client();
			cl = (Client) session.getAttribute("client");
		%>
	
	<!-- Navigation -->
		<nav class="ui large top fixed hidden menu">
		  <div class="ui container">
		  	<a class="item" href="../StatsServlet"><img src="../pics/logo.png"></a>
		    <a class="item" href="../VoyagesServlet">Voyages</a>
		    <a class="item" href="#manifest">Manifestations Culturelle</a>
		    <a class="item" href="#sitetour">Sites Touristiques</a>
		    <a class="item" href="#services">Services</a>
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
		    <div class="right menu">
		        <div class="item">
		        	<div class="ui dropdown">
		        		<img class="ui avatar image" src="<%=cl.getImage()%>"> <%= cl.getNom() %>
		        		<i class="icon dropdown"></i>
		        		<div class="menu">
		        			<div class="item"><a href="../LoginServlet">Profile</a></div>
		        			<div class="item"><a href="../LogoutServlet">Logout</a></div>
		        		</div>
		        	</div>
		    	</div>
		    </div>
		    <%} %>
		  </div>
		</nav>
		
		<!-- End Of Navigation -->
	<% if(request.getSession().getAttribute("client") != null){ %>
	
			<% 
				ArrayList<Reservation> rs = new ArrayList<>();
				rs = (ArrayList<Reservation>) session.getAttribute("rs");
				
			
			%>
		
		<div class="nos-voyages">
			<h1>
				Bienvenue Mr <%= cl.getPrenom()%>
				
			</h1>
			

		</div>
		<div class="ui container">
			<div class="ui grid">
				<div class="four wide column">
					<div class="ui card">
						<div class="image">
							<img src="<%=cl.getImage()%>">
						</div>
						<div class="content">
							<a class="header"><%= cl.getNom()%> <%=cl.getPrenom() %></a>
							<div class="meta">
						    	<i class="birthday cake icon"></i><span class="date">Date de Tarte : <%= cl.getBirthdate() %></span>
						    </div>
						    <div class="description">
						    	<i class="barcode icon"></i>ID : <%= cl.getIdClient() %> <br>
						    	<i class="venus mars icon"></i>Sexe : <%= cl.getSexe() %> <br>
						    	<i class="address book icon"></i>Addresse : <%= cl.getAddress() %> <br>
						    </div>
						</div>
						<div class="extra content">
							<a>
						    	<i class="chart line icon"></i>
						     	<%= cl.getPoints() %>
						    </a>
						    <div class="right floated">
								<i class="money bill alternate icon"></i>
								<%= cl.getCredit() %>	    
						    </div>
						</div>
					</div>
				</div>
				<div class="twelve wide column">
					<table class="ui striped table">
						<thead>
							<tr>
								<th>ID Reservation</th>
								<th>ID Voyage</th>
								<th>Nom de Reservation</th>
								<th>Heure Depart</th>
								<th>Date Depart</th>
								<th>Prix</th>
								<th>Action</th>
							</tr>
						</thead>
						<tbody>
							<%
							for(Reservation r : rs){
							%>
							<tr>
								<td><%= r.getIdRes() %></td>
								<td><%= r.getIdVoy() %></td>
								<td><%= r.getResname() %></td>
								<td><%= r.getHeureDep() %></td>
								<td><%= r.getDateDep() %></td>
								<td><%= r.getPrixpaye() %></td>
								<td>
									<a class="ui red button">Annuler</a>
								</td>
							</tr>
							<%} %>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	
	<%}else{ %>
		<div class="ui very padded container grid">
			<div class="sixteen wide column">
				<div class="ui negative message nos-voyages">
					<div class="header">
						We are Sorry, you may not see this
					</div>
					<p>
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
					Nam sed justo in neque blandit vulputate. 
					</p>
				</div>
			</div>
			
		</div>
		
	<%} %>
	
	
		<%@include file="signup.jsp" %>
		<%@include file="signin.jsp" %>
		
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