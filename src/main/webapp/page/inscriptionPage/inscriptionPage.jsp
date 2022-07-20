<script type="text/javascript" src="ressources/InscriptionApp.js"></script>
<jsp:include page="/ressources/Head.jsp"/>

<jsp:include page="/ressources/Header.jsp"/>

${User.nom}



<div class="container">
	<form class="was-validated" method ="post" action ="/ProjetCDAGuiYan/ServletMainpage">
		<div class="row mb-3">
			<div class="col">
				<label for="InputFirstName" class="form-label">First Name</label> <input
					type="text" class="form-control" placeholder="john"
					id="InputFirstName" aria-label="First name" name="InputFirstName" required>
			</div>
			<div class="col">
				<label for="InputLastName" class="form-label">Last Name</label> <input
					type="text" class="form-control" placeholder="doe"
					id="InputLastName" aria-label="Last name" name="InputLastName" required>
			</div>
		</div>
		<div class="mb-3">
			<label for="InputEmail" class="form-label">Email address</label> <input
				type="email" class="form-control" id="InputEmail"
				aria-describedby="emailHelp" placeholder="johndoe@example.com"
				name="InputEmail"
				required>
			<div id="emailHelp" class="form-text">We'll never share your
				email with anyone else.</div>
		</div>
		<label for="InputPassword" class="form-label">Create Password</label>
		<div class="input-group mb-3" id="show_hide_InputPassword">
			<input type="password" class="form-control" id="InputPassword" name="InputPassword"
				required> <a class="btn btn-outline-success "> <i
				class="bi bi-eye-slash"></i>
			</a>
		</div>
		<label for="ConfirmPassword" class="form-label">ConfirmPassword</label>
		<div class="input-group mb-3" id="show_hide_ConfirmPassword">
			<input type="password" class="form-control" id="ConfirmPassword" name="ConfirmPassword"
				required> <a class="btn btn-outline-success "> <i
				class="bi bi-eye-slash"></i>
			</a>
		</div>

		<div class="col-12">
			<div class="form-check">
				<input class="form-check-input" type="checkbox" 
					id="invalidCheck" aria-describedby="invalidCheckFeedback" required>
				<label class="form-check-label" for="invalidCheck"> Agree to
					terms and conditions </label>
				<div id="invalidCheckFeedback" class="invalid-feedback">You
					must agree before submitting.</div>
			</div>
		</div>
		<div class="d-grid gap-2 d-md-flex justify-content-md-end">
		<button type="submit" class="btn btn-primary ">Submit</button>
		</div>
	</form>
</div>
<jsp:include page="/Footer.jsp"/>
