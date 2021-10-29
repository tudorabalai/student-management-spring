package edu.msia11.proiect.components.student.input;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/* Aceasta clasa DTO (Data Transfer Object) o vei folosi
* ca model pentru input (cand vrei sa adaugi un nou student) */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentInputDTO {

    private Long cnp;

    private Integer numarCI;

    private String serieCI;
    private String nrMatricol;
    private String nume;
    private String prenume;
    private String adresaCompleta;
}