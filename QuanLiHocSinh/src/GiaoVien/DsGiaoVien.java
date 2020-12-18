package GiaoVien;

import java.util.Arrays;
import java.util.Scanner;
import GiaoVien.GiaoVien;
import qlhocsinh.Person;
import qlhocsinh.Helper;

public class DsGiaoVien implements Helper {

	private GiaoVien[] gv;
	private int n;
	static Scanner sc = new Scanner(System.in);

	public DsGiaoVien(GiaoVien[] gv, int n) {
		this.gv = gv;
		this.n = n;
	}

	public DsGiaoVien() {
	}

	@Override
	public void insert() {
		System.out.print("Nhập số giáo viên: ");
		n = Integer.parseInt(sc.nextLine());
		gv = new GiaoVien[n];

		for (int i = 0; i < n; i++) {
			gv[i] = new GiaoVien();
			System.out.println("Nhập thông tin giáo viên thứ " + (i + 1));

			sc.nextLine();
			System.out.print("Nhập mã giáo viên: ");
			gv[i].setId(sc.nextLine());

			System.out.print("Nhập tên giáo viên: ");
			gv[i].setName(sc.nextLine());

			System.out.print("Nhập lớp: ");
			gv[i].setLop(sc.nextLine());

			System.out.print("Nhập số ngày làm: ");
			gv[i].setSoNgayLam(sc.nextFloat());

			System.out.print("Lương cơ bản: ");
			gv[i].setLuongCoBan(sc.nextFloat());

			System.out.println();
		}
	}

	@Override
	public void add() {
		System.out.println("Nhập số giáo viên cần thêm: ");
		int k = sc.nextInt();
		int j = gv.length;
		int a = gv.length + k;
		gv = Arrays.copyOf(gv, a);

		for (int i = j; i < a; i++) {
			gv[i] = new GiaoVien();

			sc.nextLine();
			String id;

			nhapid:
			while (true) {
				System.out.print("Nhập mã giáo viên: ");
				id = sc.nextLine();
				if (checkId(id)) {
					System.out.println("Mã giáo viên đã tồn tại, xin mời nhập lại");
					continue nhapid;
				}
				break nhapid;
			}
			gv[i].setId(id);

			System.out.print("Nhập tên giáo viên: ");
			gv[i].setName(sc.nextLine());

			System.out.print("Nhập lớp giáo viên chủ nhiệm: ");
			gv[i].setLop(sc.nextLine());

			System.out.print("Nhập số ngày công: ");
			gv[i].setSoNgayLam(sc.nextFloat());

			System.out.print("Nhập lương cơ bản: ");
			gv[i].setLuongCoBan(sc.nextFloat());

			System.out.println();

		}
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		sc.nextLine();

		System.out.print("Nhập mã giáo viên cần xóa: ");
		String idDelete = sc.nextLine();

		if (checkIdXoa(idDelete)) {
			int k = 0;
			// Vòng for tìm mã cần xóa rồi ghi vào k
			for (int i = 0; i < gv.length; i++) {
				if (idDelete.equals(gv[i].getId())) {
					k = i;
					break;
				}
			}
			// Vòng for xóa mã tại vị trí k
			for (int i = k; i < gv.length - 1; i++) {
				gv[i] = gv[i + 1];
			}
			// Set mảng mới trừ bớt đi 1 giá trị
			gv = Arrays.copyOf(gv, gv.length - 1);
		} else
			System.out.println("Mã nhập vào không tồn tại !!");
	}

	@Override
	public void search() {
		String searchName;
		System.out.print("Nhập tên cần tìm: ");
		searchName = sc.nextLine();
		System.out.println("Thông tin học sinh cần tìm: ");
		System.out.println(String.format(" %10s  ", "Mã số") + String.format("%13s  ", "Họ tên")
				+ String.format("%13s  ", "Lớp") + String.format("%13s  ", "Số ngày làm")
				+ String.format("%13s  ", "Lương cơ bản") + String.format("%15s  ", "Tổng lương"));
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < gv.length; i++) {
			if (gv[i].getName().toLowerCase().contains(searchName.toLowerCase()))

			{
				gv[i].showData();
			}
		}

	}

	public boolean checkIdXoa(String id) {
		for (int i = 0; i < gv.length; i++) {
			if (id.equals(gv[i].getId())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void showData() {
		System.out.println(
				"----------------------------------------------DANH SÁCH GIÁO VIÊN-------------------------------------------------------");
		System.out.println(String.format(" %10s  ", "Mã số") + String.format("%13s  ", "Họ tên")
				+ String.format("%13s  ", "Lớp") + String.format("%13s  ", "Số ngày làm")
				+ String.format("%13s  ", "Lương cơ bản") + String.format("%13s  ", "Tổng lương"));
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < gv.length; i++) {
			gv[i].showData();
		}

	}

	public boolean checkId(String id) {
		for (int i = 0; i < n; i++) {
			if (id.equals(gv[i].getId()))
				return true;
		}
		return false;
	}

}
