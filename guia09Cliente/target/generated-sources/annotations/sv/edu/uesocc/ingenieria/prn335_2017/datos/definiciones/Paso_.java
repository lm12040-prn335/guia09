package sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.PostPaso;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.RolCategoria;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoPaso;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-30T12:11:19")
@StaticMetamodel(Paso.class)
public class Paso_ { 

    public static volatile SingularAttribute<Paso, TipoPaso> idTipoPaso;
    public static volatile ListAttribute<Paso, PostPaso> postPasoList;
    public static volatile SingularAttribute<Paso, RolCategoria> rolCategoria;
    public static volatile SingularAttribute<Paso, Integer> idPaso;
    public static volatile SingularAttribute<Paso, String> nombre;
    public static volatile SingularAttribute<Paso, String> comentarios;

}