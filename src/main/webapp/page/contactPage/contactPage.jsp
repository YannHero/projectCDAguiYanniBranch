<script type="text/javascript" src="${pageContext.request.contextPath}/ressources/InscriptionApp.js"></script>
<jsp:include page="/ressources/Head.jsp"/>

<jsp:include page="/ressources/Header.jsp"/>
${User.nom}


<!-- Breadcrumbs -->
<div class="breadcrumbs">
	<div class="container">
		<div class="row">
			<div class="col-12">
				<div class="bread-inner">
					<ul class="bread-list">
						<li><a href="/ServletMainpage">Home<i class="ti-arrow-right"></i></a></li>
						<li class="active"><a href="blog-single.html">Contact</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- End Breadcrumbs -->

<!-- Start Contact -->
<section id="contact-us" class="contact-us section">
	<div class="container">
		<div class="contact-head">
			<div class="row">
				<div class="col-lg-4">
					<div class="single-head">
						<div class="single-info">
							<i class="fa fa-phone"></i>
							<h4 class="title">Téléphone:</h4>
							<ul>
								<li>+0000000000</li>
							</ul>
						</div>
						<div class="single-info">
							<i class="fa fa-envelope-open"></i>
							<h4 class="title">Email:</h4>
							<ul>
								<li><a href="">test@test.com</a></li>
								<li><a href="">test@test.com</a></li>
							</ul>
						</div>
						<div class="single-info">
							<i class="fa fa-location-arrow"></i>
							<h4 class="title">Notre Adresse:</h4>
							<ul>
								<li>Afpa CDA.</li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-lg-8">
					<div class="form-main">
						<div class="title">
							<h4>Contact !</h4>
							<h3>Ecrivez nous un message</h3>
						</div>
						<form class="form" method ="post" action ="/ProjetCDAGuiYan/ServletContact">									<div class="row">
							<div class="col-lg-6 col-12">
								<div class="form-group">
									<label>Nom<span>*</span></label>
									<input name="name" type="text" placeholder="">
								</div>
							</div>
							<div class="col-lg-6 col-12">
								<div class="form-group">
									<label>Sujet<span>*</span></label>
									<input name="subject" type="text" placeholder="">
								</div>
							</div>
							<div class="col-lg-6 col-12">
								<div class="form-group">
									<label>Email<span>*</span></label>
									<input name="email" type="email" placeholder="">
								</div>
							</div>
							<div class="col-lg-6 col-12">
								<div class="form-group">
									<label>Phone<span>*</span></label>
									<input name="company_name" type="text" placeholder="">
								</div>
							</div>
							<div class="col-12">
								<div class="form-group message">
									<label>message<span>*</span></label>
									<textarea name="message" placeholder=""></textarea>
								</div>
							</div>
							<div class="col-12">
								<div class="form-group button">
									<button type="submit" class="btn ">Confirmez</button>
								</div>
							</div>
						</div>
						</form>
					</div>
				</div>

			</div>
		</div>
	</div>
</section>
<!--/ End Contact -->
<jsp:include page="/Footer.jsp"/>
