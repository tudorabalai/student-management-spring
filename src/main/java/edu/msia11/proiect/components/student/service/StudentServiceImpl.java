package edu.msia11.proiect.components.student.service;

import edu.msia11.proiect.common.model.empty.EmptyJsonResponse;
import edu.msia11.proiect.components.student.StudentRepository;
import edu.msia11.proiect.components.student.input.StudentInputDTO;
import edu.msia11.proiect.components.student.mapping.StudentMapper;
import edu.msia11.proiect.components.student.output.StudentOutputDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@NoArgsConstructor
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentMapper mapper;

    @Override
    public List<StudentOutputDTO> getAllObjects() {
        return mapper.entityToOutput(studentRepository.findAll());
    }

    @Override
    public List<StudentOutputDTO> getAllObjectsByName(String name) {
        return mapper.entityToOutput(studentRepository.findAllByPerson_NumeIgnoreCase(name));
    }

    @Override
    public StudentOutputDTO getObjectById(Long id) {
        return mapper.entityToOutput(studentRepository.getById(id));
    }

    @Override
    public StudentOutputDTO saveObject(StudentInputDTO input) {
        return mapper.entityToOutput(studentRepository.save(mapper.inputToEntity(input)));
    }

    @Override
    public StudentOutputDTO updateObject(Long id, StudentInputDTO input) {
        return mapper.entityToOutput(studentRepository.save(mapper.updateEntityFromInput(input, studentRepository.getById(id))));
    }

    @Override
    public EmptyJsonResponse deleteById(Long id) {
        studentRepository.deleteById(id);
        return new EmptyJsonResponse();
    }
}
