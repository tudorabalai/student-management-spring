package edu.msia11.proiect.components.student;

import edu.msia11.proiect.common.model.address_student.AddressStudentEntity;
import edu.msia11.proiect.common.model.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/* Entitatea este reprezentarea unei tabele din baza de date
 * sub forma unei clase Java */
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Student_Entity")
public class StudentEntity extends BaseEntity {

    //    @NonNull
//    @Column(name = "CNP")
//    private Long codNumericPersonal;
//
//    @Column(name = "Numar_CI")
//    private Integer numarCarteIdentitate;
//
//    @Column(name = "Serie_CI")
//    private String serieCarteIdentitate;

    @Column(name = "Matricol")
    private String numarMatricol;

    private PersonEntity person;
//    @Column(name = "Nume")
//    private String nume;
//
//    @Column(name = "Prenume")
//    private String prenume;

    @OneToMany(mappedBy = "student")
    List<AddressStudentEntity> adresaDomiciliu; // mutata la Person


    List<UniversityEntity> universitati;
}