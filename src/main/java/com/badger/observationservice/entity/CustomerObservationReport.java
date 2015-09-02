/*
 * Sales Badger CRM(Internal) API Service.
 * Copyright(c) 2014 SalesBadger(http://www.salesbadger.com)
 * Internal.
 */
package com.badger.observationservice.entity;

import java.util.LinkedList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Entity class for Customer Observation Report
 * @author Rehan Ayub <rayub@sales-i.com>
 */
public class CustomerObservationReport {

    /**
     * instance variable observations
     */
    private List<Observation> observations;

    /**
     * instance variable customerId
     */
    private String customerId;
    
    /**
     * instance variable backOfficeId
     */
    private String backOfficeId;

    /**
     * instance variable customerName
     */
    private String customerName;
    
    private String accountId;

    /**
     * Constructor with Customer as parameter
     * @param customer 
     */
    public CustomerObservationReport(Customer customer) {
        this.customerId = customer.getId();
        this.customerName = customer.getName();
        this.backOfficeId = customer.getBackOfficeId();
        this.observations = new LinkedList<>();
    }

    /**
     * method to add observation to observation list
     * @param observation 
     */
    public void addObservation(Observation observation) {
        this.observations.add(observation);
    }
    
    /**
     * method to add observations to observation list
     * @param observations 
     */
    public void addObservations(List<Observation> observations) {
        this.observations.addAll(observations);
    }

    /**
     * getter for customerId
     * @return 
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * setter for customer id
     * @param customerId 
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
    /**
     * getter for customerName
     * @return 
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * setter for customer name
     * @param customerName 
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * getter for observation list
     * @return 
     */
    public List<Observation> getObservations() {
        return observations;
    }

    /**
     * setter for observation list
     * @param observations 
     */
    public void setObservations(List<Observation> observations) {
        this.observations = observations;
    }
    
    /**
     * getter for backOfficeId
     * @return 
     */
    public String getBackOfficeId() {
        return backOfficeId;
    }

    /**
     * setter for backOfficeId
     * @param backOfficeId 
     */
    public void setBackOfficeId(String backOfficeId) {
        this.backOfficeId = backOfficeId;
    }

    /**
     * method to convert observation object to JSON
     * @return 
     */
    public JSONObject toJSON() {

        JSONObject json = new JSONObject();

        json.put("customer_Id", this.customerId);
        json.put("customer_Name", this.customerName);
        json.put("customer_back_office_id", this.backOfficeId);
        json.put("account", this.accountId);

        JSONArray dataArr = new JSONArray();

        for (Observation observation : getObservations()) {
            dataArr.add(observation.toJson());
        }
        json.put("obseravations", dataArr);

        return json;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "CustomerObservationReport{" + "observations=" + observations + ", customerId=" + customerId + ", backOfficeId=" + backOfficeId + ", customerName=" + customerName + ", accountId=" + accountId + '}';
    }

    
}
