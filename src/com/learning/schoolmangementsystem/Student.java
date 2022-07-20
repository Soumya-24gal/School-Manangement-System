package com.learning.schoolmangementsystem;

public class Student {
    private int id;
    private  String name;
    private int grade;
    private int fessPaid;
    private int feesTotal;
    public Student(int id, String name,int grade){
        fessPaid=0;
        feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }
    public void setGrade(int grade){
        this.grade=grade;
    }
    public void payFees(int fees){
        fessPaid+=fees;
        School.updateTotalMoneyEarned(fees);
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public int getFessPaid(){
        return fessPaid;
    }
    public int getFeesTotal(){
        return feesTotal;
    }
    
}
