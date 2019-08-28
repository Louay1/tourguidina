<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@page import="java.util.ArrayList"%>
<%@page import="modele.*"%>
<%@page import="classe.*"%>
    
    <%
			Admin ad = new Admin();
			ad = (Admin) session.getAttribute("ad");
			
		%>
		
					<div class="ui card">
				<div class="image">
					<img src="<%= ad.getImage()%>">
				</div>
				
				<div class="content">
					<a class="header"><%= ad.getNom()%> <%= ad.getPrenom() %></a>
										
					<div class="meta">
						<i class="birthday cake icon"><span class="date"></span></i><%= ad.getBirthdate() %>
					</div>
					<div class="description">
						<i class="barcode icon"></i>ID Admin: <%= ad.getIdadmin() %><br>
						<i class="venus mars icon"></i>Sexe: <%= ad.getSexe() %><br>
						<i class="address book icon"></i>Address: <%= ad.getAddress() %> <br>
					</div>
				</div>
				<div class="extra content">
					<a>
						<i class="terminal icon"></i> Coded By Der Hauptmann from Kodzaders
					</a>
				</div>
			</div>
			
