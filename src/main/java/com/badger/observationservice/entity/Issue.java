/*
 * Sales Badger CRM(Internal) API Service.
 * Copyright(c) 2014 SalesBadger(http://www.salesbadger.com)
 * Internal.
 */
package com.badger.observationservice.entity;

/**
 * entity class for Issue
 * @author Rehan Ayub <rayub@sales-i.com>
 */
public abstract class Issue extends Observation {
    
    /**
     * instance variable type
     */
    private String type;
    
    /**
     * instance variable drop
     */
    private double drop;
    
    /**
     * getter for type
     * @return 
     */
    public String getType() {
        return type;
    }

    /**
     * setter for type
     * @param type 
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * getter for drop
     * @return 
     */
    @Override
    public double getDrop() {
        return drop;
    }

    /**
     * setter for drop
     * @param drop 
     */
    @Override
    public void setDrop(double drop) {
        this.drop = drop;
    }

}
