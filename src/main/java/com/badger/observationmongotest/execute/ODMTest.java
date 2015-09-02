/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.badger.observationmongotest.execute;

import com.badger.observationservice.entity.MonthlyProductOrderCountIssue;
import com.badger.observationservice.entity.MonthlyProductRevenueIssue;
import com.badger.observationservice.entity.MonthlyRevenueIssue;
import com.badger.observationservice.entity.Observation;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author badger
 */
public class ODMTest {
    
    public static void main(String[] args) throws UnknownHostException {
        
       DBCollection col = getReportCollection();
        
       BasicDBList observationsList = getObservations(col);
       
       List<Observation> observations = new LinkedList<>();
       
       //System.out.println("observations " +observations);  
       //System.out.println("Observations element" + observationsList.get(0));
       
        for (int i = 0; i < observationsList.size(); i++) {
           
            BasicDBObject observationObject = (BasicDBObject) observationsList.get(i);
            
            if(observationObject.getString("type").equals("monthly revenue issue") && observationObject.getString("catagory").equals("Reveue Issue")){
                
                MonthlyRevenueIssue monthlyIssueObservation = new MonthlyRevenueIssue(); 
                monthlyIssueObservation.setActionRequired(true);
                monthlyIssueObservation.setCatagory(observationObject.getString("catagory"));
                monthlyIssueObservation.setType(observationObject.getString("type"));
                
                System.out.println("my revenue observation josn" + monthlyIssueObservation.toJson());
                
                observations.add(monthlyIssueObservation);           
            }
            
            if(observationObject.getString("type").equals("monthy order count") && observationObject.getString("catagory").equals("product issue")){
                
                 MonthlyProductOrderCountIssue monthlyProductOrderCountIssueObservation = new MonthlyProductOrderCountIssue();
                 monthlyProductOrderCountIssueObservation.setActionRequired(true);
                 monthlyProductOrderCountIssueObservation.setCatagory(observationObject.getString("catagory"));
                 monthlyProductOrderCountIssueObservation.setType(observationObject.getString("type"));
                 
                 System.out.println("my product order count observation josn" + monthlyProductOrderCountIssueObservation.toJson());
                 
                 observations.add(monthlyProductOrderCountIssueObservation);
            }
            
             if(observationObject.getString("type").equals("monthly product ervenue") && observationObject.getString("catagory").equals("product issue")){
                
                  MonthlyProductRevenueIssue monthlyProductRevenueIssueObservation = new MonthlyProductRevenueIssue();
                  monthlyProductRevenueIssueObservation.setActionRequired(true);
                  monthlyProductRevenueIssueObservation.setCatagory(observationObject.getString("catagory"));
                  monthlyProductRevenueIssueObservation.setType(observationObject.getString("type")); 
                  
                  System.out.println("my product revenue obervation" + monthlyProductRevenueIssueObservation.toJson());
                  
                  observations.add(monthlyProductRevenueIssueObservation);
                            
             } 
             
             System.out.println("Observation size " + observations.size());
        }
    }
    
    public static DBCollection getReportCollection() throws UnknownHostException{
         
        
        MongoClient mongo = new MongoClient("localhost", 27017);
        
        DB db = mongo.getDB("ObservationReports");

        DBCollection col = db.getCollection("reports");
        
        return col;
    }
    
    public static BasicDBList getObservations(DBCollection col){
        
        DBCursor cursor = col.find();
         
        BasicDBList observationsList = new BasicDBList();
         
         while (cursor.hasNext()) {
            
             DBObject dbObject = cursor.next();
             
             observationsList = (BasicDBList) dbObject.get("observations");
            
        }
        return observationsList;
    }
    
}
