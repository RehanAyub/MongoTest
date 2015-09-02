/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.badger.observationmongotest.execute;

import com.badger.observationservice.entity.Customer;
import com.badger.observationservice.entity.CustomerObservationReport;
import com.badger.observationservice.entity.MonthlyProductOrderCountIssue;
import com.badger.observationservice.entity.MonthlyProductRevenueIssue;
import com.badger.observationservice.entity.MonthlyRevenueIssue;
import com.badger.observationservice.entity.Observation;
import com.fasterxml.jackson.core.JsonGenerator;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.gson.Gson;
import com.mongodb.WriteResult;
import de.undercouch.bson4jackson.BsonFactory;
import java.util.Map;

/**
 *
 * @author badger
 */
public class Main {

    public static void main(String[] args) throws ParseException, UnknownHostException, IOException {

        List<Observation> observations = new LinkedList();

        Customer customer = new Customer();

        customer.setName("Mr Customer");
        customer.setId("cid123");
        customer.setBackOfficeId("boid123");

        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        String dateStr = "2015/08/10";
        Date date = format.parse(dateStr);

        CustomerObservationReport report = new CustomerObservationReport(customer);

        MonthlyProductOrderCountIssue productOrderCountIssue = new MonthlyProductOrderCountIssue();
        productOrderCountIssue.setActionRequired(true);
        productOrderCountIssue.setCatagory("product issue");
        productOrderCountIssue.setCurrentYear(2015);
        productOrderCountIssue.setCurrentYearValue(30);
        productOrderCountIssue.setCustomerId(customer.getId());
        productOrderCountIssue.setDate(date);
        productOrderCountIssue.setDrop(50.0);
        productOrderCountIssue.setLastYearValue(60);
        productOrderCountIssue.setMonth("Feb");
        productOrderCountIssue.setObservationId("oid123");
        productOrderCountIssue.setPreviousYear(2014);
        productOrderCountIssue.setProductName("cool product");
        productOrderCountIssue.setScore(4500);
        productOrderCountIssue.setType("monthy order count");

        MonthlyProductOrderCountIssue monthlyProductOrderCountIssue = new MonthlyProductOrderCountIssue();
        monthlyProductOrderCountIssue.setActionRequired(true);
        monthlyProductOrderCountIssue.setCatagory("product issue");
        monthlyProductOrderCountIssue.setCurrentYear(2015);
        monthlyProductOrderCountIssue.setCurrentYearValue(30);
        monthlyProductOrderCountIssue.setCustomerId(customer.getId());
        monthlyProductOrderCountIssue.setDate(date);
        monthlyProductOrderCountIssue.setDrop(50.0);
        monthlyProductOrderCountIssue.setLastYearValue(60);
        monthlyProductOrderCountIssue.setMonth("March");
        monthlyProductOrderCountIssue.setObservationId("oid456");
        monthlyProductOrderCountIssue.setPreviousYear(2014);
        monthlyProductOrderCountIssue.setProductName("cool product");
        monthlyProductOrderCountIssue.setScore(4500);
        monthlyProductOrderCountIssue.setType("monthy order count");

        MonthlyProductRevenueIssue monthlyProductRevenueIssue = new MonthlyProductRevenueIssue();
        monthlyProductRevenueIssue.setActionRequired(true);
        monthlyProductRevenueIssue.setCatagory("product issue");
        monthlyProductRevenueIssue.setCurrentYear(2015);
        monthlyProductRevenueIssue.setCurrentYearValue(3000.00);
        monthlyProductRevenueIssue.setCustomerId(customer.getId());
        monthlyProductRevenueIssue.setDate(date);
        monthlyProductRevenueIssue.setDrop(50.0);
        monthlyProductRevenueIssue.setLastYearValue(6000.00);
        monthlyProductRevenueIssue.setMonth("Dec");
        monthlyProductRevenueIssue.setObservationId("oid3445");
        monthlyProductRevenueIssue.setPreviousYear(2014);
        monthlyProductRevenueIssue.setProductName("test product");
        monthlyProductRevenueIssue.setScore(5667);
        monthlyProductRevenueIssue.setType("monthly product ervenue");

        MonthlyRevenueIssue monthlyRevenueIssue = new MonthlyRevenueIssue();
        monthlyRevenueIssue.setActionRequired(true);
        monthlyRevenueIssue.setCatagory("Reveue Issue");
        monthlyRevenueIssue.setCurrentValue(3000);
        monthlyRevenueIssue.setCurrentYear(2015);
        monthlyRevenueIssue.setCustomerId(customer.getId());
        monthlyRevenueIssue.setDate(date);
        monthlyRevenueIssue.setDrop(45.0);
        monthlyRevenueIssue.setMonth("Nov");
        monthlyRevenueIssue.setObservationId("oid4646646");
        monthlyRevenueIssue.setPreviousValue(5000);
        monthlyRevenueIssue.setPreviousYear(2014);
        monthlyRevenueIssue.setScore(5600);
        monthlyRevenueIssue.setType("monthly revenue issue");

        observations.add(monthlyRevenueIssue);
        observations.add(monthlyProductRevenueIssue);
        observations.add(monthlyProductOrderCountIssue);
        observations.add(productOrderCountIssue);

        report.setAccountId("acid123");

        report.addObservations(observations);

        // BasicDBObject documentDetail = new BasicDBObject();
        /**
         * documentDetail.put("accountId", report.getAccountId());
         * documentDetail.put("customerId", report.getCustomerId());
         * documentDetail.put("Observations",
         * report.getObservations().toString()); *
         */
        MongoClient mongo = new MongoClient("localhost", 27017);
        DB db = mongo.getDB("ObservationReports");

        DBCollection col = db.getCollection("reports");

        Gson gson = new Gson();
        
        String json = gson.toJson(report);

        DBObject dbObject = (DBObject) JSON.parse(json);

        col.insert(dbObject);

        //DBObject query = BasicDBObjectBuilder.start().add("_id", report.getId()).get();
        DBCursor cursor = col.find();
        
         while(cursor.hasNext()){ System.out.println("First Cursor: "+cursor.next().get("observations"));
        }
         

        while (cursor.hasNext()) {

            DBObject dbobj = cursor.next();
            
            Map map = dbObject.toMap();
            
            CustomerObservationReport report2  = new CustomerObservationReport(customer);
            
            //System.out.println("observations " +dbObject.get("observations"));
            
            List<Observation> dbObservations = (List<Observation>) dbObject.get("observations");
            
            report2.setAccountId(report.getAccountId());
            report2.setCustomerId(report.getCustomerName());
            report2.setBackOfficeId(report.getBackOfficeId());
            report2.setObservations((dbObservations));       
            
            System.out.println(report2.getClass().getTypeName());
        }
    }

}
