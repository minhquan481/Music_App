<?php  
    require "connect.php";

    $query = "SELECT * FROM playlist";
    $data = mysqli_query($con,$query);


    class Danhsachplaylist{
      	function Danhsachplaylist($idplaylist,$ten,$hinhnen,$hinhicon){
      		$this->idPlayList = $idplaylist;
      		$this->Ten = $ten;
      		$this->Hinhnen = $hinhnen;
      		$this->Hinhicon = $hinhicon;
      	}
      }

      $arrayplaylist = array();
      while ($row = mysqli_fetch_assoc($data)){
      	array_push($arrayplaylist, new Danhsachplaylist($row['idPlayList']
                                                ,$row['Ten']
                                                ,$row['Hinhnen']
                                                ,$row['Hinhicon']));
      }

      echo json_encode($arrayplaylist);

?>