package lesson5.DAO;

import lesson5.Entity.Student;
import lesson5.Service.StudentService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.Serializable;
import java.util.List;

public class StudentDao {

    private Session currentSession;
    private Transaction currentTransaction;

    public Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }

    public Session openCurrentSessionWithTransaction() {
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    public void closeCurrentSessionWithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }

    private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
//        StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder()
//                .applySettings(configuration.getProperties());
        /*
        если передавать registryBuilder в buildSessionFactory() то получаем ошибку Unknown entity
         */
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        return sessionFactory;
    }

    public Session getCurrentSession() {
        return currentSession;
    }

    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

    public void persist(Student student) {
        getCurrentSession().save(student);
    }

    public Student findById(int id) {
        Student student = getCurrentSession().get(Student.class, id);
        return student;
    }

    @SuppressWarnings("unchecked")
    public List<Student> findAllStudents() {
        List<Student> studentList = getCurrentSession().createQuery("from Student").list();
        return studentList;
    }

    public void update(Student student) {
        getCurrentSession().update(student);
    }

    public void delete(Student student) {
        getCurrentSession().delete(student);
    }

    public void deleteAll() {
        List<Student> studentList = findAllStudents();
        for (Student student:studentList) {
            getCurrentSession().delete(student);
        }
    }
}
