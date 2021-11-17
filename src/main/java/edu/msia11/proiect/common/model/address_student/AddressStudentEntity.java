package edu.msia11.proiect.common.model.address_student;

import edu.msia11.proiect.components.address.AddressEntity;
import edu.msia11.proiect.components.student.StudentEntity;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address_student")//, uniqueConstraints = {"student_id", "address_id"})
public class AddressStudentEntity {

    @EmbeddedId
    AddressStudentKey id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id")
    StudentEntity student;

    @ManyToOne
    @MapsId("addressId")
    @JoinColumn(name = "address_id")
    AddressEntity address;

    @Column(name = "viza_flotant")
    Boolean hasVizaFlotant;
}
