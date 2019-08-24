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
	<title>GuidiNa | Agent | Profile</title>
	
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
		<%
			Agent ag = new Agent();
			ag = (Agent) session.getAttribute("ag");
		%>
	<%if(request.getSession().getAttribute("ag") != null){ %>
	<div class="ui grid">
		<div class="four wide column">
			<div class="ui image tiny">
				<img src="../pics/logo.png">
			</div>
			<div class="ui card">
				<div class="image">
					<img src="<%= ag.getImage()%>">
				</div>
				
				<div class="content">
					<a class="header"><%= ag.getNom()%> <%= ag.getPrenom() %></a>
					
					<% String some = (String) session.getAttribute("some"); %>
					
					
					<div class="meta">
						<i class="birthday cake icon"><span class="date"></span></i><%= ag.getBirthdate() %>
					</div>
					<div class="description">
						<i class="barcode icon"></i>ID Agent: <%= ag.getIdagent() %><br>
						<i class="venus mars icon"></i>Sexe: <%= ag.getSexe() %><br>
						<i class="address book icon"></i>Address: <%= ag.getAddress() %> <br>
					</div>
				</div>
				<div class="extra content">
					<a>
						<i class="terminal icon"></i> Coded By Der Hauptmann from Kodzaders
					</a>
				</div>
			</div>
			<div class="ui large vertical menu">
				<a class="item" href="../IndexCircuitServlet">
					Gestion Circuit
				</a>
				<a class="item">
					Gestion Manifestation
				</a>
				<a class="item">
					Gestion Site Touristique
				</a>
				<a class="item">
					Gestion Srvices
				</a>
				<a class="item">
					Gestion Agent
				</a>
			</div>
		</div>
	</div>
	<%}else{
		response.sendRedirect("index.jsp");
		}%>
</body>
</html>