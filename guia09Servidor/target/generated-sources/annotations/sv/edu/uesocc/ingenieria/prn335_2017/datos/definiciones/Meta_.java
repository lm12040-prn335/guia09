package sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Post;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-30T12:11:19")
@StaticMetamodel(Meta.class)
public class Meta_ { 

    public static volatile SingularAttribute<Meta, String> descripcion;
    public static volatile SingularAttribute<Meta, Integer> idMeta;
    public static volatile ListAttribute<Meta, Post> postList;
    public static volatile SingularAttribute<Meta, String> nombre;
    public static volatile SingularAttribute<Meta, Boolean> activo;

}