<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@page import="java.util.ArrayList"%>
<%@page import="modele.*"%>
<%@page import="classe.*"%>

		<% 
			ArrayList<Integer> stats = new ArrayList<>();
			stats = (ArrayList<Integer>) session.getAttribute("stats");
		
		%>
		 
		<h2 class="header">Stats</h2>
		
			<table class="ui celled table">
				<thead>
					<tr>
						<th><a>Clients</a></th>
						<th><a>Agents</a></th>
						<th><a>Villes</a></th>
						<th><a>Reservations</a></th>
						<th><a>Manifestations</a></th>
						<th><a>Sites Touristiques</a></th>
						<th><a>Voyages</a></th>
						<th><a>Camps</a></th>
						<th><a>Guides</a></th>
						<th><a>Hotels</a></th>
						<th><a>Restaurants</a></th>
						<th><a>Transport</a></th>
					</tr>
				</thead>
				
				</tbody>
					
					<tr>
				<%	for(Integer i : stats){	%>
						<td class="selectable">
							<a>
								<%= i %>
							</a>
						</td>
				<%} %>
					</tr>
					
				</tbody>
			</table>
		
		
		
		
		
		
		
		
		
		