package edu.msia11.proiect.components.University;

import edu.msia11.proiect.common.model.empty.EmptyJsonResponse;
import edu.msia11.proiect.components.University.input.UniversityInputDTO;
import edu.msia11.proiect.components.University.output.UniversityOutputDTO;
import edu.msia11.proiect.components.University.service.UniversityService;
import edu.msia11.proiect.components.student.input.StudentInputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/api/v1")
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @GetMapping(value = "/universities")
    public ResponseEntity<List<UniversityOutputDTO>> getAllUniversities() {
        return new ResponseEntity<>(universityService.getAllObjects(), HttpStatus.OK);
    }
    @GetMapping(value = "/universities/{id}", produces = "application/json")
    public ResponseEntity<UniversityOutputDTO> getUniversityById(@PathVariable(value = "id") Long id) {
       return new ResponseEntity<>(UniversityService.getObjectById(id), HttpStatus.OK);
    }
    @GetMapping(value = "/universities", params = {"name"}, produces = "application/json")
    public  ResponseEntity<List<UniversityOutputDTO>> getAllUniversitiesByName(@RequestParam(value = "name") String name) {
        return new ResponseEntity<>(universityService.getAllObjectsByName(name), HttpStatus.OK);
    }

    @PostMapping(value = "/universities", consumes = "application/json", produces = "application/json")
    public ResponseEntity<UniversityOutputDTO> saveUniversity(@RequestBody StudentInputDTO input) {
        return new ResponseEntity<>(universityService.saveObject(input), HttpStatus.OK);
    }

    @PutMapping(value = "students/{id}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<UniversityOutputDTO> updateUniversity(@PathVariable(value = "id") Long id, @RequestBody UniversityInputDTO input) {
        return  new ResponseEntity<> (UniversityService.updateObject(id, input), HttpStatus.OK);
    }

    @DeleteMapping(value = "/universities/{id}", produces = "application/json")
    public ResponseEntity<EmptyJsonResponse> deleteUniversity(@PathVariable (value = "id") Long id) {
        return new ResponseEntity<> (universityService.deleteById(id), HttpStatus.OK);
    }
}
