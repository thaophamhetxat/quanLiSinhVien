package com.codegym;

import java.util.Scanner;

public class Manager {
    public static Student[] create(Student[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Gender: ");
        String gender = scanner.nextLine();
        System.out.println("Age: ");
        int age = Integer.parseInt(scanner.nextLine());


        //khai báo 1 student truyền vào 4 tham số: id,name,gender,age.
        Student student = new Student(id, name, gender, age);
        //tạo 1 mảng mới lưu thông tin truyền vào.
        Student[] arrNew = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = student;
        return arrNew;
//sửa 1 phần tử trong mảng


    }

    //    public static Lop[] create1(Lop[]arr){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("ID:");
//        int id = Integer.parseInt(sc.nextLine());
//        System.out.println("Name: ");
//        String name = sc.nextLine();
//        Lop lop = new Lop(id,name);
//        Lop[]arrNew = new  Lop[arr.length+1];
//        for(int i =0;i<arr.length;i++){
//            arrNew[i]=arr[i];
//        }
//        arrNew[arrNew.length-1]=lop;
//        return arrNew;
//    }
    public static Student[] edit(Student arr[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID Edit: ");
        int index = Integer.parseInt(scanner.nextLine());

        System.out.print("Fix Id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Fix Name: ");
        String name = scanner.nextLine();
        System.out.print("Fix Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Fix Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        Student student = new Student(id, name, gender, age);
        Student[] arrNew1 = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrNew1[i] = arr[i];
        }
        arrNew1[arrNew1.length - 1] = student;
        return arrNew1;
    }

    public static Student[] delete(Student arr[]) {
        System.out.println("Enter ID Delete: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt() - 1;
        Student[] arrNew = new Student[arr.length - 1];

        for (int i = id; i < arrNew.length; i++) {
            arr[i] = arr[i + 1];
        }
        for (int j = 0; j < arrNew.length; j++) {
            arrNew[j] = arr[j];
        }
        return arrNew;
    }

    public static Student search(Student arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int check = Integer.parseInt(sc.nextLine())-1;
        return arr[check];
    }

}
