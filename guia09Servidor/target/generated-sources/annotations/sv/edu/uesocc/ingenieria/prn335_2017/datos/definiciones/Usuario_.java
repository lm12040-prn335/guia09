package sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.UsuarioRolCategoria;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-30T12:11:19")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> apellidos;
    public static volatile ListAttribute<Usuario, UsuarioRolCategoria> usuarioRolCategoriaList;
    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile SingularAttribute<Usuario, Date> fechaNacimiento;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, String> comentarios;
    public static volatile SingularAttribute<Usuario, String> nombres;
    public static volatile SingularAttribute<Usuario, Boolean> activo;
    public static volatile SingularAttribute<Usuario, String> username;

}