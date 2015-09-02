/*
 * Sales Badger CRM(Internal) API Service.
 * Copyright(c) 2014 SalesBadger(http://www.salesbadger.com)
 * Internal.
 */
package com.badger.observationservice.entity;

/**
 *
 * @author Rehan Ayub <rayub@sales-i.com>
 */
public class Customer {

    /**
     * instance variable id
     */
    private String id;

    /**
     * instance variable name
     */
    private String name;

    /**
     * instance variable reference
     */
    private String reference;

    /**
     * instance variable backOfficeId
     */
    private String backOfficeId;

    /**
     * instance variable type
     */
    private String type;

    /**
     * instance variable address
     */
    private Address address;

    /**
     * getter method
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * setter method for id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * getter method for name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * setter method for name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter method for reference
     *
     * @return
     */
    public String getReference() {
        return reference;
    }

    /**
     * setter method for reference
     *
     * @param reference
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * getter method for backOfficeId
     *
     * @return
     */
    public String getBackOfficeId() {
        return backOfficeId;
    }

    /**
     * setter for back office id
     *
     * @param backOfficeId
     */
    public void setBackOfficeId(String backOfficeId) {
        this.backOfficeId = backOfficeId;
    }

    /**
     * getter for type
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * setter for type
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * getter for address
     *
     * @return
     */
    public Address getAddress() {
        return address;
    }

    /**
     * setter for address
     *
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }
}
