<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@page import="java.util.ArrayList"%>
<%@page import="modele.*"%>
<%@page import="classe.*"%>
    
    <%
			Agent ag = new Agent();
			ag = (Agent) session.getAttribute("ag");
			
		%>
		
					<div class="ui card">
				<div class="image">
					<img src="<%= ag.getImage()%>">
				</div>
				
				<div class="content">
					<a class="header"><%= ag.getNom()%> <%= ag.getPrenom() %></a>
										
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