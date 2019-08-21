<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<!-- Start of Sign In -->
			<div class="ui basic mini modal sign-in">
				<div class="ui header center aligned grid">Sign In</div>
				<div class="content">
					<form action="../LoginServlet" class="ui form">
						<div class="field">
							<label class="ui orange label">Email</label>
							<input type="email" name="email" placeholder="Ex: chouchane@email.com">
						</div>
						<div class="field">
							<label class="ui orange label">Password</label>
							<input type="password" name="password" placeholder="Again? dO yOu UnDeRsTanD?!">
						</div>
						
						<input class="ui orange inverted button" type="submit" value="Submit">
					</form>
				</div>
			</div>
			<!-- End of Sign In -->
