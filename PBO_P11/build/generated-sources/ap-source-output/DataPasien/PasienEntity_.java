package DataPasien;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-10-31T01:41:53", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(PasienEntity.class)
public class PasienEntity_ { 

    public static volatile SingularAttribute<PasienEntity, String> nama_pasien;
    public static volatile SingularAttribute<PasienEntity, String> diagnosa;
    public static volatile SingularAttribute<PasienEntity, Integer> no_hp;
    public static volatile SingularAttribute<PasienEntity, String> id_pasien;
    public static volatile SingularAttribute<PasienEntity, Date> tanggal_lahir;
    public static volatile SingularAttribute<PasienEntity, String> alamat;

}