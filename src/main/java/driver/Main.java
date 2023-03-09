package driver;

import courses.Course;
import courses.Instructor;
import courses.Textbook;

public class Main {
    public static void main(String[] args) {
        // Test run with one instructor/textbook
        Course course = new Course("CS-5800 Advanced Software Engineering");
        course.addInstructor(
            new Instructor("Nima", "Davarpanah", "3-2636")
        );
        course.addTextbook(
            new Textbook("Clean Code", "Robert C. Martin", "Pearson")
        );
        System.out.println("One instructor and textbook:");
        course.print();

        System.out.println("------------------");

        // Adding instructors/textbooks
        course.addInstructor(
            new Instructor("Jose", "Fernandez", "1-1234")
        );
        course.addTextbook(
            new Textbook("API Design Patterns", "JJ Geewax", "Manning")
        );
        System.out.println("Two instructors and textbooks:");
        course.print();
    }
}