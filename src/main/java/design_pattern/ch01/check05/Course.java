package design_pattern.ch01.check05;

import java.util.ArrayList;

public class Course {
	private String name;
	private ArrayList<Student> stdLists;
	
	public Course() {
		this.name ="¾Æ¹«°³";
		stdLists = new ArrayList<>();
	}

	public Course(String name) {
		this();
		this.name = name;
	}

	public void registerStudent(Student student){
		if (!stdLists.contains(student)){
			stdLists.add(student);
		}
	}
	
	public void dropStudent(Student student){
		if (stdLists.contains(student)){
			stdLists.remove(student);
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		return this.name.equals(((Course)obj).name);
	}

	@Override
	public String toString() {
		return  name;
	}

	public ArrayList<Student> getStdLists() {
		return stdLists;
	}
	

}
