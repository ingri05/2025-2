package model;

import java.util.ArrayList;
import java.util.Collections;

public class Controller {

    ArrayList<Student> students;

    public Controller(){
        students = new ArrayList<>();
    }

    public void addStudent(Student s){
        students.add(s);
    }

    public void printStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void sortByCode(){
        // Ordenar usando compareTo (por code)
        students.sort(null);
        //Collections.sort(students);
    }

    public ArrayList<Student> getStudents(){
        return students;
    }
}
