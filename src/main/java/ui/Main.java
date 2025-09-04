package ui;

import model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ana", "Pérez", "105", LocalDate.parse("2002-05-10"), 4.5));
        students.add(new Student("Luis", "Gómez", "101", LocalDate.parse("2001-03-22"), 3.8));
        students.add(new Student("María", "Rodríguez", "109", LocalDate.parse("2003-07-15"), 4.2));
        students.add(new Student("Pedro", "Martínez", "103", LocalDate.parse("2000-11-05"), 3.5));
        students.add(new Student("Sofía", "López", "107", LocalDate.parse("2002-09-28"), 4.9));
        students.add(new Student("Andrés", "Torres", "102", LocalDate.parse("2001-12-01"), 3.7));
        students.add(new Student("Laura", "Ramírez", "110", LocalDate.parse("2003-02-18"), 4.1));
        students.add(new Student("Carlos", "Hernández", "104", LocalDate.parse("2000-08-09"), 3.6));
        students.add(new Student("Valentina", "Morales", "108", LocalDate.parse("2002-04-30"), 4.8));
        students.add(new Student("Jorge", "Castro", "106", LocalDate.parse("2001-10-12"), 3.9));

        //students.sort(null);
        Collections.sort(students);

        System.out.println("\n✅ Estudiantes ORDENADOS por code:");
        for (Student s : students) {
            System.out.println(s);
        }

    }
}
