package edu.msia11.proiect.components.student.service;

import edu.msia11.proiect.common.model.empty.EmptyJsonResponse;
import edu.msia11.proiect.components.student.StudentEntity;
import edu.msia11.proiect.components.student.input.StudentInputDTO;
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

    @Override
    public List<StudentOutputDTO> getAllObjects() {
        List<StudentOutputDTO> output = new ArrayList<>();
        List<StudentEntity> entityList = entityService.getAllEntities();

        // For Each (Functional)
        entityList.forEach(entity -> {

            StudentOutputDTO dto = new StudentOutputDTO();

            dto.setCnp(entity.getCodNumericPersonal());
            dto.setId(entity.getId());
            dto.setNrMatricol(entity.getNumarMatricol());
            dto.setSerieCI(entity.getSerieCarteIdentitate());
            dto.setNumarCI(entity.getNumarCarteIdentitate());
            dto.setAdresaCompleta(entity.getAdresaDomiciliu());
            dto.setNume(entity.getNume());
            dto.setPrenume(entity.getPrenume());

            output.add(dto);
        });

        return output;
    }

    @Override
    public StudentOutputDTO getObjectById(Long id) {
        var entity = entityService.getEntityById(id);
        var dto = new StudentOutputDTO();

        dto.setCnp(entity.getCodNumericPersonal());
        dto.setId(entity.getId());
        dto.setNrMatricol(entity.getNumarMatricol());
        dto.setSerieCI(entity.getSerieCarteIdentitate());
        dto.setNumarCI(entity.getNumarCarteIdentitate());
        dto.setAdresaCompleta(entity.getAdresaDomiciliu());
        dto.setNume(entity.getNume());
        dto.setPrenume(entity.getPrenume());

        return dto;
    }

    private StudentOutputDTO convertEntityToStudentOutputDto(StudentEntity entity) {
        var dto = new StudentOutputDTO();

        dto.setCnp(entity.getCodNumericPersonal());
        dto.setId(entity.getId());
        dto.setNrMatricol(entity.getNumarMatricol());
        dto.setSerieCI(entity.getSerieCarteIdentitate());
        dto.setNumarCI(entity.getNumarCarteIdentitate());
        dto.setAdresaCompleta(entity.getAdresaDomiciliu());
        dto.setNume(entity.getNume());
        dto.setPrenume(entity.getPrenume());

        return dto;
    }

    @Override
    public StudentOutputDTO saveObject(StudentInputDTO input) {
        var entity = new StudentEntity();

        entity.setNume(input.getNume());
        entity.setNumarMatricol(input.getNrMatricol());
        entity.setCodNumericPersonal(input.getCnp());
        entity.setPrenume(input.getPrenume());
        entity.setAdresaDomiciliu(input.getAdresaCompleta());
        entity.setNumarCarteIdentitate(input.getNumarCI());
        entity.setSerieCarteIdentitate(input.getSerieCI());

        var savedEntity = entityService.saveEntity(entity);

        return convertEntityToStudentOutputDto(savedEntity);
    }

    @Override
    public StudentOutputDTO updateObject(Long id, StudentInputDTO input) {
        var entity = entityService.getEntityById(id);

        entity.setNume(input.getNume());
        entity.setNumarMatricol(input.getNrMatricol());
        entity.setCodNumericPersonal(input.getCnp());
        entity.setPrenume(input.getPrenume());
        entity.setAdresaDomiciliu(input.getAdresaCompleta());
        entity.setNumarCarteIdentitate(input.getNumarCI());
        entity.setSerieCarteIdentitate(input.getSerieCI());

        var savedEntity = entityService.saveEntity(entity);

        return convertEntityToStudentOutputDto(savedEntity);
    }

    @Override
    public EmptyJsonResponse deleteById(Long id) {
        entityService.deleteEntityById(id);
        return new EmptyJsonResponse();
    }
}
