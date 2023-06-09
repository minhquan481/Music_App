<?php

	require "connect.php";

	$idquangcao = "1";
	$queryquangcao = "SELECT * FROM quangcao WHERE id = '$idquangcao'";
	$dataquangcao = mysqli_query($con, $queryquangcao);
	$rowquangcao = mysqli_fetch_assoc($dataquangcao);
	$id = $rowquangcao['idBaiHat'];
	$query = "SELECT * FROM baihat WHERE idBaiHat = $id";
	$data = mysqli_query($con, $query);
	if ($data) {
		echo "ok";
	}else{
		echo "fails";
	}

?>