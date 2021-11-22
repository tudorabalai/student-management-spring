package edu.msia11.proiect.common.model.addresses_persons;

import lombok.*;

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
