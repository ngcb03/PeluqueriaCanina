package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-27T11:33:34", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Duenio> duenio;
    public static volatile SingularAttribute<Cliente, String> observaciones;
    public static volatile SingularAttribute<Cliente, Mascota> mascota;
    public static volatile SingularAttribute<Cliente, Integer> id;
    public static volatile SingularAttribute<Cliente, String> atencionEspecial;

}