package com.portfolio.mgb.Interface;

import com.portfolio.mgb.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una persona
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
            
    //Eliminar persona
    public void deletePersona(Long id);
    
    //Buscar persona
    public Persona findPersona(Long id);
}
