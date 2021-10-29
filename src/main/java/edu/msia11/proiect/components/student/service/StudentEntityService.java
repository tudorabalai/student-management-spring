package edu.msia11.proiect.components.student.service;

import edu.msia11.proiect.components.student.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/* Acest serviciu se ocupa strict de manipularea claselor
* de tip entitate de tip student.
* Totodata, aici preluam sau servim date catre/din Serviciul DTO sub forma Entitate
* precum si interfatarea cu repository-ul */
@Service
@Transactional
public interface StudentEntityService {

    List<StudentEntity> getAllEntities();

    StudentEntity getEntityById(Long id);

    StudentEntity saveEntity(StudentEntity entity);

    void deleteEntityById(Long id);
}