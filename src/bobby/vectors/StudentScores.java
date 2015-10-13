package bobby.vectors;
import java.util.Vector;


public class StudentScores {

	public static void main(String[] args) {
		final String[] names = {"Bobby", "Dan", "Erika", "Tessa", "Matt"};
		final double[] scores = {95, 90, 100, 80, 75};
		
		Vector<Student> students = new Vector<Student>(5);
		
		for (int i = 0; i < students.capacity(); i++) {
			students.add( new Student(names[i], scores[i]));
		}
		
		// checking if students vector is empty
		System.out.println("Vector students empty? " + students.isEmpty() + "\n");
		
		// Outputting first and last elements in students vector
		System.out.println("First element in Vector student is " + students.firstElement() + " with name " + students.firstElement().getName());
		System.out.println("Last element in Vector student is " + students.lastElement() + " with name " + students.lastElement().getName() + "\n");
		
		// checking if vector contains student with name Bobby
		for (Student s : students) {
			if (s.getName() == "Bobby") {
				System.out.println("Student Bobby exists." + "\n");
			}
		}
//		System.out.println(students.i);
		
		// removing student object from index 4 and adding new student object at that index
		System.out.println("Student to remove at index 4: " + students.get(4).getName());
		students.removeElementAt(4);
		students.add(4, new Student("Nick", 100));
		System.out.println("New student at index 4: " + students.get(4).getName() + "\n");
		
		// listing all elements in students vector
		for (Student s : students) {
			String n = s.getName();
			double x = s.getScore();
			System.out.println(n + ": " + x);
		}
	}

}
