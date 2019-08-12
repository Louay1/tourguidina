<%@ page language="java" contentType="text/html; charset=UTF-8" 
		pageEncoding="UTF-8"%>
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
	<div class="ui container">
		<form action="" class="ui form">
			<h4 class="ui dividing header">Sign Up</h4>
			<div class="field">
				<label>Name</label>
				 <div class="two fields">
					<div class="field">
        				<input type="text" name="first-name" placeholder="First Name">
      				</div>
      				<div class="field">
       					<input type="text" name="last-name" placeholder="Last Name">
      				</div>
    			</div>
			</div>
			
			<div class="field">
				 <div class="two fields">
					<div class="field">
						<label>Date de Naissance</label>
        				<input type="date" name="daten" placeholder="First Name">
      				</div>
      				<div class="field">
      					<label>Sexe</label>
       					<div class="ui selection dropdown">
					    	<input type="hidden" name="gender">
					        <i class="dropdown icon"></i>
					        <div class="default text">Sexe</div>
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
						<label>Address</label>
      					<input type="text" name="address" placeholder="Address">
    				</div>
    				<div class="field">
   						<div class="field">
							<label>State</label>
				      		<select class="ui fluid dropdown">
						        <option value="">State</option>
						    	<option value="16">Alger</option>
							    <option value="25">Constantine</option>
							    <option value="05">Batna</option>
							    <option value="31">Oran</option>
							    <option value="21">Annaba</option>								 
				      		</select>
					    </div>
    				</div>   					
    			</div>
    		</div>
    		
   			<div class="field">
		    	<div class="two fields">
		    		<div class="field">
		    			<label>Email</label>
		    			<input type="email" name="email" placeholder="Email">
		    		</div>
		      		<div class="field">
		      			<label>Phone Number</label>
		        		<input type="text" name="phone" placeholder="Phone Number">
		      		</div>
		    	</div>
		  	</div>
			<input class="ui button" type="submit" value="Submit">
		</form>
	</div>
	
<script>
	$('.dropdown').dropdown();
</script>
</body>
</html>