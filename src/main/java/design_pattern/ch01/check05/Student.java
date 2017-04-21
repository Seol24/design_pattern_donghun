package design_pattern.ch01.check05;

import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Course> courses;
	
	public Student() {
		courses = new ArrayList<>();
	}

	public Student(String name) {
		this();
		this.name = name;
	}
	
	public void registerCourse(Course course){
		if (!courses.contains(course)){
			courses.add(course);
			course.registerStudent(this);
		}
	}
	
	public void dropCourse(Course course){
		if (courses.contains(course)){
			courses.remove(course);
			course.dropStudent(this);
		}
	}

	public boolean equals(Object obj) {
		return this.name.equals(((Student)obj).name);
	}
	@Override
	public String toString() {
		return String.format("%s %s", name, courses);
	}

	public String getName() {
		return name;
	}
	
}
