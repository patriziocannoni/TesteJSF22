package testejsf22.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author patrizio
 * @since 15/06/2016
 */
@Entity
public class ServidorInfo implements Serializable {
    
    private static final long serialVersionUID = 947612482558900611L;

    @Id
    @OneToOne(optional = false)
    private Servidor servidor;
    
    @Column
    private Long memoria;
    
    @Column
    private Long disco;
    
}
