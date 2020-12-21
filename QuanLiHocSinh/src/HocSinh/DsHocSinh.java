package HocSinh;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

import qlhocsinh.Helper;
import qlhocsinh.Person;
import HocSinh.HocSinh;

public class DsHocSinh implements Helper {

	private HocSinh[] hs;
	private int n;
	Scanner sc = new Scanner(System.in);

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
				"----------------------------------------------------------------------------DANH SÁCH HỌC SINH------------------------------------------------------------------------");
		System.out.println(
				String.format(" %10s  ", "Mã số") + String.format("%13s  ", "Họ tên") + String.format("%13s  ", "Lớp")
						+ String.format("%13s  ", "Số Ngày học") + String.format("%13s  ", "Điểm toán")
						+ String.format("%15s  ", "Điểm Văn") + String.format("%13s  ", "Điểm anh")
						+ String.format("%13s  ", "Hạnh kiểm") + String.format("%13s  ", "Xếp loại")
						+ String.format("%13s  ", "Điểm trung bình") + String.format("%13s  ", "Học phí"));
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < hs.length; i++) {
			hs[i].showData();
		}
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Nhập số học sinh cần thêm: ");
		int k = sc.nextInt();
		int j = hs.length;
		int a = hs.length + k;
		hs = Arrays.copyOf(hs, a);

		for (int i = j; i < a; i++) {
			hs[i] = new HocSinh();

			sc.nextLine();
			String id;

			nhapid: while (true) {
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

			System.out.print("Nhập số ngày học: ");
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

	static int count = 0;

	@Override
	public void update() {
		sc = new Scanner(System.in);
		int temp = 0;
		boolean flag = false;
		System.out.print("Nhập mã học sinh cần cập nhật thông tin: ");
		String numID = sc.nextLine();
		for (int x = 0; x < hs.length && flag == false; x++) {
			if (checkIdUp(numID)) {
				temp = x;
				flag = true;
			}
		}
		if (flag) {
			System.out.println("Enter Student Name: ");
			hs[temp].setName(sc.nextLine());
			System.out.println("Enter Student class");
			hs[temp].setLop(sc.nextLine());
			System.out.println("Enter Student toan");
			hs[temp].setDiemToan(sc.nextFloat());
			System.out.println("Enter Student anh");
			hs[temp].setDiemAnh(sc.nextFloat());
			System.out.println("Enter Student van");
			hs[temp].setDiemVan(sc.nextFloat());
			System.out.println("Enter Student Course");
			hs[temp].setHanhKiem(sc.nextInt());
			System.out.println("Enter Student Course");
			hs[temp].setSoNgayHoc(sc.nextFloat());
			System.out.println("Học sinh có mã: " + numID + " đã được cập nhật thông tin");
		} else
			System.out.println("Không có học sinh nào có số thứ tự: " + numID);
			
	}

	@Override
	public void delete() {
		sc.nextLine();

		System.out.print("Nhập mã học sinh cần xóa: ");
		String idDelete = sc.nextLine();

		if (checkIdXoa(idDelete)) {
			int k = 0;
			// Vòng for tìm mã cần xóa rồi ghi vào k
			for (int i = 0; i < hs.length; i++) {
				if (idDelete.equals(hs[i].getId())) {
					k = i;
					break;
				}
			}
			// Vòng for xóa mã tại vị trí k
			for (int i = k; i < hs.length - 1; i++) {
				hs[i] = hs[i + 1];
			}
			// Set mảng mới trừ bớt đi 1 giá trị
			hs = Arrays.copyOf(hs, hs.length - 1);
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
				+ String.format("%13s  ", "Lớp") + String.format("%13s  ", "Số Ngày học")
				+ String.format("%13s  ", "Điểm toán") + String.format("%15s  ", "Điểm Văn")
				+ String.format("%13s  ", "Điểm anh") + String.format("%13s  ", "Hạnh kiểm"));
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < hs.length; i++) {
			if (hs[i].getName().toLowerCase().contains(searchName.toLowerCase()))

			{
				hs[i].showData();
			}
		}

	}
	public boolean checkIdUp(String id) {
		for (int i = 0; i < hs.length; i++) {
			if (id.equalsIgnoreCase(hs[i].getId())) {
				return true;
			}
		}
		return false;
	}
	public boolean checkIdXoa(String id) {
		for (int i = 0; i < hs.length; i++) {
			if (id.equals(hs[i].getId())) {
				return true;
			}
		}
		return false;
	}

	public boolean checkId(String id) {
		for (int i = 0; i < n; i++) {
			if (id.equals(hs[i].getId()))
				return true;
		}
		return false;
	}

//import
	public void imp() throws IOException {
		BufferedReader impData = new BufferedReader(new InputStreamReader(new FileInputStream("E:/importData.txt")));
		StringBuffer sb = new StringBuffer();
		String[] splitStr = new String[10];
		int i = 0;
		try {
		    String line;
		    System.out.println(
					"----------------------------------------------DANH SÁCH HỌC SINH------------------------------------------");
			System.out.println(String.format(" %10s  ", "Mã số") + String.format("%13s  ", "Họ tên")
					+ String.format("%13s  ", "Ngày sinh") + String.format("%11s  ", "Lớp")
					+ String.format("%13s  ", "GVCN") + String.format("%15s  ", "Số ngày học"));
			System.out.println(
					"----------------------------------------------------------------------------------------------------------");
		    while ((line = impData.readLine()) != null) {
//		    	System.out.println(line);
		    	splitStr = line.split(" ");
		    	System.out.println("day: "+ splitStr[1]);
				if (splitStr[0] == "id:") {
//		    		hs[i].id = splitStr[1];
					hs[i].setId(splitStr[1]);
					i++;
//		    		System.out.println(String.format(" %10s  ", hs[i].getId()) + String.format("%13s  ", hs[i].getName()));
////					+ String.format("%13s  ", hs[i].getLop()) + String.format("%13s  ", hs[i].getSoNgayHoc())
////					+ String.format("%13s  ", hs[i].getDiemToan()) + String.format("%13s  ", hs[i].getDiemAnh())
////					+ String.format("%13s  ", hs[i].getDiemVan()) + String.format("%13s  ", hs[i].getHanhKiem()));
				}

				sb.append(line);
				sb.append("\n");
			}
		} finally {

			impData.close();
		}
	}

	public void export() throws IOException {

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\DELL XPS 15\\Documents\\export.txt"));
			writer.write(
					"----------------------------------------------------------------------------DANH SÁCH HỌC SINH------------------------------------------------------------------------");
			writer.newLine();
			writer.write(String.format(" %10s  ", "Mã số") + String.format("%13s  ", "Họ tên")
					+ String.format("%13s  ", "Lớp") + String.format("%13s  ", "Số Ngày học")
					+ String.format("%13s  ", "Điểm toán") + String.format("%15s  ", "Điểm Văn")
					+ String.format("%13s  ", "Điểm anh") + String.format("%13s  ", "Hạnh kiểm")
					+ String.format("%13s  ", "Xếp loại") + String.format("%13s  ", "Điểm trung bình")
					+ String.format("%13s  ", "Học phí"));
			writer.newLine();
			writer.write(
					"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			writer.newLine();
			for (int i = 0; i < hs.length; i++) {
				writer.write(String.format(" %10s  ", hs[i].getId()) + String.format("%15s  ", hs[i].getName())
						+ String.format("%11s  ", hs[i].getLop()) + String.format("%13s  ", hs[i].getSoNgayHoc())
						+ String.format("%13s  ", hs[i].getDiemToan()) + String.format("%15s  ", hs[i].getDiemVan())
						+ String.format("%13s  ", hs[i].getDiemAnh()) + String.format("%13s  ", hs[i].getHanhKiem())
						+ String.format("%13s  ", hs[i].xepLoaiHocSinh())
						+ String.format("%15s  ", hs[i].tinhDiemTrungBinh())
						+ String.format("%13s  ", hs[i].tinhHocPhi()));
				writer.newLine();
			}
			writer.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
