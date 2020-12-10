package com.cybersoft.quanlynhansu;

import java.util.Scanner;

public abstract class NhanSu {
	/* properties */
	protected String maSo;
	protected String hoTen;
	protected String soDt;
	protected float soNgayLamViec;
	protected float luongMotNgay;
	
	/* constructor */
	public NhanSu(String maSo, String hoTen, String soDt, float soNgayLamViec, float luongMotNgay) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDt = soDt;
		this.soNgayLamViec = soNgayLamViec;
		this.luongMotNgay = luongMotNgay;
	}

	public NhanSu() {
		this.maSo = "";
		this.hoTen = "";
		this.soDt = "";
	}
	
	/* getters, setters */
	public String getSoDt() {
		return this.soDt;
	}
	
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	
	public String getHoTen() {
		return this.hoTen;
	}
	
	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	public float getLuongMotNgay() {
		return luongMotNgay;
	}

	public void setLuongMotNgay(float luongMotNgay) {
		this.luongMotNgay = luongMotNgay;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setSoDt(String soDt) {
		this.soDt = soDt;
	}

	/* methods */
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhập thông tin.");
	}
	
	public void xuatThongTin() {
		System.out.println(
				String.format("%10s |", maSo)
				+ String.format("%16s |", hoTen)
				+ String.format("%16s |", soDt)
				+ String.format("%12.2f |", soNgayLamViec)
				+ String.format("%16.2f |", luongMotNgay)
				+ String.format("%17.2f |", tinhLuong())
				+ String.format("%16s |", getChucVu())
				+ String.format("%25s |", getThongTinThem())
			);
	}
	
	public double tinhLuong() {
		return soNgayLamViec * luongMotNgay;
	}

	public String getMaSo() {
		// TODO Auto-generated method stub
		return this.maSo;
	}
	
	public void callMe() {
		System.out.println("Call me by NhanSu Class.");
	}
	
	public String getChucVu() {
		return "Nhân sự";
	}
	
	public String getThongTinThem() {
		return "";
	}
	
	/*
	 * @description: ham dung tinh phu cap hang thang cho nhan su
	 */
	public abstract double tinhPhuCap();
	
}
