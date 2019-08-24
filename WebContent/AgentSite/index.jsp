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
	<title>GuidiNa | Agent</title>
	
	<!-- Script -->
	<script src="../js/jquery.js">
</script>
<script src="../Semantic-UI-master/dist/semantic.js">
</script>
<script src="../js/main.js">
</script>

<style type="text/css">
    body {
      background-color: #DADADA;
    }
    body > .grid {
      height: 100%;
    }
    .image {
      margin-top: -100px;
    }
    .column {
      max-width: 450px;
    }
  </style>


	<!-- End of Script -->
	<meta charset="UTF-8">
</head>
	<body>
		<div class="ui middle aligned center aligned grid">
			<div class="column">
				
				<h2 class="ui image header" class="image">
					<img src="../pics/logo.png">
				</h2>
				
				<form class="ui large form" action="../AgentLoginServlet">
			      <div class="ui stacked segment">
			        <div class="field">
			          <div class="ui left icon input">
			            <i class="user icon"></i>
			            <input type="text" name="email" placeholder="E-mail address">
			          </div>
			        </div>
			        <div class="field">
			          <div class="ui left icon input">
			            <i class="lock icon"></i>
			            <input type="password" name="password" placeholder="Password">
			          </div>
			        </div>
			        <input class="ui fluid large teal submit button" type="submit" value="Login">
			      </div>
			
			      <div class="ui error message"></div>
			
			    </form>
			</div>
		</div>
</body>
</html>