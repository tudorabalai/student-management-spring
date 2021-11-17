package edu.msia11.proiect.components.student.service;

import edu.msia11.proiect.components.student.StudentEntity;

import java.util.List;

/* Acest serviciu se ocupa strict de manipularea claselor
* de tip entitate de tip student.
* Totodata, aici preluam sau servim date catre/din Serviciul DTO sub forma Entitate
* precum si interfatarea cu repository-ul */
public interface StudentEntityService {

    List<StudentEntity> getAllEntities();

    List<StudentEntity> getEntityListByName(String name);

    StudentEntity getEntityById(Long id);

    StudentEntity saveEntity(StudentEntity entity);

    Boolean existsByCnp(Long cnp);

    void deleteEntityById(Long id);

}