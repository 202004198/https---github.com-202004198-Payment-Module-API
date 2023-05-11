package net.javaguides.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PaymentController {



   @GetMapping("/payment")
public String getMobile() {
    
    return "payment";
}

}
