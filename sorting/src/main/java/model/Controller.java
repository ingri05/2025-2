package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Controller {

    private ArrayList<Student> students;

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


    public void sortByName(){
        //Collections.sort(students, new NameComparator());
        students.sort(new NameComparator());
    }

    public void sortByAverage(){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s1.getAverage(), s2.getAverage());
            }
        });

        Comparator<Student> compAverage = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s1.getAverage() < s2.getAverage()){
                    return -1;
                } else if (s1.getAverage() > s2.getAverage()) {
                    return 1;
                } else  {
                    return 0;
                }
            }
        };
        students.sort(compAverage);


        students.sort(Comparator.comparing(Student::getAverage));
        students.sort(Comparator.comparing(Student::getAverage).reversed());

    }

    public void sortByAverageLambda() {
        students.sort((s1, s2) -> Double.compare(s1.getAverage(), s2.getAverage()));
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
