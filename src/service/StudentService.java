package service;

import dao.StudentDAO;
import model.Student;

public class StudentService{
    StudentDAO dao=new StudentDAO();

    public void addStudent(String name,int age,String course){
        Student student=new Student(name,age,course);

        dao.addStudent(student);
    }

    public void viewStudents(){
        dao.viewStudents();
    }

    public void updateStudent(int id,String course){
        dao.updateStudent(id,course);
    }

    public void deleteStudent(int id){
        dao.deleteStudent(id);
    }
}