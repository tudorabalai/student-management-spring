package edu.msia11.proiect.components.University.mapping;

import edu.msia11.proiect.common.model.students_universities.StudentUniversityKey;
import edu.msia11.proiect.components.University.UniversityEntity;
import edu.msia11.proiect.components.University.input.UniversityInputDTO;
import edu.msia11.proiect.components.University.output.UniversityOutputDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UniversityMapper {

    UniversityOutputDTO entityToOutput(UniversityEntity entity);

    List<UniversityOutputDTO> entityToOutput(List<UniversityEntity> entityList);

    @Mapping(target = "name", source = "input.name")
    @Mapping(target = "studentList", source = "input.studentList")
    UniversityEntity inputToEntity(UniversityInputDTO input);

    List<UniversityEntity> inputToEntity(List<UniversityInputDTO> inputList);

    @Mapping(target = "name", source = "input.name")
    @Mapping(target = "studentList", source = "input.studentList")
    UniversityEntity updateEntityFromInput(UniversityInputDTO input, @MappingTarget UniversityEntity entity);

    List<UniversityEntity> updateEntityFromInput(List<UniversityInputDTO> input, @MappingTarget List<UniversityEntity> entity);

    default Long StudentUniversityIdToStudentId(StudentUniversityKey value) {
        return value.getStudentId();
    }
}