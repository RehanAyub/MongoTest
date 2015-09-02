/*
 * Sales Badger CRM(Internal) API Service.
 * Copyright(c) 2014 SalesBadger(http://www.salesbadger.com)
 * Internal.
 */
package com.badger.observationservice.entity;

import java.io.Serializable;
import java.util.Date;
import org.json.simple.JSONObject;

/**
 *
 * @author Rehan Ayub <rayub@sales-i.com>
 */
public abstract class Observation implements Serializable, Cloneable {

    private boolean actionRequired;
    private String catagory;
    private String observationId;
    private String customerId;

    public Observation() {

    }
    
    public abstract JSONObject toJson();

    public abstract void setScore(int score);

    public abstract int getScore();

    public abstract Date getDate();

    public abstract void setDate(Date date);
    
    public abstract void setDrop(double drop);
    
    public abstract double getDrop();

    public boolean isActionRequired() {
        return actionRequired;
    }

    public void setActionRequired(boolean actionRequired) {
        this.actionRequired = actionRequired;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getObservationId() {
        return observationId;
    }

    public void setObservationId(String observationId) {
        this.observationId = observationId;
    }

        public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Observation{" + "actionRequired=" + actionRequired + ", catagory=" + catagory + ", observationId=" + observationId + ", customerId=" + customerId + '}';
    }
}
