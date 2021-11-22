package edu.msia11.proiect.common.model.students_universities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface StudentUniversityRepository extends JpaRepository<StudentUniversityEntity, StudentUniversityKey> {

}