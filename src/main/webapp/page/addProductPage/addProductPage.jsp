<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

							<hr>

							<form method="post">
								<div class="mb-3">
									<label for="ProductName" class="form-label">Nom Du Produit</label>
									<input type="text" class="form-control" id="ProductName" name="Inputname"
										   value="<c:out  value="${showProduct.ProductName }" /> ">
								</div>
								<div class="mb-3">
									<label for="price" class="form-label">Prix</label>
									<input type="number" class="form-control" id="price" name="InputPrice"
										   value="${showProduct.price }">
								</div>
								<div class="mb-3">
									<label for="Description" class="form-label">Description</label>
									<input type="text" class="form-control" id="Description" name="InputDescription"
										   value="${showProduct.Description }">
								</div>
								<div class="mb-3">
									<label for="Titre" class="form-label">Titre</label>
									<input type="text" class="form-control" id="Titre" name="InputTitre"
										   value="${showProduct.Titre }">
								</div>
								<div class="mb-3">
									<label for="Stock" class="form-label">Stock</label>
									<input type="number" class="form-control" id="Stock" name="InputStock"
										   value="${showProduct.Stock }">
								</div>
								<div class="mb-3">
									<label for="StockMin" class="form-label">Stock Minimal</label>
									<input type="number" class="form-control" id="StockMin" name="InputStockMin"
										   value="${showProduct.StockMin }">
								</div>
								<div class="mb-3">
									<label for="StockMin" class="form-label">Image du produit</label>
									<br>
									<input type="file" name="thisImage" id="InputImage"
										   value="${showProduct.thisImage }">
								</div>
								<div class="mb-3">
									<label for="Category" class="form-label">Categorie</label>

									<select class="form-control" name ="InputCategory" id="Category"  value="${showProduct.Category }">
										<option value="">Categorie</option>
										<option value="">placebo</option>

									</select>
								</div>
								<div class="mb-3">
									<label for="SousCategory" class="form-label">Sous Category</label>

									<select class="form-control" name ="InputSousCategory" id="SousCategory" value="${showProduct.SousCategory }">
										<option value="">Categorie</option>
										<option value="">placebo</option>

									</select>
								</div>

								<button type="submit" class="btn btn-primary">Ajouter ce produit</button>
							</form>


							<!-- form-group // -->
					</div>
				</div>

			</div>
		</div>
	</div>
</section>
<jsp:include page="/Footer.jsp"/>
