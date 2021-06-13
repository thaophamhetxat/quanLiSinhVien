package com.codegym;

public class Student {
    int id;
    String name;
    String Gender;
    int Age;

    public Student(){

    }

    public Student(int id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        Gender = gender;
        Age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return Gender;
    }

    public int getAge() {
        return Age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Age=" + Age +
                '}';
    }
}
