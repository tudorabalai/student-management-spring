package edu.msia11.proiect.common.model.addresses_persons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AddressPersonEntityServiceImpl implements AddressPersonEntityService {
    @Autowired
    private AddressPersonRepository repository;

    @Override
    public List<AddressPersonEntity> getAllAddressPersonEntities() {
        return repository.findAll();
    }

    @Override
    public AddressPersonEntity getAddressPersonEntityById(AddressPersonKey id) {
        return repository.getById(id);
    }

    @Override
    public AddressPersonEntity getAddressPersonEntityById(Long addressId, Long studentId) {
        return getAddressPersonEntityById(new AddressPersonKey(addressId, studentId));
    }

    @Override
    public List<AddressPersonEntity> getAllAddressPersonEntitiesByPersonId(Long studentId) {
        return repository.findDistinctById_StudentId(studentId);
    }

    @Override
    public List<AddressPersonEntity> getAllAddressPersonEntitiesByAddressId(Long addressId) {
        return repository.findDistinctById_AddressId(addressId);
    }

    @Override
    public AddressPersonEntity assignAddressToPerson(Long addressId, Long studentId) {
        var id = new AddressPersonKey(addressId, studentId);
        var entity = AddressPersonEntity.builder().id(id).build();
        return repository.save(entity);
    }

    @Override
    public void deleteAddressToPerson(Long addressId, Long studentId) {
        repository.deleteById(new AddressPersonKey(addressId, studentId));
    }
}
