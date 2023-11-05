<!DOCTYPE html>
<html>
 <head>
   <title>Login</title>
  
   <style type="text/css">
   body{
	background-color: #B0D9B1;
    }
    .container{
	 display: flex;
	 justify-content: center;
	 
     }
     .container .form{
      margin:5rem;
     }
     form{
     padding: 5rem;
     }
     form input{
     padding: 10px;
     margin: 5px;
     }
     form button {
	 margin-left: 4.2rem;
	 background-color:#618264;
     }
   </style>
 </head>
 <body>
  <div class="container">
  	<div class="form">
  		<form method="post" action="/recipes">
  		<!-- <input placeholder="Enter id" name="id" type="number"><br> -->
  		<input placeholder="Enter recipeName" name="recipeName" type="text"><br>
  		<input placeholder="Enter image url" name="imgUrl" type="text"><br>
  		<input placeholder="Enter recipeInformation" name="recipeInformation" type="text"><br>
  		<input placeholder="Enter cost" name="recipeCost" type="text"><br>
  		<button>Submit</button> 
  		</form>
  	</div>
  </div>
 </body>
</html>