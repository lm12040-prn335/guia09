/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Rol;

/**
 *
 * @author ed
 */
@Named("Cliente")
@ViewScoped
public class ClienteRol implements Serializable{
    
    private WebTarget target;
    private Client cliente;
    private  List<Rol>  salida;
    private String rolMatch;
            
    
    public ClienteRol( ) {
        try {
           cliente=ClientBuilder.newClient( );
          target = cliente.target("http://localhost:8080/guia09Servidor-1.0-SNAPSHOT/webresources/rol");
        } catch (Exception e) {
             Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
    }
   
    public List filtro(){
         List<Rol> out=null, temp= new ArrayList();

         try {
            out = target.request(MediaType.APPLICATION_JSON).get(new GenericType<List<Rol>>(){});
            for (Rol rol : out) {
                 if (rol.getNombre().matches("(.*)"+rolMatch+"(.*)")) {
                    temp.add(rol);
                     System.out.println(temp.get(0).getNombre());
              } 
          }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }finally{
             if (temp.isEmpty()) {
                 temp= Collections.EMPTY_LIST;
                 System.out.println("   hola");
            }
        }
        salida=temp;
        return salida;
    }
  
    @PostConstruct
    public void init (){
        salida = filtro();
    }

    public List<Rol> getSalida() {
        return salida;
    }

    public void setSalida(List<Rol> salida) {
        this.salida = salida;
    }

    public String getRolMatch() {
        return rolMatch;
    }

    public void setRolMatch(String rolMatch) {
        this.rolMatch = rolMatch;
    }

   
    
}
    
    
    

