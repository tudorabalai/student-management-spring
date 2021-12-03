package edu.msia11.proiect.components.Person;

import edu.msia11.proiect.common.model.addresses_persons.AddressPersonEntity;
import edu.msia11.proiect.common.model.base.BaseEntity;
import edu.msia11.proiect.components.student.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Person_Entity")
public class PersonEntity extends BaseEntity {

    @NonNull
    @Column(name = "CNP")
    private Long codNumericPersonal;

    @Column(name = "Numar_CI")
    private Integer numarCarteIdentitate;

    @Column(name = "Serie_CI")
    private String serieCarteIdentitate;

    @Column(name = "Nume")
    private String nume;

    @Column(name = "Prenume")
    private String prenume;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Student_Id", referencedColumnName = "id")
    StudentEntity student;

    @OneToMany(mappedBy = "person")
    List<AddressPersonEntity> adresaDomiciliu;
}