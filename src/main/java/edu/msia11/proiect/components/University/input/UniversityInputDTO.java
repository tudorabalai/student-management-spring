package edu.msia11.proiect.components.University.input;

import edu.msia11.proiect.components.student.input.StudentInputDTO;

import java.util.List;

public record UniversityInputDTO(Long id,
                                 String name,
                                 List<StudentInputDTO> studentList) {
}