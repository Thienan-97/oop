package com.cybersoft.quanlynhansu;

public class GiamDoc extends NhanSu {
	/* properties */
	private float soCoPhan;

	public GiamDoc(String maSo, String hoTen, String soDt, float soNgayLamViec, float luongMotNgay, float soCoPhan) {
		super(maSo, hoTen, soDt, soNgayLamViec, luongMotNgay);
		this.soCoPhan = soCoPhan;
		
	}

	public GiamDoc() {
		super();
		luongMotNgay = 300;
	}

	
	@Override
	public double tinhLuong() {
		/*
		 * lương giám đốc bao gồm phần cổ tức theo doanh thu
		 */
		double luong = super.tinhLuong();
		
		return luong;
	}
	
	@Override
	public String getChucVu() {
		return "Giám đốc";
	}
	
	@Override
	public String getThongTinThem() {
		return String.valueOf(soCoPhan);
	}

	@Override
	public double tinhPhuCap() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float getSoCoPhan() {
		return soCoPhan;
	}

	public void setSoCoPhan(float soCoPhan) {
		this.soCoPhan = soCoPhan;
	}

	
	
}
