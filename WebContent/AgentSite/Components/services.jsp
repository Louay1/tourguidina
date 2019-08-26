

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList"%>
<%@page import="modele.*"%>
<%@page import="classe.*"%>

<%
		
		
		// Sevices
		ArrayList<Hotel> hs = new ArrayList<>();
		ArrayList<CampingSite> cps = new ArrayList<>();
		ArrayList<Transport> tps = new ArrayList<>();
		ArrayList<Guide> gds = new ArrayList<>();
		ArrayList<Restaurant> rsts = new ArrayList<>();

		hs = (ArrayList<Hotel>) session.getAttribute("hs");
		cps = (ArrayList<CampingSite>) session.getAttribute("cps");
		tps = (ArrayList<Transport>) session.getAttribute("tps");
		gds = (ArrayList<Guide>) session.getAttribute("gds");
		rsts = (ArrayList<Restaurant>) session.getAttribute("rsts");
		%>

<h2>Services</h2>
			<div class="ui fluid styled accordion">
				<div class="title">
					<i class="bed icon"></i>
					Hotels
				</div>
				<div class="content">
					<table class="ui striped table">
					<thead>
						<tr>
							<th>ID Hotel</th>
							<th>Nom Hotel</th>
							<th>Address</th>
							<th>Prix moyen d'une chambre</th>
							<th>Nobmer des Chambres</th>
							<th>Ville</th>
							<th>Etoiles</th>
							<th>Action</th>
						</tr>
					</thead>
					
					</tbody>
						<%	for(Hotel h : hs){	%>
						<tr>
							<td><%= h.getIdHotel() %></td>
							<td><%= h.getName() %></td>
							<td><%= h.getAddress() %></td>
							<td><%= h.getPrix() %></td>
							<td><%= h.getNbrchambre() %></td>
							<td><%= h.getVille() %></td>
							<td><%= h.getStars() %></td>
							<td>
								<form action="../CancelReservationServlet">
									<input type="hidden" name="idsite" value="<%= h.getIdHotel() %>">
									<input type="submit" class="ui button" value="Annuler">
								</form>
							</td>
						</tr>
						<%} %>
					</tbody>
				</table>
				</div>
				
				<div class="title">
					<i class="utensils icon"></i>
					Restaurants
				</div>
				<div class="content">
					<table class="ui striped table">
					<thead>
						<tr>
							<th>ID Restaurant</th>
							<th>Nom de Restaurant</th>
							<th>Address</th>
							<th>Prix moyen d'une repas</th>
							<th>Ville</th>
							<th>Etoiles</th>
							<th>Action</th>
						</tr>
					</thead>
					
					</tbody>
						<%	for(Restaurant r : rsts){	%>
						<tr>
							<td><%= r.getIdRest() %></td>
							<td><%= r.getName() %></td>
							<td><%= r.getAddress() %></td>
							<td><%= r.getPrix() %></td>
							<td><%= r.getVille() %></td>
							<td><%= r.getStars() %></td>
							<td>
								<form action="../CancelReservationServlet">
									<input type="hidden" name="idsite" value="<%= r.getIdRest() %>">
									<input type="submit" class="ui button" value="Annuler">
								</form>
							</td>
						</tr>
						<%} %>
					</tbody>
				</table>
				</div>
				
				<div class="title">
					<i class="tree icon"></i>
					Camps
				</div>
				<div class="content">
					<table class="ui striped table">
					<thead>
						<tr>
							<th>ID Camp</th>
							<th>Nom de Camp</th>
							<th>Address</th>
							<th>Prix moyen</th>
							<th>Ville</th>
							<th>Nomber des Places</th>
							<th>Surface</th>
							<th>Action</th>
						</tr>
					</thead>
					
					</tbody>
						<%	for(CampingSite cp : cps){	%>
						<tr>
							<td><%= cp.getIdCS() %></td>
							<td><%= cp.getName() %></td>
							<td><%= cp.getAddress() %></td>
							<td><%= cp.getPrix() %></td>
							<td><%= cp.getVille() %></td>
							<td><%= cp.getCapacity() %></td>
							<td><%= cp.getArea() %></td>
							<td>
								<form action="../CancelReservationServlet">
									<input type="hidden" name="idsite" value="<%= cp.getIdCS() %>">
									<input type="submit" class="ui button" value="Annuler">
								</form>
							</td>
						</tr>
						<%} %>
					</tbody>
				</table>
				</div>
				
				
				<div class="title">
					<i class="car icon"></i>
					Transport
				</div>
				<div class="content">
					<table class="ui striped table">
					<thead>
						<tr>
							<th>ID Transport</th>
							<th>Nom de Transporteur</th>
							<th>Address</th>
							<th>Ville</th>
							<th>Nomber des Places</th>
							<th>Action</th>
						</tr>
					</thead>
					
					</tbody>
						<%	for(Transport t : tps){	%>
						<tr>
							<td><%= t.getId() %></td>
							<td><%= t.getName() %></td>
							<td><%= t.getAddress() %></td>
							<td><%= t.getVille() %></td>
							<td><%= t.getNbrplace() %></td>
							<td>
								<form action="../CancelReservationServlet">
									<input type="hidden" name="idsite" value="<%= t.getId() %>">
									<input type="submit" class="ui button" value="Annuler">
								</form>
							</td>
						</tr>
						<%} %>
					</tbody>
				</table>
				</div>
				
				<div class="title">
					<i class="tree icon"></i>
					Guide Troustiques
				</div>
				<div class="content">
					<table class="ui striped table">
					<thead>
						<tr>
							<th>ID Guide</th>
							<th>Nom de Guide</th>
							<th>Address</th>
							<th>Prix moyen</th>
							<th>Ville</th>
							<th>email</th>
							<th>Phone</th>
							<th>Action</th>
						</tr>
					</thead>
					
					</tbody>
						<%	for(Guide gt : gds){	%>
						<tr>
							<td><%= gt.getIdguide() %></td>
							<td><%= gt.getName() %></td>
							<td><%= gt.getAddress() %></td>
							<td><%= gt.getPrix() %></td>
							<td><%= gt.getVille() %></td>
							<td><%= gt.getEmail() %></td>
							<td><%= gt.getPhone() %></td>
							<td>
								<form action="../CancelReservationServlet">
									<input type="hidden" name="idsite" value="<%= gt.getIdguide() %>">
									<input type="submit" class="ui button" value="Annuler">
								</form>
							</td>
						</tr>
						<%} %>
					</tbody>
				</table>
				</div>
			</div>