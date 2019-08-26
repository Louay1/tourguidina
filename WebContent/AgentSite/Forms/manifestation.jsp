<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	 <!-- Add a Manifestation -->
    <div class="ui basic modal manifest-add">
    	<div class="ui header center aligned grid">Add Manifestation</div>
    	<div class="content">
    		<form class="ui form">
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Nom De Manifestation</label>
							<input type="text" name="adr">
						</div>
	      				<div class="field">
							<label class="ui green label">Voyage inclue</label>
							<input type="text" name="idvoy">
						</div>
	    			</div>
				</div>
				
				
				<div class="field">
					<div class="three fields">
						<div class="field">
							<label class="ui green label">Heure de fin</label>
							<input type="time" name="heurefin">
						</div>
	      				<div class="field">
							<label class="ui green label">Heure de depart</label>
							<input type="time" name="heure">
						</div>
						<div class="field">
							<label class="ui green label">Date de fin</label>
							<input type="date" name="datefin">
						</div>
	    			</div>
				</div>
				
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Image de Localisation</label>
							<input type="file" name="image">
						</div>
						<div class="field">
			     			<label class="ui green label">Address de Manifestation</label>
							<input type="text" name="nommanifest">
			    		</div>
	    			</div>
				</div>
				
				
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Nombre de jours</label>
							<input type="text" name="nbrjour">
						</div>
						
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