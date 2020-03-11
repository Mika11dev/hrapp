package com.akademiakodu.hrapp.rest;

import com.akademiakodu.hrapp.model.Address;
import com.akademiakodu.hrapp.model.Training;
import com.akademiakodu.hrapp.service.AddressService;
import com.akademiakodu.hrapp.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TrainingController {
    private TrainingService trainingService;

    @Autowired
    public TrainingController(TrainingService trainingService) {
        this.trainingService = trainingService;
    }

    @RequestMapping(value = "/training/{name}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Training findByName(@PathVariable("name") String Name){
        return trainingService.findByName(Name);
    }

    @RequestMapping(value = "/training", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Training createTraining(Training training){
        return trainingService.save(training);
    }
}
