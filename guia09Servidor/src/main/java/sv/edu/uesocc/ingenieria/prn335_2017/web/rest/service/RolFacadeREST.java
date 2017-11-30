/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.rest.service;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.RolFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Rol;

/**
 *
 * @author ed
 */
@Stateless
@Path("rol")
public class RolFacadeREST extends AbstractFacade<Rol> implements Serializable{
    
    @EJB
     RolFacadeLocal  rolFacade;
    

    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria.prn335_2017_guia09Servidor_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public RolFacadeREST() {
        super(Rol.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Rol entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Rol entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

   
    @GET
    @Path("{todos}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Rol> findAll( ) {
      
        try {
            if (rolFacade != null) {
                return rolFacade.findAll( );
            } 
        } catch (Exception e) {
             Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return Collections.EMPTY_LIST;
    }

    @GET
    @Path("{inicio}/{tamanio}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Rol> findRange(
            @PathParam("inicio") @DefaultValue("0") int first,
            @PathParam("tamanio") @DefaultValue("10") int size) {
        try {
            if (rolFacade != null) {
                return rolFacade.findRange(first, size);
            }
        } catch (Exception e) {
            System.out.println("ex: " + e);
        }
        return Collections.EMPTY_LIST;
    }

    @GET
    @Path("{idrol}")
    @Produces(MediaType.APPLICATION_JSON)
    public Rol findById(
            @PathParam("idrol") Integer id,
            @PathParam("n") Integer n){
        try {
            if (rolFacade != null && id != null) {
                System.out.println(n);
                return rolFacade.find(id);
                
            } else {
                
            }
        } catch (Exception e) {
             Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
      return new Rol();
   }
    
    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
