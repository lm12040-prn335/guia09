/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso;

import java.util.Collections;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Rol;

/**
 *
 * @author ed
 */
@Stateless
public class RolFacade  extends AbstractFacade<Rol> implements RolFacadeLocal {

    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria.prn335_2017_guia09Servidor_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RolFacade() {
        super(Rol.class);
    }
      @Override
    /**
     * Ejecuta una NamedQuery y obtiene los roles no utilizados desde la basa de datos
     * @return retorna una lista de objetos tipo Rol
     */
     public List<Rol> obtenerUtilizados() {
        List salida;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("uesocc.ingenieria.sv.prn3352017_guia08_war_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        Query c = em.createNamedQuery("Rol.noUtilizados");
        salida = c.getResultList();
        
        if(salida != null){
        return salida;
        }else{
            return Collections.EMPTY_LIST;
        }
}

    @Override
    public List<Rol> findRange(int first, int pageSize) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
