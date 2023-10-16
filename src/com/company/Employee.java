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

    public static ArrayList searchBySurname(String inputSurname, String inputName, ArrayList<Employee> emp){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < emp.size(); i++) {
            if(emp.get(i).getSurname().equals(inputSurname) & emp.get(i).getName().equals(inputName)){
                System.out.println("Введите фамилию для изменения");
                emp.get(i).setSurname(sc.nextLine());
                System.out.println("Введите имя для изменения");
                emp.get(i).setName(sc.nextLine());
                System.out.println("Введите возраст для изменения");
                emp.get(i).setAge(Integer.parseInt(sc.nextLine()));
                System.out.println("Введите должность для изменения");
                emp.get(i).setEducation(sc.nextLine());
                break;
            }
        }
        return emp;
    }
}
