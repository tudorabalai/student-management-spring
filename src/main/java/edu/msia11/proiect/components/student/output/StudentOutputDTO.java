package edu.msia11.proiect.components.student.output;

import edu.msia11.proiect.components.student.StudentEntity;
import lombok.*;

import javax.persistence.Id;
import java.util.Objects;

/* Aceasta clasa DTO (Data Transfer Object) o vei folosi
 * ca model pentru output (cand vrei sa afisezi un anumit student) */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentOutputDTO {

    private Long id;
    private Long cnp;

    private Integer numarCI;

    private String serieCI;
    private String nrMatricol;
    private String nume;
    private String prenume;
    private String adresaCompleta;
}
