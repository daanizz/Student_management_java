import service.StudentService;
import util.MenuUtil;

import java.util.Scanner;


public class Main{
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);

        StudentService studentService=new StudentService();

        while(true){
            MenuUtil.showMenu();

            int choice=scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scan.nextLine();

                    System.out.print("Enter Age: ");
                    int age = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter Course: ");
                    String course = scan.nextLine();

                    studentService.addStudent(name,age,course);

                    break;
                
                case 2:
                    studentService.viewStudents();
                    break;
                
                case 3:
                    System.out.println("Enter id of student to update:");
                    int updateId=scan.nextInt();
                    scan.nextLine();

                    System.out.println("Enter The new course name:");
                    String newCourse=scan.nextLine();
                    studentService.updateStudent(updateId,newCourse);

                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int deleteId = scan.nextInt();

                    studentService.deleteStudent(deleteId);

                    break;

                case 5:

                    System.out.println("Exiting...");
                    return;

                default:

                    System.out.println("Invalid Choice");

            }
        }
    }
}