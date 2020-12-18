package GiaoVien;
import qlhocsinh.Person;
public class GiaoVien extends Person{

	//properties
	protected String idGv, name, lop;
	float soNgayLam, luongCoBan;
	
	public GiaoVien() {
		super();
		lop = null;
	}
	
	
	public String getIdGv() {
		return super.getId();
	}


	public void setIdGv(String idGv) {
		super.setId(idGv);
	}


	public String getName() {
		return super.getName();
	}


	public void setName(String name) {
		super.setName(name);
	}


	public String getLop() {
		return lop;
	}


	public void setLop(String lop) {
		this.lop = lop;
	}


	public float getSoNgayLam() {
		return soNgayLam;
	}


	public void setSoNgayLam(float soNgayLam) {
		this.soNgayLam = soNgayLam;
	}


	public float getLuongCoBan() {
		return luongCoBan;
	}


	public void setLuongCoBan(float luongCoBan) {
		this.luongCoBan = luongCoBan;
	}


	public float tinhLuong() {
		return soNgayLam * luongCoBan;
	}
	@Override
	public void showData() {
		System.out.println(String.format(" %10s  ", super.getId()) + String.format("%13s  ", super.getName())
		+ String.format("%13s  ", lop)
		+ String.format("%13s  ", soNgayLam)
		+ String.format("%13s  ", luongCoBan)
		+ String.format("%13s  ", tinhLuong()));
	}
	
	public static void main(String[] args) {
		DsGiaoVien list = new DsGiaoVien();
		list.insert();
		list.add();
		list.showData();
	}



}