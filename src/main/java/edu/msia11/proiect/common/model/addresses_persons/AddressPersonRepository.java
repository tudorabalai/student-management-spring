package edu.msia11.proiect.common.model.addresses_persons;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface AddressPersonRepository extends JpaRepository<AddressPersonEntity, AddressPersonKey> {

    List<AddressPersonEntity> findDistinctById_PersonId(Long personId);

    List<AddressPersonEntity> findDistinctById_AddressId(Long addressId);
}