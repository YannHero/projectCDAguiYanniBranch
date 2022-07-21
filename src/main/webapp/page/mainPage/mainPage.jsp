<jsp:include page="/ressources/Head.jsp"/>

<jsp:include page="/ressources/Header.jsp"/>
<!-- Slider Area -->
<section class="hero-slider">
    <!-- Single Slider -->
    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img class="d-block w-100" src="https://via.placeholder.com/1200x350" alt="First slide">
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" src="https://via.placeholder.com/1200x350" alt="Second slide">
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" src="https://via.placeholder.com/1200x350" alt="Third slide">
            </div>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</section>
<!--/ End Slider Area -->
<!-- Start Product Area -->
<div class="product-area section">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="section-title">
                    <h2>Notre Selection</h2>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-12">
                <div class="product-info">
                    <div class="nav-main">
                        <!-- Tab Nav -->
                        <ul class="nav nav-tabs" id="myTab" role="tablist">
                            <li class="nav-item"><a class="nav-link active" data-toggle="tab" href="#1" role="tab">Catégorie</a></li>
                            <li class="nav-item"><a class="nav-link" data-toggle="tab" href="#2" role="tab">Catégorie</a></li>
                            <li class="nav-item"><a class="nav-link" data-toggle="tab" href="#3" role="tab">Catégorie</a></li>
                            <li class="nav-item"><a class="nav-link" data-toggle="tab" href="#4" role="tab">Catégorie</a></li>
                            <li class="nav-item"><a class="nav-link" data-toggle="tab" href="#5" role="tab">Catégorie</a></li>
                            <li class="nav-item"><a class="nav-link" data-toggle="tab" href="#6" role="tab">Catégorie</a></li>
                        </ul>
                        <!--/ End Tab Nav -->
                    </div>
                    <div class="tab-content" id="myTabContent">
                        <!-- Start Single Tab -->
                        <div class="tab-pane fade show active" id="man" role="tabpanel">
                            <div class="tab-single">
                                <div class="row">
                                    <div class="col-xl-3 col-lg-4 col-md-4 col-12">
                                        <div class="single-product">
                                            <div class="product-img">
                                                <a href="/ServletMyProduct">
                                                    <img class="default-img" src="https://via.placeholder.com/550x750" alt="#">
                                                    <img class="hover-img" src="https://via.placeholder.com/550x750" alt="#">
                                                </a>
                                                <div class="button-head">
                                                    <div class="product-action">
                                                        <a title="Wishlist" href="#"><i class=" ti-heart "></i><span>Ajouter aux favoris</span></a>
                                                    </div>
                                                    <div class="product-action-2">
                                                        <a title="AjoutPanier" href="#">Ajouter au Panier</a>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <h3><a href="product-details.html">Lorem Ipusm</a></h3>
                                                <div class="produit-prix">
                                                    <span>00.00</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>


                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="/Footer.jsp"/>

<!-- End Product Area -->