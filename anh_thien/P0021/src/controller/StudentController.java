package controller;

import model.Student;
import ulti.Validation;

import java.util.*;

public class StudentController {

    private ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    // 1. CREATE
    public void createStudent(Student s) {
        students.add(s);
    }

    public int size() {
        return students.size();
    }

    // 2. FIND & SORT
    public ArrayList<Student> findByName(String keyword) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getStudentName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(s);
            }
        }
        if (result.isEmpty()) {
            return null;
        }

        result.sort(Comparator.comparing(Student::getStudentName));
        return result;
    }

    public ArrayList<Student> findByCourse(String keyword) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getCourseName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(s);
            }
        }
        if (result.isEmpty()) {
            return null;
        }

        result.sort(Comparator.comparing(Student::getCourseName));
        return result;
    }

    // 3. UPDATE / DELETE
    public Student findById(String id) {
        for (Student s : students) {
            if (s.getId().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }

    public void deleteStudent(Student s) {
        students.remove(s);
    }

    // 4. REPORT
    public void report() {
        Map<String, Map<String, Integer>> reportMap = new HashMap<>();

//        Map<String, Integer> mapName = new HashMap<>();
        for (Student s : students) {

            if (reportMap.containsKey(s.getStudentName())) {
                Map<String, Integer> map1 = reportMap.get(s.getStudentName());
                if (map1.containsKey(s.getCourseName())) {
                    map1.put(s.getCourseName(), map1.get(s.getCourseName()) + 1);
                } else {
                    map1.put(s.getCourseName(), 1);
                }
            } else {
                reportMap.put(s.getStudentName(), new HashMap<>(Map.of(s.getCourseName(), 1)));
            }
        }


        System.out.println("Student Name | Course | Total");
        for (String name : reportMap.keySet()) {
            for (String course : reportMap.get(name).keySet()) {
                System.out.format("%12s | %6s | %5s\n", name, course, reportMap.get(name).get(course));
            }
        }
    }
}

