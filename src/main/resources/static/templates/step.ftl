<!doctype html>
<html>

<head>
	<title>Refresh steps</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords"
		content="Ravishing Contact Form Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
	<script type="application/x-javascript">
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<script src="https://s3.pstatp.com/cdn/expire-1-M/jquery/3.3.1/jquery.min.js"></script>
	<!-- fonts -->
	<link href="//fonts.googleapis.com/css?family=Raleway:100,200,300,400,500,600,700,800,900" rel="stylesheet">
	<link href="//fonts.googleapis.com/css?family=Roboto+Condensed:300,400,700" rel="stylesheet">
	<!-- /fonts -->
	<!-- css -->
	<link href="../css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all" />
	<link href="../css/stylee.css" rel="stylesheet" type='text/css' media="all" />
	<link rel="icon" href="../image/favicon.ico" type="image/x-icon" />
	<!-- /css -->
</head>

<body>

<div >
	<h1 class="w3layouts">XiaoMiSports</h1>
</div>
	<div class="content-w3ls">
		<div class="content1-agile">
			<div class="info-w3l">
				<h2 class="wthree">Refresh steps</h2>
				<form method="post" class="form-agileits">
					<input type="tel" id="username" name="username" placeholder="username"
						   title="Please enter your First Name" required="">
					<input type="text" id="email" name="password" placeholder="password"
						   title="Please enter a Valid Email Address" required="">
					<input type="text" id="step" name="step" placeholder="refresh steps"
						   title="Please enter a Valid Email Address" required="">
					<input type="button" id="click" class="sign-in" value="Submit">
				</form>
				<p class="agileinfo">ICE</p>
				<ul class="social-w3-agileits">
					<li><a href="#"><i class="fa fa-facebook"></i></a></li>
					<li><a href="#"><i class="fa fa-twitter"></i></a></li>
					<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
					<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
				</ul>
			</div>
		</div>
		<div class="content2-agile">

		</div>
		<div class="clear"></div>
	</div>
	<p class="copyright-agileits">Nor shall Death brag thou wander'st in his shade, When in eternal lines to time thou
		growest</p>
</body>
<script type="text/javascript">
	$('#click').click(function () {

		user = document.getElementById("username")
		pass = document.getElementById("email")
		step = document.getElementById("step")

		$.ajax({
			type: 'post',
			url: '/mi',
			data: {
				phoneNumber: user.value,
				password: pass.value,
				steps: step.value
			},
			dataType : 'json',
			success: function() {
				alert("success")
			},
			error: function(XMLHttpRequest) {
				str = XMLHttpRequest.responseText
				if (str.search("message") !== -1) {
					console.log("sad")
					obj = JSON.parse(str)
					alert(obj.message)
				} else{
					alert("Frequent visitors")
				}

			},
			clearForm: false,
			resetForm: false
		})

	})
</script>
</html>