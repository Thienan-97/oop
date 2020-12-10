package quanlyhocsinh;

public class GiaoVien extends Person{
	
//	properties
	protected float luongMotNgay;
	protected float ngayCong;
	protected String mon;
	
//	constructor
	public GiaoVien(String id, String hoTen, String ngaySinh, int namSinh, String sdt, float luongMotNgay, float ngayCong,
			String mon) {
		super(id, hoTen, ngaySinh, namSinh, sdt);
		this.luongMotNgay = luongMotNgay;
		this.ngayCong = ngayCong;
		this.mon = mon;
	}
	
	public GiaoVien() {
		super();
		luongMotNgay = 200;
	}
	
//	method
	public double tinhLuong() {
		return luongMotNgay * ngayCong;
	}
	
	@Override
	public void xuatThongTin() {
		System.out.println(
				String.format("%10s |", id)
				+ String.format("%16s |", hoTen)
				+ String.format("%16s |", ngaySinh)
				+ String.format("%12.2f |", namSinh)
				+ String.format("%16.2f |", sdt)
				+ String.format("%17.2f |", luongMotNgay)
				+ String.format("%16s |", ngayCong)
				+ String.format("%25s |", tinhLuong())
			);
	}
}
