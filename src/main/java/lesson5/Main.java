package lesson5;

import lesson5.Entity.Student;
import lesson5.Service.StudentService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student student = new Student("Mike" , 5);
        Student student1 = new Student("Bob" , 5);
        Student student2 = new Student("John" , 5);
        Student student3 = new Student("Alex" , 5);
        Student student4 = new Student("Peter" , 5);
        Student student5 = new Student("Brine" , 5);

//        studentService.persist(student);
//        studentService.persist(student1);
//        studentService.persist(student2);
//        studentService.persist(student3);
//        studentService.persist(student4);
//        studentService.persist(student5);
//
//        studentService.delete(11);
//
//        student1.setName("mike");
//        student1.setId(12);
//        student1.setMark(4);
//        studentService.update(student1);
//        studentService.deleteAll();

//        List<Student> studentList = studentService.findAllStudents();
//        for(Student stud: studentList) {
//            System.out.println(stud.getId() + " " + stud.getName() + " " + stud.getMark());
//        }

//        System.out.println(studentService.findById(16));
    }
}
