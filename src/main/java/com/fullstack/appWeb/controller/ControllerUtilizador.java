package com.fullstack.appWeb.controller;

import com.fullstack.appWeb.srvice.IserviceUtilizador;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ControllerUtilizador {



    IserviceUtilizador iserviceUtilizador;

    @GetMapping("/")
    public String getAll(){
        return "all";
    }

}
