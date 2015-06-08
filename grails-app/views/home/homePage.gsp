<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="homeLayout">
    <title>Shopping Mania</title>
    <asset:stylesheet src="bootstrap.min.css"></asset:stylesheet>
    <asset:stylesheet src="shoppingMania.css"></asset:stylesheet>
    <asset:javascript src="jquery-2.1.3.js"></asset:javascript>
    <asset:javascript src="bootstrap.min.js"></asset:javascript>
    <asset:javascript src="carousel.js"></asset:javascript>
</head>

<body>
<h1 class="leftDiv">Welcome Page</h1>

%{--<div class="row">--}%
%{--<div class="col-sm-6 col-md-4">--}%
%{--<div class="thumbnail leftDiv">--}%
%{--<asset:image src="IMG-20150503-WA0015.jpg"></asset:image>--}%
%{--<div class="caption">--}%
%{--<h3>Thumbnail label</h3>--}%

%{--<p>...</p>--}%

%{--<p><a href="#" class="btn btn-primary" role="button">Button</a>--}%
%{--<a href="#" class="btn btn-default" role="button">Button</a></p>--}%
%{--</div>--}%
%{--</div>--}%
%{--</div>--}%
%{--</div>--}%

<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
        <li data-target="#carousel-example-generic" data-slide-to="1"></li>
        <li data-target="#carousel-example-generic" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <asset:image src="logoSM.png"></asset:image>
            <div class="carousel-caption">
                Image 1
            </div>
        </div>

        <div class="item">
            <asset:image src="grails_logo.png"></asset:image>

            <div class="carousel-caption">
                Image 2
            </div>
        </div>
    </div>

    <!-- Controls -->
    <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
</body>
</html>