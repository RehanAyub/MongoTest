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
public class MonthlyRevenueIssue extends Issue {

    private double previousValue;

    private double currentValue;

    private Date date;

    private String month;

    private int currentYear;

    private int previousYear;

    private int score;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getPreviousValue() {
        return previousValue;
    }

    public void setPreviousValue(double previousValue) {
        this.previousValue = previousValue;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
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
    public JSONObject toJson() {

        JSONObject revenueIssueJson = new JSONObject();
        revenueIssueJson.put("catagory",this.getCatagory());
        revenueIssueJson.put("action-required",this.isActionRequired());
        revenueIssueJson.put("month",this.getMonth());
        revenueIssueJson.put("current-year",this.getCurrentYear());
        revenueIssueJson.put("type",this.getType());
        revenueIssueJson.put("last-year",this.getPreviousYear());
        revenueIssueJson.put("previous-year-avg-val",this.getPreviousValue());
        revenueIssueJson.put("current-year-avg-val",this.getCurrentValue());
        revenueIssueJson.put("drop",this.getDrop());
        revenueIssueJson.put("score",this.getScore());
        revenueIssueJson.put("customer-id", this.getCustomerId());
        revenueIssueJson.put("date", this.getDate());

        return revenueIssueJson;
    }

    @Override
    public String toString() {
        return "MonthlyRevenueIssue{" + "previousValue=" + previousValue + ", currentValue=" + currentValue + ", date=" + date + ", month=" + month + ", currentYear=" + currentYear + ", previousYear=" + previousYear + ", score=" + score + '}';
    }
}
