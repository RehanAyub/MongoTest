/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.badger.observationservice.entity;

import java.util.Date;
import org.json.simple.JSONObject;

/**
 *
 * @author Rehan Ayub <rayub@sales-i.com>
 */
public class MonthlyOrderCountIssue extends Issue {

    /**
     * instance variable previousOrderCount
     */
    private int previousOrderCount;

    /**
     * instance variable currentOrderCount
     */
    private int currentOrderCount;

    /**
     * instance variable month
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
     * getter method for previousOrderCount
     * @return 
     */
    public int getPreviousOrderCount() {
        return previousOrderCount;
    }

    /**
     * setter method for previousOrderCount
     * @param previousOrderCount 
     */
    public void setPreviousOrderCount(int previousOrderCount) {
        this.previousOrderCount = previousOrderCount;
    }

    /**
     * getter method for currentOrderCount
     * @return 
     */
    public int getCurrentOrderCount() {
        return currentOrderCount;
    }

    /**
     * setter for currentOrderCount
     * @param currentOrderCount 
     */
    public void setCurrentOrderCount(int currentOrderCount) {
        this.currentOrderCount = currentOrderCount;
    }

    /**
     * getter for month
     * @return 
     */
    public String getMonth() {
        return month;
    }

    /**
     * setter for month
     * @param month 
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * getter method for currentYear
     * @return 
     */
    public int getCurrentYear() {
        return currentYear;
    }

    /**
     * setter method for currentYear
     * @param currentYear 
     */
    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    /**
     * getter method for previousYear
     * @return 
     */
    public int getPreviousYear() {
        return previousYear;
    }

    /**
     * setter for previousYear
     * @param previousYear 
     */
    public void setPreviousYear(int previousYear) {
        this.previousYear = previousYear;
    }

    /**
     * getter for score
     * @return 
     */
    @Override
    public int getScore() {
        return score;
    }

    /**
     * setter for score
     * @param score 
     */
    @Override
    public void setScore(int score) {
        this.score = score;
    }
    
    @Override
     public Date getDate() {
        return date;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * method to convert MonthlyOrderCountIssue Object to JSON Object
     * @return 
     */
    @Override
    public JSONObject toJson() {

        JSONObject orderCountissueIssueJson = new JSONObject();

        orderCountissueIssueJson.put("catagory", this.getCatagory());
        orderCountissueIssueJson.put("action-required", this.isActionRequired());
        orderCountissueIssueJson.put("month", this.getMonth());
        orderCountissueIssueJson.put("current-val", this.getCurrentOrderCount());
        orderCountissueIssueJson.put("type", this.getType());
        orderCountissueIssueJson.put("previous-val", this.getPreviousOrderCount());
        orderCountissueIssueJson.put("current-year", this.getCurrentYear());
        orderCountissueIssueJson.put("previous-year", this.getPreviousYear());
        orderCountissueIssueJson.put("drop", this.getDrop());
        orderCountissueIssueJson.put("score", this.getScore());
        orderCountissueIssueJson.put("customer-id", this.getCustomerId());
        orderCountissueIssueJson.put("date", this.getDate());

        return orderCountissueIssueJson;
    }

    @Override
    public String toString() {
        return "MonthlyOrderCountIssue{" + "previousOrderCount=" + previousOrderCount + ", currentOrderCount=" + currentOrderCount + ", month=" + month + ", currentYear=" + currentYear + ", previousYear=" + previousYear + ", score=" + score + ", date=" + date + '}';
    }
     
}
