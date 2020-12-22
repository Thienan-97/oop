package qlhocsinh;

<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import HocSinh.HocSinh;

=======
>>>>>>> parent of b4eac25... Merge branch 'main' of https://github.com/Thienan-97/oop into main
public abstract class Person {
	protected String id;
	protected String name;
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
	
<<<<<<< HEAD
	
	
=======
>>>>>>> parent of b4eac25... Merge branch 'main' of https://github.com/Thienan-97/oop into main
}
