package com.company.springbootmicroservices.rest;

import com.company.springbootmicroservices.limitservice.bean.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/limits")
public class LimitsController {

    @GetMapping
    public Limits getLimits() {
        return new Limits(1, 4);
    }
}
