package com.pillartechnology.babysitter2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Babysitter2Controller {

    @Setter @Getter
    private String babysitterName;

    @RequestMapping()
    public String returnTrue() {
        return this.babysitterName;
    }
}
