package edu.msia11.proiect.components.University.service;

import edu.msia11.proiect.common.model.empty.EmptyJsonResponse;
import edu.msia11.proiect.components.University.UniversityRepository;
import edu.msia11.proiect.components.University.input.UniversityInputDTO;
import edu.msia11.proiect.components.University.mapping.UniversityMapper;
import edu.msia11.proiect.components.University.output.UniversityOutputDTO;
import edu.msia11.proiect.components.student.input.StudentInputDTO;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@NoArgsConstructor
public class UniversityServiceImpl implements UniversityService {

    @Autowired
    private UniversityRepository universityRepository;

    @Autowired
    private UniversityMapper mapper;

    @Override
    public List<UniversityOutputDTO> getAllObjects() {
        return null;
    }

    @Override
    public List<UniversityOutputDTO> getAllObjectsByName(String name) {
        return null;
    }

    @Override
    public UniversityOutputDTO getObjectById(Long Id) {
        return null;
    }

    @Override
    public UniversityOutputDTO saveObject(StudentInputDTO input) {
        return null;
    }

    @Override
    public UniversityOutputDTO updateObject(Long id, UniversityInputDTO input) {
        return null;
    }

    @Override
    public EmptyJsonResponse deleteById(Long Id) {
        return null;
    }
}
