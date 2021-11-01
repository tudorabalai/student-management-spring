package edu.msia11.proiect.common.model.address;

import edu.msia11.proiect.common.model.base.BaseEntity;
import edu.msia11.proiect.components.student.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Address_Entity")
public class AddressEntity extends BaseEntity {

    @Column(name = "Nume_Strada")
    private String numeStrada;

    @Column(name = "Numar_Strada")
    private Integer numarStrada;

    @Column(name = "Cod_Postal")
    private Integer codPostal;

    @ManyToMany
    private List<StudentEntity> students;
}