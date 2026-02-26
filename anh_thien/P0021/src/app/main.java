/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import controller.StudentController;
import java.util.ArrayList;
import model.DemoDB;
import model.Student;
import view.StudentView;

/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> demo = DemoDB.initData();
        StudentController control = new StudentController();
        StudentView view = new StudentView(control);
        control.setStudents(demo);
        view.menu();
    }
}
