<!-- Add a Offre -->
    <div class="ui basic modal off-add">
    	<div class="ui header center aligned grid">Ajouter Offre</div>
    	<div class="content">
    		<form class="ui form" action="../OffreAjoutServlet">
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui violet label">ID Circuit</label>
							<input type="number" name="idcircuit">
						</div>
	      				<div class="field">
							<label class="ui violet label">Type</label>
							<input type="text" name="type">
						</div>
	    			</div>
				</div>
				
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui violet label">Date de depart</label>
							<input type="text" name="datedep">
						</div>
						<div class="field">
							<label class="ui violet label">Date de Fin</label>
							<input type="text" name="datefin">
						</div>
	      				
	    			</div>
				</div>
				
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui violet label">Reduction</label>
							<input type="text" name="reduction">
						</div>
	    			</div>
				</div>
				
				
				<input class="ui violet inverted button" type="submit" value="Add">
    		</form>
    	</div>
    </div>