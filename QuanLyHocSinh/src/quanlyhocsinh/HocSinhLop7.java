package quanlyhocsinh;

public class HocSinhLop7 extends HocSinh{
	public HocSinhLop7 () {
		super();
		hocPhiMotNgay = 30;
	}

	@Override
	double tinhHocPhi() {
		return hocPhiMotNgay * 20;
	}
}
