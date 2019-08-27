<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!-- Add a Circuit -->
    <div class="ui basic modal guide-add">
    	<div class="ui header center aligned grid">Ajouter Guide</div>
    	<div class="content">
    		<form class="ui form" action="../GuideAddServlet">
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Nom de Guide</label>
							<input type="text" name="nomguide">
						</div>
	      				<div class="field">
							<label class="ui green label">Address de Guide</label>
							<input type="text" name="address">
						</div>
	    			</div>
				</div>
				
				<div class="field">
					<div class="two fields">
						<div class="field">
							<label class="ui green label">Email</label>
							<input type="email" name="email">
						</div>
	      				<div class="field">
							<label class="ui green label">Phone</label>
							<input type="number" name="phone">
						</div>
						<div class="field">
							<label class="ui green label">Prix</label>
							<input type="number" name="avprix">
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