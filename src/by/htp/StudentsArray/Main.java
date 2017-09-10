package by.htp.StudentsArray;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Date birthDate1 = new Date(1996 - 12 - 20);
		Date birthDate2 = new Date(2000 - 03 - 15);
		Date birthDate3 = new Date(1998 - 02 - 22);
		Date birthDate4 = new Date(1999 - 11 - 16);
		Date birthDate5 = new Date(1997 - 05 - 04);

		Student students[] = { new Student(1, "Student 1", birthDate1, 9.5),
				new Student(2, "Student 2", birthDate2, 7.2), new Student(3, "Student 3", birthDate3, 8.3),
				new Student(4, "Student 4", birthDate4, 8.9) };

		StudentGroup studentGroup = new StudentGroup(students.length);
		studentGroup.remove(2);
		printStudents(students);

	}

	public static void printStudents(Student[] student) {
		for (int i = 0; i < student.length; i++) {
			student[i].showStudentsInfo();
		}
	}
	
}

