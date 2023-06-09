package vku.vmq.nghenhac.Model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class TheloaiChude {

@SerializedName("Theloai")
@Expose
private List<Theloai> theloai = null;
@SerializedName("Chude")
@Expose
private List<Chude> chude = null;

public List<Theloai> getTheloai() {
return theloai;
}

public void setTheloai(List<Theloai> theloai) {
this.theloai = theloai;
}

public List<Chude> getChude() {
return chude;
}

public void setChude(List<Chude> chude) {
this.chude = chude;
}

}