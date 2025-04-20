// Name: Akhil Chivukula
// PRN: 23070126009
// Batch: AIML B2

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	StudentDatabase db = new StudentDatabase();
    	int choice;

    	while (true) {
        	System.out.println("\n--- Student Data Entry ---");
        	System.out.println("1. Add Student");
        	System.out.println("2. Display Students");
        	System.out.println("3. Update Student");
        	System.out.println("4. Delete Student");
        	System.out.println("5. Search Student");
        	System.out.println("6. Exit");
        	System.out.print("Enter your choice: ");
        	choice = sc.nextInt();

        	switch (choice) {
            	case 1 -> db.addStudent();
            	case 2 -> db.displayStudents();
            	case 3 -> db.updateStudent();
            	case 4 -> db.deleteStudent();
            	case 5 -> db.searchStudent();
            	case 6 -> System.exit(0);
            	default -> System.out.println("Invalid choice.");
        	}
    	}
	}
}



