
package com.portfolio.sm.Interface;

import com.portfolio.sm.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //traer una lista de personas
    
   public List<Persona> getPersona();
   
   //guardar objeto tipo persona
   public void savePersona (Persona persona);
   
   //eliminar un objeto buscado por ID
   public void deletePersona (Long id);
   
   //buscar persona por ID
   public Persona findPersona(Long id);
           
}
