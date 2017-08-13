/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.ac.cr.OnetoOne.model;

/**
 *
 * @author MACJuanJara
" */
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "passport_detail")
public class PassportDetail {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    @Column(name = "passportno")
    private String passportno;

    public PassportDetail(long id, String passportno) {
        this.id = id;
        this.passportno = passportno;
    }

    public PassportDetail() {
        this.id = 0;
        this.passportno = "";
    }
 
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassportno() {
        return passportno;
    }

    public void setPassportno(String passportno) {
        this.passportno = passportno;
    }
    
    
}
