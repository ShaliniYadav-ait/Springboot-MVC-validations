package com.tw.validationsDemo.controller;

import com.tw.validationsDemo.entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @GetMapping("/")
    public String showFrom(Model theModel){
        theModel.addAttribute("customer",new Customer());
        return "customer-form";
    }
}
