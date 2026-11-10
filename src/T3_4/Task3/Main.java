package T3_4.Task3;

import java.io.*;

public class Main {
    private final static String FILENAME = "enrollments.ser";
    public static void main(String[] args) {

        // we create objects
        Student student = new Student(1, "Sneed", 33);
        Course course = new Course("TX00EY21-3016", "Object oriented programming", "Jarkko");
        Enrollment enrollment = new Enrollment(student, course, "10.11.2026");

        // we serialize
        try (
                FileOutputStream outputStream = new FileOutputStream(FILENAME);
                ObjectOutputStream objects = new ObjectOutputStream(outputStream)
                ) {
            objects.writeObject(enrollment);
            System.out.println("Enrollment saved");
        } catch (Exception e) {
            System.err.println(e);
        }

        // we deserialize
        try (
                FileInputStream inputStream = new FileInputStream(FILENAME);
                ObjectInputStream objects = new ObjectInputStream(inputStream)
                ) {
            Enrollment loadEnrollment = (Enrollment) objects.readObject();

            // print info
            System.out.println("\nEnrollment info: ");
            System.out.println("Student ID " + loadEnrollment.getStudent().getId());
            System.out.println("student Name " + loadEnrollment.getStudent().getName());
            System.out.println("student Age " + loadEnrollment.getStudent().getAge());

            System.out.println("Course code " + loadEnrollment.getCourse().getCourseCode());
            System.out.println("Course name " + loadEnrollment.getCourse().getCourseName());
            System.out.println("Instructor " + loadEnrollment.getCourse().getInstructor());

            System.out.println("Enrollment date " + loadEnrollment.getEnrollmentDate());
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
