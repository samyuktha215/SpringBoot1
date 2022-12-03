package se.jensen.javacourse.week3.samyuktha.myfirstspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se.jensen.javacourse.week3.samyuktha.myfirstspringboot.MyfirstspringbootApplication;

@RestController
public class PersonController {
    @GetMapping("/student")
    public MyfirstspringbootApplication.Person getperson(){
        return new MyfirstspringbootApplication.Person("Samyuktha","Basam",30);

    }


}

