package edu.msia11.proiect.common.model.address_student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AddressStudentEntityServiceImpl implements AddressStudentEntityService {
    @Autowired
    private AddressStudentRepository repository;

    @Override
    public List<AddressStudentEntity> getAllAddressStudentEntities() {
        return repository.findAll();
    }

    @Override
    public AddressStudentEntity getAddressStudentEntityById(AddressStudentKey id) {
        return repository.getById(id);
    }

    @Override
    public AddressStudentEntity getAddressStudentEntityById(Long addressId, Long studentId) {
        return getAddressStudentEntityById(new AddressStudentKey(addressId, studentId));
    }

    @Override
    public List<AddressStudentEntity> getAllAddressStudentEntitiesByStudentId(Long studentId) {
        return repository.findDistinctById_StudentId(studentId);
    }

    @Override
    public List<AddressStudentEntity> getAllAddressStudentEntitiesByAddressId(Long addressId) {
        return repository.findDistinctById_AddressId(addressId);
    }

    @Override
    public AddressStudentEntity assignAddressToStudent(Long addressId, Long studentId) {
        var id = new AddressStudentKey(addressId, studentId);
        var entity = AddressStudentEntity.builder().id(id).build();
        return repository.save(entity);
    }

    @Override
    public void deleteAddressToStudent(Long addressId, Long studentId) {
        repository.deleteById(new AddressStudentKey(addressId, studentId));
    }
}
