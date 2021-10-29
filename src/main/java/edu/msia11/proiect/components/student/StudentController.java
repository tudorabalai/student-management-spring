package edu.msia11.proiect.components.student;

import edu.msia11.proiect.components.student.output.StudentOutputDTO;
import edu.msia11.proiect.components.student.service.StudentDtoService;
import edu.msia11.proiect.components.student.service.StudentDtoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/* Controller-ul este partea accesibila public
* care serveste  obiectele tale catre utilizator/front end */
@Controller
@RequestMapping(value = "/api/v1")
public class StudentController {

    @Autowired
    private StudentDtoService studentService;

    @GetMapping(value = "/students")
    public ResponseEntity<List<StudentOutputDTO>> getAllStudents() {
        return new ResponseEntity<>(studentService.getAllObjects(), HttpStatus.OK);
    }
}
