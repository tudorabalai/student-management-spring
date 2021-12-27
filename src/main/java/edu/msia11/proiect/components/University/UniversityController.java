package edu.msia11.proiect.components.University;

import edu.msia11.proiect.components.University.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/v1")
public class UniversityController {

    @Autowired
    private UniversityService universityService;


}