/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.badger.observationmongotest.execute;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;

/**
 *
 * @author badger
 */
public class MongoQueryTest {
   
    public static void main(String[] args) throws UnknownHostException {
        
        DBCollection database = getDatabaseConnection();
        
    }
    
    public static DBCollection getDatabaseConnection() throws UnknownHostException{
     
      MongoClient client = new MongoClient("localhost", 27007);
      DB db = client.getDB("ObservationReports");
      
      DBCollection col = db.getCollection("reports");
     
      return col;
    }
}
