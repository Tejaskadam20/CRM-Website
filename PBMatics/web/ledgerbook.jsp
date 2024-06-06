<!DOCTYPE html>
<%@page import="java.sql.*"%>
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
		font-weight: bolder;
		margin-top: -15px;
		font-style: italic;
		color: white;
	}
	.well
	{
		font-size: 20px;
		background-color: gold;
	}
	a 
	{
		text-decoration: none;
		color: #000123;
	}
	a:hover
	{
		text-decoration: none;
		color: white;
	}
	.cardcontainer
	{
		box-shadow: 0px 5px 10px 0px rgba(0, 0, 0, 0.5);
		transition: 0.3s;
	}
	.cardcontainer:hover
	{
		box-shadow: 0px 10px 20px 0px rgba(0, 0, 0, 0.5);
	}
	.add_data
	{
		background-color: deeppink;
		color: white;
		width: 100%;
		padding: 10px;
		padding-bottom: 20px;
	}
	.showamt
	{
		color: gold;
		font-size: 20px;
	}
</style>
</head>
<body>
    
    
         <%!
                int camt=0,eamt=0,vamt=0; 
                int tot_expences;
         %>
             <%   
                
                try{
                    Class.forName("com.mysql.jdbc.Driver");           
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pbmatics_db","root","");
      
                    Statement st_client=con.createStatement();
                    Statement st_emp=con.createStatement();
                    Statement st_vendor=con.createStatement();
                    
                    String sql_client="select sum(pay_amt)'tot_cpay' from client_pay_entry";
                    ResultSet rs_client=st_client.executeQuery(sql_client);
                    
                  String sql_emp="select sum(final_amt)'tot_epay' from employee_pay_entry";
                   ResultSet rs_emp=st_emp.executeQuery(sql_emp);
                    
                    String sql_vendor="select sum(pay_amt)'tot_vpay' from vendor_pay_entry";
                   ResultSet rs_vendor=st_vendor.executeQuery(sql_vendor);
                    
                    
                    
                   
                   
                 %>
                
     
   
   <div class="jumbotron">
   	 <h2 style="color: gold;">PB Matics CRM</h2>
   	 <p>Digital Software Solution</p>
   </div>

   <div class="container-fluid text-center">
   	   <h3>Ledger Book Profit & Loss</h3>

   	   <div class="row">
   	   	  <div class="col-sm-3">
   	   	  	<div class="cardcontainer">
   	   	  		<img src="Book/client.jpg" style="width: 100%;">
   	   	  		<div class="add_data">
   	   	  			<h3>Client Payment</h3>
   	   	  			<br>
                                     <%
                                        while(rs_client.next())
                                        {
                                            
                                        %>
   	   	  			<p class="showamt">&#8377
                                            <%=camt=rs_client.getInt("tot_cpay")%>/-
                                            <%
                                        }
                                            %>   
                                        </p>
                                        
   	   	  		</div>
   	   	  	</div>
   	   	  </div>

   	   	  <div class="col-sm-3">
   	   	  	<div class="cardcontainer">
   	   	  		<img src="Book/emp_pay.jpg" style="width: 100%;">
   	   	  		<div class="add_data">
   	   	  			<h3>Employee Payment</h3>
   	   	  			<br>
                                        <%
                                        while(rs_emp.next())
                                        {
                                            
                                        %>
   	   	  			<p class="showamt">&#8377
                                        <%=eamt=rs_emp.getInt("tot_epay")%>/-
                                          <%
                                        }
                                            %>
                                        
                                        </p>
                                        
                                        
   	   	  		</div>
   	   	  	</div>
   	   	  </div>

   	   	  <div class="col-sm-3">
   	   	  	<div class="cardcontainer">
   	   	  		<img src="Book/vendor.png" style="width: 100%;">
   	   	  		<div class="add_data">
   	   	  			<h3>Vendor Payment</h3>
   	   	  			<br>
                                        <%
                                        while(rs_vendor.next())
                                        {
                                            
                                        %>
   	   	  			<p class="showamt">&#8377 
                                        <%=vamt=rs_vendor.getInt("tot_vpay")%>/-
                                          <%
                                        }
                                          %>
                                        
                                        </p>
                                        
                                         
   	   	  		</div>
   	   	  	</div>
   	   	  </div>
                     
                                        <%
                                        tot_expences=camt-(eamt+vamt);
                                        %>
   	   	  <div class="col-sm-3">
   	   	  	<div class="cardcontainer">
   	   	  		<img src="Book/profit.jpg" style="width: 100%;">
   	   	  		<div class="add_data">
   	   	  			<h3>Final Payment</h3>
   	   	  			<br>
   	   	  			<p class="showamt">&#8377 
                                         <%=tot_expences%>/-
                                        </p>
   	   	  		</div>
   	   	  	</div>
   	   	  </div>

   	   </div>
   </div>

</body>
</html>
<%
 con.close();
                }
                catch(Exception e)
                            {
                            System.out.println(e);
  
                          }
 %>             