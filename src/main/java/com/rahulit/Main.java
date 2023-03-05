package com.rahulit;

import com.rahulit.entities.Student;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! This is my first program created in intellij");

        Student s=new Student();
        //s.testStudent(()->s.getId()>2);
        s.testStudent(Main::testStudent);
    }

    static boolean testStudent(){
        System.out.println("hi");
        return true;
    }
}