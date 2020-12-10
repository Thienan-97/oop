package com.cybersoft.quanlynhansu;

public class NhanVien extends NhanSu {
	/* properties */
	private String truongPhong;
	
	public String getTruongPhong() {
		return this.truongPhong;
	}
	
	public void setTruongPhong(String truongPhong) {
		this.truongPhong = truongPhong;
	}
	
	public NhanVien(String maSo, String hoTen, String soDt, float soNgayLam, float luongMotNgay) {
		super(maSo, hoTen, soDt, soNgayLam, luongMotNgay);
	}
	
	public NhanVien() {
		super();
		luongMotNgay = 100;
	}

	public void testAccessModifier() {
		maSo = "I am here.";
		System.out.println(maSo);
		hoTen = "Tuan";
		soDt = "0369296613";
	}
	
	@Override
	public void callMe() {
		System.out.println("Call me by NhanVien class.");
	}
	
	@Override
	public String getChucVu() {
		return "Nhân viên";
	}

	@Override
	public double tinhPhuCap() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getThongTinThem() {
		// TODO Auto-generated method stub
		return this.truongPhong;
	}

	
}
