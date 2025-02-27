package com.longdollar.long_dollar_app.model;

import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.Entity;
import javax.persistence.Id;


import java.util.Date;

/*
 * 
 *  @Entity annotation tells Spring and JPA that the class is an entity that will be mapped 
 *  to a table in the database. The entity will be persisted in the database.
 * 
 *  @Id annotation marks the field as the primary key for the entity in the database. 
 * 
 *  @GeneratedValue annotation auto generates the id.
 * 
*/ 
@Entity
public class Colleague {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private boolean doIGetTheLongDollar;
    private Date dateCreated;
    private int transactionCounter = 0;

    // Constructor
    public Colleague(String name, boolean doIGetTheLongDollar) {
        this.name = name;
        this.doIGetTheLongDollar = doIGetTheLongDollar;
        this.transactionCounter;
        this.dateCreated = new Date();
    }

    /*
     * 
     *  Getter Functions
     * 
    */
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean getDoIGetTheLongDollar() {
        return this.doIGetTheLongDollar;
    }

    public int getTransactionCounter() {
        return this.transactionCounter;
    } 

    public Date getDateCreated() {
        return this.dateCreated;
    }
}