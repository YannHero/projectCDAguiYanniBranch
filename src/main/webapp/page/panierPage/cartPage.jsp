<script type="text/javascript" src="${pageContext.request.contextPath}/ressources/InscriptionApp.js"></script>
<jsp:include page="/ressources/Head.jsp"/>
<jsp:include page="/ressources/Header.jsp"/>
<!-- Header -->
<header class="header shop">
	<!-- Topbar -->

	<div class="middle-inner">
		<div class="container">
			<div class="row">
				<div class="col-lg-1">
					<!-- Logo -->
					<div class="logo">
						<a href="index.html"><img src="${pageContext.request.contextPath}/rssources/images/logo.png" alt="logo"></a>
					</div>

					<!--/ End Logo -->
					<!-- Search Form -->
					<div class="search-top">
						<div class="top-search"><a href="#0"><i class="ti-search"></i></a></div>
						<!-- Search Form -->
						<div class="search-top">
							<form class="search-form">
								<input type="text" placeholder="recherche..." name="search">
								<button value="search" type="submit"><i class="ti-search"></i></button>
							</form>
						</div>
						<!--/ End Search Form -->
					</div>
					<!--/ End Search Form -->
					<div class="mobile-nav"> </div>
				</div>
				<div class="col-lg-7">

					<div class="search-bar-top">
						<div class="search-bar">
							<select>
								<option selected="selected">All Category</option>
								<option>STUFF</option>
								<option>patacoufin</option>
								<option>Test</option>
							</select>
							<form>
								<input name="search" placeholder="Search Products Here....." type="search">
								<button value="search" type="submit" class ="btnn"> <i class="ti-search"></i></button>

							</form>
						</div>
					</div>
				</div>
				<div class="col-lg-2">

					<div class="right-bar">
						<!-- Search Form -->

						<div class="sinlge-bar shopping">
							<a href="#" class="single-icon"><i class="ti-bag"></i> <span class="total-count"></span></a>
							<!-- Shopping Item -->
							<div class="shopping-item">
								<div class="dropdown-cart-header">
									<span> x items</span>
									<a href="#">View Cart</a>
								</div>
								<ul class="shopping-list">
									<li>
										<a href="#" class="remove" title="Remove this item"><i class="fa fa-remove"></i></a>
										<a class="cart-img" href="#"><img src="https://via.placeholder.com/70x70" alt="#"></a>
										<h4><a href="#">PRODUCT</a></h4>
										<p class="quantity">1x - <span class="amount"></span></p>
									</li>
								</ul>
								<div class="bottom">
									<div class="total">
										<span>Total</span>
										<span class="total-amount"></span>
									</div>
									<a href="checkout.html" class="btn animate">Commandez</a>
								</div>
							</div>
							<!--/ End Shopping Item -->
						</div>
					</div>
				</div>
				<div class="col-lg-2">

					<button type="button" class="btn btn-success">Connection</button>
				</div>
			</div>

		</div>
	</div>
	<!-- Header Inner -->
	<div class="header-inner" style="background: #039203">
		<div class="container">
			<div class="cat-nav-head">
				<div class="row">
					<div class="col-lg-9 col-12">
						<div class="menu-area">
							<!-- Main Menu -->
							<nav class="navbar navbar-expand-lg">
								<div class="navbar-collapse">
									<div class="nav-inner">
										<ul class="nav main-menu menu navbar-nav">
											<li class=""><a href="#">Acceuil</a></li>
											<li><a href="#">Categorie</a></li>
											<li><a href="#">Categorie</a></li>
											<li><a href="#">Categorie</a></li>
											<li><a href="#">Categorie</a></li>
											<li><a href="contact.html">Contact</a></li>
										</ul>
									</div>
								</div>
							</nav>
							<!--/ End Main Menu -->
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--/ End Header Inner -->
</header>
<!--/ End Header -->


<!-- Breadcrumbs -->
<div class="breadcrumbs">
	<div class="container">
		<div class="row">
			<div class="col-12">
				<div class="bread-inner">
					<ul class="bread-list">
						<li><a href="index1.html">Home<i class="ti-arrow-right"></i></a></li>
						<li class="active"><a href="blog-single.html">Cart</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- End Breadcrumbs -->

