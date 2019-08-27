<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!-- Add a Circuit -->
    <div class="ui basic modal trans-add">
    	<div class="ui header center aligned grid">Ajouter Transport</div>
    	<div class="content">
    		<form class="ui form" action="../TransportAddServlet">
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Nom de Trasporteur</label>
							<input type="text" name="nomtrans">
						</div>
	      				<div class="field">
							<label class="ui green label">Address de Trasporteur</label>
							<input type="text" name="address">
						</div>
	    			</div>
				</div>
				
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Nombre des Places</label>
							<input type="number" name="nbrplaces">
						</div>
	      				<div class="field">
							<label class="ui green label">Ville</label>
							<input type="text" name="idville">
						</div>
	    			</div>
				</div>
				<input class="ui green inverted button" type="submit" value="Add">
    		</form>
    	</div>
    </div>