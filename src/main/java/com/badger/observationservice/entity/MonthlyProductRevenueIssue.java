/*
 * Sales Badger CRM(Internal) API Service.
 * Copyright(c) 2014 SalesBadger(http://www.salesbadger.com)
 * Internal.
 */
package com.badger.observationservice.entity;

import java.util.Date;
import org.json.simple.JSONObject;

/**
 *
 * @author Rehan Ayub <rayub@sales-i.com>
 */
public class MonthlyProductRevenueIssue extends Issue {

    private String productName;

    private double currentYearValue;

    private double lastYearValue;

    private String month;

    private int currentYear;

    private int previousYear;

    private int score;

    private Date date;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCurrentYearValue() {
        return currentYearValue;
    }

    public void setCurrentYearValue(double currentYearValue) {
        this.currentYearValue = currentYearValue;
    }

    public double getLastYearValue() {
        return lastYearValue;
    }

    public void setLastYearValue(double lastYearValue) {
        this.lastYearValue = lastYearValue;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public int getPreviousYear() {
        return previousYear;
    }

    public void setPreviousYear(int previousYear) {
        this.previousYear = previousYear;
    }

    @Override
    public int getScore() {
        return score;
    }

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

    @Override
    public JSONObject toJson() {

        JSONObject productRevenueIssueJson = new JSONObject();

        productRevenueIssueJson.put("catagory", this.getCatagory());
        productRevenueIssueJson.put("type", this.getType());
        productRevenueIssueJson.put("action_required", this.isActionRequired());
        productRevenueIssueJson.put("drop", this.getDrop());
        productRevenueIssueJson.put("product_name", this.getProductName());
        productRevenueIssueJson.put("month", this.getMonth());
        productRevenueIssueJson.put("current-year", this.getCurrentYear());
        productRevenueIssueJson.put("previous_year", this.getPreviousYear());
        productRevenueIssueJson.put("current_value", this.getCurrentYearValue());
        productRevenueIssueJson.put("previous_value", this.getLastYearValue());
        productRevenueIssueJson.put("score", this.getScore());
        productRevenueIssueJson.put("customer_id", this.getCustomerId());
        productRevenueIssueJson.put("date", this.getDate());

        return productRevenueIssueJson;
    }

    @Override
    public String toString() {
        return "MonthlyProductRevenueIssue{" + "productName=" + productName + ", currentYearValue=" + currentYearValue + ", lastYearValue=" + lastYearValue + ", month=" + month + ", currentYear=" + currentYear + ", previousYear=" + previousYear + ", score=" + score + ", date=" + date + '}';
    }
    
}
