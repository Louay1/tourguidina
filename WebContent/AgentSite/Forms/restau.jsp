<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!-- Add a Circuit -->
    <div class="ui basic modal restau-add">
    	<div class="ui header center aligned grid">Ajouter Hotel</div>
    	<div class="content">
    		<form class="ui form" action="../RestauAddServlet">
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Nom de restaurant</label>
							<input type="text" name="nomrestau">
						</div>
	      				<div class="field">
							<label class="ui green label">Address de restaurant</label>
							<input type="text" name="address">
						</div>
	    			</div>
				</div>
				
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Stars</label>
							<input type="number" name="stars">
						</div>
	      				<div class="field">
							<label class="ui green label">Prix moyen</label>
							<input type="number" name="prix">
						</div>
	    			</div>
				</div>
				
				<div class="field">
					<div class="two fields">
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