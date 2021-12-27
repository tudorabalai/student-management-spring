package edu.msia11.proiect.components.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/* Repository-ul este partea care te ajuta sa NU scrii SQL.
* Aici se petrece magia.*/
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
    List<StudentEntity> findAllByPerson_NumeIgnoreCase(String name);

    List<StudentEntity> findAllByPerson_PrenumeIgnoreCase(String name);

    List<StudentEntity> findAllByPerson_CodNumericPersonal(Long cnp);

    Boolean existsByPerson_CodNumericPersonal(Long codNumericPersonal);
}