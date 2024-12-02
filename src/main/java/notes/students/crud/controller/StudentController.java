package notes.students.crud.controller;


import notes.students.crud.model.Student;
import org.springframework.web.bind.annotation.*;
import notes.students.crud.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService service;
     public StudentController(StudentService service) {
         this.service = service;
     }

     @PostMapping
    public Student createStudent(@RequestParam String name){
         return service.addStudent(name);
     }

     @GetMapping
    public List<Student> getAllStudents(){
         return service.getAllStudents();
     }
}
