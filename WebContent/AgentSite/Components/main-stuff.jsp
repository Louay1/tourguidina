<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@page import="java.util.ArrayList"%>
<%@page import="modele.*"%>
<%@page import="classe.*"%>

		<%
			ArrayList<Circuit> crs = new ArrayList<Circuit>();
			crs = (ArrayList<Circuit>) session.getAttribute("crs");
			
			ArrayList<Manifestation> mfs = new ArrayList<Manifestation>();
			mfs = (ArrayList<Manifestation>) session.getAttribute("mfs");
			
			ArrayList<SiteTourisrique> sts = new ArrayList<SiteTourisrique>();
			sts = (ArrayList<SiteTourisrique>) session.getAttribute("sts");
		
		%>
<h2 class="header">Circuits</h2>
			<div class="container-1">
				<table class="ui striped table">
					<thead>
						<tr>
							<th>ID Circuit</th>
							<th>Nom Circuit</th>
							<th>Point Depart</th>
							<th>Point Fin</th>
							<th>Action</th>
						</tr>
					</thead>
					
					</tbody>
						<%	for(Circuit c : crs){	%>
						<tr>
							<td><%= c.getId() %></td>
							<td><%= c.getName() %></td>
							<td><%= c.getStartpoint() %></td>
							<td><%= c.getEndponit() %></td>
							<td>
								<form action="../CancelReservationServlet">
									<input type="hidden" name="idcircuit" value="<%= c.getId() %>">
									<input type="submit" class="ui button" value="Annuler">
								</form>
							</td>
						</tr>
						<%} %>
					</tbody>
				</table>
			</div>
			
			<h2 class="header">Manifestations</h2>
			<div class="container-1">
				<table class="ui striped table">
					<thead>
						<tr>
							<th>ID Manifestation</th>
							<th>Nom de Manifestation</th>
							<th>Address</th>
							<th>Overt à : </th>
							<th>Ferme à :</th>
							<th>Date de Fin</th>
							<th>Nombre de jours</th>
							<th>Fees</th>
							<th>Action</th>
						</tr>
					</thead>
					
					</tbody>
						<%	for(Manifestation m : mfs){	%>
						<tr>
							<td><%= m.getIdmanifest() %></td>
							<td><%= m.getNommanifest() %></td>
							<td><%= m.getAddress() %></td>
							<td><%= m.getHeure() %></td>
							<td><%= m.getHeurefin() %></td>
							<td><%= m.getDatefin() %></td>
							<td><%= m.getNbrjour() %></td>
							<td><%= m.getFees() %></td>
							<td>
								<form action="../CancelReservationServlet">
									<input type="hidden" name="idmanifest" value="<%= m.getIdmanifest() %>">
									<input type="submit" class="ui button" value="Annuler">
								</form>
							</td>
						</tr>
						<%} %>
					</tbody>
				</table>
			</div>
			
			<h2 class="header">Sites Touristiques</h2>
			<div class="container-1">
				<table class="ui striped table">
					<thead>
						<tr>
							<th>ID Site</th>
							<th>Nom de Site</th>
							<th>Address</th>
							<th>Overt à : </th>
							<th>Ferme à :</th>
							<th>Ville</th>
							<th>Fees</th>
							<th>Action</th>
						</tr>
					</thead>
					
					</tbody>
						<%	for(SiteTourisrique st : sts){	%>
						<tr>
							<td><%= st.getIdsitetour() %></td>
							<td><%= st.getNomsitetour() %></td>
							<td><%= st.getAddress() %></td>
							<td><%= st.getHeuredep() %></td>
							<td><%= st.getHeurefin() %></td>
							<td><%= st.getIdville() %></td>
							<td><%= st.getPrix() %></td>
							<td>
								<form action="../CancelReservationServlet">
									<input type="hidden" name="idsite" value="<%= st.getIdsitetour() %>">
									<input type="submit" class="ui button" value="Annuler">
								</form>
							</td>
						</tr>
						<%} %>
					</tbody>
				</table>
			</div>