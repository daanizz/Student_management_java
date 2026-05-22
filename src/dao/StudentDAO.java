package dao;

import db.DBConnection;
import model.Student;

import java.sql.*;

public class StudentDAO{
    public void addStudent(Student student){
        String query="INSERT INTO students(name,age,course) VALUES (?,?,?)";
        try(Connection connect=DBConnection.getConnection();
            PreparedStatement ps=connect.prepareStatement(query);){
                ps.setString(1,student.getName());
                ps.setInt(2,student.getAge());
                ps.setString(3,student.getCourse());

                ps.executeUpdate();

                System.out.println("Student Added Successfully");
            }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void viewStudents(){
        String query="SELECT * FROM students";
        try(Connection connect=DBConnection.getConnection();
            PreparedStatement ps=connect.prepareStatement(query);
            ResultSet rs=ps.executeQuery();){
                while(rs.next()){
                    System.out.println(rs.getInt("id")+"|"+rs.getString("name")+"|"+rs.getInt("age")+"|"+rs.getString("course"));
                }
            }
        catch(SQLException e){
            e.printStackTrace();
        }
    }


    public void updateStudent(int id,String newCourse){
        String query="UPDATE students SET course=? WHERE id=?";
        try(Connection connect=DBConnection.getConnection();
        PreparedStatement ps=connect.prepareStatement(query)){
            ps.setInt(2,id);
            ps.setString(1,newCourse);
            int rows=ps.executeUpdate();
            if(rows>0){
                System.out.println("Student Updated");
            }
            else{
                System.out.println("Student not found");
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id){
        String query="DELETE FROM students WHERE id=?";
        try(
            Connection connect=DBConnection.getConnection();
            PreparedStatement ps= connect.prepareStatement(query);
        ){
            ps.setInt(1,id);
            int rows=ps.executeUpdate();
            if(rows>0){
                System.out.println("Student Deleted");
            }
            else{
                System.out.println("Student not found");
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}