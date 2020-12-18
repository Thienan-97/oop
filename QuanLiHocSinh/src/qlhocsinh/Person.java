package qlhocsinh;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Person {
	protected String id;
	protected String name;
	protected Person []p = new Person[50];
	int i=0;
	//Constructor
	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public Person() {
		this.id = null;
		this.name = null;
	}
	
	//Getter and Setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void showData();
	
	public void export() throws IOException {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("E:/student.txt"));
			for (int i = 0; i < p.length; i++) {
				if (p[i] instanceof Person) {
					writer.write("id: " + p[i].id);
					writer.newLine();
					writer.write("name: " + p[i].name);
					writer.newLine();
					writer.write("=============================");
					writer.newLine();
				}
			}
			writer.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}	
	}

	public void imp() throws IOException {
		BufferedReader impData = new BufferedReader(new InputStreamReader(new FileInputStream("E:/importData.txt")));
		StringBuffer sb = new StringBuffer();
//		Person[] str = new HocSinh(id, name, ngaySinh, lop, giaoVienCN, soNgayHoc, diemToan, diemVan, diemAnh, hanhKiem);
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
		    	String[] splitStr = line.split(" ");
//		    	System.out.println("splitStr0: "+splitStr[0] + " + splitStr1" + splitStr[1]);
		    	if(splitStr[0] == "id:") {
		    		
		    		p[i].id = splitStr[1];
		    		p[i].setId(splitStr[1]);
		    		i++;
		    	}	
		    	if (p[i] instanceof Person) {
					System.out.println(String.format(" %10s  ", p[i].getId()) + String.format("%13s  ", p[i].getName())
							+ String.format("%13s  ", p[i].getNgaySinh())
							+ String.format("%11s  ", ((Person) p[i]).getLop())
							+ String.format("%13s  ", ((Person) p[i]).getGiaoVienCN())
							+ String.format("%15s  ", ((Person) p[i]).getSoNgayHoc()));
		    	}
		    	sb.append(line);
		        sb.append("\n");
		    }
		} finally {
			impData.close();
		}
	}
	protected abstract Object getSoNgayHoc();
	protected abstract Object getGiaoVienCN();
	protected abstract Object getLop();
	protected abstract Object getNgaySinh();
}
