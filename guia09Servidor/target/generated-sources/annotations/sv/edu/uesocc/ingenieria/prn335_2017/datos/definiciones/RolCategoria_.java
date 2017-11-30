package sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Categoria;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Paso;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Rol;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.RolCategoriaPK;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.UsuarioRolCategoria;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-30T12:11:19")
@StaticMetamodel(RolCategoria.class)
public class RolCategoria_ { 

    public static volatile ListAttribute<RolCategoria, UsuarioRolCategoria> usuarioRolCategoriaList;
    public static volatile ListAttribute<RolCategoria, Paso> pasoList;
    public static volatile SingularAttribute<RolCategoria, Categoria> categoria;
    public static volatile SingularAttribute<RolCategoria, Rol> rol;
    public static volatile SingularAttribute<RolCategoria, RolCategoriaPK> rolCategoriaPK;
    public static volatile SingularAttribute<RolCategoria, Boolean> activo;

}