package notes.students.crud.service;


import notes.students.crud.model.Note;
import org.springframework.stereotype.Service;
import notes.students.crud.repository.NoteRepository;

import java.util.List;

@Service
public class NoteService {
    private final NoteRepository repository;
    public NoteService(NoteRepository repository) {
        this.repository = repository;
    }

    public Note addNote(Long studentId, String courseName, double grade){
        Note note = new Note();
        note.setStudentId(studentId);
        note.setCourseName(courseName);
        note.setGrade(grade);
        return repository.save(note);
    }

    public List<Note> getNotesByStudentId(Long studentId){
        return repository.findStudentById(studentId);
    }
}
