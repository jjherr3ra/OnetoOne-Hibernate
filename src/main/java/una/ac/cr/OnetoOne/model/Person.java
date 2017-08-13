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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
    @JoinColumn(name = "passport_detail_id")
    @OneToOne
    private PassportDetail passportno;

    public Person(long id, String name, PassportDetail passportno) {
        this.id = id;
        this.name = name;
        this.passportno = passportno;
    }

    public Person() {
       
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


    public PassportDetail getPassportno() {
        return passportno;
    }

    public void setPassportno(PassportDetail passportno) {
        this.passportno = passportno;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", passport_detail="  + passportno.getPassportno() + '}';
    }

}
