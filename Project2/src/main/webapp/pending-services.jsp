<!DOCTYPE html>
<%@page import="dao.CustomerDao"%>
<%@page import="model.Customer"%>
<%@page import="dao.BookingDao"%>
<%@page import="model.BookService"%>
<%@page import="java.util.List"%>
<%@page import="model.ServiceMan"%>
<html lang="en">

<head>
<meta charset="utf-8">
<title>ROYAL CARS - Car Rental HTML Template</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="Free HTML Templates" name="keywords">
<meta content="Free HTML Templates" name="description">

<!-- Favicon -->
<link href="img/favicon.ico" rel="icon">

<!-- Google Web Fonts -->
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Oswald:wght@400;500;600;700&family=Rubik&display=swap"
	rel="stylesheet">

<!-- Font Awesome -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.0/css/all.min.css"
	rel="stylesheet">

<!-- Libraries Stylesheet -->
<link href="lib/owlcarousel/assets/owl.carousel.min.css"
	rel="stylesheet">
<link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css"
	rel="stylesheet" />

<!-- Customized Bootstrap Stylesheet -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Template Stylesheet -->
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<%
	ServiceMan s = null;
	if (session.getAttribute("data") != null) {
		s = (ServiceMan) session.getAttribute("data");
	} else {
		response.sendRedirect("serviceman-login.jsp");
	}
	%>
	<!-- Topbar Start -->
	<div class="container-fluid bg-dark py-3 px-lg-5 d-none d-lg-block">
		<div class="row">
			<div class="col-md-6 text-center text-lg-left mb-2 mb-lg-0">
				<div class="d-inline-flex align-items-center">
					<a class="text-body pr-3" href=""><i
						class="fa fa-phone-alt mr-2"></i>+012 345 6789</a> <span
						class="text-body">|</span> <a class="text-body px-3" href=""><i
						class="fa fa-envelope mr-2"></i>info@example.com</a>
				</div>
			</div>
			<div class="col-md-6 text-center text-lg-right">
				<div class="d-inline-flex align-items-center">
					<a class="text-body px-3" href=""> <i class="fab fa-facebook-f"></i>
					</a> <a class="text-body px-3" href=""> <i class="fab fa-twitter"></i>
					</a> <a class="text-body px-3" href=""> <i
						class="fab fa-linkedin-in"></i>
					</a> <a class="text-body px-3" href=""> <i class="fab fa-instagram"></i>
					</a> <a class="text-body pl-3" href=""> <i class="fab fa-youtube"></i>
					</a>
				</div>
			</div>
		</div>
	</div>
	<!-- Topbar End -->


	<!-- Navbar Start -->
	<div class="container-fluid position-relative nav-bar p-0">
		<div class="position-relative px-lg-5" style="z-index: 9;">
			<nav
				class="navbar navbar-expand-lg bg-secondary navbar-dark py-3 py-lg-0 pl-3 pl-lg-5">
				<a href="" class="navbar-brand">
					<h1 class="text-uppercase text-primary mb-1">E-Service</h1>
				</a>
				<button type="button" class="navbar-toggler" data-toggle="collapse"
					data-target="#navbarCollapse">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse justify-content-between px-3"
					id="navbarCollapse">
					<div class="navbar-nav ml-auto py-0">
						<a href="serviceman-index.jsp" class="nav-item nav-link active">Home</a>
						<div class="nav-item dropdown">
							<a href="#" class="nav-link dropdown-toggle"
								data-toggle="dropdown">Services</a>
							<div class="dropdown-menu rounded-0 m-0">
								<a href="pending-services.jsp" class="dropdown-item">Pending</a>
								<a href="completed-service.jsp" class="dropdown-item">Completed</a>
							</div>
						</div>
						<div class="nav-item dropdown">
							<a href="#" class="nav-link dropdown-toggle"
								data-toggle="dropdown"><%=s.getName()%></a>
							<div class="dropdown-menu rounded-0 m-0">
								<a href="serviceman-profile.jsp" class="dropdown-item">Profile</a>
								<a href="serviceman-change-password.jsp" class="dropdown-item">Change
									Password</a> <a href="serviceman-logout.jsp" class="dropdown-item">Logout</a>
							</div>
						</div>
					</div>
				</div>
			</nav>
		</div>
	</div>
	<!-- Navbar End -->


	<!-- Search Start -->
	<div class="container-fluid bg-white pt-3 px-lg-5">
		<%
		List<BookService> list = BookingDao.pendingServicesBySid(s.getId());
		%>
		<%
		for (BookService b : list) {
		%>
		<div class="row mx-n2">
			<%
			int cid = b.getCid();
			%>
			<%
			Customer c = CustomerDao.getCustomerById(cid);
			%>
			<div class="col-xl-2 col-lg-4 col-md-6 px-2">
				<div data-target-input="nearest">
					<input type="text" class="form-control p-4 datetimepicker-input"
						value="<%=c.getName() %>" data-target="#date"
						data-toggle="datetimepicker" />
				</div>
			</div>

			<div class="col-xl-2 col-lg-4 col-md-6 px-2">
				<div data-target-input="nearest">
					<input type="text" class="form-control p-4 datetimepicker-input"
						value="<%=c.getEmail() %>" data-target="#date" data-toggle="datetimepicker" />
				</div>
			</div>
			<div class="col-xl-2 col-lg-4 col-md-6 px-2">
				<div data-target-input="nearest">
					<input type="text" class="form-control p-4 datetimepicker-input"
						value="<%=c.getContact() %>" data-target="#date" data-toggle="datetimepicker" />
				</div>
			</div>
			<div class="col-xl-2 col-lg-4 col-md-6 px-2">
				<div data-target-input="nearest">
					<input type="text" class="form-control p-4 datetimepicker-input"
						value="<%=b.getStatus() %>" data-target="#date" data-toggle="datetimepicker" />
				</div>
			</div>

			<div class="col-xl-2 col-lg-4 col-md-6 px-2">
				<form action="BookingController" method="post">
					<input type="hidden" name="bid" value="<%=b.getBid()%>">
					<button class="btn btn-primary btn-block mb-3" type="submit"
						name="action" value="confirm" style="height: 50px;">Confirm</button>
				</form>
			</div>
			<div class="col-xl-2 col-lg-4 col-md-6 px-2">
				<button class="btn btn-primary btn-block mb-3" type="submit"
					style="height: 50px;">Reject</button>
			</div>
		</div>
		<%
		}
		%>
	</div>
	<!-- Search End -->




	<!-- Footer Start -->
	<div class="container-fluid bg-secondary py-5 px-sm-3 px-md-5"
		style="margin-top: 90px;">
		<div class="row pt-5">
			<div class="col-lg-3 col-md-6 mb-5">
				<h4 class="text-uppercase text-light mb-4">Get In Touch</h4>
				<p class="mb-2">
					<i class="fa fa-map-marker-alt text-white mr-3"></i>123 Street, New
					York, USA
				</p>
				<p class="mb-2">
					<i class="fa fa-phone-alt text-white mr-3"></i>+012 345 67890
				</p>
				<p>
					<i class="fa fa-envelope text-white mr-3"></i>info@example.com
				</p>
				<h6 class="text-uppercase text-white py-2">Follow Us</h6>
				<div class="d-flex justify-content-start">
					<a class="btn btn-lg btn-dark btn-lg-square mr-2" href="#"><i
						class="fab fa-twitter"></i></a> <a
						class="btn btn-lg btn-dark btn-lg-square mr-2" href="#"><i
						class="fab fa-facebook-f"></i></a> <a
						class="btn btn-lg btn-dark btn-lg-square mr-2" href="#"><i
						class="fab fa-linkedin-in"></i></a> <a
						class="btn btn-lg btn-dark btn-lg-square" href="#"><i
						class="fab fa-instagram"></i></a>
				</div>
			</div>
			<div class="col-lg-3 col-md-6 mb-5">
				<h4 class="text-uppercase text-light mb-4">Usefull Links</h4>
				<div class="d-flex flex-column justify-content-start">
					<a class="text-body mb-2" href="#"><i
						class="fa fa-angle-right text-white mr-2"></i>Private Policy</a> <a
						class="text-body mb-2" href="#"><i
						class="fa fa-angle-right text-white mr-2"></i>Term & Conditions</a> <a
						class="text-body mb-2" href="#"><i
						class="fa fa-angle-right text-white mr-2"></i>New Member
						Registration</a> <a class="text-body mb-2" href="#"><i
						class="fa fa-angle-right text-white mr-2"></i>Affiliate Programme</a>
					<a class="text-body mb-2" href="#"><i
						class="fa fa-angle-right text-white mr-2"></i>Return & Refund</a> <a
						class="text-body" href="#"><i
						class="fa fa-angle-right text-white mr-2"></i>Help & FQAs</a>
				</div>
			</div>
			<div class="col-lg-3 col-md-6 mb-5">
				<h4 class="text-uppercase text-light mb-4">Car Gallery</h4>
				<div class="row mx-n1">
					<div class="col-4 px-1 mb-2">
						<a href=""><img class="w-100" src="img/gallery-1.jpg" alt=""></a>
					</div>
					<div class="col-4 px-1 mb-2">
						<a href=""><img class="w-100" src="img/gallery-2.jpg" alt=""></a>
					</div>
					<div class="col-4 px-1 mb-2">
						<a href=""><img class="w-100" src="img/gallery-3.jpg" alt=""></a>
					</div>
					<div class="col-4 px-1 mb-2">
						<a href=""><img class="w-100" src="img/gallery-4.jpg" alt=""></a>
					</div>
					<div class="col-4 px-1 mb-2">
						<a href=""><img class="w-100" src="img/gallery-5.jpg" alt=""></a>
					</div>
					<div class="col-4 px-1 mb-2">
						<a href=""><img class="w-100" src="img/gallery-6.jpg" alt=""></a>
					</div>
				</div>
			</div>
			<div class="col-lg-3 col-md-6 mb-5">
				<h4 class="text-uppercase text-light mb-4">Newsletter</h4>
				<p class="mb-4">Volup amet magna clita tempor. Tempor sea eos
					vero ipsum. Lorem lorem sit sed elitr sed kasd et</p>
				<div class="w-100 mb-3">
					<div class="input-group">
						<input type="text" class="form-control bg-dark border-dark"
							style="padding: 25px;" placeholder="Your Email">
						<div class="input-group-append">
							<button class="btn btn-primary text-uppercase px-3">Sign
								Up</button>
						</div>
					</div>
				</div>
				<i>Lorem sit sed elitr sed kasd et</i>
			</div>
		</div>
	</div>
	<div class="container-fluid bg-dark py-4 px-sm-3 px-md-5">
		<p class="mb-2 text-center text-body">
			&copy; <a href="#">Your Site Name</a>. All Rights Reserved.
		</p>
		<p class="m-0 text-center text-body">
			Designed by <a href="https://htmlcodex.com">HTML Codex</a>
		</p>
	</div>
	<!-- Footer End -->


	<!-- Back to Top -->
	<a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i
		class="fa fa-angle-double-up"></i></a>


	<!-- JavaScript Libraries -->
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
	<script src="lib/easing/easing.min.js"></script>
	<script src="lib/waypoints/waypoints.min.js"></script>
	<script src="lib/owlcarousel/owl.carousel.min.js"></script>
	<script src="lib/tempusdominus/js/moment.min.js"></script>
	<script src="lib/tempusdominus/js/moment-timezone.min.js"></script>
	<script src="lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

	<!-- Template Javascript -->
	<script src="js/main.js"></script>
</body>

</html>