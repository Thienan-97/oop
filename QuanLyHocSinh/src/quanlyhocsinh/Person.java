package quanlyhocsinh;

import java.util.Scanner;

public class Person {
	
//	properties
	protected String id;
	protected String hoTen;
	protected String ngaySinh;
	protected int namSinh;
	protected String sdt;
	
//	constructor
	public Person(String id, String hoTen, String ngaySinh, int namSinh, String sdt) {
		this.id = id;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.namSinh = namSinh;
		this.sdt = sdt;
	}
	
	public Person() {
		this.id = "";
		this.hoTen = "";
		this.ngaySinh = "";
		this.sdt = "";
	}
	
//	get & set
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
//	method
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhập thông tin.");
	}
	
	public void xuatThongTin() {
		System.out.println(
				String.format("%10s |", id)
				+ String.format("%16s |", hoTen)
				+ String.format("%16s |", ngaySinh)
				+ String.format("%12.2f |", namSinh)
				+ String.format("%16.2f |", sdt)
//				+ String.format("%17.2f |", tinhLuong())
//				+ String.format("%16s |", getChucVu())
//				+ String.format("%25s |", getThongTinThem())
			);
	}
	
	
}
