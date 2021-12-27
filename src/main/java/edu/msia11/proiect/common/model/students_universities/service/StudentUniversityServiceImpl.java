package edu.msia11.proiect.common.model.students_universities.service;

import edu.msia11.proiect.common.model.students_universities.StudentUniversityEntity;
import edu.msia11.proiect.common.model.students_universities.StudentUniversityKey;
import edu.msia11.proiect.common.model.students_universities.StudentUniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentUniversityServiceImpl implements StudentUniversityService {

    @Autowired
    private StudentUniversityRepository repository;

    @Override
    public List<StudentUniversityEntity> getAllStudentUniversityEntities() {
        return repository.findAll();
    }

    @Override
    public StudentUniversityEntity getStudentUniversityEntityById(StudentUniversityKey id) {
        return repository.getById(id);
        //return repository.findById(id).orElseThrow(() -> {throw new ApiRequestException("Entity with id " + id + " not found");});
    }

    @Override
    public StudentUniversityEntity getStudentUniversityEntityById(Long addressId, Long personId) {
        return null;
    }

    @Override
    public List<StudentUniversityEntity> getAllStudentUniversityEntitiesByPersonId(Long personId) {
        return null;
    }

    @Override
    public List<StudentUniversityEntity> getAllStudentUniversityEntitiesByAddressId(Long addressId) {
        return null;
    }

    @Override
    public StudentUniversityEntity assignAddressToPerson(Long addressId, Long personId) {
        return null;
    }

    @Override
    public void deleteAddressToPerson(Long addressId, Long personId) {

    }
}
