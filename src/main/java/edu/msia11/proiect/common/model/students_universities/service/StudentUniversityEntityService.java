package edu.msia11.proiect.common.model.students_universities.service;

import edu.msia11.proiect.common.model.students_universities.StudentUniversityEntity;
import edu.msia11.proiect.common.model.students_universities.StudentUniversityKey;

import java.util.List;

public interface StudentUniversityEntityService {

    List<StudentUniversityEntity> getAllStudentUniversityEntities();

    StudentUniversityEntity getStudentUniversityEntityById(StudentUniversityKey id);

    StudentUniversityEntity getStudentUniversityEntityById(Long addressId, Long personId);

    List<StudentUniversityEntity> getAllStudentUniversityEntitiesByPersonId(Long personId);

    List<StudentUniversityEntity> getAllStudentUniversityEntitiesByAddressId(Long addressId);

    StudentUniversityEntity assignAddressToPerson(Long addressId, Long personId);

    void deleteAddressToPerson(Long addressId, Long personId);
}