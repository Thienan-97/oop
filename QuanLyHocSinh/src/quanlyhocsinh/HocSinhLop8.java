package quanlyhocsinh;

public class HocSinhLop8 extends HocSinh{
	public HocSinhLop8 () {
		super();
		hocPhiMotNgay = 40;
	}

	@Override
	double tinhHocPhi() {
		return hocPhiMotNgay * soNgayHoc;
	}
	
	
}
