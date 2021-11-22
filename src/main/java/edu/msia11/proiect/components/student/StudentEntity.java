package edu.msia11.proiect.components.student;

import edu.msia11.proiect.common.model.base.BaseEntity;
import edu.msia11.proiect.common.model.students_universities.StudentUniversityEntity;
import edu.msia11.proiect.components.Person.PersonEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
public class StudentEntity extends BaseEntity {

    @OneToOne(mappedBy = "student")
    private PersonEntity person;

    @OneToMany(mappedBy = "student")
    List<StudentUniversityEntity> universityList;
}