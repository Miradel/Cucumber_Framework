package com.meradel.replit_Review;

public class People {

    String name ;
    int age;
    double hight;

    People(String name, int age){
        this.age = age;
        this.name = name;
        System.out.println("People constructions");
    }

//        People(String name){
//        this.age = age;
//        this.name = name;
//    }

    public void eat(){

        System.out.println("People is eating");
    }

}

class Student extends People{

    int stNumber;
    String school;

    Student(String name){
        super(name,21);
        System.out.println("Student constructor");

    }

    public void study(){
        super.eat();
    }

    public static void main(String[] args) {
      //  Student st = new Student("Miradel");

        Student pl = new Student("masd");



    }

}
