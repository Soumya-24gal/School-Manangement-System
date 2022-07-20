package com.learning.schoolmangementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher vanita= new Teacher(1, "Vanita", 500);
        Teacher alka= new Teacher(2, "Alka", 700);
        Teacher prabha= new Teacher(3, "Prabha", 400);
        List<Teacher> teacherList=new ArrayList<>();
        teacherList.add(vanita);
        teacherList.add(alka);
        teacherList.add(prabha);
        Student soumya =new Student(1, "Soumya", 6);
        Student anshita =new Student(2, "Anshita", 4);
        Student priya =new Student(3, "Priya", 8);
        List<Student> studentList=new ArrayList<>();
        studentList.add(soumya);
        studentList.add(anshita);
        studentList.add(priya);
        School sh=new School(teacherList, studentList);
        soumya.payFees(5000);
        anshita.payFees(6000);
        System.out.println("Earned"+sh.getTotalMoneyEarned());
        alka.receiveSalary(alka.getSalary());
        System.out.println("School has spent for salary of "+ alka.getName() + "and has now" + sh.getTotalMoneyEarned()
         );
        

    }
}
