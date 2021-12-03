package edu.msia11.proiect.common.model.students_universities;

import edu.msia11.proiect.common.model.addresses_persons.service.AddressPersonEntityService;
import edu.msia11.proiect.common.model.empty.EmptyJsonResponse;
import edu.msia11.proiect.common.model.students_universities.service.StudentUniversityEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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