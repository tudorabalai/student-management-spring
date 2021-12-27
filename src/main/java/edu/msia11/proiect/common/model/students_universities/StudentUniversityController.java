package edu.msia11.proiect.common.model.students_universities;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/v1")
public class StudentUniversityController {
//    @Autowired
//    private StudentUniversityEntityService service;
//
//    @PostMapping(value = "/student-university", produces = "application/json", params = {"studentId", "universityId"})
//    public ResponseEntity<EmptyJsonResponse> assignStudentToUniversity(@RequestParam(value = "studentId") Long studentId,
//                                                                   @RequestParam(value = "universityId") Long universityId) {
//        service.assignStudentToUniversity(studentId, universityId);
//        return new ResponseEntity<>(new EmptyJsonResponse(), HttpStatus.OK);
//    }
//
//    @DeleteMapping(value = "/student-university", produces = "application/json", params = {"studentId", "universityId"})
//    public ResponseEntity<EmptyJsonResponse> deleteAddressToStudent(@RequestParam(value = "studentId") Long studentId,
//                                                                    @RequestParam(value = "universityId") Long universityId) {
//        service.deleteStudentToUniversity(studentId, universityId);
//        return new ResponseEntity<>(new EmptyJsonResponse(), HttpStatus.OK);
//    }
}