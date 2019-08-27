<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!-- Add a Circuit -->
    <div class="ui basic modal trans-add">
    	<div class="ui header center aligned grid">Ajouter Transport</div>
    	<div class="content">
    		<form class="ui form">
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Nom de Trasporteur</label>
							<input type="text" name="adr">
						</div>
	      				<div class="field">
							<label class="ui green label">Address de Trasporteur</label>
							<input type="text" name="idvoy">
						</div>
	    			</div>
				</div>
				
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Nombre des Places</label>
							<input type="number" name="idvoy">
						</div>
	      				<div class="field">
							<label class="ui green label">Ville</label>
							<input type="text" name="adr">
						</div>
	    			</div>
				</div>
				<input class="ui green inverted button" type="submit" value="Add">
    		</form>
    	</div>
    </div>