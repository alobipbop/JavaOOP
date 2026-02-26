package view;

import controller.StudentController;
import model.Student;
import ulti.Validation;

import java.util.ArrayList;

public class StudentView {

    private StudentController controller = new StudentController();

    public StudentView(StudentController controller) {
        this.controller = controller;
    }

    public void menu() {
        while (true) {
            System.out.println("WELCOME TO STUDENT MANAGEMENT\n");
            System.out.println("1. Create");
            System.out.println("2. Find and Sort");
            System.out.println("3. Update/Delete");
            System.out.println("4. Report");
            System.out.println("5. Exit");
            System.out.println("6. New Search");

            int choice = Validation.getInt("(Please choose 1 to Create, 2 to Find and Sort, 3 to Update/Delete, 4 to Report, 5 to Exit program and 6 to Search)\n", 1, 6);

            switch (choice) {
                case 1:
                    create();
                    break;
                case 2:
                    findAndSort();
                    break;
                case 3:
                    updateDelete();
                    break;
                case 4:
                    report();
                    break;
                case 6:
                    search();
                    break;
                case 5:
                    return;

            }
        }
    }

    private void create() {
        int n = Validation.getInt("The number of students you want to enroll:\n", 0, 100);
        while (--n >= 0) {
            String id = Validation.getString("ID: ");
            String name = Validation.getString("Name: ");
            String semester = Validation.getString("Semester: ");
            //check input if it is the available course
            String course;
            do {
                course = Validation.getString("Course (Java/.Net/C++): ");
            } while (!Validation.isValidCourse(course));

            controller.createStudent(new Student(id, name, semester, course));

//            if (controller.size() >= 4) {
//                String cont = Validation.getString("Continue? (Y/N): ");
//                if (cont.equalsIgnoreCase("N")) {
//                    break;
//                }
//            }
        }
    }

    private void findAndSort() {
        String key = Validation.getString("Enter name: ");
        ArrayList<Student> list = controller.findByName(key);
        if (list == null) {
            System.out.println("Student not found!");
            return;
        }
        for (Student s : list) {
            System.out.println(
                    s.getStudentName() + " | " + s.getSemester() + " | " + s.getCourseName()
            );
        }

    }

    private void updateDelete() {
        String id = Validation.getString("Enter ID: ");
        Student s = controller.findById(id);
        if (s == null) {
            System.out.println("Student not found!");
            return;
        }
        String choice = Validation.getString("Update (U) or Delete (D): ");
        if (choice.equalsIgnoreCase("U")) {
            s.setStudentName(Validation.getString("New name: "));
            s.setSemester(Validation.getString("New semester: "));
            s.setCourseName(Validation.getString("New course: "));
        } else if (choice.equalsIgnoreCase("D")) {
            controller.deleteStudent(s);
            System.out.println("Student deleted!");
        }
    }

    private void report() {
        controller.report();
    }

    private void search(){
        String choice = Validation.getString("(Please choose 1 to Search by Id, 2 to Search by Course)\n");

        if(choice.equals("1")){
            Student s;
            String id = Validation.getString("Enter ID: ");
            s = controller.findById(id);
            if (s == null) {
                System.out.println("Student not found!");
                return;
            }
            System.out.println(
                    s.getStudentName() + " | " + s.getSemester() + " | " + s.getCourseName()
            );

        } else if (choice.equals("2")){
            String course;
            do {
                course = Validation.getString("Enter Course (Java/.Net/C++): ");
            } while (!Validation.isValidCourse(course));

            ArrayList<Student> list = controller.findByCourse(course);
            if (list == null) {
                System.out.println("No students enrolled.\n");
                return;
            }
            for (Student s : list) {
                System.out.println(
                        s.getStudentName() + " | " + s.getSemester() + " | " + s.getCourseName()
                );
            }
        }

    }
}
