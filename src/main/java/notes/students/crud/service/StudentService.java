package notes.students.crud.service;


import notes.students.crud.model.Student;
import org.springframework.stereotype.Service;
import notes.students.crud.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student addStudent(String name) {
        Student student = new Student();
        student.setName(name);
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

}
