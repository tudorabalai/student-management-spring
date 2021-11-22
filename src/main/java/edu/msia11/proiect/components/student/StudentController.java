package edu.msia11.proiect.components.student;

import edu.msia11.proiect.common.model.empty.EmptyJsonResponse;
import edu.msia11.proiect.components.student.input.StudentInputDTO;
import edu.msia11.proiect.components.student.output.StudentOutputDTO;
import edu.msia11.proiect.components.student.service.StudentDtoService;
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

/* Controller-ul este partea accesibila public
* care serveste  obiectele tale catre utilizator/front end */
@Controller
@RequestMapping(value = "/api/v1")
public class StudentController {

    @Autowired
    private StudentDtoService studentService;

    // CRUD - Create, Read, Update, Delete

    @GetMapping(value = "/students")
    public ResponseEntity<List<StudentOutputDTO>> getAllStudents() {
        return new ResponseEntity<>(studentService.getAllObjects(), HttpStatus.OK);
    }

    @GetMapping(value = "/students/{id}", produces = "application/json")
    public ResponseEntity<StudentOutputDTO> getStudentById(@PathVariable(value = "id") Long id) {
        return new ResponseEntity<>(studentService.getObjectById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/students", params = {"name"}, produces = "application/json")
    public ResponseEntity<List<StudentOutputDTO>> getAllStudentsByName(@RequestParam(value = "name") String name) {
        return new ResponseEntity<>(studentService.getAllObjectsByName(name), HttpStatus.OK);
    }

    @PostMapping(value = "/students", consumes = "application/json", produces = "application/json")
    public ResponseEntity<StudentOutputDTO> saveStudent(@RequestBody StudentInputDTO input) {
        return new ResponseEntity<>(studentService.saveObject(input), HttpStatus.OK);
    }

    @PutMapping(value = "/students/{id}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<StudentOutputDTO> updateStudent(@PathVariable(value = "id") Long id, @RequestBody StudentInputDTO input) {
        return new ResponseEntity<>(studentService.updateObject(id, input), HttpStatus.OK);
    }

    @DeleteMapping(value = "/students/{id}", produces = "application/json")
    public ResponseEntity<EmptyJsonResponse> deleteStudent(@PathVariable(value = "id") Long id) {
        return new ResponseEntity<>(studentService.deleteById(id), HttpStatus.OK);
    }
}
