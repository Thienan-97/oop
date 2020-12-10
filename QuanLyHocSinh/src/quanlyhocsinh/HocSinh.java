package quanlyhocsinh;

public abstract class HocSinh extends Person {

//	properties
	protected String giaoVienCN;
	protected String xepLoai;
	protected byte hanhKiem;
	protected float diemToan;
	protected float diemVan;
	protected float diemAnh;
	protected float hocPhiMotNgay;
	protected float soNgayHoc;

//	constructor
	public HocSinh(String id, String hoTen, String ngaySinh, int namSinh, String sdt, String giaoVienCN, String xepLoai,
			byte hanhKiem, float diemToan, float diemVan, float diemAnh, float hocPhiMotNgay, float soNgayHoc) {
		super(id, hoTen, ngaySinh, namSinh, sdt);
		this.giaoVienCN = giaoVienCN;
		this.xepLoai = xepLoai;
		this.hanhKiem = hanhKiem;
		this.diemToan = diemToan;
		this.diemVan = diemVan;
		this.diemAnh = diemAnh;
		this.hocPhiMotNgay = hocPhiMotNgay;
		this.soNgayHoc = soNgayHoc;
	}

	public HocSinh() {
		super();
	}

//	get & set
	public String getGiaoVienCN() {
		return giaoVienCN;
	}

	public void setGiaoVienCN(String giaoVienCN) {
		this.giaoVienCN = giaoVienCN;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	public void setXepLoai(String xepLoai) {
		this.xepLoai = xepLoai;
	}

	public byte getHanhKiem() {
		return hanhKiem;
	}

	public void setHanhKiem(byte hanhKiem) {
		this.hanhKiem = hanhKiem;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemVan() {
		return diemVan;
	}

	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}

	public float getDiemAnh() {
		return diemAnh;
	}

	public void setDiemAnh(float diemAnh) {
		this.diemAnh = diemAnh;
	}

	public float getHocPhiMotNgay() {
		return hocPhiMotNgay;
	}

	public void setHocPhiMotNgay(float hocPhiMotNgay) {
		this.hocPhiMotNgay = hocPhiMotNgay;
	}

	public float getSoNgayHoc() {
		return soNgayHoc;
	}

	public void setSoNgayHoc(float soNgayHoc) {
		this.soNgayHoc = soNgayHoc;
	}

	// method
	public float tinhDiemTrungBinh() {
		return (diemToan + diemAnh + diemVan) / 3;
	}

	public String xepLoaiHocSinh() {
		float diemTrungBinh = tinhDiemTrungBinh();

		if (hanhKiem == 1) {
			xepLoai = "Yếu";
		} else if (diemTrungBinh >= 8 && hanhKiem == 4) {
			xepLoai = "Giỏi";
		} else if (diemTrungBinh >= 6.5 && hanhKiem > 2) {
			xepLoai = "Khá";
		} else if (diemTrungBinh > 6.5 && hanhKiem == 2) {
			xepLoai = "Trung bình";
		} else if (diemTrungBinh >= 4.5) {
			xepLoai = "Trung binh";
		} else {
			xepLoai = "Yếu";
		}
		return xepLoai;
	}

	abstract double tinhHocPhi();
	
	@Override
	public void xuatThongTin() {
		System.out.println(
				String.format("%10s |", id)
				+ String.format("%16s |", hoTen)
				+ String.format("%16s |", ngaySinh)
				+ String.format("%12.2f |", namSinh)
				+ String.format("%16.2f |", sdt)
				+ String.format("%17.2f |", tinhDiemTrungBinh())
				+ String.format("%16s |", hocPhiMotNgay)
				+ String.format("%25s |", soNgayHoc)
			);
	}
}
