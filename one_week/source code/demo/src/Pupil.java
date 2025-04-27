package com.extend_;

public class Pupil {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void test(){
        System.out.println("小学生"+name+"的考试成绩");
    }
    public void test1(){
        System.out.println("信息"+name+age+score);
    }
}
