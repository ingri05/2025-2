package model;

import java.time.LocalDate;
import java.util.Date;

public class Student implements Comparable<Student> {

    private String name;
    private String lastName;
    private String code;
    private LocalDate birthDate;
    private double average;


    public Student(String name, String lastName, String code, LocalDate birthDate, double average) {
        this.name = name;
        this.lastName = lastName;
        this.code = code;
        this.birthDate = birthDate;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
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
                ", lastName='" + lastName + '\'' +
                ", code='" + code + '\'' +
                ", birthDate=" + birthDate +
                ", average=" + average +
                '}';
    }
}
