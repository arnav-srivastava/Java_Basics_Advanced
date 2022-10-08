<?php

include_once 'config/config.php';
var_dump($_POST);


if (isset($_POST['submit'])) {

	$eid = $_SESSION['employee_id'];
	$enm = $_SESSION['emp_name'];


	//$hdl=$_POST['halfdayleave'];
	$cd = date("d-m-y");
	$ct = date("h:i:s");



	$a1 = "SELECT * FROM employee_attendance WHERE Bio_date='$cd' AND Employee_id='$eid'";
	//$superid=$_SESSION['employee_id'];
	if (mysqli_affected_rows($connection_obj) == 0) 
	{
		$q = "INSERT INTO employee_attendance(Employee_id,Checkin_time,Checkout_time,Bio_date,Stats) VALUES ('$eid','$ct','$ct','$cd','1')";
		echo $q;
		if (mysqli_affected_rows($connection_obj) > 0) {
			$employee_data =  mysqli_fetch_assoc($connection_obj);
		} else {
			header("location:./500.php");
		}
		$status = mysqli_query($connection_obj, $q);
		if ($status) {
			header("location:./dashbord.php");
		} else {
			echo "insert error";
		}
	}
} 


else {
	header("location:./500.php");
}
