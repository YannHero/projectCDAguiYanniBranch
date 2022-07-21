
<body class="js">
	<script type="text/javascript" src="ressources/HeaderApp.js"></script>




	<!-- Header -->
	<header class="header shop">
		<!-- Topbar -->

		<div class="middle-inner">
			<div class="container">
				<div class="row">
					<div class="col-lg-1">
						<!-- Logo -->
						<div class="logo">
							<a href="index.html"><img src="${pageContext.request.contextPath}/ressources/images/logo.png" alt="logo"></a>
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
										<a href="${pageContext.request.contextPath}/ServletMesCommandesPage" class="btn animate">Commandez</a>
									</div>
								</div>
								<!--/ End Shopping Item -->
							</div>
						</div>
					</div>
					<div class="col-lg-2">
						<button type="button" class="btn btn-dark" data-bs-toggle="modal fade" data-bs-target="#login">Connection</button>

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
												<li class=""><a href="${pageContext.request.contextPath}/ServletMainpage">Acceuil</a></li>
												<li><a href="">Categorie</a></li>
												<li><a href="#">Categorie</a></li>
												<li><a href="#">Categorie</a></li>
												<li><a href="#">Categorie</a></li>
												<li><a href="${pageContext.request.contextPath}/ServletContact">Contact</a></li>
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
		<!-- modal login -->

		<div class="modal fade" id="login" data-bs-backdrop="static"
			 data-bs-keyboard="false" tabindex="-1"
			 aria-labelledby="staticBackdropLabel" aria-hidden="true">
			<div
					class="modal-dialog modal-sm modal-dialog-scrollable position-fixed top-0 end-0">
				<div class="modal-content">
					<div class="modal-header container row">

						<h5 class="modal-title h4 col-8" id="exampleModalSmLabel">Admin
							Login</h5>
						<button type="button" class="btn-close col-4"
								data-bs-dismiss="modal" aria-label="Close"></button>
						<p>Welcome back. Enter your credentials to access your account</p>
					</div>
					<div class="modal-body login">
						<form method ="get">
							<div class="mb-3">
								<label for="loginEmail" class="form-label">Email address</label>
								<input type="email" class="form-control" id="loginEmail"
									   aria-describedby="emailHelp" placeholder="johndoe@example.com"
									   name="loginEmail" required>

							</div>
							<label for="InputLoginPassword" class="form-label">Password</label>
							<div class="input-group mb-3" id="show_hide_InputLoginPassword">
								<input type="password" class="form-control"
									   id="InputLoginPassword" name="InputLoginPassword" required>
								<a class="btn btn-outline-success "> <i
										class="bi bi-eye-slash"></i>
								</a>
							</div>
							<button type="submit" class="btn btn-success col-12">Submit</button>
						</form>
					</div>
					<div class="modal-footer">
						Don't have an Account? <a href="ServletInscription">Sign up
						here</a>
					</div>
				</div>
			</div>
		</div>
	</header>
	<!--/ End Header -->
