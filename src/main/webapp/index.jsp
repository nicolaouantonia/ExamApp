<!DOCTYPE html>
<%@ page import="com.agiletestingalliance.Duration"%>
<%@ page import="com.agiletestingalliance.AboutCPDOF"%>
<%@ page import="com.agiletestingalliance.Usefulness"%>
Usefulness
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="cpdofexam" content="">
	<meta property="og:image" content="http://cpdof.devopsppalliance.org/images/logo_icons.png" />
	<link rel="image_src" href="http://cpdof.devopsppalliance.org/images/logo_icons.png">

<link rel="icon" href="../../favicon.ico">

    <title>CPDOF Exam September 2021 FOUR</title>


    <!-- Custom styles for this template -->
    <link href="jumbotron.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<%
	Duration duration = new Duration();
	AboutCPDOF cpdof = new AboutCPDOF();
	Usefulness useful = new Usefulness();
%>

<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">CP-DOF</a>
        </div>
        <div class="navbar-collapse collapse">
            <form class="navbar-form navbar-right" role="form">
                <div class="form-group">
                    <input type="text" placeholder="Email" class="form-control">
                </div>
                <div class="form-group">
                    <input type="password" placeholder="Password" class="form-control">
                </div>
                <button type="submit" class="btn btn-success">Sign in</button>
            </form>
        </div><!--/.navbar-collapse -->
    </div>
</div>

<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron">
    <div class="container">
        <h1>CP-DOF Practical Exam September 2021 FOUR </h1>
        <p>This is CP-DOF Exam web app. If you want to know more about the most practical program in DevOps which covers the entire DevOps Pipeline, please click on the Learn More button below</p>

		<img src="./images/slide.jpg" style="width: 70%;margin: 0 auto;display: table;float: none;padding-top:5%;padding-bottom:5%">
			<strong>
						* This diagram is for representational purpose only. For the detailed program and tool coverage please download brochure and look at the latest syllabus.
			</strong>

        <p><a class="btn btn-primary btn-lg" role="button" href="http://cpdof.devopsppalliance.org/">Learn more &raquo;</a></p>
    </div>
</div>

<div class="container">
    <!-- Example row of columns -->
    <div class="row">
        <div class="col-md-4">
            <h2>About CPDOF</h2>
            <p>
			<%
				out.print(cpdof.desc());
			%>
		  </p>
            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div>
        <div class="col-md-4">
            <h2>How is it useful?</h2>
            <p>
		 	<%
				out.print(useful.desc());
			%>

		  </p>
            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div>
        <div class="col-md-4">
            <h2>Duration</h2>
            <p>
			<%
				out.print(duration.dur());
			%>
		  </p>
            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div>
    </div>

    <hr>

    <footer>
        <p>&copy; Agile Testing Alliance</p>
    </footer>
</div> <!-- /container -->


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
</body>
</html>
