package design_pattern.ch01.check03;

public class Student {
	private Professor advisor;
	
	public Student() {
	}

	public Professor getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}

	@Override
	public String toString() {
		return "Student";
	}
	
	
}
