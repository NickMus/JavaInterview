package lesson5.Service;

import lesson5.DAO.StudentDao;
import lesson5.Entity.Student;

import java.util.List;

public class StudentService {
    private StudentDao studentDao;

    public StudentService() {
        studentDao = new StudentDao();
    }

    public void persist(Student student) {
        studentDao.openCurrentSessionWithTransaction();
        studentDao.persist(student);
        studentDao.closeCurrentSessionWithTransaction();
    }

    public Student findById(int id) {
        studentDao.openCurrentSession();
        Student student = studentDao.findById(id);
        studentDao.closeCurrentSession();
        return student;
    }

    public List<Student> findAllStudents() {
        studentDao.openCurrentSession();
        List<Student> studentList = studentDao.findAllStudents();
        studentDao.closeCurrentSession();
        return studentList;
    }

    public void update(Student student) {
        studentDao.openCurrentSessionWithTransaction();
        studentDao.update(student);
        studentDao.closeCurrentSessionWithTransaction();
    }

    public void delete(int id) {
        studentDao.openCurrentSessionWithTransaction();
        studentDao.delete(studentDao.findById(id));
        studentDao.closeCurrentSessionWithTransaction();
    }

    public void deleteAll() {
        studentDao.openCurrentSessionWithTransaction();
        studentDao.deleteAll();
        studentDao.closeCurrentSessionWithTransaction();
    }
}
