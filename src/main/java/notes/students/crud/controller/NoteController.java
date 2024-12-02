package notes.students.crud.controller;


import notes.students.crud.model.Note;
import org.springframework.web.bind.annotation.*;
import notes.students.crud.service.NoteService;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {
    private final NoteService service;
    public NoteController(NoteService service) {
        this.service = service;
    }

    @PostMapping
    public Note addNote(
            @RequestParam Long studentId,
            @RequestParam String courseName,
            @RequestParam double grade
    ){
        return service.addNote(studentId, courseName, grade);

    }

    @GetMapping("/{studentId}")
    public List<Note> getNotesByStudentId(@PathVariable Long studentId){
        return service.getNotesByStudentId(studentId);
    }

}
