package edu.msia11.proiect.common.model.students_universities;

import edu.msia11.proiect.components.University.UniversityEntity;
import edu.msia11.proiect.components.student.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

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
@Table(name = "Student_University")//, uniqueConstraints = {"student_id", "address_id"})
public class StudentUniversityEntity {

    @EmbeddedId
    StudentUniversityKey id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "Student_Id")
    StudentEntity student;

    @ManyToOne
    @MapsId("universityId")
    @JoinColumn(name = "University_Id")
    UniversityEntity university;

    @Column(name = "Matricol")
    private String numarMatricol;

    @NonNull
    @ColumnDefault(value = "0")
    @Column(name = "Is_Exmatriculat", nullable = false)
    private Boolean isExmatriculat = Boolean.FALSE;
}