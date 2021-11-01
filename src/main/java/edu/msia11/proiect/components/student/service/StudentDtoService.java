package edu.msia11.proiect.components.student.service;

import edu.msia11.proiect.common.model.empty.EmptyJsonResponse;
import edu.msia11.proiect.components.student.input.StudentInputDTO;
import edu.msia11.proiect.components.student.output.StudentOutputDTO;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/* Acest serviciu se ocupa strict de manipularea claselor
 * de tip DTO (Data Transfer Object) de tip student.
 * Totodata, aici servim datele catre controller sub forma Output */
public interface StudentDtoService {

    List<StudentOutputDTO> getAllObjects();

    StudentOutputDTO getObjectById(Long id);

    StudentOutputDTO saveObject(StudentInputDTO input);

    StudentOutputDTO updateObject(Long id, StudentInputDTO input);

    EmptyJsonResponse deleteById(Long id);
}
