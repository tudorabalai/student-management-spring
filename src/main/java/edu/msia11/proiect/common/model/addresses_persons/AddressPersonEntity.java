package edu.msia11.proiect.common.model.addresses_persons;

import edu.msia11.proiect.components.Person.PersonEntity;
import edu.msia11.proiect.components.address.AddressEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address_person")//, uniqueConstraints = {"student_id", "address_id"})
public class AddressPersonEntity {

    @EmbeddedId
    AddressPersonKey id;

    @ManyToOne
    @MapsId("personId")
    @JoinColumn(name = "Person_Id")
    PersonEntity person;

    @ManyToOne
    @MapsId("addressId")
    @JoinColumn(name = "Address_Id")
    AddressEntity address;

    @Column(name = "Viza_Flotant")
    Boolean hasVizaFlotant;
}
