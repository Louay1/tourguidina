<!-- Add a Voyage -->
    <div class="ui basic modal voyage-add">
    	<div class="ui header center aligned grid">Ajouter Voyage</div>
    	<div class="content">
    		<form class="ui form" action="../VoyageAjoutServlet">
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui violet label">Nom de Voyage</label>
							<input type="text" name="nomvoyage">
						</div>
	      				<div class="field">
							<label class="ui violet label">Nombre des places</label>
							<input type="number" name="nbrplaces">
						</div>
	    			</div>
				</div>
				
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui violet label">Heure de depart</label>
							<input type="text" name="heuredep">
						</div>
						<div class="field">
							<label class="ui violet label">Date de depart</label>
							<input type="text" name="datedep">
						</div>
	      				
	    			</div>
				</div>
				
				<div class="field">
					<div class="three fields">
						<div class="field">
							<label class="ui violet label">Nombre des jours</label>
							<input type="text" name="nbrjour">
						</div>
	      				<div class="field">
							<label class="ui violet label">Prix moyen</label>
							<input type="number" name="avprix">
						</div>
						<div class="field">
							<label class="ui violet label">ID Circuit</label>
							<input type="number" name="idcir">
						</div>
	    			</div>
				</div>
				
				
				<input class="ui violet inverted button" type="submit" value="Add">
    		</form>
    	</div>
    </div>