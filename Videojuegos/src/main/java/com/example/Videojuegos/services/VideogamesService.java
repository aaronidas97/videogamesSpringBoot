package com.example.Videojuegos.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Videojuegos.models.VideogameModel;
import com.example.Videojuegos.repositories.MyRepository;

@Service
public class VideogamesService {
    
@Autowired
MyRepository myRepository;

public ArrayList<VideogameModel> getAllVideoGames(){

return (ArrayList<VideogameModel>) myRepository.findAll();

}
public VideogameModel createVideogame(VideogameModel juego){


return myRepository.save(juego);

}

public boolean deleteMeme(long id){


try {
    myRepository.deleteById(id);
    return true;
} catch (IllegalArgumentException e) {
return false;

}




}





}
