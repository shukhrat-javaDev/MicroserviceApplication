package com.company.springbootmicroservices.rest;

import com.company.springbootmicroservices.limitservice.bean.Configuration;
import com.company.springbootmicroservices.limitservice.bean.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/limits")
public class LimitsController {

    private final Configuration configuration;

    public LimitsController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping
    public Limits getLimits() {
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
    }
}
