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
	<title>GuidiNa | Client | Manifest</title>
	
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
		  	<a class="item" href="../StatsServlet"><img src="../pics/logo.png"></a>
		    <a class="item" href="../VoyagesServlet">Voyages</a>
		    <a class="item" href="../ManifestationServlet">Manifestations Culturelle</a>
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
		
		<%
		ArrayList<Manifestation> allmanifestation = new ArrayList<>();
		allmanifestation = (ArrayList<Manifestation>) session.getAttribute("allmanifestation");
	%>
	<h1 class="nos-voyages">Nos Manifestations</h1>
	<div class="ui container">
		<div class="ui link centered special cards">
		<% for(Manifestation manifest : allmanifestation){ %>
			<form class="card" action="../ManifestBookingServlet">
				<div class="blurring dimmable image">
					<div class="ui dimmer">
						<div class="content">
							<div class="center">
								<div class="ui inverted button reserver">
									Reserver
								</div>
							</div>
						</div>
						
					</div>
					<img src="../pics/oran.jpeg">
				</div>
				<div class="content">
					<input type="hidden" name="nomres" value="<%= manifest.getNommanifest() %>">
					<input type="hidden" name="idmanifest" value="<%= manifest.getIdmanifest() %>">
					<div class="header"><%= manifest.getNommanifest() %></div>
					<div class="description">
						<input type="hidden" name="heuredep" value="<%= manifest.getHeure() %>">
        				Heure : <%= manifest.getHeure() %> <%= manifest.getIdmanifest() %>
        				<br>
        				<input type="hidden" name="datedep" value="<%= manifest.getDatefin() %>">
        				Date : <%= manifest.getDatefin() %>
        				<br>
        				<input type="hidden" name="fees" value="<%= manifest.getFees() %>">
        				Price : <%= manifest.getFees() %>
     				 </div>
     				 <br>
     				 <% if(request.getSession().getAttribute("client") != null){ %>
     				 
     				 <%
						Client cl = new Client();
						cl = (Client) session.getAttribute("client");
					%>
     				 <div>
     				 	<input type="hidden" name ="idvoy" value="<%= manifest.getIdvoy()%>">
     				 	<input type="hidden" name ="idcli" value="<%= cl.getIdClient()%>">
     				 	<input type="submit" class="ui green button" value="Reserver">
     				 </div>
     				 <%}else{ %>
     				 	<div class="ui negative message">
							<p>
								Sign up / Sign in to Book this voyage 
							</p>
						</div>
     				 <%} %>
				</div>
				<div class="extra content">
					<span class="right floated">
						<%= manifest.getHeurefin() %>
					</span>
					<span>
						<i class="quidditch icon"></i>
						<%= manifest.getIdville() %>
					</span>
				</div>
			</form>
			<%} %>
		</div>
	</div>
	
	<br><br>
		
		
		
		
		
		
		
		
		
		<%@include file="signup.jsp" %>
		<%@include file="signin.jsp" %>
		
		
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
	
	$(function(){
		$('.special.cards .image').dimmer({
			on: 'hover'
		})
	});
	
	$(function(){
		$('.reserver').popup({
			popup: $('.flowing.popoup'),
			on: 'click'
		})
	});
	
	
</script>


</body>
</html>