/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.badger.observationservice.entity;

import java.util.Date;
import org.json.simple.JSONObject;

/**
 * entity class for MonthlyProductOrderCountIssue
 *
 * @author Rehan Ayub <rayub@sales-i.com>
 */
public class MonthlyProductOrderCountIssue extends Issue {

    /**
     * instance variable productName
     */
    private String productName;

    /**
     * instance variable currentYearValue
     */
    private int currentYearValue;

    /**
     * instance variable lastYearValue
     */
    private int lastYearValue;

    /**
     * instance variable lastYearValue
     */
    private String month;

    /**
     * instance variable currentYear
     */
    private int currentYear;

    /**
     * instance variable previousYear
     */
    private int previousYear;

    /**
     * instance variable score
     */
    private int score;

    private Date date;

    /**
     * getter for product
     *
     * @return
     */
    public String getProductName() {
        return productName;
    }

    /**
     * setter for product
     *
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * getter for currentYearValue
     *
     * @return
     */
    public int getCurrentYearValue() {
        return currentYearValue;
    }

    /**
     * setter for currentYearValue
     *
     * @param currentYearValue
     */
    public void setCurrentYearValue(int currentYearValue) {
        this.currentYearValue = currentYearValue;
    }

    /**
     * getter for lastYearValue
     *
     * @return
     */
    public int getLastYearValue() {
        return lastYearValue;
    }

    /**
     * setter for lastYearValue
     *
     * @param lastYearValue
     */
    public void setLastYearValue(int lastYearValue) {
        this.lastYearValue = lastYearValue;
    }

    /**
     * getter for month
     *
     * @return
     */
    public String getMonth() {
        return month;
    }

    /**
     * setter for month
     *
     * @param month
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * getter for currentYear
     *
     * @return
     */
    public int getCurrentYear() {
        return currentYear;
    }

    /**
     * setter for currentYear
     *
     * @param currentYear
     */
    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    /**
     * getter for the previousYear
     *
     * @return
     */
    public int getPreviousYear() {
        return previousYear;
    }

    /**
     * setter for the previousYear
     *
     * @param previousYear
     */
    public void setPreviousYear(int previousYear) {
        this.previousYear = previousYear;
    }

    /**
     * getter for score
     *
     * @return
     */
    @Override
    public int getScore() {
        return score;
    }

    /**
     * setter for score
     *
     * @param score
     */
    @Override
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * getter for the date
     *
     * @return
     */
    @Override
    public Date getDate() {
        return date;
    }

    /**
     * setter for the date
     *
     * @param date
     */
    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * method to convert ProductOrderCountIssue to JSON Object
     *
     * @return
     */
    @Override
    public JSONObject toJson() {

        JSONObject productOrderCountIssueJson = new JSONObject();

        productOrderCountIssueJson.put("catagory", this.getCatagory());
        productOrderCountIssueJson.put("type", this.getType());
        productOrderCountIssueJson.put("action_required", this.isActionRequired());
        productOrderCountIssueJson.put("drop", this.getDrop());
        productOrderCountIssueJson.put("product_name", this.getProductName());
        productOrderCountIssueJson.put("month", this.getMonth());
        productOrderCountIssueJson.put("current-year", this.getCurrentYear());
        productOrderCountIssueJson.put("previous_year", this.getPreviousYear());
        productOrderCountIssueJson.put("current_year_value", this.getCurrentYearValue());
        productOrderCountIssueJson.put("previous_year_value", this.getLastYearValue());
        productOrderCountIssueJson.put("score", this.getScore());
        productOrderCountIssueJson.put("customer_id", this.getCustomerId());
        productOrderCountIssueJson.put("date", this.getDate());
        

        return productOrderCountIssueJson;
    }

    @Override
    public String toString() {
        return "MonthlyProductOrderCountIssue{" + "productName=" + productName + ", currentYearValue=" + currentYearValue + ", lastYearValue=" + lastYearValue + ", month=" + month + ", currentYear=" + currentYear + ", previousYear=" + previousYear + ", score=" + score + ", date=" + date + '}';
    }
    
}