<!-- Shopping Cart -->
<div class="shopping-cart section">
	<div class="container">
		<div class="row">
			<div class="col-12">
				<!-- Shopping Summery -->
				<table class="table shopping-summery">
					<thead>
					<tr class="main-hading">
						<th>Produit</th>
						<th>Nom</th>
						<th class="text-center">Prix du Produit</th>
						<th class="text-center">Quantité</th>
						<th class="text-center">Total</th>
						<th class="text-center"><i class="ti-trash remove-icon"></i></th>
					</tr>
					</thead>
					<tbody>
					<tr>
						<td class="image" data-title="No"><img src="https://via.placeholder.com/100x100" alt="#"></td>
						<td class="product-des" data-title="Description">
							<p class="product-name"><a href="#">Mon Produit</a></p>
							<p class="product-des">Maboriosam in a tonto nesciung eget  distingy magndapibus.</p>
						</td>
						<td class="price" data-title="Price"><span>00.00 </span></td>
						<td class="qty" data-title="Qty"><!-- Input Order -->
							<div class="input-group">
								<div class="button minus">
									<button type="button" class="btn btn-primary btn-number" disabled="disabled" data-type="minus" data-field="quant[1]">
										<i class="ti-minus"></i>
									</button>
								</div>
								<input type="text" name="quant[1]" class="input-number"  data-min="1" data-max="100" value="1">
								<div class="button plus">
									<button type="button" class="btn btn-primary btn-number" data-type="plus" data-field="quant[1]">
										<i class="ti-plus"></i>
									</button>
								</div>
							</div>
							<!--/ End Input Order -->
						</td>
						<td class="total-amount" data-title="Total"><span>0.0</span></td>
						<td class="action" data-title="Remove"><a href="#"><i class="ti-trash remove-icon"></i></a></td>
					</tr>

					</tbody>
				</table>
				<!--/ End Shopping Summery -->
			</div>
		</div>
		<div class="row">
			<div class="col-12">
				<!-- Total Amount -->
				<div class="total-amount">
					<div class="row">
						<div class="col-lg-4 col-md-7 col-12">
							<div class="center">
								<ul>
									<li>Total <span>00.00</span></li>

								</ul>
								<div class="button5">
									<a href="#" class="btn">Checkout</a>
									<a href="#" class="btn">Continue shopping</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--/ End Total Amount -->
			</div>
		</div>
	</div>
</div>
<!--/ End Shopping Cart -->
<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span class="ti-close" aria-hidden="true"></span></button>
			</div>
			<div class="modal-body">
				<div class="row no-gutters">
					<div class="col-lg-6 col-md-12 col-sm-12 col-xs-12">
						<!-- Product Slider -->
						<div class="product-gallery">
							<div class="quickview-slider-active">
								<div class="single-slider">
									<img src="images/modal1.jpg" alt="#">
								</div>
								<div class="single-slider">
									<img src="images/modal2.jpg" alt="#">
								</div>
								<div class="single-slider">
									<img src="images/modal3.jpg" alt="#">
								</div>
								<div class="single-slider">
									<img src="images/modal4.jpg" alt="#">
								</div>
							</div>
						</div>
						<!-- End Product slider -->
					</div>
					<div class="col-lg-6 col-md-12 col-sm-12 col-xs-12">
						<div class="quickview-content">
							<h2>Flared Shift Dress</h2>
							<div class="quickview-ratting-review">
								<div class="quickview-ratting-wrap">
									<div class="quickview-ratting">
										<i class="yellow fa fa-star"></i>
										<i class="yellow fa fa-star"></i>
										<i class="yellow fa fa-star"></i>
										<i class="yellow fa fa-star"></i>
										<i class="fa fa-star"></i>
									</div>
									<a href="#"> (1 customer review)</a>
								</div>
								<div class="quickview-stock">
									<span><i class="fa fa-check-circle-o"></i> in stock</span>
								</div>
							</div>
							<h3>$29.00</h3>
							<div class="quickview-peragraph">
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia iste laborum ad impedit pariatur esse optio tempora sint ullam autem deleniti nam in quos qui nemo ipsum numquam.</p>
							</div>
							<div class="size">
								<div class="row">
									<div class="col-lg-6 col-12">
										<h5 class="title">Size</h5>
										<select>
											<option selected="selected">s</option>
											<option>m</option>
											<option>l</option>
											<option>xl</option>
										</select>
									</div>
									<div class="col-lg-6 col-12">
										<h5 class="title">Color</h5>
										<select>
											<option selected="selected">orange</option>
											<option>purple</option>
											<option>black</option>
											<option>pink</option>
										</select>
									</div>
								</div>
							</div>
							<div class="quantity">
								<!-- Input Order -->
								<div class="input-group">
									<div class="button minus">
										<button type="button" class="btn btn-primary btn-number" disabled="disabled" data-type="minus" data-field="quant[1]">
											<i class="ti-minus"></i>
										</button>
									</div>
									<input type="text" name="quant[1]" class="input-number"  data-min="1" data-max="1000" value="1">
									<div class="button plus">
										<button type="button" class="btn btn-primary btn-number" data-type="plus" data-field="quant[1]">
											<i class="ti-plus"></i>
										</button>
									</div>
								</div>
								<!--/ End Input Order -->
							</div>
							<div class="add-to-cart">
								<a href="#" class="btn">Add to cart</a>
								<a href="#" class="btn min"><i class="ti-heart"></i></a>
								<a href="#" class="btn min"><i class="fa fa-compress"></i></a>
							</div>
							<div class="default-social">
								<h4 class="share-now">Share:</h4>
								<ul>
									<li><a class="facebook" href="#"><i class="fa fa-facebook"></i></a></li>
									<li><a class="twitter" href="#"><i class="fa fa-twitter"></i></a></li>
									<li><a class="youtube" href="#"><i class="fa fa-pinterest-p"></i></a></li>
									<li><a class="dribbble" href="#"><i class="fa fa-google-plus"></i></a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- Modal end -->
<jsp:include page="/Footer.jsp"/>
