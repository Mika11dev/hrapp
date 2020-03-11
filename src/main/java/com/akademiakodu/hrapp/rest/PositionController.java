package com.akademiakodu.hrapp.rest;

import com.akademiakodu.hrapp.model.Address;
import com.akademiakodu.hrapp.model.Position;
import com.akademiakodu.hrapp.service.AddressService;
import com.akademiakodu.hrapp.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PositionController {
    private PositionService positionService;

    @Autowired
    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }

    @RequestMapping(value = "/position/{name}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Position findByName(@PathVariable("name") String Name){
        return positionService.findByName(Name);
    }

    @RequestMapping(value = "/position", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Position createPosition(Position position){
        return positionService.save(position);
    }
}
