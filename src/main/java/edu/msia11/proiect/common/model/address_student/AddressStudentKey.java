package edu.msia11.proiect.common.model.address_student;

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
public class AddressStudentKey implements Serializable {

    @Column(name = "address_id")
    Long addressId;

    @Column(name = "student_id")
    Long studentId;
}
