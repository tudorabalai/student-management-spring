package edu.msia11.proiect.common.model.address_student;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

public interface AddressStudentEntityService {
    List<AddressStudentEntity> getAllAddressStudentEntities();

    AddressStudentEntity getAddressStudentEntityById(AddressStudentKey id);

    AddressStudentEntity getAddressStudentEntityById(Long addressId, Long studentId);

    List<AddressStudentEntity> getAllAddressStudentEntitiesByStudentId(Long studentId);

    List<AddressStudentEntity> getAllAddressStudentEntitiesByAddressId(Long addressId);

    AddressStudentEntity assignAddressToStudent(Long addressId, Long studentId);

    void deleteAddressToStudent(Long addressId, Long studentId);
}
