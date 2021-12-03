package edu.msia11.proiect.common.model.students_universities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
public class StudentUniversityKey implements Serializable {

    @Column(name = "Student_Id")
    Long studentId;

    @Column(name = "University_Id")
    Long universityId;
}