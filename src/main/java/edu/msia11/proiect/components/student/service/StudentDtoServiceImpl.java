package edu.msia11.proiect.components.student.service;

import edu.msia11.proiect.common.model.empty.EmptyJsonResponse;
import edu.msia11.proiect.components.student.StudentEntity;
import edu.msia11.proiect.components.student.input.StudentInputDTO;
import edu.msia11.proiect.components.student.mapping.StudentMapper;
import edu.msia11.proiect.components.student.output.StudentOutputDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@NoArgsConstructor
@AllArgsConstructor
public class StudentDtoServiceImpl implements StudentDtoService {

    @Autowired
    private StudentEntityService entityService;

    @Autowired
    private StudentMapper mapper;

    @Override
    public List<StudentOutputDTO> getAllObjects() {
        return mapper.entityToOutput(entityService.getAllEntities());
    }

    @Override
    public List<StudentOutputDTO> getAllObjectsByName(String name) {
        return mapper.entityToOutput(entityService.getEntityListByName(name));
    }

    @Override
    public StudentOutputDTO getObjectById(Long id) {
        return mapper.entityToOutput(entityService.getEntityById(id));
    }

    @Override
    public StudentOutputDTO saveObject(StudentInputDTO input) {
        return mapper.entityToOutput(entityService.saveEntity(mapper.inputToEntity(input)));
    }

    @Override
    public StudentOutputDTO updateObject(Long id, StudentInputDTO input) {
        return mapper.entityToOutput(entityService.saveEntity(mapper.updateEntityFromInput(input, entityService.getEntityById(id))));
    }

    @Override
    public EmptyJsonResponse deleteById(Long id) {
        entityService.deleteEntityById(id);
        return new EmptyJsonResponse();
    }
}
