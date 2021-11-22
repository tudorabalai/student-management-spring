package edu.msia11.proiect.components.University;

import edu.msia11.proiect.common.model.base.BaseEntity;
import edu.msia11.proiect.common.model.students_universities.StudentUniversityEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "University_Entity")
public class UniversityEntity extends BaseEntity {

    @Column(name = "Name")
    private String name;

    @OneToMany(mappedBy = "university")
    private List<StudentUniversityEntity> studentList;

//    private List<FacultyEntity> facultati;
}