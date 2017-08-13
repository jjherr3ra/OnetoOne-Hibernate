/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.ac.cr.OnetoOne.model;

/**
 *
 * @author MACJuanJara
 */

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "passport_detail_id")
    private int passport_detail_id;

    public Person(long id, String name, int passport_detail_id) {
        this.id = id;
        this.name = name;
        this.passport_detail_id = passport_detail_id;
    }

    public Person() {
        this.id = 0;
        this.name = "";
        this.passport_detail_id = 0;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassport_detail_id() {
        return passport_detail_id;
    }

    public void setPassport_detail_id(int passport_detail_id) {
        this.passport_detail_id = passport_detail_id;
    }
    
    
}
