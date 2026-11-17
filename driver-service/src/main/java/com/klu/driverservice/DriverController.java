
package com.klu.driverservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    @GetMapping("/test")
    public String test(HttpServletRequest request) {

        int port = request.getLocalPort();

        System.out.println(
            "Request handled by Driver Service on port: " + port
        );

        return "Driver Service running on port: " + port;
    }
}
