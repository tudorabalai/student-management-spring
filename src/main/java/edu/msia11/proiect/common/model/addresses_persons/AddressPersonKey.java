package edu.msia11.proiect.common.model.addresses_persons;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@Builder
@Embeddable
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class AddressPersonKey implements Serializable {

    @Column(name = "Address_Id")
    Long addressId;

    @Column(name = "Student_Id")
    Long personId;
}
