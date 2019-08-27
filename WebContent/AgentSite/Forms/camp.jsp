<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!-- Add a Circuit -->
    <div class="ui basic modal camp-add">
    	<div class="ui header center aligned grid">Ajouter Camp</div>
    	<div class="content">
    		<form class="ui form" action="../CampAddServlet">
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Nom de camp</label>
							<input type="text" name="nomcamp">
						</div>
	      				<div class="field">
							<label class="ui green label">Address de camp</label>
							<input type="text" name="address">
						</div>
	    			</div>
				</div>
				
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Nombre des places</label>
							<input type="number" name="capa">
						</div>
						<div class="field">
							<label class="ui green label">Surface</label>
							<input type="number" name="area">
						</div>
	      				
	    			</div>
				</div>
				
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Ville</label>
							<input type="text" name="idville">
						</div>
	      				<div class="field">
							<label class="ui green label">Prix moyen</label>
							<input type="number" name="avprix">
						</div>
	    			</div>
				</div>
				
				
				<input class="ui green inverted button" type="submit" value="Add">
    		</form>
    	</div>
    </div>
    
    