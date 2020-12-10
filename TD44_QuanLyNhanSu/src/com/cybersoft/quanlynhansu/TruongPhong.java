package com.cybersoft.quanlynhansu;

public class TruongPhong extends NhanSu {
	/* properties */
	private int soNhanVien;

	public TruongPhong(String maSo, String hoTen, String soDt, float soNgayLamViec, float luongMotNgay,
			int soNhanVien) {
		super(maSo, hoTen, soDt, soNgayLamViec, luongMotNgay);
		this.soNhanVien = soNhanVien;
	}
	
	public TruongPhong() {
		super();
		luongMotNgay = 200;
	}
	
	public int getSoNhanVien() {
		return this.soNhanVien;
	}

	@Override
	public void callMe() {
		
	}

	@Override
	public double tinhLuong() {
		double luong = luongMotNgay * soNgayLamViec + 100 * soNhanVien;
		return luong;
	}
	
	@Override
	public String getChucVu() {
		return "Trưởng phòng";
	}
	
	@Override
	public String getThongTinThem() {
		return String.valueOf(soNhanVien);
	}

	@Override
	public double tinhPhuCap() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void tangNhanVien() {
		this.soNhanVien++;
	}
	
	public void giamNhanVien() {
		this.soNhanVien--;
	}
}
