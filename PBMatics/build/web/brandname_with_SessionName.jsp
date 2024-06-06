<html>
    <head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js">
  </script>
  
  <style type="text/css">
		.jumbotron
		{
			padding: 10px;
			font-family: sans-serif;
			background-color: #ED3196;
		}
		p 
		{
			color: white;
			font-weight: bolder;
			margin-top: -15px;
			font-style: italic;
		}
		.well
		{
			font-size: 20px;
			background-color: gold;
		}
		.well:hover
		{
			background-color: #ED3196;
			color: white;
			cursor: pointer;
		}
		a 
		{
			text-decoration: none;
			color: white;
		}
		a:hover
		{
			text-decoration: none;
			color: white;
		}
		.btn
		{
			background-color: gold;
		}
                h4
                {
                    margin-left: 85%;
                    color:gold;
                }
	</style>
    </head>
    
    <body>
        <div class="jumbotron">
   	  <h2 style="color: gold;">PB Matics CRM</h2>
   	  <p>Digital Software Solution</p>
          <%
        String sname=(String)session.getAttribute("sname");
        
        out.print("<h4>Welcome "+sname+"</h4>");
     %>  
      </div>
    </body>
</html>