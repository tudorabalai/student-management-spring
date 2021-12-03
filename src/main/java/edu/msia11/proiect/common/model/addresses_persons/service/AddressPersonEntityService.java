package edu.msia11.proiect.common.model.addresses_persons.service;

import edu.msia11.proiect.common.model.addresses_persons.AddressPersonEntity;
import edu.msia11.proiect.common.model.addresses_persons.AddressPersonKey;

import java.util.List;

public interface AddressPersonEntityService {
    List<AddressPersonEntity> getAllAddressPersonEntities();

    AddressPersonEntity getAddressPersonEntityById(AddressPersonKey id);

    AddressPersonEntity getAddressPersonEntityById(Long addressId, Long personId);

    List<AddressPersonEntity> getAllAddressPersonEntitiesByPersonId(Long personId);

    List<AddressPersonEntity> getAllAddressPersonEntitiesByAddressId(Long addressId);

    AddressPersonEntity assignAddressToPerson(Long addressId, Long personId);

    void deleteAddressToPerson(Long addressId, Long personId);
}
