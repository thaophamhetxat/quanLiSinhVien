package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Lop[] arrLop = new Lop[0];
        Student[] arrStudent = new Student[0];
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Quản Lí Học Sinh");
            System.out.println("1.ADD Student ");
            System.out.println("2. Edit ");
            System.out.println("3.Show");
            System.out.println("4.Delete");
            System.out.println("5.Exit");
            System.out.println("6.Search ");
            System.out.println("Enter a number choose:");

            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    arrStudent = Manager.create(arrStudent);
                    break;
                case 3:
                    for (Student s:arrStudent) {
                        System.out.println(s);
                    }
                    break;
                case 2:
                    arrStudent = Manager.edit(arrStudent);
                    break;
                case 4:
                    arrStudent = Manager.delete(arrStudent);
                    break;
                case 6:
                    System.out.println(Manager.search(arrStudent));
                    break;
                case 5:
                    System.exit(0);


            }
        } while (true);
    }
}
