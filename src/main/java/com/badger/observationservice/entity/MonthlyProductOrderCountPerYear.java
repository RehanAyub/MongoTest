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
public class MonthlyProductOrderCountPerYear {
    
    private int year;
    
    private String productName;
    
    private int january;
    
    private int february;
    
    private int march ;
    
    private int april ;
    
    private int may;
    
    private int june;
    
    private int july;
    
    private int august;
    
    private int september;
    
    private int october;
    
    private int november;
    
    private int december;            

    public MonthlyProductOrderCountPerYear() {
        this.year = 0;
        this.productName = "default-value";
        this.january = 0;
        this.february = 0;
        this.march = 0;
        this.april = 0;
        this.may = 0;
        this.june = 0;
        this.july = 0;
        this.august = 0;
        this.september = 0;
        this.october = 0;
        this.november = 0;
        this.december = 0;
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

    public int getJanuary() {
        return january;
    }

    public void setJanuary(int january) {
        this.january = january;
    }

    public int getFebruary() {
        return february;
    }

    public void setFebruary(int february) {
        this.february = february;
    }

    public int getMarch() {
        return march;
    }

    public void setMarch(int march) {
        this.march = march;
    }

    public int getApril() {
        return april;
    }

    public void setApril(int april) {
        this.april = april;
    }

    public int getMay() {
        return may;
    }

    public void setMay(int may) {
        this.may = may;
    }

    public int getJune() {
        return june;
    }

    public void setJune(int june) {
        this.june = june;
    }

    public int getJuly() {
        return july;
    }

    public void setJuly(int july) {
        this.july = july;
    }

    public int getAugust() {
        return august;
    }

    public void setAugust(int august) {
        this.august = august;
    }

    public int getSeptember() {
        return september;
    }

    public void setSeptember(int september) {
        this.september = september;
    }

    public int getOctober() {
        return october;
    }

    public void setOctober(int october) {
        this.october = october;
    }

    public int getNovember() {
        return november;
    }

    public void setNovember(int november) {
        this.november = november;
    }

    public int getDecember() {
        return december;
    }

    public void setDecember(int december) {
        this.december = december;
    }

}
