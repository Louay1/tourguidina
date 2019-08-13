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

	<!-- End of Script -->
	<meta charset="UTF-8">
</head>
	<body>
		<!-- Navigation -->
		<nav class="ui large top fixed hidden menu">
		  <div class="ui container">
		  	<a class="item"><img src="../pics/logo.png"></a>
		    <a class="item" href="VoyagesServlet">Voyages</a>
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
		
		<!-- Main Page -->
			<div class="ui fluid container" id="home-page">
				<div class="hero-image">
					<img class="ui centered large image" src="../pics/logo.png">
					<div class="ui container">
						<div class="ui center aligned griid search">
  							<div class="ui center aligned grid icon input">
    							<input class="prompt" type="text" placeholder="Search ...">
    							<i class="search icon"></i>
 			 				</div>
 			 				<div class="results"></div>
						</div>
					</div>
				</div>
			</div>
			<br><br>
			<div class="ui container">
				<h1 class="ui header center aligned grid padded" id="services">Our Services</h1>
				<div class="ui horizontal segments">
					<div class="ui segment">
						<h1 class="ui header">Header 1</h1>
						<p>
							Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
							Nam sed justo in neque blandit vulputate. 
							Etiam et quam vitae eros semper lacinia. 
							Ut et est nec lacus faucibus pulvinar eget a lorem. 
							Morbi magna libero, rhoncus a ornare eu, auctor eget velit. 
							Aenean malesuada neque ut ante ullamcorper luctus. 
							Mauris rutrum dapibus tellus quis tincidunt. 
							In hac habitasse platea dictumst. 
							Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. 
							Aenean elit magna, ornare ut bibendum sit amet, efficitur sed sem. 
							Proin sed arcu semper, vulputate justo at, aliquet nibh. Praesent nisl lectus, 
							posuere in sem non, interdum porttitor lorem.
						</p>
					</div>
					
					<div class="ui segment">
						<h1 class="ui header">Header 2</h1>
						<p>
							Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
							Nam sed justo in neque blandit vulputate. 
							Etiam et quam vitae eros semper lacinia. 
							Ut et est nec lacus faucibus pulvinar eget a lorem. 
							Morbi magna libero, rhoncus a ornare eu, auctor eget velit. 
							Aenean malesuada neque ut ante ullamcorper luctus. 
							Mauris rutrum dapibus tellus quis tincidunt. 
							In hac habitasse platea dictumst. 
							Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. 
							Aenean elit magna, ornare ut bibendum sit amet, efficitur sed sem. 
							Proin sed arcu semper, vulputate justo at, aliquet nibh. Praesent nisl lectus, 
							posuere in sem non, interdum porttitor lorem.
						</p>
					</div>
					
					<div class="ui segment">
						<h1 class="ui header">Header 3</h1>
						<p>
							Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
							Nam sed justo in neque blandit vulputate. 
							Etiam et quam vitae eros semper lacinia. 
							Ut et est nec lacus faucibus pulvinar eget a lorem. 
							Morbi magna libero, rhoncus a ornare eu, auctor eget velit. 
							Aenean malesuada neque ut ante ullamcorper luctus. 
							Mauris rutrum dapibus tellus quis tincidunt. 
							In hac habitasse platea dictumst. 
							Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. 
							Aenean elit magna, ornare ut bibendum sit amet, efficitur sed sem. 
							Proin sed arcu semper, vulputate justo at, aliquet nibh. Praesent nisl lectus, 
							posuere in sem non, interdum porttitor lorem.
						</p>
					</div>
				</div>
				
				<!-- Start of Voyages -->
				<div class="ui container">
					<h1 class="ui header center aligned grid padded" id="voyages">Nos Voyages</h1><br>
					<div class="ui centered cards">
						<div class="card">
							<div class="image">
								<img src="../pics/image.png">
							</div>
							<div class="content">
								<div class="header">Voyage 1</div>
								<div class="description">
									Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
									Nam sed justo in neque blandit vulputate. 
								</div>
							</div>
						</div>
						
						<div class="card">
							<div class="image">
								<img src="../pics/image.png">
							</div>
							<div class="content">
								<div class="header">Voyage 2</div>
								<div class="description">
									Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
									Nam sed justo in neque blandit vulputate. 
								</div>
							</div>
						</div>
						
						<div class="card">
							<div class="image">
								<img src="../pics/image.png">
							</div>
							<div class="content">
								<div class="header">Voyage 3</div>
								<div class="description">
									Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
									Nam sed justo in neque blandit vulputate. 
								</div>
							</div>
						</div>
						
						<div class="card">
							<div class="image">
								<img src="../pics/image.png">
							</div>
							<div class="content">
								<div class="header">Voyage 4</div>
								<div class="description">
									Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
									Nam sed justo in neque blandit vulputate. 
								</div>
							</div>
						</div>
						
						<div class="card">
							<div class="image">
								<img src="../pics/image.png">
							</div>
							<div class="content">
								<div class="header">Voyage 5</div>
								<div class="description">
									Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
									Nam sed justo in neque blandit vulputate. 
								</div>
							</div>
						</div>
						
						<div class="card">
							<div class="image">
								<img src="../pics/image.png">
							</div>
							<div class="content">
								<div class="header">Voyage 6</div>
								<div class="description">
									Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
									Nam sed justo in neque blandit vulputate. 
								</div>
							</div>
						</div> 
					</div>
				</div><br><br>
				<!-- End of Voyages -->
				
				
				<!-- Start of Sites touristique -->
				<div class="ui container">
					<h1 class="ui header center aligned grid padded" id="manifest">Des Manifestation</h1><br>
					<div class="ui centered cards">
						<div class="card">
							<div class="image">
								<img src="../pics/image.png">
							</div>
							<div class="content">
								<div class="header">Site Touristique 1</div>
								<div class="description">
									Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
									Nam sed justo in neque blandit vulputate. 
								</div>
							</div>
						</div>
						
						<div class="card">
							<div class="image">
								<img src="../pics/image.png">
							</div>
							<div class="content">
								<div class="header">Site Touristique 2</div>
								<div class="description">
									Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
									Nam sed justo in neque blandit vulputate. 
								</div>
							</div>
						</div>
						
						<div class="card">
							<div class="image">
								<img src="../pics/image.png">
							</div>
							<div class="content">
								<div class="header">Site Touristique 3</div>
								<div class="description">
									Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
									Nam sed justo in neque blandit vulputate. 
								</div>
							</div>
						</div>
					</div>
				</div><br><br>
				<!-- End of Sites touristique -->
				
				
				<!-- Start of Manifest -->
				<div class="ui container">
					<h1 class="ui header center aligned grid padded" id="sitetour">Des Sites Touristiques</h1><br>
					<div class="ui centered cards">
						<div class="card">
							<div class="image">
								<img src="../pics/image.png">
							</div>
							<div class="content">
								<div class="header">Site Touristique 1</div>
								<div class="description">
									Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
									Nam sed justo in neque blandit vulputate. 
								</div>
							</div>
						</div>
						
						<div class="card">
							<div class="image">
								<img src="../pics/image.png">
							</div>
							<div class="content">
								<div class="header">Site Touristique 2</div>
								<div class="description">
									Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
									Nam sed justo in neque blandit vulputate. 
								</div>
							</div>
						</div>
						
						<div class="card">
							<div class="image">
								<img src="../pics/image.png">
							</div>
							<div class="content">
								<div class="header">Site Touristique 3</div>
								<div class="description">
									Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
									Nam sed justo in neque blandit vulputate. 
								</div>
							</div>
						</div>
					</div>
				</div><br><br>
				<!-- End of Manifest -->
				
				
				
				<!-- Start of Statistics -->
				<%
					//int voyages = 0;
					
				%>
				<h1 class="ui header center aligned grid padded">Some Statistics</h1>
				<div class="ui center aligned grid statistics">
					<div class="statistic">
						<div class="value">
							<% out.print(session.getAttribute("voyages")); %>
						</div>
						<div class="label">
					      Voyages
					    </div>
					</div>
					
					<div class="statistic">
						<div class="value">
							<% out.print(session.getAttribute("hotels")); %>
						</div>
						<div class="label">
					      Hotels
					    </div>
					</div>
					
					<div class="statistic">
						<div class="value">
							<% out.print(session.getAttribute("restau")); %>
						</div>
						<div class="label">
					      Restaurants
					    </div>
					</div>
					
					<div class="statistic">
						<div class="value">
							<% out.print(session.getAttribute("guides")); %>
						</div>
						<div class="label">
					      Guides Touristiques
					    </div>
					</div>
					
					<div class="statistic">
						<div class="value">
							<% out.print(session.getAttribute("camps")); %>
						</div>
						<div class="label">
					      Camps
					    </div>
					</div>
					<div class="statistic">
						<div class="value">
							<% out.print(session.getAttribute("villes")); %>
						</div>
						<div class="label">
					      Villes
					    </div>
					</div>
					
					<!-- End of Statistics -->
				</div><br>
			</div>	
			
			
			<!-- SIGN UP FORM -->
			<div class="ui fullscreen basic modal sign-up">
				<h1 class="ui header center aligned grid">Sign Up</h1> <br><br>
				<div class="ui container">
					<form action="" class="ui form">
						<div class="field">
							<label class="ui orange label">Name</label>
							 <div class="two fields">
								<div class="field">
			        				<input type="text" name="first-name" placeholder="Ex: Chouchane">
			      				</div>
			      				<div class="field">
			       					<input type="text" name="last-name" placeholder="Ex: Louai">
			      				</div>
			    			</div>
						</div>
						
						<div class="field">
							 <div class="two fields">
								<div class="field">
									<label class="ui orange label">Date de Naissance</label>
			        				<input type="date" name="daten" placeholder="Ex: 06/19/1997">
			      				</div>
			      				<div class="field">
			      					<label class="ui orange label">Sexe</label>
			       					<div class="ui selection dropdown">
								    	<input type="hidden" name="gender">
								        <i class="dropdown icon"></i>
								        <div class="default text">Uhm .. Sorry?</div>
								        <div class="menu">
								            <div class="item" data-value="1">Homme</div>
					 		            	<div class="item" data-value="0">Femme</div>
								    	</div>
							    	</div>
			      				</div>
			    			</div>
						</div>
						
						<div class="field">
			    			<div class="two fields">
								<div class="field">
									<label class="ui orange label">Address</label>
			      					<input type="text" name="address" placeholder="Ex: Teleghma">
			    				</div>
			    				<div class="field">
			   						<div class="field">
										<label class="ui orange label">State</label>
										<input type="hidden" name="state">
							      		<select class="ui fluid dropdown">
									        <option data-value="">State</option>
									    	<option data-value="16">Alger</option>
										    <option data-value="25">Constantine</option>
										    <option data-value="05">Batna</option>
										    <option data-value="31">Oran</option>
										    <option data-value="21">Annaba</option>								 
							      		</select>
								    </div>
			    				</div>   					
			    			</div>
			    		</div>
			    		
			   			<div class="field">
					    	<div class="three fields">
					    		<div class="field">
					    			<label class="ui orange label">Email</label>
					    			<input type="email" name="email" placeholder="Ex: chouchane@email.com">
					    		</div>
					      		<div class="field">
					      			<label class="ui orange label">Phone Number</label>
					        		<input type="text" name="phone" placeholder="Am Taken, sorry :/">
					      		</div>
					      		<div class="field">
									<label class="ui orange label">Password</label>
									<input type="password" name="password" placeholder="Keep it low, bits have ears!">
								</div>
					    	</div>
					  	</div>
						<input class="ui orange inverted button" type="submit" value="Submit"> <br><br>
					</form>
				</div>
			</div>
			
			<!-- End Of SIGN UP -->
			
			<!-- Start of Sign In -->
			<div class="ui basic mini modal sign-in">
				<div class="ui header center aligned grid">Sign In</div>
				<div class="content">
					<form class="ui form">
						<div class="field">
							<label class="ui orange label">Email</label>
							<input type="email" name="email" placeholder="Ex: chouchane@email.com">
						</div>
						<div class="field">
							<label class="ui orange label">Password</label>
							<input type="password" name="password" placeholder="Again? dO yOu UnDeRsTanD?!">
						</div>
						
						<input class="ui orange inverted button" type="submit" value="Submit">
					</form>
				</div>
			</div>
			<!-- End of Sign In -->
			
			
			<!-- Start of #voyages the Footer -->
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