package model;

public class Student{
    private int id;
    private String name;
    private int age;
    private String course;


    public Student(){

    }

    public Student(String name,int age,String course){
        this.name=name;
        this.age=age;
        this.course=course;
    }

    public Student(int id,String name,int age,String course){
        this.name=name;
        this.age=age;
        this.course=course;
        this.id=id;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getCourse(){
        return course;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setCourse(String course){
        this.course=course;
    }
}