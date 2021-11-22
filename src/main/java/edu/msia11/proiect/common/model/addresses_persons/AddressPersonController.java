package edu.msia11.proiect.common.model.addresses_persons;

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
public class AddressPersonController {
    @Autowired
    private AddressPersonEntityService service;

    @PostMapping(value = "/address-person", produces = "application/json", params = {"addressId", "personId"})
    public ResponseEntity<EmptyJsonResponse> assignAddressToPerson(@RequestParam(value = "addressId") Long addressId,
                                                                   @RequestParam(value = "personId") Long personId) {
        service.assignAddressToPerson(addressId, personId);
        return new ResponseEntity<>(new EmptyJsonResponse(), HttpStatus.OK);
    }

    @DeleteMapping(value = "/address-person", produces = "application/json", params = {"addressId", "personId"})
    public ResponseEntity<EmptyJsonResponse> deleteAddressToStudent(@RequestParam(value = "addressId") Long addressId,
                                                                    @RequestParam(value = "personId") Long personId) {
        service.deleteAddressToPerson(addressId, personId);
        return new ResponseEntity<>(new EmptyJsonResponse(), HttpStatus.OK);
    }
}