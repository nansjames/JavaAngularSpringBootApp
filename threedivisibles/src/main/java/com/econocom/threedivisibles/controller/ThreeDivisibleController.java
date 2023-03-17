package com.econocom.threedivisibles.controller;

import com.econocom.threedivisibles.service.ThreeDivisiblesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ThreeDivisibleController {

    public final ThreeDivisiblesService threeDivisiblesService;

    public ThreeDivisibleController(ThreeDivisiblesService threeDivisiblesService) {
        this.threeDivisiblesService = threeDivisiblesService;
    }

    @GetMapping("/threedivisibles/{id}")
    public Integer getResult(@PathVariable Integer id) {
        System.out.println("ThreeDivisibleController");
        return threeDivisiblesService.getResult(id);
    }
}
