package com.akademiakodu.hrapp.rest;

import com.akademiakodu.hrapp.model.Address;
import com.akademiakodu.hrapp.model.Education;
import com.akademiakodu.hrapp.service.AddressService;
import com.akademiakodu.hrapp.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EducationController {

    private EducationService educationService;

    @Autowired
    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @RequestMapping(value = "/education/{title}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Education findByTitle(@PathVariable("title") String Title){
        return educationService.findByTitle(Title);
    }

    @RequestMapping(value = "/education", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Education createEducation(Education education){
        return educationService.save(education);
    }
}
