package com.example.Videojuegos.controllers;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Videojuegos.models.VideogameModel;
import com.example.Videojuegos.services.VideogamesService;

@Controller
public class VideogameController {
    
    @Autowired
    VideogamesService videogamesService;

    @RequestMapping("/videogames")
    public String allVideogames(Model model) {
        
        
        ArrayList<VideogameModel> lista = videogamesService.getAllVideoGames();

        model.addAttribute("lista", lista);
        
        
        return "listaVideojuegos";


    }

    
    @PostMapping("/videogames")
    public String memesAdd(@RequestParam HashMap<String, String> body){

        String name = body.get("name");
        String urlImage = body.get("urlImage");
        String description = body.get("description");
        String rating = body.get("rating");

        VideogameModel game = new VideogameModel();
        game.setName(name);
        game.setUrlImage(urlImage);
        game.setDescription(description);
        game.setRating(rating);

        try {
            videogamesService.createVideogame(game);

        } catch (Exception e) {

System.err.println("Error.");    
    }
        return "createOK";
    }




    
    @RequestMapping("/videogames/addForm")
    public String memeAddForm(){
        return "addForm";
    }  

}
