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
	
			
			<!-- Start of #voyages the Footer -->
	<div class="ui inverted vertical footer segment">
    <div class="ui center aligned container">
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