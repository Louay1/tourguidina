<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!-- Add a Circuit -->
    <div class="ui basic mini modal circuit-add">
    	<div class="ui header center aligned grid">Add Circuit</div>
    	<div class="content">
    		<form class="ui form">
				<div class="field">
					<label class="ui green label">Nom De Circuit</label>
					<input type="text" name="nomcircuit">
				</div>
				
				<div class="field">
					<label class="ui green label">Point de Dapart</label>
					<input type="text" name="pointdep">
				</div>
				
				<div class="field">
					<label class="ui green label">Point de Fin</label>
					<input type="text" name="pointdfin">
				</div>
				
				<input class="ui green inverted button" type="submit" value="Add">
    		</form>
    	</div>
    </div>
    
    