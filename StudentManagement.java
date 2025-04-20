public class StudentDatabase {
	ArrayList<Student> students = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void addStudent() {
    	try {
        	System.out.print("Enter PRN: ");
        	String prn = sc.nextLine();
        	System.out.print("Enter Name: ");
        	String name = sc.nextLine();

        	for (Student s : students) {
            	if (s.prn.equals(prn)) throw new DuplicateStudentException("Student already exists.");
        	}

        	Student s = new Student(prn, name);
        	students.add(s);
        	System.out.println("Student added.");
    	} catch (InvalidNameException | InvalidPRNException | DuplicateStudentException e) {
        	System.out.println("Error: " + e.getMessage());
    	}
	}

	public void displayStudents() {
    	if (students.isEmpty()) {
        	System.out.println("No students to display.");
        	return;
    	}
    	for (Student s : students) {
        	System.out.println(s);
    	}
	}

	public void updateStudent() {
    	System.out.print("Enter PRN to update: ");
    	String prn = sc.nextLine();
    	boolean found = false;

    	for (Student s : students) {
        	if (s.prn.equals(prn)) {
            	try {
                	System.out.print("Enter new name: ");
                	String newName = sc.nextLine();
                	if (!newName.matches("[A-Za-z ]+")) {
                    	throw new InvalidNameException("Name must contain only alphabets.");
                	}
                	s.name = newName;
                	found = true;
                	System.out.println("Updated successfully.");
            	} catch (InvalidNameException e) {
                	System.out.println("Error: " + e.getMessage());
            	}
        	}
    	}

    	if (!found) {
        	try {
            	throw new StudentNotFoundException("Student not found.");
        	} catch (StudentNotFoundException e) {
            	System.out.println("Error: " + e.getMessage());
        	}
    	}
	}

	public void deleteStudent() {
    	System.out.print("Enter PRN to delete: ");
    	String prn = sc.nextLine();
    	boolean removed = students.removeIf(s -> s.prn.equals(prn));

    	if (removed) {
        	System.out.println("Student deleted.");
    	} else {
        	try {
            	throw new StudentNotFoundException("Student not found.");
        	} catch (StudentNotFoundException e) {
            	System.out.println("Error: " + e.getMessage());
        	}
    	}
	}

	public void searchStudent() {
    	System.out.print("Enter PRN to search: ");
    	String prn = sc.nextLine();
    	for (Student s : students) {
        	if (s.prn.equals(prn)) {
            	System.out.println(s);
            	return;
        	}
    	}
    	try {
        	throw new StudentNotFoundException("Student not found.");
    	} catch (StudentNotFoundException e) {
        	System.out.println("Error: " + e.getMessage());
    	}
	}
}
