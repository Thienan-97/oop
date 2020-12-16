package qlhocsinh;

public abstract class Person {
	
//	properties
	protected String id;
	protected String name;
	protected String ngaySinh;
	
//	constructor
	public Person(String id, String name, String ngaySinh) {
		this.id = id;
		this.name = name;
		this.ngaySinh = ngaySinh;
	}
	
	public Person() {
		this.id = "";
		this.name = "";
		this.ngaySinh = "";
	}

//	get & set
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

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
//	method
	
	public abstract void showData();

	public abstract void addData();
	
	public String toString() {
		return "id: "+ id + "Name: " + name + "Ngaysinh: " + ngaySinh;
	}
}
