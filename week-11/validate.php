<html>
<body>
<center><h2>Validation Form</h2>
<form method="post">
Name: <input type="text" name="uname"><br>
Password: <input type="text" name="pass"><br>
Email ID: <input type="text" name="email"><br>
Phone Number: <input type="text" name="phone"><br>
<input type="submit" name="submit" value="Validate">
</form>
</center>
</body>
</html>
<?php
if(isset($_POST[&#39;submit&#39;]))
{
$uname = $_POST[&#39;uname&#39;];
$pass = $_POST[&#39;pass&#39;];
$email = $_POST[&#39;email&#39;];
$phone = $_POST[&#39;phone&#39;];
$flag = 1;
if(!$uname) //(emptyempty($_POST["name"]))
$nameErr = "Name is required";
//echo "Name not entered!<br>";
else

{

if(ctype_alpha($uname)==0)
{
//echo "Name contains numeric characters<br>";
$nameErr = "Name contains numeric characters<br>";
$flag=0;

}
else if(strlen($uname)<6)
{
echo "Name is less than 6 characters<br>";
$flag=0;
}
}
if(!$pass)
echo "Password not entered!<br>";
else
{
if(strlen($pass)<6)
{
echo "Password is less than 6 characters<br>";
$flag=0;
}
}
if(!$email)
echo "Email not entered!<br>";
else
{
if (!filter_var($email, FILTER_VALIDATE_EMAIL))
{
echo "Email address is Incorrect<br>";
$flag=0;
}
}
if(!$phone)
echo "Phone number not entered!<br>";
else {
if(ctype_digit($phone)==0) {
echo "Phone Number cannot contain alphabets<br>";
$flag=0;
}
else if(strlen($phone)!=10) {
echo "Phone Number is not 10 digits long<br>";
$flag=0;
}
}
if($flag)
echo "All fields are validated!";
}
?>