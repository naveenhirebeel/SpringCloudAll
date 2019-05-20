package com.self.client;

import com.self.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("producer")
public interface EmployeeClient {

    @RequestMapping(method= RequestMethod.GET, value="/employee")
    Employee getEmployees();
}
