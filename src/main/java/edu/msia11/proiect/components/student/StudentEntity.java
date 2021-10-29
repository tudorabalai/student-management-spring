package edu.msia11.proiect.components.student;

import edu.msia11.proiect.components.student.service.StudentEntityService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/* Entitatea este reprezentarea unei tabele din baza de date
 * sub forma unei clase Java */
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Student_Entity")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //    @NonNull
    @Column(name = "CNP")
    private Long codNumericPersonal;

    @Column(name = "Numar_CI")
    private Integer numarCarteIdentitate;

    @Column(name = "Serie_CI")
    private String serieCarteIdentitate;

    @Column(name = "Matricol")
    private String numarMatricol;

    @Column(name = "Nume")
    private String nume;

    @Column(name = "Prenume")
    private String prenume;

    @Column(name = "Adresa")
    private String adresaDomiciliu;
}