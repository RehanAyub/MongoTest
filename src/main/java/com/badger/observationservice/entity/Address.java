/*
 * Sales Badger CRM(Internal) API Service.
 * Copyright(c) 2014 SalesBadger(http://www.salesbadger.com)
 */
package com.badger.observationservice.entity;

/**
 * Entity class for Address.
 *
 * @author Rehan Ayub <rayub@sales-i.com>
 */
public class Address {

    /**
     * instance variable address1
     */
    private String adress1;

    /**
     * instance variable address2
     */
    private String address2;

    /**
     * instance variable county
     */
    private String county;

    /**
     * instance variable postcode
     */
    private String postcode;

    /**
     * instance variable country
     */
    private String country;

    /**
     * getter for address1
     *
     * @return
     */
    public String getAdress1() {
        return adress1;
    }

    /**
     * setter for address1
     *
     * @param adress1
     */
    public void setAdress1(String adress1) {
        this.adress1 = adress1;
    }

    /**
     * getter for address2
     *
     * @return
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * setter for address2
     *
     * @param address2
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * getter for county
     *
     * @return
     */
    public String getCounty() {
        return county;
    }

    /**
     * setter for county
     *
     * @param county
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * getter for postcode
     *
     * @return
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * setter for postcode
     *
     * @param postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * getter for country
     *
     * @return
     */
    public String getCountry() {
        return country;
    }

    /**
     * setter for county
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }
}
