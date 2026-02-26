/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DemoDB {

    public static ArrayList<Student> initData() {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("1", "Thien", "Spring", "Java"));
        list.add(new Student("2", "Linh", "Summer", "C++"));
        list.add(new Student("3", "Cuong", "Fall", ".NET"));
        list.add(new Student("3", "Cuong", "Summer", "Java"));
        list.add(new Student("3", "Cuong", "Spring", ".NET"));

        return list;
    }

}
