package edu.msia11.proiect.components.student.service;

import edu.msia11.proiect.components.student.StudentEntity;
import edu.msia11.proiect.components.student.StudentRepository;
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
public class StudentEntityServiceImpl implements StudentEntityService {

    @Autowired
    private StudentRepository repository;

    @Override
    public List<StudentEntity> getAllEntities() {
        return repository.findAll();
    }

    @Override
    public List<StudentEntity> getEntityListByName(String name) {
        return repository.findAllByPerson_NumeIgnoreCase(name);
    }

    @Override
    public StudentEntity getEntityById(Long id) {
        return repository.getById(id);
    }

    @Override
    public StudentEntity saveEntity(StudentEntity entity) {
        return repository.save(entity);
    }

    @Override
    public Boolean existsByCnp(Long cnp) {
        return repository.existsByPerson_CodNumericPersonal(cnp);
    }

    @Override
    public void deleteEntityById(Long id) {
        repository.deleteById(id);
    }
}
