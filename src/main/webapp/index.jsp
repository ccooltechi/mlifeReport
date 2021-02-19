<html>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="shortcut icon" href="oekyc/img/favicon.ico" type="image/x-icon" />

<style type="text/css">
.am-pagetitle {
	left: 0px;
}

.product-solutions-page-flexslider {
	padding-top: 8px;
	padding-bottom: 8px;
	padding-left: 40px;
	padding-right: 40px;
	/* border: 0.5px solid #EDECEB; */
	border-radius: 0.8em;
	margin-bottom: 1em !important;
	-webkit-box-shadow: 1px 1px 10px 0px rgba(138, 138, 138, 1);
	-moz-box-shadow: 1px 1px 10px 0px rgba(138, 138, 138, 1);
	box-shadow: 1px 1px 10px 0px rgba(138, 138, 138, 1);
	background: red;
	background: -moz-linear-gradient(top, rgba(255, 255, 255, 1) 0%,
		rgba(237, 236, 235, 1) 100%);
	background: -webkit-gradient(left top, left bottom, color-stop(0%, rgba(255, 255,
		255, 1)), color-stop(100%, rgba(237, 236, 235, 1)));
	background: -webkit-linear-gradient(top, rgba(255, 255, 255, 1) 0%,
		rgba(237, 236, 235, 1) 100%);
	background: -o-linear-gradient(top, rgba(255, 255, 255, 1) 0%,
		rgba(237, 236, 235, 1) 100%);
	background: -ms-linear-gradient(top, rgba(255, 255, 255, 1) 0%,
		rgba(237, 236, 235, 1) 100%);
	background: linear-gradient(to bottom, rgba(255, 255, 255, 1) 0%,
		rgba(237, 236, 235, 1) 100%);
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#ffffff',
		endColorstr='#edeceb', GradientType=0);
}

.flexslider {
	margin: 0 0 60px;
	margin-bottom: 60px;
	background: #fff;
	/* border: 4px solid #fff; */
	position: relative;
	zoom: 1;
	-webkit-border-radius: 4px;
	-moz-border-radius: 10px;
	border-radius: 10px;
	-webkit-box-shadow: '' 0 1px 4px rgba(0, 0, 0, 0.2);
	-moz-box-shadow: '' 0 1px 4px rgba(0, 0, 0, 0.2);
	-o-box-shadow: '' 0 1px 4px rgba(0, 0, 0, 0.2);
	box-shadow: '' 0 1px 4px rgba(0, 0, 0, 0.2);
}

.flexslider {
	margin: 0;
	padding: 0;
}

.boxShadow {
	padding: 5px;
	background: #0e355e;;
	font-size: 30px;
	color: white;
	text-align: center;
	min-height: 4.2em;
	border: 1px dashed #fff;
}

.fapaddingtop {
	padding-top: 30px;
}

.boxShadowFont {
	font-size: 12px;
	color: white;
	font-weight: bold;
}

.boxShadowFont:hover {
	color: #2d3a50;
}

a {
	color: white;
	text-decoration: none;
}

a:hover {
	color: #2d3a50;
}
/* ----------------------- Slide Effect --------------------------- */
[class^="hvr-"] {
	margin: .4em;
	padding: 1em;
	cursor: pointer;
	background: #007AC9;
	text-decoration: none;
	color: white;
}

/* Sweep To Bottom */
.hvr-sweep-to-bottom {
	display: inline-block;
	vertical-align: middle;
	-webkit-transform: perspective(1px) translateZ(0);
	transform: perspective(1px) translateZ(0);
	box-shadow: 0 0 1px transparent;
	position: relative;
	-webkit-transition-property: color;
	transition-property: color;
	-webkit-transition-duration: 0.3s;
	transition-duration: 0.3s;
}

.hvr-sweep-to-bottom:before {
	content: "";
	position: absolute;
	z-index: -1;
	top: 0;
	left: 0;
	right: 0;
	bottom: 0;
	background: #2098D1;
	-webkit-transform: scaleY(0);
	transform: scaleY(0);
	-webkit-transform-origin: 50% 0;
	transform-origin: 50% 0;
	-webkit-transition-property: transform;
	transition-property: transform;
	-webkit-transition-duration: 0.3s;
	transition-duration: 0.3s;
	-webkit-transition-timing-function: ease-out;
	transition-timing-function: ease-out;
}

