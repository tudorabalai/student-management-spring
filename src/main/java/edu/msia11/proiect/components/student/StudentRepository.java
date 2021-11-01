package edu.msia11.proiect.components.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/* Repository-ul este partea care te ajuta sa NU scrii SQL.
* Aici se petrece magia.*/
@Repository
@Transactional
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

    List<StudentEntity> findAllByNumeIgnoreCase(String name);

    List<StudentEntity> findAllByPrenumeIgnoreCase(String name);

    List<StudentEntity> findAllByCodNumericPersonal(Long cnp);
}