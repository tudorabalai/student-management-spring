package edu.msia11.proiect.common.model.address_student;

import edu.msia11.proiect.common.model.empty.EmptyJsonResponse;
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
public class AddressStudentController {
    @Autowired
    private AddressStudentEntityService service;

    @PostMapping(value = "/address-student", produces = "application/json", params = {"addressId", "studentId"})
    public ResponseEntity<EmptyJsonResponse> assignAddressToStudent(@RequestParam(value = "addressId") Long addressId,
                                                                    @RequestParam(value = "studentId") Long studentId) {
        service.assignAddressToStudent(addressId, studentId);
        return new ResponseEntity<>(new EmptyJsonResponse(), HttpStatus.OK);
    }

    @DeleteMapping(value = "/address-student", produces = "application/json", params = {"addressId", "studentId"})
    public ResponseEntity<EmptyJsonResponse> deleteAddressToStudent(@RequestParam(value = "addressId") Long addressId,
                                                                    @RequestParam(value = "studentId") Long studentId) {
        service.deleteAddressToStudent(addressId, studentId);
        return new ResponseEntity<>(new EmptyJsonResponse(), HttpStatus.OK);
    }
}