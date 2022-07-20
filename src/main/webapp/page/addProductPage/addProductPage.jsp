<jsp:include page="/ressources/Head.jsp"/>
<jsp:include page="/ressources/Header.jsp"/>
<!-- Start addProduct -->
<section id="contact-us" class="contact-us section">
	<div class="container">
		<div class="contact-head">
			<div class="row">

				<div class="col-lg-12">
					<div class="form-main">
						<div class="title">
							<h4> Admin</h4>
							<h3>Ajouter un Produit</h3>
						</div>
						<form class="prudct-validated" method="post"
							  action="/ProjetCDAGuiYan/ServletMainpage">


							<div class="form-group">
								<label for="Inputname" class="col-sm-3 control-label">Nom du
									produit</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" name="Inputname" id="Inputname"
										   placeholder="Nom produit">
								</div>
							</div>
							<!-- form-group // -->
							<div class="form-group">
								<label for="InputPrice" class="col-sm-3 control-label">Prix</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" name="InputPrice" id="InputPrice"
										   placeholder="Entrer un Prix">
								</div>
							</div>
							<!-- form-group // -->
							<div class="form-group">
								<label for="InputDescription" class="col-sm-3 control-label">Description</label>
								<div class="col-sm-9">
									<textarea class="form-control" name ="InputDescription"></textarea>
								</div>
							</div>
							<!-- form-group // -->
							<div class="form-group">
								<label for="qty" class="col-sm-3 control-label">titre</label>
								<div class="col-sm-3">
									<input type="text" class="form-control" name="InputTitre" id="qty"
										   placeholder="titre.">
								</div>
							</div>
							<!-- form-group // -->
							<div class="form-group">
								<label class="col-sm-3 control-label">Stock</label>
								<div class="col-sm-3">
									<label class="control-label small" for="InputStock"></label> <input
										type="text" class="form-control" name="date_start"
										id="InputStock" placeholder="" name ="InputStock">
								</div>
								<div class="col-sm-3">
									<label class="control-label small" for="date_finish">stock
										min:</label> <input type="text" class="form-control" name="InputStockMin"
															id="InputStockMin" placeholder="min">
								</div>
							</div>
							<!-- form-group // -->
							<div class="form-group">
								<label for="InputImage" class="col-sm-3 control-label">Images du
									produit</label>
								<div class="col-sm-3">
									<label class="control-label small" for="file_img">Image
										(jpg/png):</label> <input type="file" name="InputImage" id="InputImage">
								</div>
							</div>
							<!-- form-group // -->
							<div class="form-group">
								<label for="InputCategory" class="col-sm-3 control-label">Categorie</label>
								<div class="col-sm-3">
									<select class="form-control" name ="InputCategory">
										<option value="">Categorie</option>
										<option value="texnolog2">placebo</option>

									</select>
								</div>
								<div class="col-sm-3">
									<select class="form-control" name ="InputSousCategory">
										<option value="">Sous-Categorie</option>
										<option value="texnolog2">placebo</option>

									</select>
								</div>
							</div>
							<!-- form-group // -->
							<hr>
							<div class="form-group">
								<div class="col-sm-offset-3 col-sm-9">
									<button type="submit" class="btn btn-primary ">Submit</button>

								</div>
							</div>
							<!-- form-group // -->
						</form>
					</div>
				</div>

			</div>
		</div>
	</div>
</section>
<jsp:include page="/Footer.jsp"/>
