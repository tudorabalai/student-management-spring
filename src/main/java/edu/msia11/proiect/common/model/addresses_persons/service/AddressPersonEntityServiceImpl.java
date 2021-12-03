package edu.msia11.proiect.common.model.addresses_persons.service;

import edu.msia11.proiect.common.model.addresses_persons.AddressPersonEntity;
import edu.msia11.proiect.common.model.addresses_persons.AddressPersonKey;
import edu.msia11.proiect.common.model.addresses_persons.AddressPersonRepository;
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
    public AddressPersonEntity getAddressPersonEntityById(Long addressId, Long personId) {
        return getAddressPersonEntityById(new AddressPersonKey(addressId, personId));
    }

    @Override
    public List<AddressPersonEntity> getAllAddressPersonEntitiesByPersonId(Long personId) {
        return repository.findDistinctById_PersonId(personId);
    }

    @Override
    public List<AddressPersonEntity> getAllAddressPersonEntitiesByAddressId(Long addressId) {
        return repository.findDistinctById_AddressId(addressId);
    }

    @Override
    public AddressPersonEntity assignAddressToPerson(Long addressId, Long personId) {
        var id = new AddressPersonKey(addressId, personId);
        var entity = AddressPersonEntity.builder().id(id).build();
        return repository.save(entity);
    }

    @Override
    public void deleteAddressToPerson(Long addressId, Long personId) {
        repository.deleteById(new AddressPersonKey(addressId, personId));
    }
}
