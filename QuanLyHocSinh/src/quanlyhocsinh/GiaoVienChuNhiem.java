package quanlyhocsinh;

public class GiaoVienChuNhiem extends GiaoVien {

//	properties
	private String lop;

//	constructor
	public GiaoVienChuNhiem(String id, String hoTen, String ngaySinh, int namSinh, String sdt, float luongMotNgay,
			float ngayCong, String mon, String lop) {
		super(id, hoTen, ngaySinh, namSinh, sdt, luongMotNgay, ngayCong, mon);
		this.lop = lop;
	}
	
	public GiaoVienChuNhiem() {
		super();
	}
	
	
//	get & set
	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}
	
//	method
	@Override
	public double tinhLuong() {
		return luongMotNgay * ngayCong + 500;
	}
}
