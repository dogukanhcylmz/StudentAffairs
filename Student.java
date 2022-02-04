package java2lab01;

public class Student {

	private String name;
	private int[] courses;
	private int[] grades;

	public Student(String name, int[] courses, int[] grades) {
		this.name = name;
		this.courses = courses;
		this.grades = grades;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getCourses() {
		return courses;
	}

	public void setCourses(int[] courses) {
		this.courses = courses;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public void addCourse(int course_id, int grade) {

		int[] newCourses = new int[this.courses.length + 1];
		int[] newGrades = new int[this.grades.length + 1];

		for (int i = 0; i < courses.length; i++) {

			newCourses[i] = this.courses[i];
			newGrades[i] = this.grades[i];
		}

		newCourses[newCourses.length - 1] = course_id;
		newGrades[newGrades.length - 1] = grade;

		this.courses = newCourses;
		this.grades = newGrades;

	}

	public double calculateAverage() {

		int sum = 0;

		for (int i = 0; i < grades.length; i++) {

			sum += grades[i];

		}

		double average = sum / grades.length;

		return average;

	}

}
