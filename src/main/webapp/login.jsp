<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


  
        <link rel="stylesheet" href="css/style.css">
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body style="background-color:white;">

 
  
     <header style="background-color:#5bc0de;">
           
        <div id="header">
          
        <nav class="navbar navbar-expand-md navbar-light navbar-expand-md " >
         
            
            <a class="navbar-brand" href="/"> Employee List
           
              
           
           </a>
           
           
           
          
           
           
                
                
                
                
            </nav>
        </div>
            
        
        </header>





<div class="ml-5">

 <div class="container mt-5 ">

<div class="row ml-5">
 <div class="col-md-6 mx-auto">
<div class="card ml-5">
<div class="card-body ml-2 mr-2">
<div class="row">

<div class="col text-center">


<!--  <img src="<c:url value="Images/login.jpg"/>"/>  -->
  <img width="150px" src="Images/log.png"/>

</div>


</div> <!-- end of row -->

<div class="row">

<div class="col text-center">

<h3>Member Login</h3>
</div>

</div>

<div class="row">
<div class="col">





<hr>
</div>

</div>


<div class="row">

<div class="col text-center">

<label > <font color="red">${SPRING_SECURITY_LAST_EXCEPTION.message}</font></label>   
</div>

</div>

<div class="row">
<div class="col">
<form action="login" method="post">

<label for="uname">UserName</label>

<div class="form-group">

<input type="text" name="username" id="uname" class="form-control" placeholder="User Name"/>

</div>

<label for="upassword">Password</label>

<div class="form-group">


<input type="password" name="password" id="upassword" class="form-control" placeholder="Password"/>
</div>

<div class="form-group">
<input type="submit"  name="submit" value="submit" class="btn btn-info btn-block btn-lg">

</div>


</form>


</div>



</div>

</div>

</div> <!-- end of card body -->



</div>



</div>



</div>


</div>





   <footer style="margin-bottom:0px; margin-top:52px; padding-top:2%; padding-bottom:4px; border-top:2px solid black; background-color:#5bc0de;">
            <div class="container-fluid" >
               
               
                    
                    <div class="row">
                     <div class="col-12 align-content-center">
                        <h6 class="pb-1 mb-2">Muhammad Ahsan 2020 © All Rights Reserved.</h6>
                     </div>
                        
                    </div>
                    
                  
                
                
                
                
            </div>
            
            
            
            
            
        </footer>


  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  



</body>
</html>














































