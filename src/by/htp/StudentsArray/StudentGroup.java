package by.htp.StudentsArray;

import java.util.Date;

/**
 * You may add new methods, fields to this class, but DO NOT RENAME any given
 * class, interface or method DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;

	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		if (students == null) {
			throw new IllegalArgumentException();
		}
		this.students = students;
	}

	@Override
	public Student getStudent(int index) {
		if (index < 0 || index >= students.length) {
			throw new IllegalArgumentException();
		}
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		if (students == null) {
			throw new IllegalArgumentException();
		}
		students[index] = student;
	}

	@Override
	public void addFirst(Student student) {
		if (students == null) {
			throw new IllegalArgumentException();
		}
		Student[] studentPlusOne = new Student[students.length + 1];

		for (int i = 0; i < students.length; i++) {
			studentPlusOne[i + 1] = students[i];
		}
		studentPlusOne[0] = student;
		this.students = studentPlusOne;
	}

	@Override
	public void addLast(Student student) {
		if (student == null) {
			throw new IllegalArgumentException();
		}

		Student[] studentPlusOne = new Student[students.length + 1];
		studentPlusOne[students.length] = student;

		for (int i = 0; i < students.length; i++) {
			studentPlusOne[i] = students[i];
		}
		this.students = studentPlusOne;
	}

	@Override
	public void add(Student student, int index) {
		if (student == null) {
			throw new IllegalArgumentException();
		}
		if (index < 0 || index >= students.length) {
			throw new IllegalArgumentException();
		}
		Student[] studentPlusOne = new Student[students.length + 1];
		for (int i = 0, j = 0; i < students.length; i++, j++) {
			studentPlusOne[j] = students[i];
		}
		studentPlusOne[index] = student;
		this.students = studentPlusOne;
	}

	@Override
	public void remove(int index) {
		if (index < 0 || index >= students.length) {
			throw new IllegalArgumentException();
		}
		Student[] studentRemoveOne = new Student[students.length - 1];
		for (int i = 0, j = 0; i < students.length; i++) {
			if (i == index) {
				continue;
			}
			studentRemoveOne[j] = students[i];
			j++;
		}
		this.students = studentRemoveOne;
	}

	@Override
	public void remove(Student student) {
		if (student == null) {
			throw new IllegalArgumentException();
		}

		for (int i = 0; i < students.length; i++) {
			if (students[i].equals(student)) {
				students[i] = null;
			}
		}
	}

	@Override
	public void removeFromIndex(int index) {
		if (index < 0 || index >= students.length) {
			throw new IllegalArgumentException();
		}
		Student[] studentsNew = new Student[index];

		for (int i = 0, j = 0; i < studentsNew.length; i++, j++) {
			studentsNew[j] = students[i];
		}
		this.students = studentsNew;
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		if (index < 0 || index >= students.length) {
			throw new IllegalArgumentException();
		}
		int value = students.length - index;
		Student[] studentsNew = new Student[value];
		for (int i = 0, j = value; i < studentsNew.length; i++, j++) {
			studentsNew[j] = students[i];
		}
		this.students = studentsNew;
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = 0; j < i; j++) {
				if (students[j].compareTo(students[j + 1]) > 0) {
					Student buffer = students[j];
					students[j] = students[j + 1];
					students[j + 1] = buffer;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
