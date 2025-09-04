package model;

import java.time.LocalDate;
import java.util.Date;

public class Student implements Comparable<Student> {

    // Atributos
    private String name;
    private String apellido;
    private String code;
    private LocalDate birthDate;
    private double average;

    // Constructor
    public Student(String name, String apellido, String code, LocalDate birthDate, double average) {
        this.name = name;
        this.apellido = apellido;
        this.code = code;
        this.birthDate = birthDate;
        this.average = average;
    }

    // Métodos getter
    public String getName() {
        return name;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCode() {
        return code;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public double getAverage() {
        return average;
    }

    // Implementación de compareTo (compara por code)
    @Override
    public int compareTo(Student other) {
        return this.code.compareTo(other.code);
    }

    // toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                ", code='" + code + '\'' +
                ", birthDate=" + birthDate +
                ", average=" + average +
                '}';
    }
}
