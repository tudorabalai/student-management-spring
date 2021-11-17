package edu.msia11.proiect.common.model.address_student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface AddressStudentRepository extends JpaRepository<AddressStudentEntity, AddressStudentKey> {

    List<AddressStudentEntity> findDistinctById_StudentId(Long studentId);

    List<AddressStudentEntity> findDistinctById_AddressId(Long addressId);
}