.hvr-sweep-to-bottom:hover, .hvr-sweep-to-bottom:focus,
	.hvr-sweep-to-bottom:active {
	color: white;
}

.hvr-sweep-to-bottom:hover:before, .hvr-sweep-to-bottom:focus:before,
	.hvr-sweep-to-bottom:active:before {
	-webkit-transform: scaleY(1);
	transform: scaleY(1);
}

/* ----------------------Zoom in Effect --------------------------- */
.hvr-grow-shadow {
	display: inline-block;
	vertical-align: middle;
	-webkit-transform: perspective(1px) translateZ(0);
	transform: perspective(1px) translateZ(0);
	box-shadow: 0 0 1px transparent;
	-webkit-transition-duration: 0.3s;
	transition-duration: 0.3s;
	-webkit-transition-property: box-shadow, transform;
	transition-property: box-shadow, transform;
}

.hvr-grow-shadow:hover, .hvr-grow-shadow:focus, .hvr-grow-shadow:active
	{
	box-shadow: 0 15px 10px -10px rgba(0, 0, 0, 0.5);
	border: 10px;
	-webkit-transform: scale(1.1);
	transform: scale(1.1);
}

.modal-dialog {
  position:absolute;
  top:50% !important;
  transform: translate(0, -50%) !important;
  -ms-transform: translate(0, -50%) !important;
  -webkit-transform: translate(0, -50%) !important;
  margin:auto 25%;
  width:50%;
  height:75%;
}
.modal-content {
  min-height:100%;
  position:absolute;
  top:0;
  bottom:0;
  left:0;
  right:0; 
}
.modal-body {
  position:absolute;
  top:45px; /** height of header **/
  bottom:45px;  /** height of footer **/
  left:0;
  right:0;
  overflow-y:auto;
}
.modal-footer {
  position:absolute;
  bottom:0;
  left:0;
  right:0;
}

.close {
    color: #F4F8F9; 
    opacity: 1;
}

/* ----------------------Added from old  --------------------------- */
body{
    background-color: #FFFFFF;
    font-family: 'Roboto', sans-serif !important;
    font-size: 14px;
    white-space: nowrap;
}

label {
    padding: 12px 12px 12px 0;
    display: inline-block;
    width: 196px;
}

input[type=button] {
    background-color: #CCCCCC;
/*  color: white;
 */ padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    float: felt;
}

input[type=button]:hover {
    background-color: #CCCCCC;
}


input[type=submit] {
    background-color: #CCCCCC;
/*     color: white;
 */ padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    float: right;
}

input[type=submit]:hover {
    background-color: #CCCCCC;
}


.col-25 {
    float: left;
    width: 25%;
    margin-top: 6px;
}

.col-75 {
    float: left;
    width: 30%;
    margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
    content: "";
    display: table;
    clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
    .col-25, .col-75, input[type=submit] {
        width: 100%;
        margin-top: 0;
    }
}
/* ----------------------Added from old  --------------------------- */
</style>

</head>

<body>


 	<div class="am-header">
		<div class="am-header-left">
		</div>
	</div>
	<!-- am-header -->

	<!-- am-sideleft -->

	<div class="am-pagetitle">
		<h2 class="am-title">Searches</h2>
	</div>
	<!-- am-pagetitle -->

	<div class="am-mainpanel" style="margin-left: 0px;">
		<div class="am-pagebody">
			<div class="product-solutions-page-flexslider flexslider" style="min-height: 220px; background: #F4F8F9;">
				<div class="container">
					<div style="width:50%;margin: 0 auto; ">
						<div class="row">
				        <div class="col-xs-12">
							<div class="row">
								<form action="loginprocess.jsp">
									Email:<input type="text" name="email"/><br/><br/>
									Password:<input type="password" name="pass"/><br/><br/>
									<input type="submit" value="login"/>
								</form>								
								</div>
							</div>
					    </div>
			    	</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
</html>
