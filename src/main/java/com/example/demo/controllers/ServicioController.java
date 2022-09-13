package com.example.demo.controllers;

import com.example.demo.models.Administrador;
import com.example.demo.models.Empleado;
import com.example.demo.models.Personas;
import com.example.demo.models.Tendero;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


@RestController
public class ServicioController {

    private static Logger logger = LoggerFactory.getLogger(ServicioController.class);

    @RequestMapping(value = "crearUsuario")
    public String getServicio(){
        logger.trace("Log level: TRACE");
        logger.info("Log level: INFO");
        logger.debug("Log level: DEBUG");
        logger.error("Log level: ERROR");
        logger.warn("Log level: WARN");
        return "estamos en el controlador";
    }
}
