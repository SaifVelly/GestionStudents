package notes.students.crud.repository;

import notes.students.crud.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findStudentById(Long studentId);
}
