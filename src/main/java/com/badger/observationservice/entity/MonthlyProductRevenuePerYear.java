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
public class MonthlyProductRevenuePerYear {

    private int year;

    private String productName;

    private double january;

    private double february;

    private double march;

    private double april;

    private double may;

    private double june;

    private double july;

    private double august;

    private double september;

    private double october;

    private double november;

    private double december;

    public MonthlyProductRevenuePerYear() {
        this.year = 0;
        this.productName = "default-value";
        this.january = 0.0;
        this.february = 0.0;
        this.march = 0.0;
        this.april = 0.0;
        this.may = 0.0;
        this.june = 0.0;
        this.july = 0.0;
        this.august = 0.0;
        this.september = 0.0;
        this.october = 0.0;
        this.november = 0.0;
        this.december = 0.0;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getJanuary() {
        return january;
    }

    public void setJanuary(double january) {
        this.january = january;
    }

    public double getFebruary() {
        return february;
    }

    public void setFebruary(double february) {
        this.february = february;
    }

    public double getMarch() {
        return march;
    }

    public void setMarch(double march) {
        this.march = march;
    }

    public double getApril() {
        return april;
    }

    public void setApril(double april) {
        this.april = april;
    }

    public double getMay() {
        return may;
    }

    public void setMay(double may) {
        this.may = may;
    }

    public double getJune() {
        return june;
    }

    public void setJune(double june) {
        this.june = june;
    }

    public double getJuly() {
        return july;
    }

    public void setJuly(double july) {
        this.july = july;
    }

    public double getAugust() {
        return august;
    }

    public void setAugust(double august) {
        this.august = august;
    }

    public double getSeptember() {
        return september;
    }

    public void setSeptember(double september) {
        this.september = september;
    }

    public double getOctober() {
        return october;
    }

    public void setOctober(double october) {
        this.october = october;
    }

    public double getNovember() {
        return november;
    }

    public void setNovember(double november) {
        this.november = november;
    }

    public double getDecember() {
        return december;
    }

    public void setDecember(double december) {
        this.december = december;
    }

}
