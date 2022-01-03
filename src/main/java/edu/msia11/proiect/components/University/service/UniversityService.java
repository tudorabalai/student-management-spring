package edu.msia11.proiect.components.University.service;

import edu.msia11.proiect.common.model.empty.EmptyJsonResponse;
import edu.msia11.proiect.components.University.input.UniversityInputDTO;
import edu.msia11.proiect.components.University.output.UniversityOutputDTO;

import java.util.List;

public interface UniversityService {

    List<UniversityOutputDTO> getAllObjects();

    List<UniversityOutputDTO> getAllObjectsByName(String name);

    static UniversityOutputDTO getObjectById(Long Id);

    UniversityOutputDTO saveObject(UniversityInputDTO input);

    static UniversityOutputDTO updateObject(Long id, UniversityInputDTO input);

    EmptyJsonResponse deleteById(Long Id);
}