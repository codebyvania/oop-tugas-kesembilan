/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataPasien;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author User
 */
@Entity

@Table(name = "data_pasien")
public class PasienEntity implements Serializable {

    private static final long serialVersionUID = 1L;
  
    @Basic(optional = false)
    @Column(name = "id_pasien")
    @Id
    private String id_pasien;
    @Column(name = "nama_pasien")
    private String nama_pasien;
    @Column(name = "tanggal_lahir")
    @Temporal(TemporalType.DATE)
    private Date tanggal_lahir;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "no_hp")
    private Integer no_hp;
    @Column(name = "diagnosa")
    private String diagnosa;



    public String getId_pasien() {
        return id_pasien;
    }

    public void setId_pasien(String id_pasien) {
        this.id_pasien = id_pasien;
    }

    public String getNama_pasien() {
        return nama_pasien;
    }

    public void setNama_pasien(String nama_pasien) {
        this.nama_pasien = nama_pasien;
    }

    public Date getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(Date tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Integer getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(Integer no_hp) {
        this.no_hp = no_hp;
    }

    public String getDiagnosa() {
        return diagnosa;
    }

    public void setDiagnosa(String diagnosa) {
        this.diagnosa = diagnosa;
    }


    @Override
public int hashCode() {
    int hash = 0;
    hash += (id_pasien != null ? id_pasien.hashCode() : 0);
    return hash;
}

@Override
public boolean equals(Object object) {
    if (!(object instanceof PasienEntity)) {
        return false;
    }
    PasienEntity other = (PasienEntity) object;
    if ((this.id_pasien == null && other.id_pasien != null) 
            || (this.id_pasien != null && !this.id_pasien.equals(other.id_pasien))) {
        return false;
    }
    return true;
}

@Override
public String toString() {
    return "DataPasien.PasienEntity[ id_pasien=" + id_pasien + " ]";
}

}
