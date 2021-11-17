package edu.msia11.proiect.components.student.mapping;

import edu.msia11.proiect.components.student.StudentEntity;
import edu.msia11.proiect.components.student.input.StudentInputDTO;
import edu.msia11.proiect.components.student.output.StudentOutputDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

/* Acest mapper se va ocupa de conversia entity -> dto si dto -> entity.
* Totodata, cu asta scapi de programarea aia de la Wellcode cu for in for in for in for. */
@Mapper(componentModel = "spring")
public interface StudentMapper {

    @Mapping(target = "id", source = "entity.id", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT)
    @Mapping(target = "nume", source = "entity.nume", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT)
    @Mapping(target = "prenume", source = "entity.prenume", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT)
    @Mapping(target = "cnp", source = "entity.codNumericPersonal", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT)
    @Mapping(target = "nrMatricol", source = "entity.numarMatricol", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT)
    @Mapping(target = "numarCI", source = "entity.numarCarteIdentitate", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT)
    @Mapping(target = "serieCI", source = "entity.serieCarteIdentitate", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT)
//    @Mapping(target = "adresaCompleta", source = "entity.adresaDomiciliu", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT)
    @Mapping(target = "adresaCompleta", ignore = true)
    StudentOutputDTO entityToOutput(StudentEntity entity);

    List<StudentOutputDTO> entityToOutput(List<StudentEntity> entityList);

    @Mapping(target = "nume", source = "input.nume", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT)
    @Mapping(target = "prenume", source = "input.prenume", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT)
    @Mapping(target = "codNumericPersonal", source = "input.cnp", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT)
    @Mapping(target = "numarMatricol", source = "input.nrMatricol", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT)
    @Mapping(target = "numarCarteIdentitate", source = "input.numarCI", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT)
    @Mapping(target = "serieCarteIdentitate", source = "input.serieCI", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT)
//    @Mapping(target = "adresaDomiciliu", source = "input.adresaCompleta", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT)
    @Mapping(target = "adresaDomiciliu", ignore = true)
    StudentEntity inputToEntity(StudentInputDTO input);

    List<StudentEntity> inputToEntity(List<StudentInputDTO> inputList);

    @Mapping(target = "nume", source = "input.nume", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "prenume", source = "input.prenume", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "codNumericPersonal", source = "input.cnp", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "numarMatricol", source = "input.nrMatricol", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "numarCarteIdentitate", source = "input.numarCI", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "serieCarteIdentitate", source = "input.serieCI", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    @Mapping(target = "adresaDomiciliu", source = "input.adresaCompleta", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "adresaDomiciliu", ignore = true)
    StudentEntity updateEntityFromInput(StudentInputDTO input, @MappingTarget StudentEntity entity);

    List<StudentEntity> updateEntityFromInput(List<StudentInputDTO> input, @MappingTarget List<StudentEntity> entity);
}