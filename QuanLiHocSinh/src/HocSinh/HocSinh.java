package HocSinh;


import qlhocsinh.Person;
public class HocSinh extends Person {

	//properties
	protected String lop;
	protected float soNgayHoc;
	protected float diemToan, diemVan, diemAnh;
	protected int hanhKiem;
	public HocSinh() {
		super();
		lop = null;
	}
	public String getId() {
		return super.getId();
	}
	public void setId(String id) {
		super.setId(id);
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
	
	public float getSoNgayHoc() {
		return soNgayHoc;
	}
	public void setSoNgayHoc(float soNgayHoc) {
		this.soNgayHoc = soNgayHoc;
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
	public int getHanhKiem() {
		return hanhKiem;
	}
	public void setHanhKiem(int hanhKiem) {
		this.hanhKiem = hanhKiem;
	}
	@Override
	public void showData() {
		// TODO Auto-generated method stub
		
		
				System.out.println(String.format(" %10s  ", super.getId()) + String.format("%17s  ", super.getName())
						+ String.format("%13s  ", lop)
						+ String.format("%13s  ", soNgayHoc)
						+ String.format("%13s  ", diemToan)
						+ String.format("%15s  ", diemVan)
						+ String.format("%13s  ", diemAnh)
						+ String.format("%12s  ", hanhKiem));
			
	}
	
	
	
	
}
