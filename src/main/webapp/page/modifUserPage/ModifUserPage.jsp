<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/ressources/Head.jsp"/>
<jsp:include page="/ressources/Header.jsp"/>
<div class="container w-50">
	<h1>Mes informations</h1>
	<div class="card" style="">
		<ul class="list-group list-group-flush">
			<li class="list-group-item ">
				<div class="row py-2">
					<div class="col-6">
					<label><b>Nom :</b></label> <br><input name="Nom" placeholder="${User.nom}">
					</div>
					<div class="col-6 d-grid gap-2 d-md-flex justify-content-md-end">
						<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal" value="modifNom">Modifier
						
						</button>
					</div>
				</div>
			</li>
			<li class="list-group-item"><div class="row py-2">
					<div class="col-6">
						<label><b>Prénom :</b></label> <br><input name="Prenom" placeholder="${User.prenom}">
					</div>
					<div class="col-6 d-grid gap-2 d-md-flex justify-content-md-end">
						<button type="button" class="btn btn-primary" value="modifPrenom">Modifier</button>
					</div>
				</div></li>
			<li class="list-group-item"><div class="row py-2">
					<div class="col-6">
						<label><b>Email :</b></label> <br><input name="Email" placeholder="${User.email}">
					</div>
					<div class="col-6 d-grid gap-2 d-md-flex justify-content-md-end">
						<button type="button" class="btn btn-primary" value="modifEmail">Modifier</button>
					</div>
				</div></li>
				<li class="list-group-item"><div class="row py-2">
					<div class="col-6">
						<b>Mot de passe :</b> <span><br>********</span>
					</div>
					<div class="col-6 d-grid gap-2 d-md-flex justify-content-md-end">
						<button type="button" class="btn btn-primary" value="">Modifier</button>
					</div>
				</div>
				</li>
		</ul>

	</div>
</div>

<div class="modal" tabindex="-1" id="exampleModal">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Modal title</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <p>Modal body text goes here.</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary" name="buttonValider" value="" >Save changes</button>
      </div>
    </div>
  </div>
</div>
<jsp:include page="/Footer.jsp"/>
