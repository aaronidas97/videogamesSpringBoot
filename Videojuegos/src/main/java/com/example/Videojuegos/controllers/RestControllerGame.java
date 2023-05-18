package com.example.Videojuegos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Videojuegos.services.VideogamesService;


@RestController
public class RestControllerGame {
    

@Autowired
VideogamesService videogamesService;


@DeleteMapping("/delete/{id}")
public String deleteGame(@PathVariable String id){

boolean result = videogamesService.deleteMeme(Long.parseLong(id));

if (result) {
    return "Borrado correcto.";
}else return "ERROR al borrar el meme";

}





}
