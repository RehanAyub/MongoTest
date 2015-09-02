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
public class BsonSerialisationTest {

    public static void main(String[] args) throws UnknownHostException {

        DBCollection col = getReportCollection();

        BasicDBList dbObservationsList = getObservations(col);

        List<Observation> observations = new LinkedList<>();

        //System.out.println("observations " +observations);  
        //System.out.println("Observations element" + observationsList.get(0));
        for (Object observationsObjectList : dbObservationsList) {
           
            BasicDBList observationList = (BasicDBList) observationsObjectList;
           
            for (Object observationDbList : observationList) {
                
                DBObject observationObject = (DBObject) observationDbList;
                
                if (observationObject.get("type").equals("monthly revenue issue") && observationObject.get("catagory").equals("Reveue Issue")) {

                    MonthlyRevenueIssue monthlyIssueObservation = new MonthlyRevenueIssue();
                    monthlyIssueObservation.setActionRequired(true);
                    monthlyIssueObservation.setCatagory((String) observationObject.get("catagory"));
                    monthlyIssueObservation.setType((String) observationObject.get("type"));

                    System.out.println("my revenue observation josn" + monthlyIssueObservation.toJson());

                    observations.add(monthlyIssueObservation);
                }
                if (observationObject.get("type").equals("monthy order count") && observationObject.get("catagory").equals("product issue")) {

                    MonthlyProductOrderCountIssue monthlyProductOrderCountIssueObservation = new MonthlyProductOrderCountIssue();
                    monthlyProductOrderCountIssueObservation.setActionRequired(true);
                    monthlyProductOrderCountIssueObservation.setCatagory((String) observationObject.get("catagory"));
                    monthlyProductOrderCountIssueObservation.setType((String) observationObject.get("type"));

                    System.out.println("my product order count observation josn" + monthlyProductOrderCountIssueObservation.toJson());

                    observations.add(monthlyProductOrderCountIssueObservation);
                }
                if (observationObject.get("type").equals("monthly product ervenue") && observationObject.get("catagory").equals("product issue")) {

                    MonthlyProductRevenueIssue monthlyProductRevenueIssueObservation = new MonthlyProductRevenueIssue();
                    monthlyProductRevenueIssueObservation.setActionRequired(true);
                    monthlyProductRevenueIssueObservation.setCatagory((String) observationObject.get("catagory"));
                    monthlyProductRevenueIssueObservation.setType((String) observationObject.get("type"));

                    System.out.println("my product revenue obervation json" + monthlyProductRevenueIssueObservation.toJson());

                    observations.add(monthlyProductRevenueIssueObservation);
                }
                System.out.println("Observation size " + observations.size());
            }
        }
    }

    public static DBCollection getReportCollection() throws UnknownHostException {

        MongoClient mongo = new MongoClient("localhost", 27017);

        DB db = mongo.getDB("ObservationReports");

        DBCollection col = db.getCollection("reports");

        return col;
    }

    public static BasicDBList getObservations(DBCollection col) {

        DBCursor cursor = col.find();

        BasicDBList observationsList = new BasicDBList();

        while (cursor.hasNext()) {

            DBObject dbObject = cursor.next();
            
            BasicDBList innerObservationsList = (BasicDBList) dbObject.get("observations");

            observationsList.add(innerObservationsList);

        }
        return observationsList;
    }

}
