package java2lab01;

public class StudentAffairs {

	public static void main(String[] args) {

		Student margot = new Student("Margot Roman", new int[] { 103, 104 }, new int[] { 45, 88 });
		Student isabella = new Student("Isabella Davies", new int[] { 101, 104 }, new int[] { 36, 46 });
		Student murphy = new Student("Murphy Meyer", new int[] { 101, 103 }, new int[] { 70, 55 });
		Student lawrance = new Student("Lawrence Marquez", new int[] { 102, 103, 104 }, new int[] { 22, 28, 92 });
		Student chay = new Student("Chay Skinner", new int[] { 101, 102, 104 }, new int[] { 66, 44, 39 });
		Student may = new Student("May Banks", new int[] { 103 }, new int[] { 49 });
		Student presley = new Student("Presley Morgan", new int[] { 102, 104 }, new int[] { 88, 74 });
		Student alysha = new Student("Alysha Caldwell", new int[] { 101, 102, 104 }, new int[] { 49, 22, 55 });
		Student kirby = new Student("Kirby Aguilar", new int[] { 101, 102, 103 }, new int[] { 82, 77, 65 });
		Student edna = new Student("Edna Padilla", new int[] { 102 }, new int[] { 59 });

		Student[] students = { margot, isabella, murphy, lawrance, chay, may, presley, alysha, kirby, edna };

		double mathAverage = 0;
		int mathCount = 0;
		double physicsAverage = 0;
		int physicsCount = 0;
		double chemistryAverage = 0;
		int chemistryCount = 0;
		double biologyAverage = 0;
		int biologyCount = 0;

		for (Student student : students) {
			System.out.println(student.getName() + ": " + String.format("%.2f", student.calculateAverage()));
		}

		for (Student student : students) {
			for (int i = 0; i < student.getCourses().length; i++) {
				if (student.getCourses()[i] == 101) {
					mathAverage += student.getGrades()[i];
					mathCount++;
				} else if (student.getCourses()[i] == 102) {
					physicsAverage += student.getGrades()[i];
					physicsCount++;
				} else if (student.getCourses()[i] == 103) {
					chemistryAverage += student.getGrades()[i];
					chemistryCount++;
				} else {
					biologyAverage += student.getGrades()[i];
					biologyCount++;
				}
			}
		}
		mathAverage = mathAverage / mathCount;
		physicsAverage = physicsAverage / physicsCount;
		chemistryAverage = chemistryAverage / chemistryCount;
		biologyAverage = biologyAverage / biologyCount;
		
		System.out.println();
		
		System.out.println("Math: " + String.format("%.02f", mathAverage));
		System.out.println("Physics: " + String.format("%.02f", physicsAverage));
		System.out.println("Chemistry: " + String.format("%.02f", chemistryAverage));
		System.out.println("Biology: " + String.format("%.02f", biologyAverage));

	}
}
