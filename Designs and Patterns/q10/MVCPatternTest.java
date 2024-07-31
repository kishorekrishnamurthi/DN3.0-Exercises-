// MVCPatternTest.java
public class MVCPatternTest {
    public static void main(String[] args) {
        // Create a student model
        Student student = new Student("kishore", "12345", "A");

        // Create a view
        StudentView view = new StudentView();

        // Create a controller with the student model and view
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        controller.updateView();

        // Update student details using controller
        controller.setStudentName("Joseph");
        controller.setStudentId("67890");
        controller.setStudentGrade("A");

        // Display updated student details
        controller.updateView();
    }
}
