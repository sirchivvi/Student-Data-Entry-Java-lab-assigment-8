Student.java

public class Student {
	String prn;
	String name;

	public Student(String prn, String name) throws InvalidNameException, InvalidPRNException {
    	if (!name.matches("[A-Za-z ]+")) {
        	throw new InvalidNameException("Name must contain only alphabets.");
    	}
    	if (!prn.matches("\\d{11}")) {
        	throw new InvalidPRNException("PRN must be 11 digits.");
    	}
    	this.prn = prn;
    	this.name = name;
	}

	public String toString() {
    	return "PRN: " + prn + " | Name: " + name;
	}
}

