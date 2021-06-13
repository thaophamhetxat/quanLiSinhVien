package com.codegym;

public class Lop {
    int id;
    String name;
    public Lop(){

    }
    public Lop(int id, String name){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
