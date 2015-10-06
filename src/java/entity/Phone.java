/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Asnorrason
 */
@Entity
public class Phone {
    @Id
    private int number;
    private String description;
    private InfoEntity IE;

    public Phone() {
    }

    public Phone(int number, String description, InfoEntity IE) {
        this.number = number;
        this.description = description;
        this.IE = IE;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InfoEntity getIE() {
        return IE;
    }

    public void setIE(InfoEntity IE) {
        this.IE = IE;
    }
    
    
    
}
