package HocSinh;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

import qlhocsinh.Helper;
import qlhocsinh.Person;
import HocSinh.HocSinh;

public class DsHocSinh implements Helper {

	private HocSinh[] hs;
	private int n;
	static Scanner sc = new Scanner(System.in);

	public DsHocSinh(HocSinh[] hs, int n) {
		this.hs = hs;
		this.n = n;
	}

	public DsHocSinh() {

	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.print("Nhập số học sinh: ");
		n = Integer.parseInt(sc.nextLine());
		hs = new HocSinh[n];

		for (int i = 0; i < n; i++) {
			hs[i] = new HocSinh();
			System.out.println("Nhập thông tin học sinh thứ " + (i + 1));

			sc.nextLine();
			System.out.print("Nhập mã học sinh: ");
			hs[i].setId(sc.nextLine());

			System.out.print("Nhập tên học sinh: ");
			hs[i].setName(sc.nextLine());

			System.out.print("Nhập lớp học sinh: ");
			hs[i].setLop(sc.nextLine());

			System.out.print("Nhập số ngày học sinh học: ");
			hs[i].setSoNgayHoc(sc.nextFloat());

			System.out.print("Nhập điểm toán học sinh: ");
			hs[i].setDiemToan(sc.nextFloat());

			System.out.print("Nhập điểm văn học sinh: ");
			hs[i].setDiemVan(sc.nextFloat());

			System.out.print("Nhập điểm anh học sinh: ");
			hs[i].setDiemAnh(sc.nextFloat());

			System.out.print("Nhập hạnh kiểm của học sinh: ");
			hs[i].setHanhKiem(sc.nextInt());

			System.out.println();
		}

	}

	@Override
	public void showData() {
		System.out.println(
				"----------------------------------------------DANH SÁCH HỌC SINH-------------------------------------------------------");
		System.out.println(String.format(" %10s  ", "Mã số") + String.format("%13s  ", "Họ tên")
				+ String.format("%13s  ", "Lớp") + String.format("%13s  ", "Số Ngày học")
				+ String.format("%13s  ", "Điểm toán") + String.format("%15s  ", "Điểm Văn")
				+ String.format("%13s  ", "Điểm anh") + String.format("%13s  ", "Hạnh kiểm"));
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < hs.length; i++) {
			hs[i].showData();
		}
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Nhập số học sinh cần thêm: ");
		int k = sc.nextInt();
		int  j = hs.length;
		int a = hs.length + k;
		hs = Arrays.copyOf(hs, a);

		for (int i = j; i < a; i++) {
			hs[i] = new HocSinh();
			
			sc.nextLine();
			String id;
			
			nhapid:
			while (true) {
				System.out.print("Nhập mã học sinh: ");
				id = sc.nextLine();
				if (checkId(id)) {
					System.out.println("Mã học sinh đã tồn tại, xin mời nhập lại");
					continue nhapid;
				}
				break nhapid;
			}
			hs[i].setId(id);
		
			System.out.print("Nhập tên học sinh: ");
			hs[i].setName(sc.nextLine());
			
			System.out.print("Nhập lớp học sinh: ");
			hs[i].setLop(sc.nextLine());

			System.out.print("Nhập số ngày học sinh học: ");
			hs[i].setSoNgayHoc(sc.nextFloat());

			System.out.print("Nhập điểm toán học sinh: ");
			hs[i].setDiemToan(sc.nextFloat());

			System.out.print("Nhập điểm văn học sinh: ");
			hs[i].setDiemVan(sc.nextFloat());

			System.out.print("Nhập điểm anh học sinh: ");
			hs[i].setDiemAnh(sc.nextFloat());

			System.out.print("Nhập hạnh kiểm của học sinh: ");
			hs[i].setHanhKiem(sc.nextInt());

			System.out.println();

		}
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void search() {
		// TODO Auto-generated method stub

	}

	public boolean checkId(String id) {
		for (int i = 0; i < n; i++) {
			if (id.equals(hs[i].getId()))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		DsHocSinh list = new DsHocSinh();
		list.insert();
		list.add();
		list.showData();
	}

}
