package com.gazetta.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/teste")
public class TesteController {

    @ResponseBody
    @RequestMapping( method = RequestMethod.GET )
    public String listarTrack() {
        return "ok";
    }

   
}

