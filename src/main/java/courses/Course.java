package courses;

import java.util.ArrayList;

public class Course {
    private String name;
    private final ArrayList<Instructor> instructors;
    private final ArrayList<Textbook> textbooks;

    public Course(String name) {
        this.name = name;
        this.instructors = new ArrayList<>();
        this.textbooks = new ArrayList<>();
    }

    public Course(String name, ArrayList<Instructor> instructors, ArrayList<Textbook> textbooks) {
        this.name = name;
        this.instructors = instructors;
        this.textbooks = textbooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public ArrayList<Textbook> getTextbooks() {
        return textbooks;
    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public Instructor removeInstructor(int index) {
        return instructors.remove(index);
    }

    public void addTextbook(Textbook textbook) {
        textbooks.add(textbook);
    }

    public Textbook removeTextbook(int index) {
        return textbooks.remove(index);
    }

    private void printInstructors() {
        System.out.println("Instructor(s):");
        for (Instructor instructorInstance : instructors) {
            System.out.println(instructorInstance);
        }
    }

    private void printTextbooks() {
        System.out.println("Textbook(s):");
        for (Textbook textbookInstance : textbooks) {
            System.out.println(textbookInstance);
        }
    }

    public void print() {
        System.out.printf("Course: %s%n", name);
        printInstructors();
        printTextbooks();
    }
}
