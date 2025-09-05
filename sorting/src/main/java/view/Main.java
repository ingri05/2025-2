package view;
import model.Controller;
import model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void  main(String[] args) {

        Controller controller = new Controller();
        controller.addStudent(new Student("Ana", "Pérez", "105", LocalDate.parse("2002-05-10"), 4.5));
        controller.addStudent(new Student("Ana", "Pérez", "105", LocalDate.of(2002, 5, 10), 4.5));
        controller.addStudent(new Student("Luis", "Gómez", "101", LocalDate.of(2001, 3, 22), 3.8));
        controller.addStudent(new Student("María", "Rodríguez", "109", LocalDate.of(2003, 7, 15), 4.2));
        controller.addStudent(new Student("Pedro", "Martínez", "103", LocalDate.of(2000, 11, 5), 3.5));
        controller.addStudent(new Student("Sofía", "López", "107", LocalDate.of(2002, 9, 28), 4.9));
        controller.addStudent(new Student("Andrés", "Torres", "102", LocalDate.of(2001, 12, 1), 3.7));
        controller.addStudent(new Student("Laura", "Ramírez", "110", LocalDate.of(2003, 2, 18), 4.1));
        controller.addStudent(new Student("Carlos", "Hernández", "104", LocalDate.of(2000, 8, 9), 3.6));
        controller.addStudent(new Student("Valentina", "Morales", "108", LocalDate.of(2002, 4, 30), 4.8));
        controller.addStudent(new Student("Jorge", "Castro", "106", LocalDate.of(2001, 10, 12), 3.9));

        // Ordenamientos
        //controller.sortByCode();
        //controller.insertionSort();
       //controller.sortByName();
        controller.sortByAverage();

        // Imprimir lista ordenada
        controller.printStudents();

    }
}
