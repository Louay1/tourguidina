<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@page import="java.util.ArrayList"%>
<%@page import="modele.*"%>
<%@page import="classe.*"%>
	<% 
			ArrayList<Integer> stat = new ArrayList<>();
			stat = (ArrayList<Integer>) session.getAttribute("stats");
			 
		%>
<script src="https://cdn.jsdelivr.net/npm/chart.js@2.8.0/dist/Chart.min.js"></script>
<h2>Charts</h2>
		<canvas id="goodCanvas1" width="400" height="200" aria-label="Hello ARIA World" role="img">
		
		</canvas>
		
		<canvas id="goodCanvas2" width="400" height="200" aria-label="Hello ARIA World" role="img">
		
		</canvas>
		
		<canvas id="goodCanvas3" width="400" height="200" aria-label="Hello ARIA World" role="img">
		
		</canvas>
		
	
	<script>
	
	function chart1(){
		var ctx = document.getElementById("goodCanvas1").getContext('2d');
		var chart = new  Chart(ctx, {
			type: 'bar',
			data: {
				labels: ['Clients', 'Agents', 'Villes', 'Reservation'],
				datasets: [{
					label: "Resources",
					data:[
						<% for(int i=0; i <= 3; i++){%>
						<%= stat.get(i)%>,
						<%} %>
					], 
					backgroundColor:[
						'#a44141',
						'#8a2a2a',
						'#701616',
						'#4c0808'
					],
					
					borderWidth:1,
					borderColor: '#777',
					hoverBorderWidth: 2,
					hoverBorderColor: '#000'
				}
				]
			}, 
			options: {
			    scales: {
			        yAxes: [{
			            ticks: {
			                beginAtZero: true
			            }
			        }]
			    },
			
				title:{
					display: true,
					text: 'Resources & Reservations',
					fontSize: 25
				}
			}
			});
	}
		
	
	function chart2(){
		var ctx = document.getElementById("goodCanvas2").getContext('2d');
		var chart = new  Chart(ctx, {
			type: 'bar',
			data: {
				labels: ['Manifestations', 'Sites Touristiques', 'Voyages'],
				datasets: [{
					label: "Main Stuff",
					data:[
						<% for(int i=4; i <= 6; i++){%>
						<%= stat.get(i)%>,
						<%} %>
					], 
					backgroundColor:[
						'#008f9a',
						'#006f87',
						'#006389'
					],
					
					borderWidth:1,
					borderColor: '#777',
					hoverBorderWidth: 2,
					hoverBorderColor: '#000'
				}
				]
			}, 
			
			options: {
			    scales: {
			        yAxes: [{
			            ticks: {
			                beginAtZero: true
			            }
			        }]
			    },
			
				title:{
					display: true,
					text: 'Main Offres',
					fontSize: 25
				}
			}
			});
	}
		
	
		function chart3(){
			var ctx = document.getElementById("goodCanvas3").getContext('2d');
			
			Chart.defaults.global.defaultFontFamily= 'Lato';
			Chart.defaults.global.defaultFontSite= 18;
			Chart.defaults.global.defaultFontColor= '#777';
			
			var chart = new  Chart(ctx, {
				type: 'bar',
				data: {
					labels: ['Camps', 'Guides Touristiques', 'Hotels', 'Restaurants' ,'Transport'],
					datasets: [{
						label: "Services",
						data:[
							<% for(int i=6; i < stat.size(); i++){%>
							<%= stat.get(i)%>,
							<%} %>
						], 
						backgroundColor:[
							'#00ff00',
							'#00e000',
							'#00c000',
							'#00a000',
							'#008000'
						],
						
						borderWidth:1,
						borderColor: '#777',
						hoverBorderWidth: 2,
						hoverBorderColor: '#000'
					}
					]
				}, 
				
				options: {
				    scales: {
				        yAxes: [{
				            ticks: {
				                beginAtZero: true
				            }
				        }]
				    },
				
					title:{
						display: true,
						text: 'Services',
						fontSize: 25
					}
				}
				});
				
			
		}
		chart1();
		chart2();
		chart3();
		
	</script>