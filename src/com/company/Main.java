package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> emp = new ArrayList<>();

        while(true){
            System.out.println("Введите информацию о сотруднике (фамилия, имя, возраст, пол, образование, должность, отдел");
            System.out.println("Введите фамилию");
            String surname = sc.nextLine();
            System.out.println("Введите имя");
            String name = sc.nextLine();
            System.out.println("Введите возраст");
            String age = sc.nextLine();
            System.out.println("Введите должность");
            String education = sc.nextLine();
            emp.add(new Employee(surname,name,Integer.parseInt(age),education));

            System.out.println("Если хотите закончить ввод данных, введите end, для продолжения введите enter");
            String input = sc.nextLine();
            if("end".equals(input)){
                System.out.println("Программа завершена");
                System.out.println("Список сотрудников: ");
                System.out.printf("%-10s %-10s %-10s %-10s\n", "Фамилия","Имя","Возраст","Должность");

                for (int i = 0; i < emp.size(); i++) {
                    System.out.printf("%-10s %-10s %-10s %-10s\n", emp.get(i).getSurname(), emp.get(i).getName(), emp.get(i).getAge(), emp.get(i).getEducation());
                }
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Если не хотите менять данные, введите end, для изменения нажмите enter");
                String input2 = sc.nextLine();
                if("end".equals(input2)){
                    break;
                }else{
                    System.out.println("Введите фамилию и имя работника, для которого хотите изменить данные");
                    String inputSurname = sc.nextLine();
                    String inputName = sc.nextLine();
                    int empIndex = searchBySurname(surname, name, emp);
                    if (empIndex != -1) {
                        // TODO опросы по атрибутам
                    }
                }
            }

            emp.get
        }

    }
    
}
