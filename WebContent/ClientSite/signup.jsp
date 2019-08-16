<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- SIGN UP FORM -->
			<div class="ui fullscreen basic modal sign-up">
				<h1 class="ui header center aligned grid">Sign Up</h1> <br><br>
				<div class="ui container">
					<form action="../RegisterServlet" class="ui form">
						<div class="field">
							<label class="ui orange label">Name</label>
							 <div class="two fields">
								<div class="field">
			        				<input type="text" name="nom" placeholder="Ex: Chouchane">
			      				</div>
			      				<div class="field">
			       					<input type="text" name="prenom" placeholder="Ex: Louai">
			      				</div>
			    			</div>
						</div>
						
						<div class="field">
							 <div class="two fields">
								<div class="field">
									<label class="ui orange label">Date de Naissance</label>
			        				<input type="date" name="birthdate" placeholder="Ex: 06/19/1997">
			      				</div>
			      				<div class="field">
			      					<label class="ui orange label">Sexe</label>
			       					<div class="ui selection dropdown">
								    	<input type="hidden" name="sexe">
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
										<input type="hidden" name="ville">
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
</body>
</html>