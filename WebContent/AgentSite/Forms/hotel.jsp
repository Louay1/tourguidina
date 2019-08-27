<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!-- Add a Circuit -->
    <div class="ui basic modal hotel-add">
    	<div class="ui header center aligned grid">Ajouter Hotel</div>
    	<div class="content">
    		<form class="ui form" action="../HotelAddServlet">
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Nom d'hotel</label>
							<input type="text" name="nomhotel">
						</div>
	      				<div class="field">
							<label class="ui green label">Address d'hotel</label>
							<input type="text" name="address">
						</div>
	    			</div>
				</div>
				
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Nombre des chambres</label>
							<input type="number" name="rooms">
						</div>
	      				<div class="field">
							<label class="ui green label">Prix moyen</label>
							<input type="number" name="avprice">
						</div>
	    			</div>
				</div>
				
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Ville</label>
							<input type="number" name="ville">
						</div>
	      				<div class="field">
							<label class="ui green label">Stars</label>
							<input type="number" name="stars">
						</div>
	    			</div>
				</div>
				
				
				<input class="ui green inverted button" type="submit" value="Add">
    		</form>
    	</div>
    </div>
    
    