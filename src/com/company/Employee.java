package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    private String surname;
    private String  name;
    private int age;
    private String education;

    public Employee(String surname, String name, int age, String education) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.education = education;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {

        return surname + name  + education;
    }

    public static int searchBySurname(String inputSurname, String inputName, ArrayList<Employee> emp){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < emp.size(); i++) {
            if(emp.get(i).getSurname() == inputSurname & emp.get(i).getName() == inputName){
                return i;
            }
        }
        return -1;
    }
}



//    public static void searchBySurname(String inputSurname, String inputName, ArrayList<Employee> emp){
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < emp.size(); i++) {
//            if(emp.get(i).getSurname() == inputSurname & emp.get(i).getName() == inputName){
//                System.out.println("Введите информацию о сотруднике (фамилия, имя, возраст, пол, образование, должность, отдел");
//                System.out.println("Введите фамилию");
//                String surname = sc.nextLine();
//                System.out.println("Введите имя");
//                String name = sc.nextLine();
//                System.out.println("Введите возраст");
//                String age = sc.nextLine();
//                System.out.println("Введите должность");
//                String education = sc.nextLine();
//                emp.get(i).setSurname(surname);
//                emp.get(i).setName(name);
//                emp.get(i).setAge(Integer.parseInt(age));
//                emp.get(i).setEducation(education);
//            }
//        }
//
//        System.out.println("Программа завершена");
//        System.out.println("Список сотрудников: ");
//        System.out.printf("%-10s %-10s %-10s %-10s\n", "Фамилия","Имя","Возраст","Должность");
//
//        for (int i = 0; i < emp.size(); i++) {
//            System.out.printf("%-10s %-10s %-10s %-10s\n", emp.get(i).getSurname(), emp.get(i).getName(), emp.get(i).getAge(), emp.get(i).getEducation());
//        }
//
//
//    }