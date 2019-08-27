<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	 <!-- Add a Manifestation -->
    <div class="ui basic modal site-add">
    	<div class="ui header center aligned grid">Add Site Touristique</div>
    	<div class="content">
    		<form class="ui form" action="../SiteTouristiqueAjoutServlet">
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Nom De Site Touristique</label>
							<input type="text" name="nomsite">
						</div>
	      				<div class="field">
							<label class="ui green label">Voyage inclue</label>
							<input type="text" name="idvoy">
						</div>
	    			</div>
				</div>
				
				
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Heure de fin</label>
							<input type="text" name="heurefin" placeholder="HH:mm">
						</div>
	      				<div class="field">
							<label class="ui green label">Heure de depart</label>
							<input type="text" name="heuredep" placeholder="HH:mm">
						</div>
	    			</div>
				</div>
				
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Ville</label>
							<input type="number" name="idville">
						</div>
						<div class="field">
			     			<label class="ui green label">Address de Manifestation</label>
							<input type="text" name="address">
			    		</div>
	    			</div>
				</div>
				
				
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Prix d'entre</label>
							<input type="number" name="fees">
						</div>
	    			</div>
				</div>
				
				

				
				<input class="ui green inverted button" type="submit" value="Add">
    		</form>
    	</div>
    </div>