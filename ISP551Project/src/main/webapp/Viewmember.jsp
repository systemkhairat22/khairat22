<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Member</title>
</head>


    <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="main.css">
</head>

<style>

body{
	padding:0; 
	margin:0;
}

.container{
	 	height: 500px;
        background-color: black;/* For browsers that do not support gradients */
 
}
.container-fluid{
  margin-left: 12%;
  font-family: 'Times New Roman', Times, serif;
  
  
}
a.btn1,a.btn2,a.btn3,a.btn4,a.btn5,a.btn6,a.btn7,a.btn8{
	height:50px;
	text-align: center;
}



a:link{
  background-color: #0abcdb;
  padding: 14px 25px;
  text-align: center;
  text-decoration: none;
  font-size:11px;
  
}
a:hover, a:active {
    background-color: rgb(247, 249, 250);
  }
  
  a{
    color: rgb(5, 5, 5);
  }
  
  h5{
    color:black;
    font-size:16px;
    padding-bottom:-5em;
  }
  
  h1{
      text-align:center;
      padding-top:5px;
  }
  .logo{
	display: block;
  	margin-left: auto;
  	margin-right: auto;
  	width:70%;
  	border-radius: 150px;
}


</style>

 <!-- SIDEBAR -->
        <div class="container" style="padding:0; margin:0; height:100%;width:200px;background-color:#0abcdb;position:fixed!important;z-index:1;overflow:auto">
            <img class="logo" alt="" src="KKS.JPG">
            <h3 style="text-align: center; color: rgb(2, 2, 2);">WELCOME</h3>
            <hr style="height:2px;border-width:0;color:BLACK;background-color:BLACK">
            <a href="#" class="btn2" style="display:block;">HOME </a>
            <a href="#" class="btn4" style="display:block;">MEMBER</a>
            <a href="#" class="btn5" style="display:block;">APPLICATION CLAIM</a>
            <a href="#" class="btn5" style="display:block;">PAYMENT</a>
            <a href="#" class="btn5" style="display:block;">CLAIM KHAIRAT</a>
            <hr style="height:2px;border-width:0;color:BLACK;background-color:BLACK">
            <a href="#" class="btn5" style="display:block;">LOGOUT</a>

        </div>
        
           <!-- TOPBAR -->      
        <div style=" background-color: #043a9f; height:100px; color:blue; padding-left:60px; ">
            <h1 style="text-align: center; color: rgb(2, 2, 2);">View Member</h1>
        </div>
<body>

   <!-- CONTENT -->
        <div class="container-fluid">
            <div>
                <form action = "createMemberController" method = "post">
                <table class="table table-striped" style="width: 88%;">
                <tbody>
                    <tr>
                    <th><label for="memID">Member ID</label></th>
                        <th><input type="number" name="memberid" placeholder="Member ID"></th>
                       
                    <tr>
                        <th><label for="fullname">Full Name</label></th>
                        <th><input type="text"  name="mem_name" placeholder="Full Name"></th>
                    </tr>
                    <tr>
                        <th><label for="memIC">IC Number</label></th>
                        <th><input type="text"  name="mem_icnum" placeholder="000000-00-0000"></th>
                    </tr>
                    <tr>
                        <th><label for="age">Age</label></th>
                        <th><input type="number"  name="mem_age"></th>
                    </tr>
                    <tr>
                        <th><label for="Adage">Gender</label></th>
                        <th><input type="radio"  name="mem_gender" value="male">
                        <label for="male">Male</label>
                        <input type="radio" name="mem_gender" value="female">
                        <label for="female">Female</label> </th>

                    </tr>
                    <tr>
                        <th><label for="address">Address</label></th>
                        <th><input type="text"  name="mem_address"></th>
                        
                    </tr>
                    <tr>
                        <th><label for="phoneNumber">Phone Number</label></th>
                        <th><input type="text"  name="mem_phonenum" placeholder="000-00000000"></th>
                    </tr>
                    <tr>
                        <th><label for="repName">Representative Name</label></th>
                        <th><input type="text"  name="rep_name" placeholder=" Representative Full Name"></th>
                    </tr>
                    <tr>
                        <th><label for="repIC">Representative IC Number</label></th>
                        <th><input type="number"  name="rep_icnum" placeholder="000000-00-0000"></th>
                    </tr>
                    <tr>
                        <th><label for="memEmail">Email</label></th>
                        <th><input type="email"  name="mem_Email" placeholder="abc@gmail.com"></th>
                    </tr>
                    <tr>
                        <th><label for="memPwd">Password</label></th>
                        <th><input type="password"  name="mem_password"></th>
                    </tr>
                    <tr>
                        <th><label for="memPwd2">Confirm Password</label></th>
                        <th><input type="password"name="mem_password"></th>
                    </tr>
                </tbody>    
                </table>
                
                
                 <!-- </div> --> 
            <input  type="submit" value= "Update" class="btn btn-outline-success">
            <input type="reset"  value = "Delete" class="btn btn-outline-danger">
         
            </form>
      
        <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
        <script src="main.js"></script>
        

</body>
</html>