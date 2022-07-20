<script type="text/javascript" src="ressources/InscriptionApp.js"></script>
<jsp:include page="/ressources/Head.jsp"/>
<jsp:include page="/ressources/Header.jsp"/>
<!-- Breadcrumbs -->
<div class="breadcrumbs">
	<div class="container">
		<div class="row">
			<div class="col-12">
				<div class="bread-inner">
					<ul class="bread-list">
						<li><a href="index1.html">Home<i class="ti-arrow-right"></i></a></li>
						<li class="active"><a href="MYproduct-single.html">MYproduct Single Sidebar</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- End Breadcrumbs -->

<!-- Start MYproduct Single -->
<section class="MYproduct-single section">
	<div class="container">
		<div class="row">
			<h5>Nom du Produit</h5>
			<div class="image">
				<img src="${pageContext.request.contextPath}/ressources/images/5star.jpg" alt="#" style="width: 300px; height: auto">
			</div>
			<div class="col-lg-8 col-12">

				<div class="MYproduct-single-main">
					<div class="row">
						<div class="col-12">
							<div class="image">
								<img src="https://via.placeholder.com/950x460" alt="#">
							</div>

							<div class="MYproduct-detail">
								<h2 class="MYproduct-title">Description Produit</h2>
								<div class="content">
									<p> Lumens observare, tanquam nobilis lactea.</p>
								</div>
							</div>
							<div class="share-social">
								<div class="row">
									<div class="col-12">
										<div class="content-tags">
											<ul class="tag-inner">
												<li><a href="#">Categorie</a></li>
												<li><a href="#">Sous-Categorie</a></li>
											</ul>
										</div>
									</div>
								</div>
							</div>

						</div>
						<div class="col-12">
							<div class="comments">
								<h3 class="comment-title">Commentaires</h3>
								<!-- Single Comment -->
								<div class="single-comment">
									<div class="content">
										<h4>User <span>Date</span></h4>
										<p>Nunquam aperto poeta.</p>
									</div>
								</div>
								<!-- End Single Comment -->
								<!-- Single Comment -->
							</div>
						</div>
						<div class="col-12">
							<div class="reply">
								<div class="reply-head">
									<h2 class="reply-title">Laissez un Commentaire</h2>
									<!-- Comment Form -->
									<form class="form" action="#">
										<div class="row">
											<div class="col-lg-6 col-md-6 col-12">
												<div class="form-group">
													<label>Ton nom<span>*</span></label>
													<input type="text" name="name" placeholder="" required="required">
												</div>
											</div>
											<div class="col-lg-6 col-md-6 col-12">
												<div class="form-group">
													<label>Ton Email<span>*</span></label>
													<input type="email" name="email" placeholder="" required="required">
												</div>
											</div>
											<div class="col-12">
												<div class="form-group">
													<label>Contenu du Message<span>*</span></label>
													<textarea name="message" placeholder=""></textarea>
												</div>
											</div>
											<div class="col-12">
												<div class="form-group button">
													<button type="submit" class="btn">Poste ton commentaire</button>
												</div>
											</div>
										</div>
									</form>
									<!-- End Comment Form -->
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-lg-4 col-6">
				<div class="main-sidebar">
					<div class="single-post">
						<div class="image">
							<img src="https://via.placeholder.com/600x100" alt="#">
						</div>

						<div class="image">
							<img src="https://via.placeholder.com/600x100" alt="#">
						</div>
					</div>
				</div>


			</div>

		</div>
	</div>
</section>
<!--/ End MYproduct Single -->
<jsp:include page="/Footer.jsp"/>
