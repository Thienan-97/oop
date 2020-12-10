package quanlyhocsinh;

public class HocSinhLop6 extends HocSinh{
	public HocSinhLop6 () {
		super();
		hocPhiMotNgay = 20;
	}

	@Override
	double tinhHocPhi() {
		return hocPhiMotNgay * 20;
	}
}
