package edu.msia11.proiect.components.University.output;

import edu.msia11.proiect.components.student.output.StudentOutputDTO;

import java.util.List;

public record UniversityOutputDTO(Long id,
                                  String name,
                                  List<StudentOutputDTO> studentList) {
}