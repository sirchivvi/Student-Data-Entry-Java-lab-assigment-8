# Student Data Entry Java Application

## Overview
This is a CLI-based Java application that allows users to manage student records using CRUD (Create, Read, Update, Delete) operations with validation and custom exceptions.

## Functionalities

1. **Add Student**
   - Adds a new student using PRN and name.
   - Custom Exceptions:
     - `InvalidPRNException`
     - `InvalidNameException`
     - `DuplicateStudentException`

2. **Display Students**
   - Lists all students.

3. **Update Student**
   - Updates the name of a student based on PRN.
   - Custom Exceptions:
     - `InvalidNameException`
     - `StudentNotFoundException`

4. **Delete Student**
   - Removes a student using their PRN.
   - Custom Exception:
     - `StudentNotFoundException`

5. **Search Student**
   - Searches and displays student information using PRN.
   - Custom Exception:
     - `StudentNotFoundException`

## Technologies
- Java
- Java Collections (ArrayList)
- Scanner for input
- Custom Exception Handling

## How to Run
1. Compile all Java files.
2. Run `Main.java`.

## Author
- **Name:** Akhil Chivukula  
- **PRN:** 23070126009  
- **Batch:** AIML B2
